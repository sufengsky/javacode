<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<html>
 <head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>����û���Ϣ</title>
<style type="text/css">
<!--
.STYLE1{
	color: #FFFFFF;
	font-family: "Microsoft YaHei UI";
	font-size: 36px;
}
.STYLE4 {font-family: "Microsoft YaHei UI"; font-size: 24px; }
-->
</style>
<script>
	function add_user() {
		if (form1.name.value == "") {
			alert("��������Ϊ��");
			return false;
		}
		if (form1.uid.value == "") {
			alert("ѧ�Ų���Ϊ�գ�");
			return false;
		}
		if (form1.password.value == "") {
			alert("���벻��Ϊ�գ�");
			return false;
		}
		if (form1.banji.value == "") {
			alert("������༶");
			return false;
		}
		if (form1.yuanxi.value == "") {
			alert("������Ժϵ");
			return false;
		}
		if (form1.status.value == "") {
			alert("������Ȩ��");
			return false;
		}
	}
</script>
</head>

<body>
<form id="form1" name="form1" method="post" action="check_adduser.jsp">
  <table width="350" height="400" border="0" align="center">
    <tr>
      <td width="321" height="57" bgcolor="#0072C6"><div align="center" class="STYLE1">���ѧ����Ϣ</div></td>
    </tr>
    <tr>
      <td bgcolor="#F0F0F9"><span class="STYLE4">������  
          <label>
          <input type="text" name="name" />
          </label>
      </span></td>
    </tr>
    <tr>
      <td bgcolor="#F0F0F9"><span class="STYLE4">ѧ�ţ�
        <input type="text" name="uid" />
      </span></td>
    </tr>
    <tr>
      <td bgcolor="#F0F0F9"><span class="STYLE4">���룺
        <input type="text" name="password" />
      </span></td>
    </tr>
    <tr>
      <td bgcolor="#F0F0F9"><span class="STYLE4">�༶��
        <input type="text" name="banji" />
      </span></td>
    </tr>
    <tr>
      <td bgcolor="#F0F0F9"><span class="STYLE4">Ժϵ��
        <input type="text" name="yuanxi" />
      </span></td>
    </tr>
    <tr>
     
    </tr>
    <tr>
      <td bgcolor="#D9EBFE"><label>
        &nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;  &nbsp;  &nbsp;&nbsp;&nbsp;&nbsp;
        <input name="Submit" type="submit" value="ȷ��" onClick="return add_user()"/>
        &nbsp; 
        <input name="Submit2" type="submit" value="ȡ��" />
      </label></td>
    </tr>
  </table>
</form>
</body>
</html>
