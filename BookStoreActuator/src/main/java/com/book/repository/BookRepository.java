package com.book.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.domain.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
	List<Book> findByBookTitle(String bookTitle);
	List<Book> findByBookPublisher(String bookPublisher);
	List<Book> findByBookYear(int bookYear);
}

