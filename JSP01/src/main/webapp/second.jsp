<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body >

<h1>Page Context attribute is:: <%=pageContext.getAttribute("p",1) %></h1>
<h1>Request attribute is:: <%=pageContext.getAttribute("r",2) %></h1>
<h1>Session attribute is:: <%=pageContext.getAttribute("s",3) %></h1>
<h1>Application attribute is:: <%=pageContext.getAttribute("a",4) %></h1>
</body>
</html>