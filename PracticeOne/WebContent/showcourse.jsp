<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="enroll">
		<table>
			<tr>
				<th>Course Id</th>
				<th>Course Name</th>
				<th>Course Fees</th>
				<th>Enroll</th>
			</tr>
			<a:forEach var="course" items="${temp}">
				<tr>
					<td>${course.courseId}</td>
					<td>${course.courseName}</td>
					<td>${course.courseFee}</td>
					<td><a href="enroll">Enroll</a></td>
					
				</tr>
			</a:forEach>
		</table>
	</form>
</body>
</html>