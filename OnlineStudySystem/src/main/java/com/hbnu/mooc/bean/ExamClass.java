package com.hbnu.mooc.bean;

public class ExamClass {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_class.id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_class.exam_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String examId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column exam_class.class_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    private String classId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_class.id
     *
     * @return the value of exam_class.id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_class.id
     *
     * @param id the value for exam_class.id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_class.exam_id
     *
     * @return the value of exam_class.exam_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getExamId() {
        return examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_class.exam_id
     *
     * @param examId the value for exam_class.exam_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setExamId(String examId) {
        this.examId = examId == null ? null : examId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column exam_class.class_id
     *
     * @return the value of exam_class.class_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public String getClassId() {
        return classId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column exam_class.class_id
     *
     * @param classId the value for exam_class.class_id
     *
     * @mbg.generated Thu Sep 20 16:18:00 CST 2018
     */
    public void setClassId(String classId) {
        this.classId = classId == null ? null : classId.trim();
    }
}