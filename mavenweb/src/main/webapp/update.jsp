<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>张同</title>
</head>
<body>
<form method="get" action="account/update">
    姓名<input type="text"   name="name" placeholder="请输入需要修改的姓名">
    金额<input type="text" name="money" placeholder="请输入需要修改的金额">
    <input type="submit" value="提交">
</form>
</body>
</html>
