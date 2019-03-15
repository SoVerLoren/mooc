package com.hbnu.mooc.dao;

import com.hbnu.mooc.bean.admin;
import com.hbnu.mooc.bean.adminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface adminMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    long countByExample(adminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int deleteByExample(adminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int deleteByPrimaryKey(String adminNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int insert(admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int insertSelective(admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    List<admin> selectByExample(adminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    admin selectByPrimaryKey(String adminNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") admin record, @Param("example") adminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByExample(@Param("record") admin record, @Param("example") adminExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByPrimaryKeySelective(admin record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    int updateByPrimaryKey(admin record);
}