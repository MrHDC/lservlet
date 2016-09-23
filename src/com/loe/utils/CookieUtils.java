package com.loe.utils;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspWriter;

public class CookieUtils {

	public static void demoUserCookie(HttpServletRequest request, HttpServletResponse response, JspWriter writer)
			throws IOException {
		boolean found = false;

		Cookie[] cookies = request.getCookies();

		if (cookies != null && cookies.length > 0) {
			String userName = null;
			String lastLoginDatetime = null;

			writer.println("<h3>Cookie:</h3>");

			for (int i = 0; i < cookies.length; i++) {
				writer.println(cookies[i].getName() + " : " + cookies[i].getValue() + "<br>");

				if (cookies[i].getName().equals("userName")) {
					userName = cookies[i].getValue();
				} else if (cookies[i].getName().equals("lastLoginTime")) {
					lastLoginDatetime = cookies[i].getValue();
				}
			}

			if (userName != null) {
				found = true;
				writer.println("<h4>Last login info:</h4>");
				writer.println("User Name: " + userName + "<br>");
				writer.println("Last Login Datetime: " + lastLoginDatetime + "<br>");
			}
		}

		if (!found) {
			writer.println("<h3>No cookies founds!, write some cookies into client computer</h3>");
			// Ghi một vài thông tin Cookie vào máy tính người dùng.
			// Chẳng hạn như userName họ đã từng login.
			// Đây là cách nhớ user đã login
			// Mô phỏng ghi Cookie vào máy tính người dùng sau khi họ vừa login.

			String userName = "someName";

			Cookie cookieUserName = new Cookie("userName", userName);

			DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			Date now = new Date();

			String lastLoginTime = dateFormat.format(now);

			Cookie cookieLoginDatetime = new Cookie("lastLoginTime", lastLoginTime);
			
			// Sét đặt thời gian sống của Cookie là 24h (Đã đổi ra giây).
	         cookieUserName.setMaxAge(24 * 60 * 60);
	         cookieLoginDatetime.setMaxAge(24 * 60 * 60);
	         
	         response.addCookie(cookieUserName);
	         response.addCookie(cookieLoginDatetime);

		}
	}
}
