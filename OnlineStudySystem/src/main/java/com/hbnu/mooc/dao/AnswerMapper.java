package com.hbnu.mooc.dao;

import com.hbnu.mooc.bean.Answer;
import com.hbnu.mooc.bean.AnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answer
     *
     * @mbg.generated Thu Sep 20 16:17:59 CST 2018
     */
    long countByExample(AnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answer
     *
     * @mbg.generated Thu Sep 20 16:17:59 CST 2018
     */
    int deleteByExample(AnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answer
     *
     * @mbg.generated Thu Sep 20 16:17:59 CST 2018
     */
    int deleteByPrimaryKey(String answerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answer
     *
     * @mbg.generated Thu Sep 20 16:17:59 CST 2018
     */
    int insert(Answer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answer
     *
     * @mbg.generated Thu Sep 20 16:17:59 CST 2018
     */
    int insertSelective(Answer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answer
     *
     * @mbg.generated Thu Sep 20 16:17:59 CST 2018
     */
    List<Answer> selectByExample(AnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answer
     *
     * @mbg.generated Thu Sep 20 16:17:59 CST 2018
     */
    Answer selectByPrimaryKey(String answerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answer
     *
     * @mbg.generated Thu Sep 20 16:17:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") Answer record, @Param("example") AnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answer
     *
     * @mbg.generated Thu Sep 20 16:17:59 CST 2018
     */
    int updateByExample(@Param("record") Answer record, @Param("example") AnswerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answer
     *
     * @mbg.generated Thu Sep 20 16:17:59 CST 2018
     */
    int updateByPrimaryKeySelective(Answer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answer
     *
     * @mbg.generated Thu Sep 20 16:17:59 CST 2018
     */
    int updateByPrimaryKey(Answer record);
}