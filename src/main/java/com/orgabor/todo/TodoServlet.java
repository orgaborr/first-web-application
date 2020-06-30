package com.orgabor.todo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/todo.do")
public class TodoServlet extends HttpServlet {

	private TodoService todoService = new TodoService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setAttribute("todos", todoService.retriveTodos());
		req.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String newTodo  = req.getParameter("todo");
		todoService.addTodo(new Todo(newTodo));
		res.sendRedirect("/todo.do");
	}
	
		
}
