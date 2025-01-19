package com.kisho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc {
	public  boolean readRecords(String Username,String Pass) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/kisho";
		String userName = "root";
		String passWord = "4049";
		String query = "SELECT * from users where uname= ? and password=?";
		
		Connection con = DriverManager.getConnection(url,userName,passWord);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, Username);
		pst.setString(2, Pass);
		ResultSet rs = pst.executeQuery();
		if(rs.next()) {
			return true;
			
		}
				
		con.close();
		return false;
	}
}
