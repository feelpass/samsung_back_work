<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>todoList</title>
</head>
<body>
<h1>
	ToDo List
</h1>


	<c:forEach items="${ todoList }" var="todo">
		<p>
			${ todo.todo}
		</p>
	</c:forEach>
</body>
</html>
