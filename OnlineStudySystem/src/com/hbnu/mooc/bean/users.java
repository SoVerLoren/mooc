package com.hbnu.mooc.bean;

import java.util.Date;

public class users {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.User_ID
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.Nick_Name
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    private String nickName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.User_Type
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    private Integer userType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.Role_ID
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.Create_time
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.Creator
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.Update_Time
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.Updator
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    private String updator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.Login_Name
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    private String loginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.Login_Pwd
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    private String loginPwd;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.User_ID
     *
     * @return the value of users.User_ID
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.User_ID
     *
     * @param userId the value for users.User_ID
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.Nick_Name
     *
     * @return the value of users.Nick_Name
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.Nick_Name
     *
     * @param nickName the value for users.Nick_Name
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.User_Type
     *
     * @return the value of users.User_Type
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.User_Type
     *
     * @param userType the value for users.User_Type
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.Role_ID
     *
     * @return the value of users.Role_ID
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.Role_ID
     *
     * @param roleId the value for users.Role_ID
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.Create_time
     *
     * @return the value of users.Create_time
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.Create_time
     *
     * @param createTime the value for users.Create_time
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.Creator
     *
     * @return the value of users.Creator
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.Creator
     *
     * @param creator the value for users.Creator
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.Update_Time
     *
     * @return the value of users.Update_Time
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.Update_Time
     *
     * @param updateTime the value for users.Update_Time
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.Updator
     *
     * @return the value of users.Updator
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.Updator
     *
     * @param updator the value for users.Updator
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.Login_Name
     *
     * @return the value of users.Login_Name
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.Login_Name
     *
     * @param loginName the value for users.Login_Name
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.Login_Pwd
     *
     * @return the value of users.Login_Pwd
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.Login_Pwd
     *
     * @param loginPwd the value for users.Login_Pwd
     *
     * @mbg.generated Tue Sep 18 11:38:21 CST 2018
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }
}