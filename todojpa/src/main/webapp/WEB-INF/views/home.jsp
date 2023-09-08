<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<sec:authorize access="!isAuthenticated()">
		<a href="loginform.html">login</a>
	</sec:authorize>
	
	<sec:authorize access="isAuthenticated()">
		welcome~~~!!  <sec:authentication property="name"/> <a href="logout">logout</a>
	</sec:authorize>
	
	<hr>
	
	<a href="todo.html">todo</a>
</body>
</html>
