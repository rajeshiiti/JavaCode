package com.java.jdbc.connect;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nk", "root", "toor");
			Statement stmt = conn.createStatement();
			int tmp = stmt.executeUpdate("insert into user values ('test','test','test','1993-12-24')");
			ResultSet rs = stmt.executeQuery("select *from user");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
