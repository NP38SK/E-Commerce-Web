package com.manish.Servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manish.Connection.DBConnection;
import com.manish.dao.ProductDao;
import com.manish.model.Productmodel;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		String name = request.getParameter("name");
		String category = request.getParameter("category");
		String price = request.getParameter("price");
		String images = request.getParameter("images");
		
		FileInputStream fis = new FileInputStream(new File(images));
		
		Productmodel pm = new Productmodel();
		pm.setName(name);
		pm.setCategory(category);
		pm.setPrice(price);
		pm.setImages(images);
		
		HttpSession session = request.getSession();
		
		ProductDao pd = new ProductDao(DBConnection.getConn());
		if(pd.insert(pm))
		{
			session = request.getSession();
			session.setAttribute("product-success", "Product Added Successfully");
			response.sendRedirect("index.jsp");
		}
	}
	
}
