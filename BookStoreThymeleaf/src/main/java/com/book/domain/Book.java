package com.book.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="BookDetails")

public class Book{
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Book_Id")
private Integer bookId;
@Column(name="Book_Title")
private String bookTitle;
@Column(name="Book_Publisher")
private String bookPublisher;
@Column(name="Book_Year")
private int bookYear;



public Book( Integer bookId,String bookTitle, String bookPublisher, int bookYear) {
	super();
   this.bookId=bookId;
	this.bookTitle = bookTitle;
	this.bookPublisher = bookPublisher;
	this.bookYear = bookYear;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookPublisher=" + bookPublisher + ", bookYear="
			+ bookYear + "]";
}
public Integer getBookId() {
	return bookId;
}
public void setBookId(Integer bookId) {
	this.bookId = bookId;
}
public String getBookTitle() {
	return bookTitle;
}
public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}
public String getBookPublisher() {
	return bookPublisher;
}
public void setBookPublisher(String bookPublisher) {
	this.bookPublisher = bookPublisher;
}
public int getBookYear() {
	return bookYear;
}
public void setBookYear(int bookYear) {
	this.bookYear = bookYear;
}




}





	
	
//	@Entity
//	@Table(name="BookDetails")
//	public class Book {
//		
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name="Book_Id")
//	private Integer bookId;
//	@Column(name="Book_Title")
//	private String bookTitle;
//	@Column(name="Book_Publisher")
//	private String bookPublisher;
//	@Column(name="Book_Year")
//	private int bookYear;
//	
//	
//	
//	public Book(Integer bookId, String bookTitle, String bookPublisher, int bookYear) {
//		super();
//		this.bookId = bookId;
//		this.bookTitle = bookTitle;
//		this.bookPublisher = bookPublisher;
//		this.bookYear = bookYear;
//	}
//	public Book() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public String toString() {
//		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookPublisher=" + bookPublisher + ", bookYear="
//				+ bookYear + "]";
//	}
//	public Integer getBookId() {
//		return bookId;
//	}
//	public void setBookId(Integer bookId) {
//		this.bookId = bookId;
//	}
//	public String getBookTitle() {
//		return bookTitle;
//	}
//	public void setBookTitle(String bookTitle) {
//		this.bookTitle = bookTitle;
//	}
//	public String getBookPublisher() {
//		return bookPublisher;
//	}
//	public void setBookPublisher(String bookPublisher) {
//		this.bookPublisher = bookPublisher;
//	}
//	public int getBookYear() {
//		return bookYear;
//	}
//	public void setBookYear(int bookYear) {
//		this.bookYear = bookYear;
//	}
//	
//	
//	
//	}
//
//	
	
	
	
	
	
	
	
	
	
