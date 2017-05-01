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
<form  action="/user/addBook" method="post">
    <fieldset>
        <legend>
            添加书籍
        </legend>
        <ol>
            <li>
                <label for="bookname">
                    书名:
                </label>
                <input id="bookname" type="text" name="bookname" required="required"
                       required autofocus/>
            </li>
            <li>
                <label for="author">
                    作者:
                </label>
                <input id="author" type="text" name="author" required="required"
                        />
            </li>
            <li>
                <label for="num">
                    现有数量:
                </label>
                <input id="num" type="text" name="num" required="required"
                       />
            </li>
            <li>
                <label for="bookcomment">
                    书评:
                </label>
                <input id="bookcomment" type="text" name="bookcomment" required="required"
                       />
            </li>
        </ol>
    </fieldset>
    <fieldset>
        <button class="button" type="submit" />
        添加
        </button>
    </fieldset>
</form>
<form action="/user/toAdminIndex" method="get">
    <button class="button"  type="submit" value="登录"/> 返回</button>
</form>
</body>

</html>