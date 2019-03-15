package com.hbnu.mooc.service.teacher;

import java.util.List;

import com.hbnu.mooc.bean.Chapter;
import com.hbnu.mooc.bean.ChapterDto;
import com.hbnu.mooc.bean.ChapterDtoArr;
import com.hbnu.mooc.bean.Course;
import com.hbnu.mooc.bean.CourseDto;
import com.hbnu.mooc.bean.Student;
import com.hbnu.mooc.bean.Teacher;

public interface CourseManService {

	Boolean addCourse(Course record);

	List<CourseDto> selectCourse(Teacher teac);

	Boolean deleteCourse(String id);

	List<CourseDto> selectByName(String courseName);

	Boolean addChapter(ChapterDtoArr ch,Course co);

	List<Chapter> selectChapter(Course co);

	Boolean deleteChapter(Chapter ch);

	Course selectCourseById(String courseId);

	List<Student> selectStudentByClassId(String courseId);

	List<Student> selectByStuName(String name);

	String rebackRate(String stuNum,String courId);


}
