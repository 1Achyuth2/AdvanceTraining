package com.book.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.domain.Book;

@Repository
@Scope("singleton")
public interface BookRepository extends JpaRepository<Book,Integer>{

	
	List<Book> findByBookTitle(String bookTitle);
	List<Book> findByBookPublisher(String bookPublisher);
	List<Book> findByBookYear(int bookYear);

}
