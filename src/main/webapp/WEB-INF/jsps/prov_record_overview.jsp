<%--
  Created by IntelliJ IDEA.
  User: He Zhentang
  Date: 2017/5/8
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Province Record Overview</title>
</head>
<body>
    <form name="search_record" action="/province/record" method="get">
        <input id="" type="text" name="" placeholder="调查期/地区"/>
        <button>搜索</button>
    </form>
    <c:if test="${not empty recordList}">
        <c:forEach var="listValue" items="${recordList}">
            <form name="recorded_enterprises" action="/province/record_details" method="post">
                <tr>
                    <td>
                        <input id="enterprisename" name="enterprisename" type="text" value="${listValue.enterprisename}" readonly="readonly" />
                    </td>
                    <td>
                        <button class="button" type="submit">查看</button>
                    </td>
                </tr>
            </form>
        </c:forEach>
    </c:if>
</body>
</html>
