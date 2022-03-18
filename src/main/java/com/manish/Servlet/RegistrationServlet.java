package com.manish.Servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manish.Connection.DBConnection;
import com.manish.dao.registerdao;
import com.manish.model.Register;

@WebServlet("/user-registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
		{
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String mobilenumber = request.getParameter("mobilenumber");
			String password = request.getParameter("password");
			String address = request.getParameter("address");
			
			Register regis = new Register();
			regis.setName(name);
			regis.setEmail(email);
			regis.setMobilenumber(mobilenumber);
			regis.setPassword(password);
			regis.setAddress(address);
			HttpSession session = request.getSession();
			
			registerdao dao = new registerdao(DBConnection.getConn());
			if(dao.insert(regis))
			{
				session = request.getSession();
				session.setAttribute("reg-success", "Registration Successfully");
				response.sendRedirect("register.jsp");
			}
			else
			{
				session = request.getSession();
				session.setAttribute("failed-msg", "Something went wrong on server");
				response.sendRedirect("register.jsp");
			}
			
		}
	

}
