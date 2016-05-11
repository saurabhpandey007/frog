package com.cyblib.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cyblib.dto.BookDTO;
import com.cyblib.utilities.BookID;
import com.cyblib.utilities.DBConnection;

public class BookDAO {

	
	
	
	
	public List<BookDTO> getBookDetail(BookDTO bkd)
	{
		
		List<BookDTO>ls=new ArrayList<BookDTO>() ;
		
		
		
		
		return ls;
		
	}
	
	public String addBook(BookDTO bd) throws SQLException
	{
		Connection dbConnection=DBConnection.getConnection();
		String insertTableSQL = "INSERT INTO BOOK_DETAILS"
				+ "(bookId,bookGenre,bookTitle, numberOfCopy,bookReview) VALUES"
				+ "(?,?,?,?,?)";
		PreparedStatement preparedStatement = dbConnection.prepareStatement(insertTableSQL);
		
		
		preparedStatement.setInt(1,BookID.getNewBookId());
		preparedStatement.setString(2,bd.getBookGenre());
		preparedStatement.setString(3, bd.getBookTitle());
		preparedStatement.setInt(4, bd.getNumberOfCopy());
		preparedStatement.setString(5, bd.getBookReview());
		
		preparedStatement .executeUpdate();
	
		return "success";
		
	}
	
	
	public String removeBook(int bId)
	{
		
		
		
		return null;
		
	}
	
	
	public void addBookReview(int bId,BookDTO bd) throws SQLException
	{
		
		Connection dbConnection=DBConnection.getConnection();
		String insertTableSQL = "INSERT INTO BOOK_DETAILS"
				+ "(bookReview) VALUES"
				+ "(?)"+"  where PC_Used ='"+bId+"'";;		PreparedStatement preparedStatement = dbConnection.prepareStatement(insertTableSQL);
		
		preparedStatement.setString(1,bd.getBookReview());
		
		
		
	}
	
	
	
	
	
}
