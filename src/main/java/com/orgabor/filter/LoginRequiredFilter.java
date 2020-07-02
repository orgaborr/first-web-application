package com.orgabor.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = "*.do")
public class LoginRequiredFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest servletReq, ServletResponse servletRes, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) servletReq;
		
		System.out.println(req.getRequestURI());
		
		if (req.getSession().getAttribute("name") != null) {
			chain.doFilter(servletReq, servletRes);
		} else {
			req.getRequestDispatcher("/login.do").forward(servletReq, servletRes);
		}
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}
	
}
