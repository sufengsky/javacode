<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@page import="com.core.*,com.model.*,com.dao.*"%>
<%@ page import="java.util.Collection"%>
<%@ page import="java.util.Iterator"%>
<%
	response.setHeader("Cache-Control", "no-cache");
	response.setHeader("Cache-Control", "no-store");
	response.setDateHeader("Expires", 0);
	response.setHeader("Pragma", "no-cache");
	request.setCharacterEncoding("GB2312");
	User u=(User)session.getAttribute("user");
%>

<html>
	<head>
	<script>
	<%
	long start=System.currentTimeMillis();
	long end=start+1200;
	if(session.getAttribute("end")==null){
	session.setAttribute("end",Long.valueOf(start+1200000));
	
	%>
	var total=5400;
	<%
	}else{
	%>
	var end=<%=session.getAttribute("end") %>
	
	var total=Math.floor((end-<%=start%>)/1000);
	<%
	
	System.out.println("end:"+end);
	}
	%>
	function time(){
	total=total-1;
	if(total<=0){
	document.form1.submit();
	}
	minute=Math.floor(total/60);
	second=total%60;
	lminute=(minute<10)?("0"+minute):minute;
	lsecond=(second<10)?("0"+second):second;
	ltime=lminute+":"+lsecond;
	this.ShowTime.innerHTML="����ʣ��"+ltime;//��ʾ����ʱʱ��
	setTimeout("time()",1000);
	}
	</script>
		<title>���߿���</title>
	</head>
	<style type="text/css">
<!--
.STYLE7 {
	font-size: 16
}
.STYLE11 {
	font-family: "Microsoft YaHei UI";
	font-size: 18px;
	color: #FF0000;
	font-weight: bold;
}
.STYLE12 {
	font-family: "Microsoft YaHei UI";
	font-weight: bold;
}
.STYLE13 {
	font-family: "Microsoft YaHei UI";
	font-size: 36px;
	font-weight: bold;
}
.STYLE14 {
	font-family: "Microsoft YaHei UI";
	font-size: 16px;
	font-weight: bold;
}
-->
</style>
<%
DbBasetableFactory bf=new DbBasetableFactory();

Paper p=bf.SearchPaper("where paper_type='0'");
 %>
	<body onLoad="time();">

  <div align="right" class="STYLE11" id="ShowTime"></div>

		<table width="733" height="130" border="0" align="center">
  <tr>
    <td height="87" colspan="2"><div align="center" class="STYLE13"><%=p.getPt() %></div></td>
  </tr>
  <tr>
    <td width="613" height="37"><div align="right" class="STYLE12">������</div></td>
    <td width="110"><div align="center" class="STYLE14"><%=p.getPu() %></div></td>
  </tr>
</table>

		<style type="text/css">
<!--
.STYLE8 {
	font-size: 24px;
	font-weight: bold;
}
-->
</style>


		<p class="STYLE8">
			һ��ѡ���⣨ÿ��2�֣�
		</p>
		<form id="form1" name="form1" method="post" action="examDeal.jsp">
			<%
				int submit_page = ParamUtils.getIntParameter(request, "page");
				int index[][]=new int[60][2],index_b[][]=new int[60][2];
				int tiSum=p.getSn(),tiSum_b=p.getBn();//�Ծ����õ�ѡ�������Ŀ
				System.out.println();
				System.out.print("tisum"+tiSum);
				
				index=Algo.getIndex();
				index_b=Algo_blank.getIndex();
				
				double weight[]=new double[60];
				double weight_b[]=new double[60];
				
				weight=Algo.getSort();//����Ȩ�������˳���Ӧ��index
				weight_b=Algo_blank.getSort();
				
				int num[]=new int[60];
				int num_b[]=new int[60];
				
				for(int j=0;j<num.length;j++){
				num[j]=(int)Math.floor((weight[j]*20));
				System.out.println();
			//	System.out.print("num"+num[j]);
				}
				
				for(int q=0;q<num_b.length;q++){
				num_b[q]=(int)Math.floor((weight_b[q]*20));
				System.out.println();
		//		System.out.print("num_b"+num_b[q]);
				
				}
				int i = 0,sum=0;//i����Ŀ��˳��ţ�sum��Ŀǰ�Ѿ�ɸѡ��������
				int i_b=0,sum_b=0;
				
				String str="";//��ɸѡ�������id������str��	
				String str_b="";
				
				for(int m=0;m<60;m++){
				System.out.println();
		//		System.out.print("index[][]"+index[m][0]+" "+index[m][1]);
				Collection coll =bf.ListSelect(submit_page, "where chp="+"'"+index[m][0]+"'"+"and diff='"+index[m][1]+"' order by rand() limit "+num[m]);
				sum=sum+coll.size();//��ѡ���������Ŀ��Ŀ�ۼ�����
				if (sum < -1) {
			%>
			<table width="631" height="53" border="0">
				<tr>
					<td height="53" colspan="4">
						&nbsp;��ǰ�����⣡
					</td>
				</tr>
			</table>

			<%
				} else {
					Iterator it = coll.iterator();

					while (it.hasNext()) {
						i++;
						Select s = (Select) it.next();
						str=str+s.getTimu_id()+",";
			%>
			<table width="631" height="321" border="0">
				<tr>
					<td height="100"><%=i%>.&nbsp;<%=s.getTimu()%></td>
				</tr>
				<tr>
					<td height="34">
						<label>
							<input type="radio" name="myans<%=i%>" value="<%=s.getA()%>" />
							A.<%=s.getA()%></label></td>
				</tr>
				<tr>
				  <td height="34"><label>
							<input type="radio" name="myans<%=i%>" value="<%=s.getB()%>" />
							B.<%=s.getB()%></label></td>
			  </tr>
				<tr>
				  <td height="34"><label>
							<input type="radio" name="myans<%=i%>" value="<%=s.getC()%>" />
							C.<%=s.getC()%></label></td>
			  </tr>
				<tr>
				  <td height="34"><label>
							<input type="radio" name="myans<%=i%>" value="<%=s.getD()%>" />
							D.
							<%=s.getD()%></label></td>
			  </tr>
				<%
							session.setAttribute("a" + i, s.getA());
							session.setAttribute("b" + i, s.getB());
							session.setAttribute("c" + i, s.getC());
							session.setAttribute("d" + i, s.getD());
							session.setAttribute("ans" + i, s.getAns());
							session.setAttribute("timu" + i, s.getTimu());
							session.setAttribute("user",u);
				%>
			</table>
			<%
				}
				}
			%>
		
		<%} %>
		<%
		if(sum<tiSum){
		str=str.substring(0,str.length()-1);//������Ľ�������һ��������ɾ��
		tiSum=tiSum-sum;
		Collection collection =bf.ListSelect(submit_page,"where timu_id not in ("+str+") and diff>1 and diff<4 limit "+tiSum);
	//	System.out.println("coll"+collection.size()+"sum"+sum+"str"+str);	
		Iterator it = collection.iterator();

					while (it.hasNext()) {
						i++;
						Select s = (Select) it.next();
			
		 %>	
		 <table width="631" height="321" border="0">
				<tr>
					<td height="100"><%=i%>.&nbsp;<%=s.getTimu()%></td>
				</tr>
				<tr>
					<td height="34">
						<label>
							<input type="radio" name="myans<%=i%>" value="<%=s.getA()%>" />
							A.<%=s.getA()%></label></td>
				</tr>
				<tr>
				  <td height="34"><label>
							<input type="radio" name="myans<%=i%>" value="<%=s.getB()%>" />
							B.<%=s.getB()%></label></td>
			  </tr>
				<tr>
				  <td height="34"><label>
							<input type="radio" name="myans<%=i%>" value="<%=s.getC()%>" />
							C.<%=s.getC()%></label></td>
			  </tr>
				<tr>
				  <td height="34"><label>
							<input type="radio" name="myans<%=i%>" value="<%=s.getD()%>" />
							D.
							<%=s.getD()%></label></td>
			  </tr>
				<%
							session.setAttribute("a" + i, s.getA());
							session.setAttribute("b" + i, s.getB());
							session.setAttribute("c" + i, s.getC());
							session.setAttribute("d" + i, s.getD());
							session.setAttribute("ans" + i, s.getAns());
							session.setAttribute("timu" + i, s.getTimu());
							session.setAttribute("user",u);
				%>
			</table>
			<%
			}
			}
			 %>
			 

		<p class="STYLE8">
			�����ж��⣨ÿ��2�֣�
		</p>			 
			 
			 
			 <%
			 for(int m=0;m<60;m++){
		//		System.out.println();
	//			System.out.print("index_b[][]"+index_b[m][0]+" "+index_b[m][1]);
				Collection coll_b =bf.ListBlank(submit_page, "where chp="+"'"+index_b[m][0]+"'"+"and diff='"+index_b[m][1]+"' order by rand() limit "+num_b[m]);
				sum_b=sum_b+coll_b.size();//��ѡ���������Ŀ��Ŀ�ۼ�����
				if (sum_b < -1) {
			  %>
			  <table width="631" border="0" align="center">
  <tr>
    <td height="48">&nbsp;��ǰ��������Ϣ</td>
  </tr>
</table>
			 	<%
				} else {
					Iterator it_b = coll_b.iterator();
				
					while (it_b.hasNext()) {
						i_b++;
						Blank be = (Blank) it_b.next();
						str_b=str_b+be.getId()+",";
						System.out.println("sssssssss "+str_b);
			%>
			 <table width="631" height="321" border="0">
				<tr>
					<td height="100"><%=i_b%>.&nbsp;<%=be.getTimu()%></td>
				</tr>
				<tr>
					<td height="34" width="80">
						<label>
							<input type="radio" name="myans_b<%=i_b%>" value="1" />
							��ȷ</label></td>
							<td height="34" width="80">
						<label>
							<input type="radio" name="myans_b<%=i_b%>" value="0" />
							����</label></td>
				</tr>
				<%
							session.setAttribute("ans_b" + i_b,be.getAns());
				%>
				</table>
			 
			 
			 
			 	<%
			}
			}
			}
			 %>
			 		 <%
		if(sum_b<tiSum_b){
		if(str_b.equals("")){
				str_b="-1";}else{
		str_b=str_b.substring(0,str_b.length()-1);//������Ľ�������һ��������ɾ��
		}
		tiSum_b=tiSum_b-sum_b;

		System.out.println();
		System.out.println("�Ǻ�"+sum_b);
		Collection collection_b =bf.ListBlank(submit_page,"where id not in ("+str_b+")  limit "+tiSum_b);
		System.out.println("coll"+collection_b.size()+"sum_b"+sum_b+"str_b"+str_b);	
		Iterator it = collection_b.iterator();

					while (it.hasNext()) {
						i_b++;
						Blank be = (Blank) it.next();
			
		 %>	
			  <table width="631" height="321" border="0">
				<tr>
					<td height="100"><%=i_b%>.&nbsp;<%=be.getTimu()%></td>
				</tr>
				<tr>
					<td height="34" width="80">
						<label>
							<input type="radio" name="myans_b<%=i_b%>" value="1" />
							��ȷ</label></td>
							<td height="34" width="80">
						<label>
							<input type="radio" name="myans_b<%=i_b%>" value="0" />
							����</label></td>
				</tr>
				<%
							session.setAttribute("ans_b" + i_b,be.getAns());
				%>
				</table>
			 
			 <%
			 }
			 }
			  %>
			 
			 
			 
			 
			 
			 
			 
		
	
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			<table width="490" height="21" border="0">
				<tr>
					<td width="211">
						<div align="right">
							<input type="hidden" name="sumCount" value="<%=i%>" />
							<input type="hidden" name="sumCount_b" value="<%=i_b %>"/>"
							<input type="submit" name="Submit" value="����" />
						</div>
					</td>
					<td width="48"><br><label></label>
					<br></td>
					<td width="217">
						<label>
							<input name="Submit2" type="reset" value="����" />
						</label>
					</td>
				</tr>
			</table>
		</form>
		<p>&nbsp;
		</p>
	</body>
</html>
