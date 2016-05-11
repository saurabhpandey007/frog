// class providing connection 
package com.cyblib.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	// this method will return the connection object
	public static Connection getConnection() {
		Connection con=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/booklibrary","root","root");

		} 
		
		catch (ClassNotFoundException e) {
			System.out.println("exception in class.forname method");
			e.printStackTrace();
		}
		catch (SQLException e) {
			
			System.out.println("exception in getconnection method");
			e.printStackTrace();
		}
		
		return con;

	}

}
