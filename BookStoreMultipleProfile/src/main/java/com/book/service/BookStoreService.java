package com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.book.domain.Book;
import com.book.repository.BookRepository;

@Service
@Scope("singleton")
public class BookStoreService implements IBookService{
	
	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepository;

	@Override
	public List<Book> getByYear(int bookYear) {
		// TODO Auto-generated method stub
		return bookRepository.findByBookYear(bookYear);
	}

	@Override
	public List<Book> getByPublisher(String bookPublisher) {
		// TODO Auto-generated method stub
		return bookRepository.findByBookPublisher(bookPublisher);
	}

	@Override
	public List<Book> getByTitle(String bookTitle) {
		// TODO Auto-generated method stub
		return bookRepository.findByBookTitle(bookTitle);
	}

	@Override
	public Book getById(Integer bookId) {
		// TODO Auto-generated method stub
		return bookRepository.findById(bookId).get();
	}

	@Override
	public List<Book> getBookDetails() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Book updateBookDetails(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteById(Integer bookId) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(bookId);
	}

}
