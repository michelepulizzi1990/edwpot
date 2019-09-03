<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>List of Countries</title>
</head>
<body>
<h1>List of countries for selected region</h1>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
        </tr>
        <c:forEach var="country" items="${countries}">
            <tr>
                <td>${country.id}</td>
                <td>${country.name}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>