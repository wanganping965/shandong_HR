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
    还书失败（不存在这本书或者您没有借过这本书）
</h2>
<form action="/user/overview" method="get">
    <button class="button" type="submit" value="登录" />
    返回
    </button>
</form>
</body>

</html>