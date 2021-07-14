<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/7/10
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Login</title>
</head>
<body>
    <h2>登录</h2>
    <form action="UserLogin" method="post">
        <table border="0" cellpadding="5">
            <tr>
                <td>账号：</td>
                <td>
                    <input type="text" name="username">
                </td>
            </tr>
            <tr>
                <td>密码：</td>
                <td>
                    <input type="password" name="password">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="登录">
                </td>
                <td>
                     <input type="button" onclick="javascript:window.location.href='register.jsp'" value="注册">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
