package com.hbnu.mooc.bean;

import java.util.Date;

public class Exam {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.exam_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String examId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.course_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.question_num
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String questionNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.contain_subjective
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private Integer containSubjective;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.Start_time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private Date startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.length
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private Integer length;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.Create_time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.Creator
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.Update_Time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.Updator
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String updator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam.paper_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String paperId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.exam_id
     *
     * @return the value of exam.exam_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getExamId() {
        return examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.exam_id
     *
     * @param examId the value for exam.exam_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setExamId(String examId) {
        this.examId = examId == null ? null : examId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.course_id
     *
     * @return the value of exam.course_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.course_id
     *
     * @param courseId the value for exam.course_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.question_num
     *
     * @return the value of exam.question_num
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getQuestionNum() {
        return questionNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.question_num
     *
     * @param questionNum the value for exam.question_num
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setQuestionNum(String questionNum) {
        this.questionNum = questionNum == null ? null : questionNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.contain_subjective
     *
     * @return the value of exam.contain_subjective
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public Integer getContainSubjective() {
        return containSubjective;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.contain_subjective
     *
     * @param containSubjective the value for exam.contain_subjective
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setContainSubjective(Integer containSubjective) {
        this.containSubjective = containSubjective;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.Start_time
     *
     * @return the value of exam.Start_time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.Start_time
     *
     * @param startTime the value for exam.Start_time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.length
     *
     * @return the value of exam.length
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public Integer getLength() {
        return length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.length
     *
     * @param length the value for exam.length
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setLength(Integer length) {
        this.length = length;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.Create_time
     *
     * @return the value of exam.Create_time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.Create_time
     *
     * @param createTime the value for exam.Create_time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.Creator
     *
     * @return the value of exam.Creator
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.Creator
     *
     * @param creator the value for exam.Creator
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.Update_Time
     *
     * @return the value of exam.Update_Time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.Update_Time
     *
     * @param updateTime the value for exam.Update_Time
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.Updator
     *
     * @return the value of exam.Updator
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.Updator
     *
     * @param updator the value for exam.Updator
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setUpdator(String updator) {
        this.updator = updator == null ? null : updator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam.paper_id
     *
     * @return the value of exam.paper_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getPaperId() {
        return paperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam.paper_id
     *
     * @param paperId the value for exam.paper_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setPaperId(String paperId) {
        this.paperId = paperId == null ? null : paperId.trim();
    }
}