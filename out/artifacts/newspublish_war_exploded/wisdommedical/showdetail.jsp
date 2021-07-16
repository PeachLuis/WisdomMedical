<%@page import="ruanko.newspublish.entity.Article"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.wisdommedical.entity.Patient" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	//从request里获取患者
	Patient patient = (Patient) request.getAttribute("PatientShow_patient");
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>显示患者内容</title>
    
  </head>
  
  <body>
     患者详细内容 <br>
    <br>作者:<%= patient.getName() %>
    <br>身份证:<%= patient.getId() %>
    <br>年龄:<%= patient.getAge()%>
  </body>
</html>
