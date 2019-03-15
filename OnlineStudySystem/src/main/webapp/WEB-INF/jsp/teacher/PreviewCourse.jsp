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
<title>预览课程</title>
<link href="<%=basepath%>/static/css/cy-global.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div class="container play">
	<div class="play-bg">
    	<div class="play-title">
        	<div class="play-title-left">
            	<span class="zj">课程名称</span>
                <span class="title">${course.courseName}</span>
            </div>
        </div>
        <div class="production">
            <h3>课程介绍</h3>
            <p>${course.description}</p>
        </div>
        <div class="play-list">
        	<div class="play-list-title">相关章节
            </div>
            <div class="play-list-content h450">
            	<table width="100%" border="0" cellspacing="0" cellpadding="0">
            		<tr>
            			<td>章节编号</td>
            			<td>章节说明</td>
            		</tr>
            	<c:forEach items="${chapter}" var="chapter">
                    <tr>
                        <td>${chapter.chapterIndex}</td>
                        <td>${chapter.chapterContent}</td>
                    </tr>
                </c:forEach> 
                </table>
            </div>
        </div>
    </div>
    <div class="container">
    	<table class="tabpanels" width="100%" cellspacing="0" cellpadding="0">
            <tr>
                <td class="QA" width="100%"></td>
            </tr>
        </table>
        <div class="kc">
           
        </div>
       
        <a class="backtop" href="#"></a>
    </div>
</div>
<!-- #BeginLibraryItem "/Library/foot.lbi" --><div class="foot">
	<p>湖北师范大学</p>
</div><!-- #EndLibraryItem -->
</body>
</html>