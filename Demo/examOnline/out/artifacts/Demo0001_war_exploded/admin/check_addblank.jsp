<%@ page language="java"
	import="java.util.*,com.core.*,com.dao.*,com.model.*"
	pageEncoding="GBK"%>
<%
	if (!Crazyadept.UserIsOK(session, FinalConstants.STATUS_ADMIN))
		return;
	session.removeAttribute("error");
	//String chp=request.getParameter("chp");
	//String diff=request.getParameter("diff");
//	System.out.println();
	//System.out.print("diff"+diff+" "+"chp"+chp);
	DbBasetableFactory bf = new DbBasetableFactory();
	if (bf.CreatBlank(request)) {
		out.println("��ϲ����ѡ����¼��ɹ���");
	} else {
		session.setAttribute("error", "����ж���ʧ�ܣ�");
		response.sendRedirect("error.jsp");
	}
%>
<style type="text/css">
<!--
.STYLE7 {
	color: #FF0000;
	font-size: 24px;
}
-->
</style>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>


		<title>¼����</title>

	</head>

	<body>
		<table width="433" height="65" border="0" align="center">
			<tr>
				<td class="STYLE7">
					<a href="add_blank.jsp">����¼��</a>
				</td>
				<td>
					<a href="main.jsp" class="STYLE7" >������ҳ��</a>
				</td>
			</tr>
		</table>
	</body>
</html>
