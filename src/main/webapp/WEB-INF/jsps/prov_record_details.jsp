<%--
  Created by IntelliJ IDEA.
  User: He Zhentang
  Date: 2017/5/8
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Province Record Details</title>
</head>
<body>
    <c:if test="${not empty recordInfo}">
        <c:forEach var="listValue" items="${recordInfo}">
            <form name="recordInfo" action="/province/record_details" method="get">
                <tr>
                    <td>
                        所属地区：<input id="area" name="area" type="text" value="${listValue.area}" readonly="readonly" />
                    </td>
                    <td>
                        组织机构代码：<input id="organizationCode" name="organizationCode" type="text" value="${listValue.organizationCode}" readonly="readonly" />
                    </td>
                    <td>
                        企业名称：<input id="enterpriseName" name="enterpriseName" type="text" value="${listValue.enterpriseName}" readonly="readonly" />
                    </td>
                    <td>
                        企业性质：<input id="enterpriseProperty" name="enterpriseProperty" type="text" value="${listValue.enterpriseProperty}" readonly="readonly" />
                    </td>
                    <td>
                        所属行业：<input id="industryInvolved" name="industryInvolved" type="text" value="${listValue.industryInvolved}" readonly="readonly" />
                    </td>
                    <td>
                        主要经营业务：<input id="business" name="business" type="text" value="${listValue.business}" readonly="readonly" />
                    </td>
                    <td>
                        联系人：<input id="contacts" name="contacts" type="text" value="${listValue.contacts}" readonly="readonly" />
                    </td>
                    <td>
                        联系地址：<input id="address" name="address" type="text" value="${listValue.address}" readonly="readonly" />
                    </td>
                    <td>
                        邮政编码：<input id="postalCode" name="postalCode" type="text" value="${listValue.postalCode}" readonly="readonly" />
                    </td>
                    <td>
                        联系电话：<input id="phone" name="phone" type="text" value="${listValue.phone}" readonly="readonly" />
                    </td>
                    <td>
                        传真：<input id="fax" name="fax" type="text" value="${listValue.fax}" readonly="readonly" />
                    </td>
                    <td>
                        E-mail：<input id="email" name="email" type="text" value="${listValue.email}" readonly="readonly" />
                    </td>
                </tr>
            </form>
        </c:forEach>
    </c:if>
    <button class="button" type="submit">导出</button>
</body>
</html>
