<%@ page language="java" import="java.util.*,com.dao.*,com.core.*,com.model.*" pageEncoding="gbk"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>�ޱ����ĵ�</title>


<style type="text/css">
<!--
.STYLE6 {
	font-family: "Microsoft YaHei UI";
	font-size: 36px;
	color: #FFFFFF;
}
.STYLE11 {font-family: "Microsoft YaHei UI"; font-size: 16px; }
-->
</style>
</head>

<body>
<%
	int submit_page = ParamUtils.getIntParameter(request, "page");
	int count=1;
	DbBasetableFactory bf=new DbBasetableFactory();
	Collection coll = bf.ListBlankChp(submit_page, "");
	
 %>
<form id="form1" name="form1" method="post" action="check_addblank.jsp">
  <table width="336" height="348" border="0" align="center">
    <tr>
      <td height="70" colspan="2" bgcolor="#2679CE"><div align="center"><span class="STYLE6">����ж���</span></div></td>
    </tr>
    <tr>
      <td width="58" height="113" bgcolor="#D9EBFE"><span class="STYLE11">��Ŀ��</span></td>
      <td width="279" bgcolor="#D9EBFE"><span class="STYLE11">
        <label>
        <textarea name="timu" ></textarea>
        </label>
      </span></td>
    </tr>
    <tr>
      <td bgcolor="#D9EBFE"><span class="STYLE11">�𰸣�</span></td>
      <td bgcolor="#D9EBFE"><span class="STYLE11">��ȷ
          <label>
        <input type="radio" name="ans" value="1" />
&nbsp;</label><label>����

<input type="radio" name="ans" value="0"  />
          </label>
      </span></td>
    </tr>
    <tr>
      <td height="40" bgcolor="#D9EBFE" class="STYLE11">�Ѷȣ�</td>
      <td height="40" bgcolor="#D9EBFE"><label>
        <select name="diff">
          <option value="1">��</option>
          <option value="2">����</option>
          <option value="3">����</option>
          <option value="4">����</option>
        </select>
      </label></td>
    </tr>
    <tr>
      <td height="34" bgcolor="#D9EBFE" class="STYLE11">�½ڣ�</td>
      <td bgcolor="#D9EBFE"><label>
            <select name="chp" >
        <%
    	if (coll == null || coll.size() <= 0) {
	
     %>
          <option value="noinfo">��ǰ���½���Ϣ</option>
            <%
				 }else {
					Iterator it = coll.iterator();
					while (it.hasNext()) {
						BlankChp s = (BlankChp) it.next();
						System.out.println("s"+s.getChp());
			%>
			   <option value="<%=s.getId() %>"><%=count++ %>. <%=s.getChp() %></option>
			   <%}} %>
          
        </select>
      </label></td>
    </tr>
    <tr>
      <td height="36" colspan="2" bgcolor="#2679CE"><label>
        <div align="center">
          <input name="Submit" type="submit" value="ȷ��" />    &nbsp;   &nbsp;
          <input name="Submit2" type="reset" value="ȡ��" />
          </div>
      </label></td>
    </tr>
  </table>
</form>
</body>
</html>
