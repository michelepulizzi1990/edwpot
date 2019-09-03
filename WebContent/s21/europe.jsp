<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<sql:query dataSource="jdbc/hr" var="regions">select country_name, region_id from regions natural join countries</sql:query>
<link rel="stylesheet" type="text/css" href="./regions.css" />

<h1>HR European Countries</h1>
</head>
<body>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
        </tr>
        <c:forEach var="cur" items="${regions.rows}">
            <tr>
                <td>${cur.COUNTRY_ID}</td>
                <td>${cur.COUNTRY_NAME}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
