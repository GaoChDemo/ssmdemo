<%--
  Created by IntelliJ IDEA.
  User: chong
  Date: 2018/9/7
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>input</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/insertSelective.action" method="post">
    账号:<input type="text" name="userName"><br/>
    密码:<input type="password" name="userPassword"><br/>
    <input type="submit" value="保存">
</form>
</body>
</html>
