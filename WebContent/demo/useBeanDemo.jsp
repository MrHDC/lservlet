<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>useBeanDemo</title>
</head>
<body>
	<jsp:useBean id="helloBean2" class="com.loe.beans.HelloBean"></jsp:useBean>

	<h3>Say Hello</h3>

	<jsp:getProperty property="hello" name="helloBean2" />

	<!-- Set property name for helloBean -->
	<jsp:setProperty property="name" name="helloBean2" value="JSP" />

	<h3>Say Hello after setName</h3>
	<jsp:getProperty property="hello" name="helloBean2" />
</body>
</html>