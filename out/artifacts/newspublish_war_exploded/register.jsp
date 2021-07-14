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
    <title>Register</title>
</head>
<script type="text/javascript">
    function check(str){
        var mess="不允许输入的字符：\r\n";
        var mark="yes";
        if(str.indexOf(";")>=0){
            mark="no";
            mess+=" ; ";
        }
        if(str.indexOf("&")>=0){
            mark="no";
            mess+=" & ";
        }
        if(str.indexOf("<")>=0){
            mark="no";
            mess+=" < ";
        }
        if(str.indexOf(">")>=0){
            mark="no";
            mess+=" > ";
        }
        if(str.indexOf("--")>=0){
            mark="no";
            mess+=" -- ";
        }
        if(str.indexOf("/")>=0){
            mark="no";
            mess+=" / ";
        }
        if(str.indexOf("%")>=0){
            mark="no";
            mess+=" % ";
        }
        if(str.indexOf("'")>=0){
            mark="no";
            mess+=" ' ";
        }
        if(mark=="no"){
            alert(mess);
            return false;
        }
        else
            return true;
    }
</script>
<body>
    <h2>注册</h2>
    <form name="form_register" action="UserRegister" method="post" onsubmit="return check(form_register.username.value)">
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
                    <input type="submit" value="注册">
                </td>
                <td></td>
            </tr>
        </table>
    </form>

</body>
</html>
