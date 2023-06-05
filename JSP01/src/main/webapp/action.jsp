<jsp:useBean id="student" class="com.bean.Student" scope="page">
	<jsp:setProperty property='id' name='student' value='1'/>
	<jsp:setProperty property='name' name='student' value='rajendar'/>
	<jsp:setProperty property='address' name='student' value='Warangal'/>
	<jsp:setProperty property='age' name='student' value='23'/>
</jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
</head>
<body>

<center>
	<h1>Student Details</h1>
		<table border=1>
			<tr><th>ID:</th>
				<td>
					<jsp:getProperty property="id" name="student"/>
				</td>
			</tr>
			<tr><th>NAME:</th>
				<td>
					<jsp:getProperty property="name" name="student"/>
				</td>
			</tr>
			<tr><th>ADDRESS:</th>
				<td>
					<jsp:getProperty property="address" name="student"/>
				</td>
			</tr>
			<tr><th>AGE:</th>
				<td>
					<jsp:getProperty property="age" name="student"/>
				</td>
			</tr>
		</table>
</center>
</body>
</html>