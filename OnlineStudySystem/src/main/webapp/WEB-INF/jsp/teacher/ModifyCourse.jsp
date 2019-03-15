<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
	String basepath=request.getScheme()+
			"://"+request.getServerName()+
			":"+request.getServerPort()+
			request.getContextPath();
	request.setAttribute("basepath", basepath);
	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>修改课程</title>
<link href="<%=basepath%>/static/css/Course.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="<%=basepath%>/static/css/cy-global.css" />
<script src="jquery-1.7.2.js" type="text/javascript"></script>
    <script src="<%=basepath%>/static/incjs/jquery-ui/jquery-ui.min.js" type="text/javascript"></script>
    <link rel="stylesheet" href="<%=basepath%>/static/css/style.css">


    <style>
        .tm_qscore{
            background-color:#fff; border:1px solid #ccc;
            height:15px; padding:3px 5px; font-size:12px; line-height:15px; color:#555;
            vertical-align:middle; -webkit-border-radius:3px; -moz-border-radius:3px; border-radius:3px;
        }
        .tm_position_adjustment{
            float:left; margin-right:10px; margin-top:3px;
        }
    </style>
    
    

    <script type="text/javascript">
        
        var var_exam_users = "0";
        var pager = null;
        var var_sectionId = 0;
        
        $(document).ready(function() {
            tmPaper.pageInit();
            pager = new Pagination("listnav");
            tmPaper.searchQuestions(1);
        });
        

        var tmPaper = {
            uiInit : function(){
                $( ".tm_adm_questionlist" ).unbind("sortstop");

                $( ".tm_adm_questionlist" ).sortable({connectWith: ".tm_adm_questionlist"}).disableSelection();
                $( ".tm_adm_questionlist" ).bind('sortstop', function(event, ui) {
                    //===================检查是否存在--开始===================
                    //当前选中的qid
                    var _current_qid = ui["item"].find("input[name^='p_question_ids_']").val();
                    //alert(_current_qid);
                    //判断是否存在VALUE是这个QID的控件对象
                    var _exsit_checker = $("#paper_sections").find("input[value='"+_current_qid+"']");
                    if(_exsit_checker.length>1){
                        alert("目标试题已经存在，请不要重复添加");
                        ui["item"].remove();
                        return;
                    }
                    //===================检查是否存在--结束===================


                    //当前拖动的对象的父对象
                    var questionUL = ui["item"].parent();
                    //获取父对象的章节ID
                    var section_id = questionUL.data("sectionid");
                    //alert(section_id);

                    //批量对下级空间更改命名
                    questionUL.find("input[name^='p_question_scores_']").attr("name","p_question_scores_"+section_id);
                    questionUL.find("input[name^='p_question_types_']").attr("name","p_question_types_"+section_id);
                    questionUL.find("input[name^='p_question_ids_']").attr("name","p_question_ids_"+section_id);
                    questionUL.find("input[name^='p_question_cnts_']").attr("name","p_question_cnts_"+section_id);
                });   
                $( ".tm_adm_paper_body_section" ).sortable({connectWith: ".tm_adm_paper_body_section"}).disableSelection();

                //绑定计算分数的方法
                $(".tm_qscore").unbind("change");
                $(".tm_qscore").bind("change", function(){
                    tmPaper.countScore();
                });

            },
            
            addSection : function(){
                var_sectionId++;
                var html = [];
                html.push('<li>');
                html.push(' <dl class="tm_adm_paper_body_section_dl">');
                html.push('  <dt>');
                html.push('    <span class="section_title">');
                html.push('      章节名称 : ');
                html.push('      <input type="text" name="ChapterDtos['+var_sectionId+'].chapterName" class="validate[required] tm_txt" size="20" />');
                html.push('    </span>');
                html.push('    <span class="section_tools">');

                html.push('      <a href="javascript:void(0);" onclick="javascript:tmPaper.removeSection(this);" class="tm_ico_delete tm_position_adjustment">×</a>');
                html.push('    </span>');
                html.push('    <input type="hidden" name="ChapterDtos['+var_sectionId+'].chapterIndex" value="'+var_sectionId+'" />');
                html.push('  </dt>');
                html.push('  <dt>');
                html.push('     章节描述 : ');
                html.push('     <input type="text" class="validate[required] tm_txt" size="20" name="ChapterDtos['+var_sectionId+'].chapterContent" />');
                html.push('  </dt>');

                html.push('  <dt>');
                html.push('     文件名: ');
                html.push('     <input type="text" class="validate[required] tm_txt" size="20" name="ChapterDtos['+var_sectionId+'].fileName" />');
                html.push('     上传文件: ');
                html.push('     <input type="file" class="validate[required] tm_txt" size="20" name="ChapterDtos['+var_sectionId+'].fileUrl" />');
                html.push('  </dt>');
                html.push(' </dl>');
                html.push('</li>');
                $("#paper_sections").append(html.join(""));
                tmPaper.uiInit();
            },

            toggleSection : function(obj){
                var pobj = $(obj).parent().parent().parent();
                var current_ico = $(obj).attr("class");
                
                if(pobj){
                    if(current_ico.indexOf("tm_ico_max")>-1){
                        $(obj).removeClass("tm_ico_max");
                        $(obj).addClass("tm_ico_min");
                        pobj.children("dd").slideUp();
                    }else{
                        $(obj).removeClass("tm_ico_min");
                        $(obj).addClass("tm_ico_max");
                        pobj.children("dd").slideDown();
                    }
                }
            },
            
            removeSection : function(obj){
                var pobj = $(obj).parent().parent().parent().parent();
                if(pobj.is("li")){
                    pobj.remove();
                }else{
                    pobj.parent().remove();
                }
                tmPaper.countScore();
            },

            expandSection : function(){
                $(".tm_adm_paper_body_section_dl dd ").slideDown();
                $(".tm_ico_min").removeClass("tm_ico_min").addClass("tm_ico_max");
            },

            shrinkSection : function(){
                $(".tm_adm_paper_body_section_dl dd ").slideUp();
                $(".tm_ico_max").removeClass("tm_ico_max").addClass("tm_ico_min");
            },
            
            countScore : function(){
                var totalscore = 0, passscore = 0;
                $(".tm_adm_paper_body_section .tm_qscore").each(function(i,o){
                    var score = parseInt($(this).val());
                    totalscore += score;
                    
                });
                passscore = Math.ceil(0.6 * totalscore);
                $("input[name='p_total_score']").val(totalscore);
                $("input[name='p_pass_score']").val(passscore);
            },

            removeItem : function(obj){
                var pobj = $(obj).parent().parent().parent().parent();
                if(pobj.is("li")){
                    pobj.remove();
                }else{
                    pobj.parent().remove();
                }
                tmPaper.countScore();
            },
            
        
        };
    </script>

</head>

<body>
<div style="padding:10px 0;">
    <div class="container">
        <img src="<%=basepath%>/static/images/在线课堂图标.jpg" width="161" height="52" />
    </div>
</div>
<div class="top-bg">
    <div class="container">
        <form class="search-form" action="post">
            <div class="select-box">            
                <ul class="select-ul">
                    <li>
                        <a href="#">
                            <input type="text" value="课程版本" />
                            <input type="button" />
                        </a>
                     </li>
                </ul>
            </div>
            <div class="select-box">            
                <ul class="select-ul">
                    <li>
                        <a href="#">
                            <input type="text" value="学段年级" />
                            <input type="button" />
                        </a>
                     </li>
                </ul>
            </div>
            <div class="search-box">
                <input type="text" value="搜索" />
                <input type="button" />
            </div>
        </form>
        <div class="user-info">
            <ul>
                <li>
                    <a class="head-portrait head-portrait-s" href="#"></a>
                 
                </li>
                <li><a class="shopping-cart" href="#"><span>1</span></a></li>
                <li><a class="news" href="#"><span>1</span></a></li>
            </ul>
        </div>
    </div>
</div><!-- #BeginLibraryItem "/Library/menu.lbi" --><div class="menu_bg">
    <div class="container">
        <div class="logo">
            <a href="#"></a>
        </div>
        <ul class="menu">
            <li><a class="curriculum" href="我的课程.html"><p>我的课程</p></a></li>
            <li>
                <a class="learning-plan" href="#"><p>我的考试</p></a>
                <ul>
                    <li><a href="题库列表.html">题库管理</a></li>
                    <li><a href="试卷管理.html">试卷管理</a></li>
                </ul>
            </li>
            <li><a class="my-group" href="#"><p>测试结果</p></a></li>
            <li><a class="personal-center" href="user_info.html"><p>个人中心</p></a>
                <ul>
                    <li><a href="user_pass.html">修改密码</a></li>
                </ul>
            </li>
            <li><a class="overview-resources" href="#"><p>我的论坛</p></a></li>
        </ul>
    </div>
</div><!-- #EndLibraryItem -->
<div class="container">
	<div class="courses-div">
    	<div class="course-title">
        	<h3 class="title"><span>我的课程——课程修改</span></h3>
        </div>

        <form method="post"  enctype="multipart/form-data" action="/teacher/addCourse?courseId= ${modifyCo.courseId}" class="formg" > 

        <div class="cu-info">
            <div class="cu-in-info">简介：<input type="text" class="cu-introduce" name="description"/></div>
        </div>
        <div class="cu-add">
            <table>
            <tr>
            <td>
           
            <div class="tm_adm_paper_tool">
                <button class="tm_btn " type="button" onclick="tmPaper.addSection()">新添章节</button>
            </div>

            <div class="tm_adm_paper_body">
                                        
                <ul class="tm_adm_paper_body_section" id="paper_sections">
                    <li>
                        <dl class="tm_adm_paper_body_section_dl">
                            <dt>
                                <span class="section_title">
                                    章节名称 : 
                                    <input type="text" name="ChapterDtos[0].chapterName" class="validate[required] tm_txt" size="20" />
                                </span>
                                <span class="section_tools">
                                    <a href="javascript:void(0);" onclick="javascript:tmPaper.removeSection(this);" class="tm_ico_delete tm_position_adjustment" >×</a>
                                </span>
                                <input type="hidden" name="ChapterDtos[0].chapterIndex" value="0" />
                            </dt>
                            <dt>
                                章节描述 :
                                <input type="text" class="validate[required] tm_txt" size="20" name="ChapterDtos[0].chapterContent" />
                            </dt>
                            <dt>
                                文件名：<input type="text"  class="validate[required] tm_txt" size="20" name="ChapterDtos[0].fileName"> 上传文件：<input type="file"  class="validate[required] tm_txt" size="20" name="ChapterDtos[0].fileUrl">
                            </dt>
                        </dl>
                    </li>
                </ul>
            </div>
                                    <!-- /tm_adm_paper_body -->
                                    
            <div class="tm_adm_paper_foot">
                <button class="tm_btn tm_btn_primary" type="submit" onclick="javascript:tmPaper.submit()">提交</button>
                <button class="tm_btn" type="button" onclick="location.href='${basepath}/teacher/coursetab'">取消</button>
            </div>
            
            </td>
            </tr>
            </table>
        </div>
        </form>
        <div class="cu-ul-show">
           <ul class="ul-lis">
               <li>章节名称</li>
               <li>章节描述</li>
               <li>文件名</li>
               <li>操作</li>
           </ul>
           <c:forEach items="${modifyCh}" var="ch">
           
           
           <ul class="ul-lis">
               <li>${ch.chapterIndex}</li>
               <li>${ch.chapterContent}</li>
               <li>第一章word文档</li>
               <li><input type="button" value="删除" onclick="location.href='${basepath}/teacher/delChapter?chapterId=${ch.chapterId}&courseId=${modifyCo.courseId}'"/></li>
           </ul>
           </c:forEach>
              
        </div>

        
    </div>
</div>

<div class="foot"></div>
</body>
</html>