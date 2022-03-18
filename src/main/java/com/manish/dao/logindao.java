package com.manish.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.manish.Connection.DBConnection;
import com.manish.model.Register;

public class logindao {
	
	private Connection conn;

	public logindao(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean userLogin(String email, String password)
	{
		
		try
		{
			Connection conn = DBConnection.getConn();
			String sql = "select * from users where email=? and password=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
			    Register regis = new Register();
				regis.setEmail(rs.getString("email"));
				regis.setPassword(rs.getString("password"));
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	
	
}
