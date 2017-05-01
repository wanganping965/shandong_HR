<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>
        Index
    </title>
</head>

<body>
<form action="/user/toaddBook" method="get">
    <button class="button" type="submit" value="登录" />
    增加图书
    </button>
</form>
<form action="/user/toupdateBook" method="get">
    <button class="button" type="submit" value="登录" />
    修改图书
    </button>
</form>
<form action="/user/todeleteBook" method="get">
    <button class="button" type="submit" value="登录" />
    删除图书
    </button>
</form>
<table id="table">
    <h2>
        书籍
    </h2>
    <div id="书录">
        书录
    </div>
    <tr>
        <td>
            书名
        </td>
        <td>
            作者
        </td>
        <td>
            书评
        </td>
        <td>
            剩余数量
        </td>
    </tr>
    <c:if test="${not empty bookInfoList}">
        <c:forEach var="listValue" items="${bookInfoList}">
            <form action="" method="post">
                <tr>
                    <td>
                        <input id="bookname" name="bookname" type="text" value="${listValue.bookname}"
                               readonly="readonly" />
                    </td>
                    <td>
                        <input id="author" name="author" type="text" value="${listValue.author}"
                               readonly="readonly" />
                    </td>
                    <td>
                        <input id="bookcomment" name="bookcomment" type="text" value="${listValue.bookcomment}"
                               readonly="readonly" />
                    </td>
                    <td>
                        <input id="num" name="num" type="text" value="${listValue.num}" readonly="readonly"
                        />
                    </td>
                </tr>
            </form>
        </c:forEach>
    </c:if>
</table>
<form action="/user/login" method="get">
    <button class="button" type="submit" value="登录" />
    登出
    </button>
</form>
</body>

</html>