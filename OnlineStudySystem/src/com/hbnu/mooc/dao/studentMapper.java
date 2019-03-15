package com.hbnu.mooc.dao;

import com.hbnu.mooc.bean.student;
import com.hbnu.mooc.bean.studentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface studentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    long countByExample(studentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int deleteByExample(studentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int deleteByPrimaryKey(String studentNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int insert(student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int insertSelective(student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    List<student> selectByExample(studentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    student selectByPrimaryKey(String studentNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") student record, @Param("example") studentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByExample(@Param("record") student record, @Param("example") studentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByPrimaryKeySelective(student record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByPrimaryKey(student record);
}