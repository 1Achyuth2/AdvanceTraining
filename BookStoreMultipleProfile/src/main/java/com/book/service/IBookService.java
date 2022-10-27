package com.book.service;

import java.util.List;

import com.book.domain.Book;

public interface IBookService {

	List<Book> getByYear(int bookYear);
	List<Book> getByPublisher(String bookPublisher);
	List<Book> getByTitle(String bookTitle);
	Book getById(Integer bookId);
	List<Book> getBookDetails();
	
	Book updateBookDetails(Book book);
	
	Book save(Book book);
	
	void deleteById(Integer bookId);
	
}
