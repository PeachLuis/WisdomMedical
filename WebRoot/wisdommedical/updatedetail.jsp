<%@page import="ruanko.newspublish.entity.Article"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.wisdommedical.entity.Patient" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	//从request里得到要修改的新闻
//	Article article = (Article)request.getAttribute("article");
    Patient patient = (Patient) request.getAttribute("PatientUpdate_patient");
 %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updatedetail.jsp' starting page</title>
    
	
  </head>
  
  <body>
    修改患者信息<br>
    <form action="WisdomMedical/PatientUpdateDo" method="post">
    	<input type="hidden" name="id" value="<%= patient.getId() %>" />
        姓名：<input type="text" name="name" value="<%= patient.getName() %>" />
        <br>身份证：<input type="text" name="id" value="<%= patient.getId() %>" />
        <br>年龄：<input type="text" name="age" value="<%= patient.getAge() %>" />
    	<br><input type="submit" value="保存修改">
    </form>
    <a href="WisdomMedical/PatientShowList" >返回患者列表</a>
  </body>
</html>
