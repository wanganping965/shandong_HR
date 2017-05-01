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
            已经借到的书籍
        </h2>
        <div id="书录">
            书录
        </div>
        <tr>
            <td>
                借阅人
            </td>
            <td>
                书名
            </td>
            <td>
                借书日期
            </td>
            <td>
                归还日期
            </td>
            <td>
                续借次数
            </td>
            <td>
                实际归还日期
            </td>
        </tr>
        <c:if test="${not empty userlogBookInfoList}">
            <c:forEach var="listValue" items="${userlogBookInfoList}">
                <tr>
                    <td>
                            ${listValue.id}
                    </td>
                    <td>
                            ${listValue.bookname}
                    </td>
                    <td>
                            ${listValue.borrowdate}
                    </td>
                    <td>
                            ${listValue.returndate}
                    </td>
                    <td>
                            ${listValue.hasbeenrenewed}
                    </td>
                    <td>
                            ${listValue.actualreturndate}
                    </td>
                </tr>
            </c:forEach>
        </c:if>
    </table>
</div>
<form action="/user/overview" method="get">
    <button class="button" type="submit" value="登录" />
    返回
    </button>
</form>
<form action="/user/returnbook" method="post">
    <input id="bookname" name="bookname" type="text" required="required">
    请输入要还的书名
    </input>
    <button class="button" type="submit" value="登录" />
    还书
    </button>
</form>
<div>
    <form action="/user/renew" method="post">
        <input id="bookname_" name="bookname_" type="text" required="required"
               placeholder="一本书只能续借两次">
        请输入要续借的书名
        </input>
        <button class="button" type="submit" value="登录" />
        续借
        </button>
    </form>
</div>
<div>
    <form action="/user/logout" method="get">
        <button class="button" type="submit" />
        登出
        </button>
    </form>
</div>
</body>

</html>