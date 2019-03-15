package com.hbnu.mooc.controller.teacher;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hbnu.mooc.bean.Chapter;
import com.hbnu.mooc.bean.ChapterDtoArr;
import com.hbnu.mooc.bean.Course;
import com.hbnu.mooc.bean.CourseDto;
import com.hbnu.mooc.bean.State;
import com.hbnu.mooc.bean.Student;
import com.hbnu.mooc.bean.Teacher;
import com.hbnu.mooc.service.teacher.CourseManService;

@Controller
@RequestMapping("/teacher")
public class CourseManController {
	
	@Autowired
	private CourseManService cms;
	
	//显示我的课程页面
	@RequestMapping("/coursetab")
	public String showCourse(@RequestParam(value="pageIndex",defaultValue="1") Integer i, Model m, Teacher teac){
		PageHelper.startPage(i, 10);
		List<CourseDto> course = cms.selectCourse(teac);
		PageInfo<CourseDto> pageInfo = new PageInfo<CourseDto>(course);
		m.addAttribute("courseList",pageInfo);
		m.addAttribute("teacher",teac);//给页面返回老师对象
		return "teacher/MyCourse";
	}

	//跳转到章节增加页面
	@RequestMapping("/addPage")
	public String jumpAddPage(Course co,Model m){
		m.addAttribute("addCo", co);
		return "teacher/AddCourse";
	}
	//章节增加界面-增加章节实现
	@RequestMapping("/addCourse")
	public String addCourse(Course co,ChapterDtoArr chDtos){
		cms.addCourse(co);
		cms.addChapter(chDtos,co);
		
		return "redirect:coursetab";
	}
	
	/*
	//我的课程页面-删除课程操作
	@RequestMapping("/deleteCourse")
	public String deleteCourse(Course co){
		cms.deleteCourse(co.getCourseId());
		return "redirect:coursetab";
	}
	*/
	//我的课程页面-查询课程操作
	@RequestMapping("/queryCourse")
	public String queryCourse(Course co,@RequestParam(value="pageIndex",defaultValue="1") Integer i, Model m){
		PageHelper.startPage(i, 10);
		List<CourseDto> courses = cms.selectByName(co.getCourseName());
		PageInfo<CourseDto> pageinfo = new PageInfo<CourseDto>(courses);
		m.addAttribute("courseList", pageinfo);
		return "teacher/MyCourse";
	}
	
	//跳转章节修改界面
	@RequestMapping("/modifyPage")
	public String jumpModifyPage(Course co,Model m){
		m.addAttribute("modifyCo", co);
		List<Chapter> chapters = cms.selectChapter(co);
		m.addAttribute("modifyCh", chapters);
		return "teacher/ModifyCourse";
	}
	
	//课程修改界面-删除章节操作
	@RequestMapping("/delChapter")
	public String delChapter(Chapter ch,Course co){
		cms.deleteChapter(ch);
		return "redirect:modifyPage?courseId="+co.getCourseId();//将courseId值传入jumpModifyPage方法中
	}
	
	//跳转课程状态页面，并显示状态信息
	@RequestMapping("/statePage")
	public String jumpStatePage(Course co,Model m){
		Course courseById = cms.selectCourseById(co.getCourseId());
		List<Student> s = cms.selectStudentByClassId(co.getCourseId());
		List<State> stasList = new ArrayList<State>();
		for( Student sts : s){
		State state = new State();
		String rate = cms.rebackRate(sts.getStudentNo(), co.getCourseId());
		state.setSpeed(rate);
		state.setCourseId(courseById.getCourseId());
		state.setCourseName(courseById.getCourseName());
		state.setOpen(courseById.getOpen());
		state.setCreator(courseById.getCreator());
		state.setStudentNo(sts.getStudentNo());
		state.setName(sts.getName());
		stasList.add(state);
		}
		m.addAttribute("stateList", stasList);
		m.addAttribute("courseForId", co); //传一个 courseId,用于查询操作
		return "/teacher/CourseState";
	}
	
	//课程状态页面的搜索功能
	@RequestMapping("/selectByName")
	public String selectByName(State sta,Model m){
		Course courseById = cms.selectCourseById(sta.getCourseId());
		List<Student> stu = cms.selectByStuName(sta.getName());
		List<State> stasList = new ArrayList<State>();
		for( Student sts : stu){
		State state = new State();
		String rate = cms.rebackRate(sts.getStudentNo(), sta.getCourseId());
		state.setSpeed(rate);
		state.setCourseId(courseById.getCourseId());
		state.setCourseName(courseById.getCourseName());
		state.setOpen(courseById.getOpen());
		state.setCreator(courseById.getCreator());
		state.setStudentNo(sts.getStudentNo());
		state.setName(sts.getName());
		stasList.add(state);
		}
		m.addAttribute("stateList", stasList);
		m.addAttribute("courseForId", sta);
		return "/teacher/CourseState";
	}
	
	//跳转课程信息页面
	@RequestMapping("/previewPage")
	public String jumpPreviewPage(Course co,Model m){
		m.addAttribute("course", co);
		List<Chapter> chapters = cms.selectChapter(co);
		m.addAttribute("chapter", chapters);
		return "/teacher/PreviewCourse";
	}
	
}
