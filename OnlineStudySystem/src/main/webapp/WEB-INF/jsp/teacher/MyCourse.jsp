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
<title>课程列表</title>
<link href="<%=basepath%>/static/css/cy-global.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="<%=basepath%>/static/css/modalBox.css">
<script type="text/javascript" src="<%=basepath%>/static/js/jquery-1.7.2.js"></script>
</head>

<body>
<input type="hidden" name="basepath" value="${basepath}"  />
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
</div>
<!-- #EndLibraryItem -->
<div class="container">
    <div class="kc">
        <div class="kc-title">
            <h3 class="title"><span>课程列表</span></h3>
        </div>
        <div class="kc-search">
            <form action="/teacher/queryCourse" method="post" >
                <table width="100%">
                    <tr>
                        <td width="30%">
                            <label>课程名</label>
                            <input class="kc-input" type="text" name="courseName"/><input class="kc-search" type="submit" value="" /> 
                        </td>
                        
                        <td width="20%">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
        <table width="100%" border="1" cellpadding="10" cellspacing="10" class="kc-tab" style="table-layout:fixed;">
            <tr>
                <th width="20%">课程名称</th>
                <th width="28%">简介</th>
                <th width="8%">章节</th>
                <th width="26%">操作</th>
            </tr>
            <c:forEach items="${courseList.list}" var="course">
            
           
            <tr>
                <td width="20%" style=" word-break:keep-all;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;">
                	<a class="kc-tab-title" href="/teacher/previewPage?courseId=${course.courseId}&description=${course.description}&courseName=${course.courseName}">
                	${course.courseName}</a></td>
                <td width="28%" style=" word-break:keep-all;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;">
                	${course.description}</td>
                <td width="8%" style=" word-break:keep-all;white-space:nowrap;overflow:hidden;text-overflow:ellipsis;">
                	${course.chapterNum}</td>
                <td width="26%">
                    <a href="/teacher/modifyPage?courseId=${course.courseId}" id="edit">修改</a>
                    <a href="/teacher/addPage?courseId=${course.courseId}&courseName=${course.courseName}" >章节添加</a> 
                    <a class="delete" href="/teacher/statePage?courseId=${course.courseId}">课程状态</a></td>
            </tr>
            </c:forEach> 
                
        </table>
        <div class="pages">
        	当前第<span class="yeshu">${courseList.pageNum}</span>页  共<span class="zongyeshu">${courseList.pages}</span>页
            <div class="page-right">
                <a href="" class="first">首页</a>
                <c:if test="${courseList.isHasPreviousPage()}">
					<a href="" class="pre">上一页</a>
				</c:if>
                <span>1</span>
                <c:if test="${courseList.isHasNextPage()}">
					<a href=""  class="next">下一页</a>
				</c:if>
                <a href="" class="last">末页</a>
            </div>
        </div>
    </div>
</div>
<!-- #BeginLibraryItem "/Library/foot.lbi" --><div class="foot">
    <p>湖北师范大学</p>
</div><!-- #EndLibraryItem -->
  
</body>
<script type="text/javascript">

$(function(){
	//获得当前页的页码
	var a=$(".yeshu").text();
	//获得总页数
	var b=$(".zongyeshu").text();
	//下一页实现
	$(".next").click(function(){
		var pageIndex=a;
		pageIndex++;
		$(".next").attr("href",$('input[name=basepath]').val()+"/teacher/coursetab?pageIndex="+pageIndex);
	})
	//上一页实现
	$(".pre").click(function(){
		var pageIndex=a;
		pageIndex--;
		$(".pre").attr("href",$('input[name=basepath]').val()+"/teacher/coursetab?pageIndex="+pageIndex);
	})
	//首页实现
	$(".first").click(function(){
		alert(11111);
		$(".first").attr("href",$('input[name=basepath]').val()+"/teacher/coursetab?pageIndex=1");
	})
	//尾页实现
	$(".last").click(function(){
		var pageIndex=b;
		$(".last").attr("href",$('input[name=basepath]').val()+"/teacher/coursetab?pageIndex="+pageIndex);
	})
})


</script>
</html>