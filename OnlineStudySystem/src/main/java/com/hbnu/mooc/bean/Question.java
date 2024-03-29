package com.hbnu.mooc.bean;

import java.util.Date;

public class Question {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.question_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String questionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.Updator
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String updator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.title
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.class_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String classId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.chapter_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String chapterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.out_num
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String outNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.defficulty
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String defficulty;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.Create_time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.Creator
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.Update_Time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question.type_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String typeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.question_id
     *
     * @return the value of question.question_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.question_id
     *
     * @param questionId the value for question.question_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setQuestionId(String questionId) {
        this.questionId = questionId == null ? null : questionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.Updator
     *
     * @return the value of question.Updator
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.Updator
     *
     * @param updator the value for question.Updator
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.title
     *
     * @return the value of question.title
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.title
     *
     * @param title the value for question.title
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.class_id
     *
     * @return the value of question.class_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.class_id
     *
     * @param classId the value for question.class_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.chapter_id
     *
     * @return the value of question.chapter_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getChapterId() {
        return chapterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.chapter_id
     *
     * @param chapterId the value for question.chapter_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setChapterId(String chapterId) {
        this.chapterId = chapterId == null ? null : chapterId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.out_num
     *
     * @return the value of question.out_num
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getOutNum() {
        return outNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.out_num
     *
     * @param outNum the value for question.out_num
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setOutNum(String outNum) {
        this.outNum = outNum == null ? null : outNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.defficulty
     *
     * @return the value of question.defficulty
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getDefficulty() {
        return defficulty;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.defficulty
     *
     * @param defficulty the value for question.defficulty
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setDefficulty(String defficulty) {
        this.defficulty = defficulty == null ? null : defficulty.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.Create_time
     *
     * @return the value of question.Create_time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.Create_time
     *
     * @param createTime the value for question.Create_time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.Creator
     *
     * @return the value of question.Creator
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.Creator
     *
     * @param creator the value for question.Creator
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.Update_Time
     *
     * @return the value of question.Update_Time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.Update_Time
     *
     * @param updateTime the value for question.Update_Time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question.type_id
     *
     * @return the value of question.type_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question.type_id
     *
     * @param typeId the value for question.type_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }
}