package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.domain.Book;
import com.book.service.BookStoreService;

@RestController
@Scope("request")
@RequestMapping("/shop")
public class BookController {
	
	@Autowired
	@Qualifier("bookStoreService")
	private BookStoreService bookStoreService;
	
	@PostMapping(value="/insert",produces = MediaType.APPLICATION_JSON_VALUE
			,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Book insertBookDetails(Book book) {
		return bookStoreService.save(book);
	}
	
	@GetMapping(value="/get",produces = MediaType.APPLICATION_JSON_VALUE)
     public List<Book> getBookDetails(){
    	 return bookStoreService.getBookDetails();
     }
	
	@GetMapping(value="/getbyId/{bookId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Book getById(@PathVariable Integer bookId){
		return bookStoreService.getById(bookId);
	}
	
	@GetMapping(value="/getbyTitle/{bookTitle}",produces =MediaType.APPLICATION_JSON_VALUE )
	public List<Book> getByTitle(@PathVariable  String bookTitle){
		return bookStoreService.getByTitle(bookTitle);
	}
	
	@GetMapping(value="/getbyPublisher/{bookPublisher}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getByPublisher(@PathVariable String bookPublisher){
		return bookStoreService.getByPublisher(bookPublisher);
	}
	
	@GetMapping(value="/getbyYear/{bookYear}",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Book> getByYear(@PathVariable int bookYear){
		return bookStoreService.getByYear(bookYear);
	}
	
	@PutMapping(value="/update",produces = MediaType.APPLICATION_JSON_VALUE)
	public Book updateDetails(@RequestBody Book book) {
		return bookStoreService.updateBookDetails(book);
	}
    
	@DeleteMapping(value="/delete/{bookId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteById(@PathVariable Integer bookId) {
		bookStoreService.deleteById(bookId);
	}
}
