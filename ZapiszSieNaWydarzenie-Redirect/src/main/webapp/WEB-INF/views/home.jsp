<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Event registration</h1>
    <form action="register" method="post">
        <input name="firstName" placeholder="first name" /><br />
        <input name="lastName" placeholder="last name" /><br />
        <input type="submit" value="Register" />
    </form>
    <a href="show">Print participants</a>
</body>
</html>