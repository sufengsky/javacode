<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>������ʾ</title>
	</head>
	<link href="css/css.css" rel="stylesheet" type="text/css">
	<script src="js/validate.js"></script>
	<body>
		<tr>
			<td height="50" align="left">
				<h1>
					error
				</h1>
			</td>
		</tr>
		<tr>
			<td height="260" align="center" valign="middle" class="Redfont">
				<%        String error=session.getAttribute("error").toString();
        if(error!=null){
            out.print(error);
        }else{
            out.print("δ֪���󣡣���");
        }%>
			</td>
		</tr>
		<tr>
			<td height="50" align="center" valign="middle">
				<a style="cursor: hand" onClick="javascript:history.back();"
					class="delink">������ҳ</a>&nbsp;&nbsp;
				<a style="cursor: hand" onClick="javascrip:window.close();"
					class="delink">�رմ���</a>
			</td>
		</tr>
	</body>
</html>
