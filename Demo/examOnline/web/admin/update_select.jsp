<%@ page contentType="text/html; charset=GBK"%>
<%@ page import="com.model.*"%>
<%@ page import="com.core.*"%>
<%@page import="com.dao.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<style type="text/css">
<!--
.STYLE5 {
	font-size: 36px;
	color: #FF0000;
}

.STYLE6 {
	font-size: 18px
}
.STYLE1 {
	font-family: "Microsoft YaHei UI";
	font-size: 36px;
	color: #FF0000;
}
.STYLE4 {font-size: 16px; font-weight: bold; }
-->

</style>
  <head>
  
    <title>My JSP 'update_select.jsp' starting page</title>
    	<script>
	function add_select() {
		if (form1.timu.value == "") {
			alert("��������Ŀ");
			return false;
		}
		if (form1.ans.value == "") {
			alert("�������");
			return false;
		}
		if (form1.A.value == "") {
			alert("������Aѡ��");
			return false;
		}
		if (form1.B.value == "") {
			alert("������Bѡ��");
			return false;
		}
		if (form1.C.value == "") {
			alert("������Cѡ��");
			return false;
		}
		if (form1.D.value == "") {
			alert("������Dѡ��");
			return false;
		}
		if(form1.ans.value!=form1.A.value && form1.ans.value!=form1.B.value && form1.ans.value!=form1.C.value && form1.ans.value!=form1.D.value){
			alert("ѡ�����ô����޴�ƥ����");
			return false;
		}
	}
</script>
  </head>
  <%
	
		DbBasetableFactory bf = new DbBasetableFactory();
		String timu_id = ParamUtils.getRequestString(request, "uid");
		Select s = bf.SearchSelect("where timu_id='"+timu_id+"'");
		//session.setAttribute("select",s);
		System.out.println("+++++"+timu_id);
		System.out.println("timu_id+++++"+s.getTimu_id());
	%>
  <body>
  <form id="form1" name="form1" method="post"
			action="modify_select.jsp">
			  <table width="674" height="298" border="0" align="center" cellpadding="0" cellspacing="0" bordercolor="#000000">
    <tr>
      <td colspan="2"><label>
        <div align="left"><span class="STYLE1">&nbsp;&nbsp;  &nbsp;  &nbsp;&nbsp;    &nbsp;&nbsp;  &nbsp;  &nbsp;    &nbsp;         �޸�ѡ����</span></div>
        </label></td>
    </tr>
    <tr>
      <td width="336" height="66"><span class="STYLE4">
        <label>��Ŀ��<br />
        <br /> 
        <textarea name="timu"></textarea>
        </label>
      </span></td>
      <td width="338"><p class="STYLE4">�𰸣�</p>
        <p class="STYLE4">
          <textarea name="ans"></textarea>
        </p></td>
    </tr>
    
    <tr>
      <td height="66"><p class="STYLE4">Aѡ�</p>
        <p class="STYLE4">
          <textarea name="A"></textarea>
      </p></td>
      <td><p class="STYLE4">Bѡ�</p>
        <p class="STYLE4">
          <textarea name="B"></textarea>
        </p></td>
    </tr>
    
    <tr>
      <td height="66"><p class="STYLE4">Cѡ�</p>
        <p class="STYLE4">
          <textarea name="C"></textarea>
        </p></td>
      <td><p class="STYLE4">Dѡ�</p>
        <p class="STYLE4">
          <textarea name="D"></textarea>
        </p></td>
    </tr>
    	<input type="hidden" name="action" value="modify">
						<input type="hidden" name="uid_v" value="<%=s.getTimu_id()%>">
    <tr>
      <td colspan="2"><label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; 
        <input type="submit" name="Submit" value="����" onClick="return add_select()"/>
      </label>
        <label >
       &nbsp;&nbsp;      &nbsp; 
       <input name="Submit2" type="submit" value="����" />
      </label></td>
    </tr>
  </table>
		</form>
  </body>
</html>
