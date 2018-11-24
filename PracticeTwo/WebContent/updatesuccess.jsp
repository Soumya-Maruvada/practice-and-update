<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td><h1>Update Successful</h1></td>
		</tr>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Deg</th>
			<th>Salary</th>
			<th>Gender</th>
		</tr>
		<tr>
			<td>${temp.empId}</td>
			<td>${temp.empName}</td>
			<td>${temp.empDesignation}</td>
			<td>${temp.empSalary}</td>
			<td>${temp.empGender}</td>
		</tr>
	</table>
</body>
</html>