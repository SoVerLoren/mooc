package com.hbnu.mooc.service.serviceImpl.teacherImpl;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import org.n3r.idworker.Sid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hbnu.mooc.bean.Chapter;
import com.hbnu.mooc.bean.ChapterDto;
import com.hbnu.mooc.bean.ChapterDtoArr;
import com.hbnu.mooc.bean.Course;
import com.hbnu.mooc.bean.CourseDto;
import com.hbnu.mooc.bean.Student;
import com.hbnu.mooc.bean.Teacher;
import com.hbnu.mooc.dao.ChapterMapper;
import com.hbnu.mooc.dao.ClassCourseMapper;
import com.hbnu.mooc.dao.CourseExamMapper;
import com.hbnu.mooc.dao.CourseMapper;
import com.hbnu.mooc.dao.GradeMapper;
import com.hbnu.mooc.dao.StudentMapper;
import com.hbnu.mooc.dao.TeacherCourseMapper;
import com.hbnu.mooc.service.teacher.CourseManService;

@Service
public class CourseManServiceImpl implements CourseManService {
	
	@Autowired
	private CourseMapper cm;
	@Autowired
	private ChapterMapper chapMa;
	@Autowired
	private StudentMapper sMa;
	@Autowired
	private ClassCourseMapper clco;;
	@Autowired
	private Sid sid;
	@Autowired
	private CourseExamMapper cem;
	@Autowired
	private GradeMapper gm;
	@Autowired
	private TeacherCourseMapper  tcm;

	@Override
	public Boolean addCourse(Course co) {
		int insert = cm.changeDesc(co);
		if(insert>0){
			return true;
		}else{
			return null;
		}
	}

	@Override
	public List<CourseDto> selectCourse(Teacher teac) {
		String a = String.valueOf(21);
		teac.setTeacherNo(a);
		List<String> courseId = tcm.selectCourseId(teac.getTeacherNo());
		List<Course> courses = new ArrayList<Course>();   

		//根据取出来的课程id取出课程，并存在courses中
			for(String id : courseId){  
				Course course = cm.selectByPrimaryKey(id);
				//if(!course.equals(null))
					courses.add(course);
			}

		//System.out.println(course.size()+"==server");
		List<CourseDto> courseDto = new ArrayList<CourseDto>(); //courseDto 用来装载最终返回的课程信息
		List<CourseDto> courseDto2 = new ArrayList<CourseDto>();//courseDto2 用来装载只有章节数信息的课程
		//用课程id查询出章节数，遍历装入对应课程并装入courseDto2中
		for (Course co : courses) {
			Integer i = chapMa.selectCount(co.getCourseId());
			CourseDto codto1 = new CourseDto();
			codto1.setChapterNum(i);
			courseDto2.add(codto1);
		}
		//遍历，将最终课程信息装入courseDto
		int i = -1;
		for (Course co : courses) {
			CourseDto codto1 = new CourseDto();
			//将章节数信息装入codto1
			for( i++ ;i<courseDto2.size();){
				BeanUtils.copyProperties(courseDto2.get(i),codto1);
				break;
			}
			//将课程其余信息装入codto1
			BeanUtils.copyProperties(co, codto1);
			courseDto.add(codto1);
		}
		return courseDto;
	
	}

	@Override
	public Boolean deleteCourse(String id) {
		int i = cm.deleteByPrimaryKey(id);
		if(i>0){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public List<CourseDto> selectByName(String courseName) {
		List<Course> courses = cm.selectByName(courseName);
		List<CourseDto> courseDto = new ArrayList<CourseDto>(); //courseDto 用来装载最终返回的课程信息
		List<CourseDto> courseDto2 = new ArrayList<CourseDto>();//courseDto2 用来装载只有章节数信息的课程
		//用课程id查询出章节数，遍历装入对应课程并装入courseDto2中
		for (Course co : courses) {
			Integer i = chapMa.selectCount(co.getCourseId());
			CourseDto codto1 = new CourseDto();
			codto1.setChapterNum(i);
			courseDto2.add(codto1);
		}
		//遍历，将最终课程信息装入courseDto
		int i = -1;
		for (Course co : courses) {
			CourseDto codto1 = new CourseDto();
			//将章节数信息装入codto1
			for( i++ ;i<courseDto2.size();){
				BeanUtils.copyProperties(courseDto2.get(i),codto1);
				break;
			}
			//将课程其余信息装入codto1
			BeanUtils.copyProperties(co, codto1);
			courseDto.add(codto1);
		}
		return courseDto;
		
	}

	@Override
	public Boolean addChapter(ChapterDtoArr chDtos,Course co) {
		Chapter ch = new Chapter();
		for(ChapterDto chDto : chDtos.getChapterDtos()){
			BeanUtils.copyProperties(chDto, ch);
			ch.setCourseId(co.getCourseId()); //存入courseId
			String uid = sid.nextShort();//返回的是16位的字母加数字组合
			ch.setChapterId(uid);
			MultipartFile file = chDto.getFileUrl();
			String filename = System.currentTimeMillis()+"_"+chDto.getChapterName()+"_"
			+file.getOriginalFilename();
			
			if(file==null || file.isEmpty()) return false; //文件不存在直接返回false
			
			else {
				//存放视频等资源的路径，注意修改。
				String url = "D:/Javacode/OnlineStudySystem/src/main/resources/static/chapterFile/"; 
				ch.setVideoPath(url+filename);
				File path = new File(url + filename);
				
				if(!path.exists()) {
					path.getParentFile().mkdirs();
				}
				
				try {
					file.transferTo(path);
				} catch (IllegalStateException e) {
					System.out.println(e.getMessage()+"222");
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			chapMa.insert(ch);
		}
		return true;
	}

	//查询章节
	@Override
	public List<Chapter> selectChapter(Course co) {
		List<Chapter> chapters = chapMa.selectByCourseId(co.getCourseId());
		return chapters;
	}

	//删除章节
	@Override
	public Boolean deleteChapter(Chapter ch) {
		Boolean j = false;
		Chapter chapter = chapMa.selectByPrimaryKey(ch.getChapterId());
		File de = new File(chapter.getVideoPath());
		if(de.exists()){
			j = de.delete();
		}
		int i = chapMa.deleteByPrimaryKey(ch.getChapterId());
		if(i>0&&j==true)
		return true;
		return false;
	}

	@Override
	public Course selectCourseById(String courseId) {
		Course co = cm.selectByPrimaryKey(courseId);
		//System.out.println(co.getCourseId()+"==impl");
		return co;
	}

	@Override
	public List<Student> selectStudentByClassId(String courseId) {
		String classId = clco.selectClassId(courseId);
		List<Student> s = sMa.selectByClassId(classId);
		return s;
	}

	//通过学生姓名查询学生
	@Override
	public List<Student> selectByStuName(String name) {
		List<Student> stu = sMa.selectByName(name);
		return stu;
	}
	
	//返回学习进度
	@Override
	public String rebackRate(String stuNum,String courId){
		int i = 0;
		List<String> papeId = cem.selectByCourId(courId);
		for(String pa : papeId){
			String score = gm.selectScore(stuNum,pa);
			if(score!=null){
				i++;
			}
		}
		if(papeId.size()==0){
			return String.valueOf(0);
		}
		
		NumberFormat nt = NumberFormat.getPercentInstance();
		nt.setMinimumFractionDigits(2);
		return nt.format(1);
		/*
		//将进度计算出来并转换为百分数，保留两位小数
		double cent = (double)i/papeId.size();
		NumberFormat nt = NumberFormat.getPercentInstance();
		nt.setMinimumFractionDigits(2);
		return nt.format(cent);
		*/
	}

}
