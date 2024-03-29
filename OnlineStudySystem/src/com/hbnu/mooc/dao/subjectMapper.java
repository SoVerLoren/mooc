package com.hbnu.mooc.dao;

import com.hbnu.mooc.bean.subject;
import com.hbnu.mooc.bean.subjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface subjectMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    long countByExample(subjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int deleteByExample(subjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int deleteByPrimaryKey(String subjectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int insert(subject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int insertSelective(subject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    List<subject> selectByExample(subjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    subject selectByPrimaryKey(String subjectId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") subject record, @Param("example") subjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByExample(@Param("record") subject record, @Param("example") subjectExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByPrimaryKeySelective(subject record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByPrimaryKey(subject record);
}