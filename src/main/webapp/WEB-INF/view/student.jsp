<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: aleksey
  Date: 31.03.2022
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
<h2> Student name: ${student.name}</h2>
<h2>Student age: ${student.age}</h2>

<c:url var="deleteUrl" value="/student/delete">
    <c:param name="id" value="${student.id}"/>
</c:url>
<a href="${deleteUrl}">DELETE</a>
<br>

<c:url var="editUrl" value="/student/edit">
    <c:param name="id" value="${student.id}"/>
</c:url>

<a href="${editUrl}">EDIT</a>

</body>
</html>
