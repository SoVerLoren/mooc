package com.hbnu.mooc.dao;

import com.hbnu.mooc.bean.Paper;
import com.hbnu.mooc.bean.PaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    long countByExample(PaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    int deleteByExample(PaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    int insert(Paper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    int insertSelective(Paper record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    List<Paper> selectByExample(PaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    int updateByExampleSelective(@Param("record") Paper record, @Param("example") PaperExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    int updateByExample(@Param("record") Paper record, @Param("example") PaperExample example);
}