<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>hi</title>
</head>
<body>
<h1>
	hi
</h1>

<P>  hi page  <%=request.getAttribute("name") %> </P>
</body>
</html>
