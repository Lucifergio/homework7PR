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
    <title>Students list</title>
</head>
<body>
<h1>Students list:</h1>
<ul>
    <c:forEach var="student" items="${student}">
        <c:url var="viewUrl" value="/student/ + ${student.id}"/>
        <li>
            <a href="${viewUrl}">View</a>
            <br>
            Student id: ${student.id}
            <br>
            Student title: ${student.name}
            <br>
            Student cost: ${student.age}
            <br>
        </li>
    </c:forEach>
</ul>
<br>
<c:url var="createUrl" value="/student/create"/>
<a href="${createUrl}">CREATE</a>
</body>
</html>
