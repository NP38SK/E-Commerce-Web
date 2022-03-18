package com.manish.dao;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.manish.Connection.DBConnection;
import com.manish.model.Productmodel;

public class ProductDao {

	private Connection conn;
	String images;
	

	public ProductDao(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean insert(Productmodel pm)
	{
		try
		{
			conn = DBConnection.getConn();
			String query = "insert into eproducts (name, category, price, images) values (?,?,?,?)";
			FileInputStream fis = new FileInputStream(new File(images));
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, pm.getName());
			ps.setString(2, pm.getCategory());
			ps.setString(3, pm.getPrice());
			ps.setBinaryStream(4, fis);
			return true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
}
