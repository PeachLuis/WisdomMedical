<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.wisdommedical.entity.Doctor" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	//从request里获取新闻列表
	List<Doctor> doctors = (List<Doctor>)request.getAttribute("DoctorShowList_doctors");
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'showdoctor.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  
  <body>
<%--    患者列表<a href="wisdommedical/addpatient.jsp">添加患者</a><br>--%>
	<h2>在院医生列表</h2>
    <table border="1">
    	<tr>
    		<td>医生姓名</td>
    		<td>操作</td>
    	</tr>

	   <%
	   		for (int i = 0; i < doctors.size(); i++){
				Doctor doctor = doctors.get(i);
	    %>
	    	<tr>
				<td><%=doctor.getName()%></td>
<%--				跳转到挂了该医生的患者列表，通过name字段进行标识--%>
				<td><a href="WisdomMedical/PatientShow?name=<%=doctor.getName()%>">查看该医生的患者</a></td>
<%--	    		<td><a href="WisdomMedical/PatientShow?id=<%= patient.getId() %>"><%= patient.getName() %></a></td>--%>
<%--	    		<td><a href="wisdommedical/deteledetail.jsp?id=<%= patient.getId() %>">删除</a> <a href="WisdomMedical/PatientUpdate?id=<%= patient.getId() %>">修改</a></td>--%>
	    	</tr>
	    <%
	       }
	     %>
    </table>
  </body>
</html>
