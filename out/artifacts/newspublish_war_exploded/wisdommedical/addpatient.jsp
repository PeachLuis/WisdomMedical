<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>添加患者</title>
  </head>
  
  <body>
    <h2>添加患者</h2>
    <form action="WisdomMedical/PatientAdd" method="post">
        姓名：<input type="text" name="name">
        <br>身份证：<input type="text" name="id">
        <br>年龄：<input type="text" name="age">
        <br><input type="submit" value="添加">
    </form>
  </body>
</html>
