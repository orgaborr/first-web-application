package com.orgabor;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	private UserValidationService userValidationService = new UserValidationService();
	private TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String password = req.getParameter("password");

		boolean isUserValid = userValidationService.isUserValid(name, password);
		
		if(isUserValid) {
			req.setAttribute("name", req.getParameter("name"));
			req.setAttribute("todos", todoService.retriveTodos());
			req.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(req, res);
		} else {
			req.setAttribute("errorMessage", "Invalid Credentials!");
			req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, res);
		}
		
	}
	
}
