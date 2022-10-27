package com.book.service;

import java.util.List;

import com.book.domain.Book;

public interface IBookStoreService {

	Book save(Book book);//add
	Book updateBookDetails(Book book);
    //List<Book> getAllBookDetails();
    void deleteById(String bookId);
 
     List<Book> getDetailsByTitle(String bookTitle);
     List<Book> getDetailsByPublisher(String bookPublisher);
     List<Book> getDetailsByYear(int bookYear);
     Book getDetailsById(String bookId);
}
