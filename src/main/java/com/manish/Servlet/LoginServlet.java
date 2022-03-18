package com.manish.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manish.Connection.DBConnection;
import com.manish.dao.logindao;

@WebServlet("/user-login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		PrintWriter out = response.getWriter();
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		logindao login = new logindao(DBConnection.getConn());
		
	
		
		if(login.userLogin(email, password))
		{
			request.getSession().setAttribute("email", email);
			response.sendRedirect("index.jsp");
		}
		else if("mohitbutola@gmail.com".equals(email) && "Mohit@#$%123".equals(password))
		{
			response.sendRedirect("admin/adminHome.jsp");
		}
		else {
			HttpSession session = request.getSession();
			session.setAttribute("login-failed", "Invalid email and password");
			response.sendRedirect("login.jsp");
		}
	}
	

}
