<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="com.model.*"%>
<%@ page import="com.core.*"%>
<%@ page import="com.dao.*,java.util.*,java.sql.*"%>
<%
	session.removeAttribute("error");
	String action = request.getParameter("action").toString();
	String id = request.getParameter("id");
	//System.out.print("user attri"+us.getBanji());
	DbBasetableFactory bf = new DbBasetableFactory();
	if (action == null || "".equals(action)) {
		return;
	}  else if ("del".equals(action) && bf.DeleteSelectChp("WHERE id='" + id + "'") &&bf.DeleteSelectDiff("where id='"+id+"'")) {
		response.sendRedirect("set_select.jsp");
	}  else {
		session.setAttribute("error", "���½���Ϣ�б��в���ʧ��");
		response.sendRedirect("error.jsp");
	}
%>
