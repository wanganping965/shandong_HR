<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>
        User Login
    </title>
</head>

<body>
<form name="Userlog" action="/user/check" method="post">
    <fieldset>
        <legend>
            登录
        </legend>
        <ol>
            <li>
                <label for="id">
                    账号:
                </label>
                <input id="id" type="text" name="id" required="required" placeholder="输入你的账号"
                       required autofocus/>
            </li>
            <li>
                <label for="pswd">
                    密码:
                </label>
                <input id="pswd" type="password" name="pswd" required placeholder="输入你的密码"
                       required />
            </li>
        </ol>
    </fieldset>
    <fieldset>
        <button class="button" type="submit" />
        登录
        </button>
    </fieldset>
</form>
<form action="/user/enrol" method="get">
    <button class="button" type="submit" />
    注册
    </button>
</form>
<form action="/user/admin" method="get">
    <button class="button" type="submit" />
    我是管理员
    </button>
</form>
</body>

</html>