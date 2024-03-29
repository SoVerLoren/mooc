package com.hbnu.mooc.dao;

import com.hbnu.mooc.bean.teacher;
import com.hbnu.mooc.bean.teacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface teacherMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    long countByExample(teacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int deleteByExample(teacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int deleteByPrimaryKey(String teacherNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int insert(teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int insertSelective(teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    List<teacher> selectByExample(teacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    teacher selectByPrimaryKey(String teacherNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") teacher record, @Param("example") teacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByExample(@Param("record") teacher record, @Param("example") teacherExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByPrimaryKeySelective(teacher record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table teacher
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByPrimaryKey(teacher record);
}