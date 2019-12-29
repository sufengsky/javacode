<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.core.*"%>
<%@ page import="com.dao.*,com.model.*"%>
<%

    // 获取用户输入的用户名和密码
	String uid = ParamUtils.getRequestString(request, "uid");
	String password = ParamUtils.getRequestString(request, "password");
	//out.println("uid:" + uid + "    " + "password:" + password);

	session.removeAttribute("error");
    session.removeAttribute("user");
	
	DbBasetableFactory bf = new DbBasetableFactory();
	User u = bf.SearchUser("where uid='" + uid + "' and password='" + password + "'");
	if (u.getUid() == null) {
		session.setAttribute("error", "用户名或密码错误");
		response.sendRedirect("index.jsp");
	} else if (uid != null && !"".equals(uid) && u.getStatus() == FinalConstants.STATUS_ADMIN) {
		session.setAttribute("user", u);
		response.sendRedirect("admin/index1.jsp");
	} else if ((uid != null && !"".equals(uid) && u.getStatus() == FinalConstants.STATUS_USER)) {
		session.setAttribute("user", u);
		System.out.println("u.getName"+u.getName());
		response.sendRedirect("homepage.jsp");
	} else {
		session.setAttribute("error", "用户名或密码错误");
		response.sendRedirect("error.jsp");
	}
%>

