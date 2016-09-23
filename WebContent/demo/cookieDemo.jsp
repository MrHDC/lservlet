<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.loe.utils.CookieUtils"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>cookieDemo</title>
</head>
<body>
	<%
		CookieUtils.demoUserCookie(request, response, out);
	%>
	<a href ="">Try again!!</a>
</body>
</html>