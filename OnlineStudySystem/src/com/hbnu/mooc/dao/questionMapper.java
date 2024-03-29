package com.hbnu.mooc.dao;

import com.hbnu.mooc.bean.question;
import com.hbnu.mooc.bean.questionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface questionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    long countByExample(questionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int deleteByExample(questionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int deleteByPrimaryKey(String questionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int insert(question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int insertSelective(question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    List<question> selectByExample(questionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    question selectByPrimaryKey(String questionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") question record, @Param("example") questionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByExample(@Param("record") question record, @Param("example") questionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByPrimaryKeySelective(question record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table question
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByPrimaryKey(question record);
}