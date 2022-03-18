package com.manish.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.manish.Connection.DBConnection;
import com.manish.model.Register;

public class registerdao {
	
	private Connection conn;
	
	public registerdao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	public boolean insert(Register regis)
	{
		
		try
		{
			Connection conn = DBConnection.getConn();
			String sql = "insert into users (name , email, mobilenumber, password, address) values (?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, regis.getName());
			ps.setString(2, regis.getEmail());
			ps.setString(3, regis.getMobilenumber());
			ps.setString(4, regis.getPassword());
			ps.setString(5, regis.getAddress());
			ps.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	
}
