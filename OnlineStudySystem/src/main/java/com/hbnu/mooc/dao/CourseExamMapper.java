package com.hbnu.mooc.dao;

import com.hbnu.mooc.bean.CourseExam;
import com.hbnu.mooc.bean.CourseExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseExamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_exam
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    long countByExample(CourseExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_exam
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    int deleteByExample(CourseExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_exam
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    int insert(CourseExam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_exam
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    int insertSelective(CourseExam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_exam
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    List<CourseExam> selectByExample(CourseExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_exam
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    int updateByExampleSelective(@Param("record") CourseExam record, @Param("example") CourseExamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table course_exam
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    int updateByExample(@Param("record") CourseExam record, @Param("example") CourseExamExample example);
    
    List<String> selectByCourId(String courId);
}