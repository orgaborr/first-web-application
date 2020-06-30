package com.orgabor.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.orgabor.todo.TodoService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	private LoginService userValidationService = new LoginService();
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
			req.getSession().setAttribute("name", name);
			res.sendRedirect("/todo.do");
		} else {
			req.setAttribute("errorMessage", "Invalid Credentials!");
			req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, res);
		}
		
	}
	
}
