<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<f:form action="submituser.do" modelAttribute="user" method="post">
		<table>
			<tr>
				<th>Name:</th>
				<td><f:input path="name" type="text"/></td>
			</tr>
			<tr>
				<th>Address:</th>
				<td><f:input path="address" type="text"/></td>
			</tr>
			<tr>
				<th>Email:</th>
				<td><f:input path="userEmails" type="text"/></td>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit"></td>
			</tr>
		</table>
	</f:form>
</body>
</html>