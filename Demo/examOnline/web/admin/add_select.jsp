<%@ page language="java" import="java.util.*,com.dao.*,com.core.*,com.model.*" pageEncoding="gbk"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
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

		<title>¼��ѡ����</title>
	</head>
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
<%
	int submit_page = ParamUtils.getIntParameter(request, "page");
	int count=1;
	DbBasetableFactory bf=new DbBasetableFactory();
	Collection coll = bf.ListSelectChp(submit_page, "");
	
 %>
	<body>
		<form id="form1" name="form1" method="post"
			action="check_addselect.jsp">
			  <table width="674" height="298" border="0" align="center" cellpadding="0" cellspacing="0" bordercolor="#000000">
    <tr>
      <td colspan="2"><label>
        <div align="left"><span class="STYLE1">&nbsp;&nbsp;  &nbsp;  &nbsp;&nbsp;    &nbsp;&nbsp;  &nbsp;  &nbsp;    &nbsp;         ¼��ѡ����</span></div>
        </label></td>
    </tr>
    <tr>
    
      <td height="66"><span class="STYLE4">�½ڣ�</span>
        <label>
        <select name="chp" >
        <%
    	if (coll == null || coll.size() <= 0) {
	
     %>
          <option value="noinfo">��ǰ���½���Ϣ</option>
            <%
				 }else {
					Iterator it = coll.iterator();
					while (it.hasNext()) {
						SelectChp s = (SelectChp) it.next();
						System.out.println("s"+s.getChp());
			%>
			   <option value="<%=s.getId() %>"><%=count++ %>. <%=s.getChp() %></option>
			   <%}} %>
          
        </select>
      </label></td>
      
       
      <td><span class="STYLE4">�Ѷȣ�</span>
        <label>
        <select name="diff">
          <option value="1">����</option>
          <option value="2">��</option>
          <option value="3">����</option>
          <option value="4">����</option>
        </select>
      </label></td>
    </tr>
    <tr>
      <td width="336" height="66"><span class="STYLE4">
        <label>��Ŀ��<br />
        <br /> 
        <textarea name="timu" ></textarea>
        </label>
      </span></td>
      <td width="338"><p class="STYLE4">�𰸣�</p>
        <p class="STYLE4">
          <textarea name="ans" ></textarea>
        </p></td>
    </tr>
    
    <tr>
      <td height="66"><p class="STYLE4">Aѡ�</p>
        <p class="STYLE4">
          <textarea name="A"></textarea>
      </p></td>
      <td><p class="STYLE4">Bѡ�</p>
        <p class="STYLE4">
          <textarea name="B" ></textarea>
        </p></td>
    </tr>
    
    <tr>
      <td height="66"><p class="STYLE4">Cѡ�</p>
        <p class="STYLE4">
          <textarea name="C" ></textarea>
        </p></td>
      <td><p class="STYLE4">Dѡ�</p>
        <p class="STYLE4">
          <textarea name="D" ></textarea>
        </p></td>
    </tr>
    
    <tr>
      <td colspan="2"><label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp; 
        <input type="submit" name="Submit" value="�ύ" onClick="return add_select()"/>
      </label>
        <label >
       &nbsp;&nbsp;      &nbsp; 
       <input name="Submit2" type="reset" value="����" />
      </label></td>
    </tr>
  </table>
		</form>
	</body>
</html>
