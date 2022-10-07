<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <title>Create</title>
</head>
<body>
<form:form action="create" modelAttribute="student">

    <form:hidden path="id" value="${student.id}"/>
    Name: <form:input path="name"/>
    <br>
    Age: <form:input path="age"/>
    <br>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
