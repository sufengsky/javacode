<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.sf.dao.StringUtil"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
	System.out.println(basePath);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">
		<title>index</title>
	</head>

	<body>
		您好，基本的环境已经配置好了 aaaaaa<br/>
		<%=StringUtil.isEmptyString("test")%>
		<br/>
		<%out.print("hello world"); %>
		
		<%@include file="foot.jsp"%>
	</body>
</html>
