<%@ page language="java"
	import="java.util.*,com.core.*,com.dao.*,com.model.*"
	pageEncoding="gbk"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%
if (!Crazyadept.UserIsOK(session, FinalConstants.STATUS_ADMIN))
		return;
	/*String name=ParamUtils.getRequestString(request,"name");
	String uid=ParamUtils.getRequestString(request,"uid");
	String banji=ParamUtils.getRequestString(request,"banji");
	System.out.println("name:"+name+"uid:"+uid+"banji"+banji);*/
	
	session.removeAttribute("error");
	DbBasetableFactory bf = new DbBasetableFactory();
	if (bf.CreatUser(request)) {
		out.println("��ϲ�����û�¼��ɹ���");
	} else {
		session.setAttribute("error", "����û�ʧ�ܣ�");
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
<html>
  <head>
    <title>check_user</title>
  </head>

	<body>
		<table width="433" height="65" border="0" align="center">
			<tr>
				<td class="STYLE7">
					<a href="add_user.jsp">����¼��</a>
				</td>
				<td>
					<a href="main.jsp" class="STYLE7" >������ҳ��</a>
				</td>
			</tr>
		</table>
</html>
