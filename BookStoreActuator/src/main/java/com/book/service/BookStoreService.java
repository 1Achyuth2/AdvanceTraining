package com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.book.domain.Book;
import com.book.repository.BookRepository;


@Service("bookStoreService")
@Scope("singleton")
public class BookStoreService implements IBookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book updateBookDetails(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAllBookDetails() {
		return bookRepository.findAll();
	}

	@Override
	public void deleteById(Integer bookId) {
		bookRepository.deleteById(bookId);
		
	}

	@Override
	public List<Book> getDetailsByTitle(String bookTitle) {
		return bookRepository.findByBookTitle(bookTitle);
	}

	@Override
	public List<Book> getDetailsByPublisher(String bookPublisher) {
		return bookRepository.findByBookPublisher(bookPublisher);
	}

	@Override
	public List<Book> getDetailsByYear(int bookYear) {
		return bookRepository.findByBookYear(bookYear);
	}

	@Override
	public Book getDetailsById(Integer bookId) {
		return bookRepository.findById(bookId).get();
	}



}