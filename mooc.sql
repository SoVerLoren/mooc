/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : mooc

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2019-03-15 14:26:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `Admin_NO` varchar(255) NOT NULL COMMENT '管理员编号',
  `User_ID_A` varchar(255) DEFAULT NULL COMMENT '用户编号',
  `Name` varchar(255) DEFAULT NULL COMMENT '管理员名',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Admin_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for `answer`
-- ----------------------------
DROP TABLE IF EXISTS `answer`;
CREATE TABLE `answer` (
  `answer_id` char(10) NOT NULL COMMENT '答案编号',
  `question_id` varchar(255) DEFAULT NULL COMMENT '问题编号',
  `option_A` char(10) DEFAULT NULL COMMENT '选项A',
  `option_B` char(10) DEFAULT NULL COMMENT '选项B',
  `option_C` char(10) DEFAULT NULL COMMENT '选项C',
  `option_D` char(10) DEFAULT NULL COMMENT '选项D',
  `correct` char(10) DEFAULT NULL COMMENT '参考答案',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`answer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of answer
-- ----------------------------

-- ----------------------------
-- Table structure for `chapter`
-- ----------------------------
DROP TABLE IF EXISTS `chapter`;
CREATE TABLE `chapter` (
  `chapter_id` char(16) NOT NULL COMMENT '主键',
  `chapter_content` char(10) DEFAULT NULL COMMENT '章节内容',
  `course_id` char(10) DEFAULT NULL COMMENT '所属课程编号',
  `weight` int(11) DEFAULT NULL COMMENT '章节所占比重',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  `Video_Path` varchar(255) DEFAULT NULL COMMENT '视频路径',
  `work_path` varchar(255) DEFAULT NULL COMMENT '作业地址',
  `chapter_index` int(11) DEFAULT NULL COMMENT '章节序号',
  PRIMARY KEY (`chapter_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of chapter
-- ----------------------------
INSERT INTO `chapter` VALUES ('1811066K2HS4AN2W', '236', '11', null, null, null, null, null, 'D:/Javacode/OnlineStudySystem/src/main/resources/static/chapterFile/1541466944483_gaoshu_10.24日报-汪昆.docx', null, '0');
INSERT INTO `chapter` VALUES ('181106CMAB84N4SW', '123', '12', null, null, null, null, null, 'D:/Javacode/OnlineStudySystem/src/main/resources/static/chapterFile/1541497440046_hello_10.22日报-汪昆.docx', null, '0');

-- ----------------------------
-- Table structure for `class`
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `class_id` varchar(255) NOT NULL COMMENT '班级编号',
  `class_name` varchar(255) DEFAULT NULL COMMENT '班级名',
  `subject` varchar(255) DEFAULT NULL COMMENT '所属专业',
  `college` varchar(255) DEFAULT NULL COMMENT '所属学院',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`class_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------

-- ----------------------------
-- Table structure for `class_course`
-- ----------------------------
DROP TABLE IF EXISTS `class_course`;
CREATE TABLE `class_course` (
  `id` varchar(255) NOT NULL DEFAULT '' COMMENT '班级课程表 主键',
  `course_id` varchar(255) DEFAULT NULL COMMENT '课程编号',
  `Class_ID` varchar(255) DEFAULT NULL COMMENT '班级编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class_course
-- ----------------------------
INSERT INTO `class_course` VALUES ('1', '11', '9');
INSERT INTO `class_course` VALUES ('3', '12', '8');

-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `replay_id` char(10) NOT NULL COMMENT '回复编号',
  `topic_id` char(10) DEFAULT NULL COMMENT '主题编号',
  `replay_content` char(10) DEFAULT NULL COMMENT '回复内容',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`replay_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `course_id` varchar(255) NOT NULL COMMENT '课程编号',
  `course_name` varchar(255) DEFAULT NULL COMMENT '课程名称',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  `Resource_Path` char(10) DEFAULT NULL COMMENT '资源路径',
  `description` varchar(255) DEFAULT NULL COMMENT '课程描述',
  `open` int(11) DEFAULT NULL COMMENT '是否开课，0表示未开课，1表示已开课',
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('11', 'yinyue', '2018-09-28', null, null, null, null, 'sasasasasasaqw', null);
INSERT INTO `course` VALUES ('12', 'shuxue', '2018-09-26', null, null, null, null, '亲爱我的歌撒啊', null);
INSERT INTO `course` VALUES ('13', 'shengwu', '2018-09-26', null, null, null, null, 'papapapapapapa', null);
INSERT INTO `course` VALUES ('14', 'yuwen', '2018-09-27', null, null, null, null, 'opopopopopop', null);
INSERT INTO `course` VALUES ('15', 'meishu', '2018-09-27', null, null, null, null, 'lalalalalalalalalala', null);

-- ----------------------------
-- Table structure for `course_exam`
-- ----------------------------
DROP TABLE IF EXISTS `course_exam`;
CREATE TABLE `course_exam` (
  `id` char(10) DEFAULT NULL COMMENT '课程考试表 主键',
  `course_id` varchar(255) DEFAULT NULL COMMENT '课程编号',
  `exam_id` varchar(255) DEFAULT NULL COMMENT '考试编号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course_exam
-- ----------------------------
INSERT INTO `course_exam` VALUES ('1', '11', '21');
INSERT INTO `course_exam` VALUES ('2', '11', '22');
INSERT INTO `course_exam` VALUES ('3', '11', '23');
INSERT INTO `course_exam` VALUES ('4', '11', '24');

-- ----------------------------
-- Table structure for `exam`
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam` (
  `exam_id` char(10) NOT NULL COMMENT '考试编号',
  `course_id` char(10) DEFAULT NULL COMMENT '课程编号',
  `question_num` char(10) DEFAULT NULL COMMENT '题目熟练那个',
  `contain_subjective` int(11) DEFAULT NULL COMMENT '是否包含主观题',
  `Start_time` date DEFAULT NULL COMMENT '开始日期',
  `length` int(11) DEFAULT NULL COMMENT '考试时长',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  `paper_id` varchar(255) DEFAULT NULL COMMENT '试卷编号',
  PRIMARY KEY (`exam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam
-- ----------------------------

-- ----------------------------
-- Table structure for `exam_class`
-- ----------------------------
DROP TABLE IF EXISTS `exam_class`;
CREATE TABLE `exam_class` (
  `id` char(10) DEFAULT NULL COMMENT '考试班级表 主键',
  `exam_id` char(10) DEFAULT NULL COMMENT '考试编号',
  `class_id` char(10) DEFAULT NULL COMMENT '考试班级编号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of exam_class
-- ----------------------------

-- ----------------------------
-- Table structure for `grade`
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `grade_id` char(10) DEFAULT NULL COMMENT '成绩表 主键',
  `student_no` char(255) DEFAULT NULL COMMENT '学号',
  `class_id` varchar(255) DEFAULT NULL COMMENT '班级号',
  `paper_id` varchar(255) DEFAULT NULL COMMENT '试卷号',
  `subjective_score` char(10) DEFAULT NULL COMMENT '客观题得分',
  `objective_score` char(10) DEFAULT NULL COMMENT '主观题得分',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  `Score` char(10) DEFAULT NULL COMMENT '总分'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES ('21512422', '2015115050141', null, '21', null, null, null, null, null, null, '60');
INSERT INTO `grade` VALUES ('20152235', '2015115050141', null, '22', null, null, null, null, null, null, '70');
INSERT INTO `grade` VALUES ('21534662', '2015115050141', null, '23', null, null, null, null, null, null, '80');
INSERT INTO `grade` VALUES ('53815648', '2015115050141', null, '24', null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `paper`
-- ----------------------------
DROP TABLE IF EXISTS `paper`;
CREATE TABLE `paper` (
  `question_id` varchar(255) DEFAULT NULL COMMENT '试题编号',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  `paper_id` char(10) DEFAULT NULL COMMENT '试卷编号',
  `value` double(11,0) DEFAULT NULL COMMENT '分值'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of paper
-- ----------------------------

-- ----------------------------
-- Table structure for `question`
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `question_id` char(10) NOT NULL COMMENT '题目编号',
  `Updator` varchar(255) DEFAULT NULL,
  `title` char(10) DEFAULT NULL COMMENT '题目标题',
  `class_id` char(10) DEFAULT NULL COMMENT '所属课程',
  `chapter_id` char(10) DEFAULT NULL COMMENT '所属章节',
  `out_num` char(10) DEFAULT NULL COMMENT '出卷次数',
  `defficulty` char(10) DEFAULT NULL COMMENT '题目难度',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `type_id` varchar(255) DEFAULT NULL COMMENT '试题类型',
  PRIMARY KEY (`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of question
-- ----------------------------

-- ----------------------------
-- Table structure for `questiontype`
-- ----------------------------
DROP TABLE IF EXISTS `questiontype`;
CREATE TABLE `questiontype` (
  `type_id` char(10) NOT NULL COMMENT '类型编号',
  `name` char(10) DEFAULT NULL COMMENT '类型名',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of questiontype
-- ----------------------------

-- ----------------------------
-- Table structure for `record`
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `record_id` varchar(255) NOT NULL COMMENT '学生回答记录编号',
  `stu_no` varchar(255) NOT NULL COMMENT '学生学号',
  `paper_id` varchar(255) NOT NULL COMMENT '试题编号',
  `question_id` varchar(255) NOT NULL COMMENT '题目编号',
  `answer` varchar(255) DEFAULT NULL COMMENT '学生解答'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of record
-- ----------------------------

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `Student_NO` varchar(255) NOT NULL COMMENT '学号',
  `User_ID_S` varchar(255) DEFAULT NULL COMMENT '用户编号',
  `College_Name` varchar(255) DEFAULT NULL COMMENT '所属学院名称',
  `Subject_Name` varchar(255) DEFAULT NULL COMMENT '所属专业名称',
  `Class_id` varchar(255) DEFAULT NULL COMMENT '所属班级编号',
  `phone` varchar(255) DEFAULT NULL COMMENT '联系方式',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  `Name` varchar(255) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`Student_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('2015115050121', null, 'hushi', null, '8', null, null, null, null, null, null, 'ming');
INSERT INTO `student` VALUES ('2015115050141', null, 'hushi', null, '9', null, null, null, null, null, null, 'uzi');

-- ----------------------------
-- Table structure for `subject`
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `Subject_ID` char(10) NOT NULL COMMENT '栏目表 主键',
  `Subject_Name` varchar(255) DEFAULT NULL COMMENT '栏目名',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Subject_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subject
-- ----------------------------

-- ----------------------------
-- Table structure for `teacher`
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `Teacher_NO` varchar(255) NOT NULL COMMENT '教师编号',
  `User_ID_T` varchar(255) DEFAULT NULL COMMENT '用户编号',
  `Name` varchar(255) DEFAULT NULL COMMENT '教师姓名',
  `Colleage_Name` varchar(255) DEFAULT NULL COMMENT '所属学院',
  `Subject_Name` varchar(255) DEFAULT NULL COMMENT '所属专业',
  `Class_id` varchar(255) DEFAULT NULL COMMENT '所属班级编号',
  `phone` varchar(255) DEFAULT NULL COMMENT '联系方式',
  `sex` varchar(255) DEFAULT NULL COMMENT '性别',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Teacher_NO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------

-- ----------------------------
-- Table structure for `teachercourse`
-- ----------------------------
DROP TABLE IF EXISTS `teachercourse`;
CREATE TABLE `teachercourse` (
  `id` varchar(255) DEFAULT NULL COMMENT '教师课程表 主键',
  `teacher_id` varchar(255) DEFAULT NULL COMMENT '教师编号',
  `course_id` varchar(255) DEFAULT NULL COMMENT '课程编号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teachercourse
-- ----------------------------
INSERT INTO `teachercourse` VALUES ('1', '21', '11');
INSERT INTO `teachercourse` VALUES ('2', '21', '12');
INSERT INTO `teachercourse` VALUES ('3', '21', '13');
INSERT INTO `teachercourse` VALUES ('4', '21', '14');
INSERT INTO `teachercourse` VALUES ('5', '21', '15');

-- ----------------------------
-- Table structure for `topic`
-- ----------------------------
DROP TABLE IF EXISTS `topic`;
CREATE TABLE `topic` (
  `Topic_ID` char(10) NOT NULL COMMENT '主题编号',
  `Subject_ID` char(10) DEFAULT NULL COMMENT '所属栏目编号',
  `title` char(10) DEFAULT NULL COMMENT '主题',
  `description` char(10) DEFAULT NULL COMMENT '主题描述',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Topic_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of topic
-- ----------------------------

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `User_ID` varchar(255) NOT NULL COMMENT '用户编号',
  `Nick_Name` varchar(255) DEFAULT NULL COMMENT '用户昵称',
  `User_Type` decimal(8,0) DEFAULT NULL COMMENT '用户类型',
  `Role_ID` decimal(8,0) DEFAULT NULL COMMENT '角色ID',
  `Create_time` date DEFAULT NULL,
  `Creator` varchar(255) DEFAULT NULL,
  `Update_Time` date DEFAULT NULL,
  `Updator` varchar(255) DEFAULT NULL,
  `Login_Name` varchar(255) DEFAULT NULL COMMENT '登录名',
  `Login_Pwd` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`User_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�����û������ű���';

-- ----------------------------
-- Records of users
-- ----------------------------
