package com.loe.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.loe.beans.Constants;

@WebServlet("/showMe")
public class ShowMeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ShowMeServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletOutputStream out = response.getOutputStream();
		out.println("<h3>Text of ForwardDemoServlet</h3>");
		String value = (String) request.getAttribute(Constants.ATTRIBUTE_USER_NAME_KEY);
		out.println(value);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
