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
	<form action="add" method="post">
		할일 : <input type="text" name="todo" placeholder="할일을 입력해 주세요."/>
		<input type="submit" value="할일 추가"/>
	</form>

<hr>
	<c:forEach items="${ todoList }" var="todo">
		<p>
			${ todo.todo}
		</p>
	</c:forEach>
</body>
</html>
