<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hit Count</title>
</head>
<body>


	<%
		Integer count = (Integer)application.getAttribute("hitcount");
		if(count==null){
			count=1;
		}else{
			count++;
		}
		application.setAttribute("hitcount", count);
		
		Integer userCount = (Integer) application.getAttribute("usercount");
		if(session.isNew()){
			if(userCount == null){
				userCount = 1;
			}
			else{
				userCount++;
			}
		}
		
		application.setAttribute("usercount",userCount);
	%>
	
	<h1 style="color:red;">No of hit counts: <%=application.getAttribute("hitcount") %></h1>
	<h1>No of users/sessions logged in: <%= application.getAttribute("usercount") %></h1>
</body>
</html>