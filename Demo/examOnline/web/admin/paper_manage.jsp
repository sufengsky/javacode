<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>�����Ծ�</title>
	</head>
	<link href="../css/admin.css" rel="stylesheet" type="text/css">
	<script>
function add_paper(){
	var select_num=document.getElementById("select_num").value;
	var blank_num=document.getElementById("blank_num").value;
	var operate_num=document.getElementById("operate_num").value;
	var select_value=document.getElementById("select_value").value;
	var blank_value=document.getElementById("blank_value").value;
	var operate_value=document.getElementById("operate_value").value;
	 var reg = /^\d+$/;//����ֻ����������
	 
	
	if(form1.paper_timu.value==""){
		alert("����д�Ծ���");
		return false;
	}
	if(form1.paper_user.value==null){
		alert("����������������");
		return false;
	}
	if(form1.select_num.value==null){
		alert("������ѡ������Ŀ");
		return false;
	}
	if(form1.select_value.value==null){
		alert("������ѡ�����ֵ");
		return false;
	}
	if(form1.operate_num.value==null){
		alert("�������������Ŀ");
		return false;
	}
	if(form1.operate_value.value==null){
		alert("������������ֵ");
		return false;
	}
	if(form1.blank_num.value==""){
		alert("�������������Ŀ");
		return false;
	}
	if(form1.blank_value.value==""){
		alert("������������ֵ");
		return false;
	}
	if(((form1.blank_value.value)*(form1.blank_num.value)+(form1.select_num.value)*(form1.select_value.value)+(form1.operate_num.value)*(form1.operate_value.value))!=100){
		alert("�������ò�����");
		return false;
	}
	
	  if(!reg.test(blank_value)){
	 alert("�ж����ֵ���벻�淶��");
	 form1.blank_value.value="";
	 return false;
	 }
	   if(!reg.test(blank_num)){
	 alert("�ж�����Ŀ���벻�淶��");
	 form1.blank_num.value="";
	 return false;
	 }
	 
	 if(!reg.test(select_value)){
	 alert("ѡ�����ֵ���벻�淶��");
	 form1.select_value.value="";
	 return false;
	 }
	   if(!reg.test(select_num)){
	 alert("ѡ������Ŀ���벻�淶��");
	 form1.select_num.value="";
	 return false;
	 }
	 
	 if(!reg.test(opetate_value)){
	 alert("�������ֵ���벻�淶��");
	 form1.blank_value.value="";
	 return false;
	 }
	   if(!reg.test(operate_num)){
	 alert("��������Ŀ���벻�淶��");
	 form1.blank_num.value="";
	 return false;
	 }
}
</script>

	<style type="text/css">
<!--
.STYLE2 {
	font-size: 18px
}

.STYLE3 {
	font-family: "Microsoft YaHei UI"
}

.STYLE4 {
	font-size: 18px;
	font-family: "Microsoft YaHei UI";
}

a {
	text-decoration: none
}
-->
</style>
	<body>
		<form id="form1" name="form1" method="post" action="set_paper.jsp">
			<table width="100%" height="306" border="1" cellpadding="0"
				cellspacing="0" bordercolor="#CCCCCC">
				<tr>
					<td height="50">
						<span class="STYLE2"><span class="STYLE3">�Ծ���⣺</span> <label>
								<input type="text" name="paper_timu" />
							</label> </span>
					</td>
				</tr>
				<tr>
					<td height="42">
						<span class="STYLE4">ѡ������Ŀ�� <label>
								<input type="text" name="select_num" id="select_num"/>
							</label> ��ֵ�� <label>
								<input type="text" name="select_value" id="select_value" />
							</label> <label>
								<input name="Submit" type="button" value="����ѡ��������"
									onClick="javascript:location.href='set_select.jsp'" />
							</label>
						</span>
					</td>
				</tr>
				<tr>
					<td height="53">
						<span class="STYLE4">�ж�����Ŀ�� <label>
								<input type="text" name="blank_num" id="blank_num"/>
							</label> ��ֵ�� <label>
								<input type="text" name="blank_value" id="blank_value" />
							</label> </span><label>
								<input name="Submit" type="button" value="�����ж�������"
									onClick="javascript:location.href='set_blank.jsp'" />
							</label>
					</td>
				</tr>
				<tr>
					<td height="43">
						<span class="STYLE4">��������Ŀ�� <label>
								<input type="text" name="operate_num" id="operate_num" />
							</label> ��ֵ�� <label>
								<input type="text" name="operate_value" id="operate_value"/>
							</label> </span>
					</td>
				</tr>
				<tr>
					<td height="64">
						<span class="STYLE4">�����ˣ� <label>
								<input type="text" name="paper_user" />
							</label> <label>
								�������ͣ�
								<input type="radio" name="paper_type" id="pp1" value="0"
									checked="checked" />
								��ĩ����
							</label> <label>
								<input type="radio" name="paper_type" id="pp2" value="1" />
								����
							</label> </span>
					</td>
				</tr>
				<tr>
					<td height="38">
						<span class="STYLE3"> <label>
						</span>
						<div align="right" class="STYLE3">

							<div align="left">
								&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								&nbsp;&nbsp;&nbsp;&nbsp;
								<input type="submit" name="Submit" value="�ύ"
									onClick="return add_paper()" />

								<label>
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
									<input name="Submit2" type="reset" value="ȡ��" />
									&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								</label>


							</div>
						</div>

						<span class="STYLE3"> </label> </span>
					</td>
				</tr>
		  </table>
		</form>

	</body>
</html>
