<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="com.model.*"%>
<%@ page import="com.core.*"%>
<%@page import="com.dao.*"%>
<html>
	<style type="text/css">
<!--
.STYLE1 {
	font-size: 24px;
	color: #FF0000;
}

.STYLE2 {
	font-size: 24px
}
-->
</style>

	<head>
	<script>
	function check(){
	if(form1.name.value==""){
	alert("����������"); 
	return false;
	}
	if(form1.password.value==""){
	alert("����������");
	return false;
	}
	if(form1.uid.value==""){
	alert("������ѧ��");
	return false;
	}
	if(form1.banji.value==""){
	alert("������༶");
	return false;
	}
	if(form1.yuanxi.value){
	alert("������Ժϵ");
	return false;
	}
	
	}
	</script>
		<title>�û���Ϣ�޸�</title>
	</head>

	<%
	
		DbBasetableFactory bf = new DbBasetableFactory();
		String uid = ParamUtils.getRequestString(request, "uid");
		User u = bf.SearchUser("WHERE uid='" + uid + "'");
		session.setAttribute("user",u);
		System.out.println("uid"+u.getBanji());
	%>
	<form id="form1" name="form1" method="post" action="modify_user.jsp">
		<table width="588" height="332" border="0" align="center">
			<tr>
				<td colspan="3">
					<div align="center">
						<span class="STYLE1">ѧ����Ϣ�޸�</span>
					</div>
				</td>
			</tr>
			<tr>
				<td width="235">
					<div align="center" class="STYLE2">
						<div align="right">
							������
						</div>
					</div>
				</td>
				<td colspan="2">
					<label>
						<input type="text" name="name" />
					</label>
				</td>
			</tr>
			<tr>
				<td>
					<div align="center" class="STYLE2">
						<div align="right">
							ѧ�ţ�
						</div>
					</div>
				</td>
				<td colspan="2">
					<input type="text" name="uid" />
				</td>
			</tr>
			<tr>
				<td>
					<div align="center" class="STYLE2">
						<div align="right">
							�༶��
						</div>
					</div>
				</td>
				<td colspan="2">
					<label>
						<input type="text" name="banji" />
					</label>
				</td>
			</tr>
			<tr>
				<td>
					<div align="center" class="STYLE2">
						<div align="right">
							Ժϵ��
						</div>
					</div>
				</td>
				<td colspan="2">
					<label>
						<input type="text" name="yuanxi" />
					</label>
				</td>
			</tr>
			<tr>
				<td>
					<div align="center" class="STYLE2">
						<div align="right">
							���룺
						</div>
					</div>
				</td>
				<td colspan="2">
					<label>
						<input type="text" name="password" />
					</label>
				</td>
			</tr>
			<tr>
				
			</tr>
			<tr>
				<td>
					<label>
						<input type="hidden" name="action" value="modify">
						<input type="hidden" name="uid_v" value="<%=u.getUid()%>">
						<div align="right">
							<input name="Submit" type="submit" value="����" onClick="return check();"/>
						</div>
					</label>
				</td>
				<td width="55">
					&nbsp;
				</td>
				<td width="224">
					<label>
						<input name="Submit2" type="reset" value="ȡ��" />
					</label>
				</td>
			</tr>
		</table>
	</form>
</html>