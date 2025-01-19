<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
			 <c:set var="str" value="Hello, JSTL!" />

    <!-- String Length -->
    <p>The length of '${str}' is: ${fn:length(str)}</p>

    <!-- String Substring -->
    <p>The first 5 characters: ${fn:substring(str, 0, 5)}</p>

    <!-- String Uppercase -->
    <p>Uppercase: ${fn:toUpperCase(str)}</p>
</body>
</html>