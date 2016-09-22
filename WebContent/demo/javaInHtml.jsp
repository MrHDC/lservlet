<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.Random, java.text.*"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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

	<a href="<%=request.getRequestURI()%>">Trả về ngẫu nhiên (0, 1 hoặc 2).</a>

	<%!public int sum(int a, int b) {
		return (a + b);
	}%>
	<h3>
		1 + 2 =
		<%=sum(1, 2)%></h3>
</body>
</html>