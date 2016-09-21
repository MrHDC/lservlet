package com.loe.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/other/redirectDemo")
public class RedirectDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RedirectDemoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String redirect = request.getParameter("redirect");
		 
        if ("true".equals(redirect)) {
            System.out.println("Redirect to ShowMeServlet");
            // contextPath luôn luôn là "" hoặc "/contextPath".
 
            String contextPath = request.getContextPath();
 
            // ==> /ServletTutorial/showMe
            response.sendRedirect(contextPath + "/showMe");
            return;
        }
 
        ServletOutputStream out = response.getOutputStream();
        out.println("<h3>Text of RedirectDemoServlet</h3>");
        out.println("- servletPath=" + request.getServletPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
