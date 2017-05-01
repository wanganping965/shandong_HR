<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>
        Login Error
    </title>
</head>

<body>
<h2>
    登录失败（密码错误或者不存在这个用户）
</h2>
<form action="/user/login" method="get">
    <button class="button" type="submit" value="登录" />
    重新登录
    </button>
</form>
</body>

</html>