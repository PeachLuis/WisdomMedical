<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.wisdommedical.entity.Patient" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	//从request里获取新闻列表
	List<Patient> patients = (List<Patient>)request.getAttribute("DoctorShow_patients");
	String name = request.getParameter("DoctorShow_doctor_name");
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showpatient.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
  	<h2>
		<%=name%>医生的患者列表
	</h2>
<%--    患者列表<a href="wisdommedical/addpatient.jsp">添加患者</a><br>--%>
    <table border="1">
    	<tr>
    		<td>患者姓名</td>
    		<td>操作</td>
    	</tr>
<%--		<%--%>
<%--		%>--%>
<%--		<tr>--%>
<%--			<td>--%>
<%--				Patients :<%=patients == null%>--%>
<%--			</td>--%>
<%--			<td>--%>

<%--			</td>--%>
<%--		</tr>--%>
<%--		<%--%>
<%--		%>--%>

	   <%
	   		for (int i = 0; i < patients.size(); i++){
	   			Patient patient = patients.get(i);
	    %>
	    	<tr>
				<td><%=patient.getName()%></td>
				<td>
<%--					跳转到患者挂号表--%>
					<a href="">查看详情</a>
				</td>
<%--	    		<td><a href="WisdomMedical/PatientShow?id=<%= patient.getId() %>"><%= patient.getName() %></a></td>--%>
<%--	    		<td><a href="wisdommedical/deteledetail.jsp?id=<%= patient.getId() %>">删除</a> <a href="WisdomMedical/PatientUpdate?id=<%= patient.getId() %>">修改</a></td>--%>
	    	</tr>
	    <%
	       }
	     %>
    </table>
  </body>
</html>
