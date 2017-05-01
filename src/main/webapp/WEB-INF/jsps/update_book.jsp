<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>
        Book Info
    </title>
</head>

<body>
<div class="bg">
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
                <form action="/user/updateBook" method="post">
                    <tr>
                        <td>
                            <input id="bookname" name="bookname" type="text" value="${listValue.bookname}"
                                   readonly="readonly" />
                        </td>
                        <td>
                            <input id="author" name="author" type="text" value="${listValue.author}"
                            />
                        </td>
                        <td>
                            <input id="bookcomment" name="bookcomment" type="text" value="${listValue.bookcomment}"
                            />
                        </td>
                        <td>
                            <input id="num" name="num" type="text" value="${listValue.num}" />
                        </td>
                        <td>
                            <button class="button" type="submit">
                                更新
                            </button>
                        </td>
                    </tr>
                </form>
            </c:forEach>
        </c:if>
    </table>
</div>
<form action="/user/toAdminIndex" method="get">
    <button class="button" type="submit" value="登录" />
    返回
    </button>
</form>
</body>

</html>