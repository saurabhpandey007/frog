package com.cyblib.dto;

public class BookDTO {
	
	private int bookId;
	private String bookGenre;
	private String bookTitle;
	private int numberOfCopy;
	private String bookReview;
	
	
	public BookDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookGenre() {
		return bookGenre;
	}


	public void setBookGenre(String bookGenre) {
		this.bookGenre = bookGenre;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public int getNumberOfCopy() {
		return numberOfCopy;
	}


	public void setNumberOfCopy(int numberOfCopy) {
		this.numberOfCopy = numberOfCopy;
	}


	public String getBookReview() {
		return bookReview;
	}


	public void setBookReview(String bookReview) {
		this.bookReview = bookReview;
	}


	@Override
	public String toString() {
		return "BookDTO [bookId=" + bookId + ", bookGenre=" + bookGenre + ", bookTitle=" + bookTitle + ", numberOfCopy="
				+ numberOfCopy + ", bookReview=" + bookReview + "]";
	}


	
	

}
