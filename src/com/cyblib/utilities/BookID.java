package com.cyblib.utilities;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookID {

	
	
	
	public static int getNewBookId() throws SQLException
	{
		int ct=101;
		Statement stmt =DBConnection.getConnection().createStatement();
		
		String sql = "SELECT bookId FROM book_details";
	     
		ResultSet rs = stmt.executeQuery(sql);
	   	      while(rs.next()){
	         ct++;
	      }
	   	   
	      rs.close();
		System.out.println(ct);
		return ct;
		
	}
	
	
	
}
