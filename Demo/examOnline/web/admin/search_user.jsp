<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>�����û�</title>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 36px;
	color: #FFFFFF;
	font-family: "Microsoft YaHei UI";
}
.STYLE2 {font-family: "Microsoft YaHei UI"}
-->
</style>

</head>

<body>
<form id="form1" name="form1" method="post" action="list_user_s.jsp">
 <table width="397" height="102" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#CCCCCC">
    <tr>
      <td height="32" colspan="3" bgcolor="#0E4495"><div align="center"><span class="STYLE1">�û�����</span></div></td>
    </tr>
    <tr>
      <td height="44" bgcolor="#D9EBFE"><span class="STYLE2">����
          <label>
        <select name="search">
          <option value="uid">ѧ��</option>
          <option value="name">����</option>
          <option value="banji">�༶</option>
        </select>
        ����</label>
      </span>        <label>
      </label></td>
      <td bgcolor="#D9EBFE"><div align="right">
   <input type="text" name="search_text" value="������ؼ���" onFocus="if(value==defaultValue){value='';this.style.color='#000'}" onBlur="if(!value){value=defaultValue;this.style.color='#999'}" style="color:#999999" />
      </div></td>
      <td bgcolor="#D9EBFE"> &nbsp;<a href="javascript:document.form1.submit();"><img src="../images/search.png" width="58" height="16" /></a></td>
    </tr>
    <tr>
      <td height="18" bgcolor="#0E4495"><label></label></td>
      <td bgcolor="#0E4495"><label></label>     </td>
      <td bgcolor="#0E4495">&nbsp;</td>
    </tr>
</table>
</form>
</body>
</html>
