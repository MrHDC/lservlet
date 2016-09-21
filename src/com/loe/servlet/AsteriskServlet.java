package com.loe.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/any/*")
public class AsteriskServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AsteriskServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();

		out.println("<html>");
		out.println("<head><title>Asterisk</title></head>");

		out.println("<body>");

		out.println("<h3>Hi, your URL match /any/*</h3>");
		out.println("Try out<br>");
		out.println(
				"<br><a href='http://localhost:8080/lservlet/any/path1/a.html'>http://localhost:8080/lservlet/any/path1/a.html</a>");
		out.println(
				"<br><a href='http://localhost:8080/lservlet/any/something'>http://localhost:8080/lservlet/any/something</a>");
		out.println("<br><a href='http://localhost:8080/lservlet/any'>http://localhost:8080/lservlet/any</a>");
		out.println("</body>");
		out.println("<html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
