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
<title>课程状态</title>
<link href="<%=basepath%>/static/css/cy-global.css" rel="stylesheet" type="text/css" />
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
	<div class="kc">
    	<div class="kc-title">
        	<h3 class="title"><span>我的课程</span></h3>
        </div>
        <div class="kc-search">
        	<form action="/teacher/selectByName" method="post" enctype="multipart/form-data">
            	<table width="100%">
                	<tr>
                    	<td width="30%">
                            <label>学生姓名</label>
                            <input class="kc-input" type="text" name="name"/>
                            <input  type="hidden" name="courseId" value="${courseForId.courseId}"/>
                            <input class="kc-search" type="submit" value=""  /> 
                        </td>
                        <td width="30%">
                        </td>
                        <td width="20%">
                        </td>
                        <td width="20%"> 
                        </td>
                    </tr>
                </table>
            </form>
        </div>
        <table width="100%" border="1" cellpadding="10" cellspacing="10" class="kc-tab">
        	<tr>
                <th width="15%">课程名称</th>
                <th width="15%">课程状态</th>
                <th width="15%">创建人</th>
                <th width="20%">学号</th>
                <th width="10%">学生</th>
                <th width="25%">学习进度</th>
                
            </tr>
            <c:forEach items="${stateList}" var="state">
            <tr>
                <td>${state.courseName}</td>
                <td>${state.open}</td>
                <td>${state.creator}</td>
                <td>${state.studentNo}</td>
                <td>${state.name}</td>
                <td>${state.speed}</td>
            </tr> 
           </c:forEach>
        </table>
        <div class="pages">
        	<span class="page-left">分页显示：第1页 共1页 (总记录数6条）</span>
            <div class="page-right">
            	<a href="#">首页</a>
                <a href="#">上页</a>
                <span>1</span>
                <a href="#">下页</a>
                <a href="#">末页</a>
            </div>
        </div>
    </div>
</div>
<!-- #BeginLibraryItem "/Library/foot.lbi" --><div class="foot">
	<p>学创教育</p>
</div><!-- #EndLibraryItem --></body>
</html>