<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="java.util.Random, java.text.*"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>javaInHtml</title>
</head>
<body>
	<%
		Random random = new Random();

		// Trả về ngẫu nhiên (0, 1 hoặc 2).
		int randomInt = random.nextInt(3);

		if (randomInt == 0) {
	%>

	<h1>
		Zero =<%=randomInt%></h1>

	<%
		} else if (randomInt == 1) {
	%>

	<h2>
		One =<%=randomInt%></h2>

	<%
		} else {
	%>
	<h3>
		Two =<%=randomInt%></h3>
	<%
		}
	%>

	<a href="<%=request.getRequestURI()%>">Try Again</a>
</body>
</html>