<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>SQL Query Example</title>
</head>
<body>
    <c:set var="dbDriver" value="com.mysql.cj.jdbc.Driver" />
    <c:set var="dbUrl" value="jdbc:mysql://localhost:3306/kisho" />
    <c:set var="dbUser" value="root" />
    <c:set var="dbPass" value="4049" />

    <sql:setDataSource var="dataSource" driver="${dbDriver}" url="${dbUrl}" user="${dbUser}" password="${dbPass}" />
    <sql:query dataSource="${dataSource}" var="result">
        SELECT * FROM bus;
    </sql:query>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>AC</th>
            <th>CAPACITY</th>
        </tr>
        <c:forEach var="row" items="${result.rows}">
            <tr>
                <td>${row.id}</td>
                <td>${row.ac}</td>
                 <td>${row.capacity}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
