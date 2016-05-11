package com.cyblib.dto;

public class UserDTO {
	
	private String userId;
	private String password;
	private int numOfBookIssued;
	private int bookId;
	
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getNumOfBookIssued() {
		return numOfBookIssued;
	}
	public void setNumOfBookIssued(int numOfBookIssued) {
		this.numOfBookIssued = numOfBookIssued;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", password=" + password + ", numOfBookIssued=" + numOfBookIssued
				+ ", bookId=" + bookId + "]";
	}
	
	
	
	

}
