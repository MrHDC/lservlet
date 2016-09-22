package com.loe.serlvet.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class Log2Filter implements Filter {
	private String logFile;

	public Log2Filter() {
		// TODO Auto-generated constructor stub
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		if (this.logFile != null) {
			this.logToFile(this.logFile);
		}

		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		this.logFile = fConfig.getInitParameter("logFile");

		System.out.println("Log File " + logFile);
	}

	private void logToFile(String fileName) {
		// Ghi log vào file.
		System.out.println("Write log to file " + fileName);
	}
}
