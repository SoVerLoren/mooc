package com.hbnu.mooc.dao;

import com.hbnu.mooc.bean.exam_class;
import com.hbnu.mooc.bean.exam_classExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface exam_classMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_class
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    long countByExample(exam_classExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_class
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int deleteByExample(exam_classExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_class
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int insert(exam_class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_class
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int insertSelective(exam_class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_class
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    List<exam_class> selectByExample(exam_classExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_class
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") exam_class record, @Param("example") exam_classExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table exam_class
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByExample(@Param("record") exam_class record, @Param("example") exam_classExample example);
}