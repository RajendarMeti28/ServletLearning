<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>

	<h1><c:out value="rajendar"/></h1>
	<c:set var='x' value='30' scope='request'/>
	<c:set var='y' value='20' scope='request'/>
	<c:set var='z' value='${x+y }' scope='session'/>
	<h1 style="color:red; text-align:center;">The sum of x and y is :: <c:out value="${z}"/></h1>
	
	<br/><br/>
	<c:if test="${ x>y }" var="result">
	 X is greater than y.
	 Result is ${ result }
	</c:if>
	<br/><br/>
	<h1>
		<c:forEach begin='1' end='10' step='2'>
				Learning for loop in jstl<br/>
		
		</c:forEach>
		
		</br>
		
		<c:forTokens items='raj,ram,rag,raj,rap' delims=',' var='name' >
		
				The name is ${name}<br/>
		</c:forTokens>
	</h1>
</body>
</html>