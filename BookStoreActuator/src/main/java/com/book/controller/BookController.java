package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.book.domain.Book;
import com.book.service.BookStoreService;

@RestController
@Scope("request")
@RequestMapping("/shop")
public class BookController {
	@Autowired
	private BookStoreService bookStoreService;
	
	@RequestMapping("/")
	public String duplicate()
	{
		return "this is duplicate file";
	}
	
	@GetMapping(value="/get",produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Book> getAllBookDetails(){
		return bookStoreService.getAllBookDetails();
	}

	@PostMapping(value="/insert",produces = {MediaType.APPLICATION_JSON_VALUE},
	consumes= {MediaType.APPLICATION_JSON_VALUE})
	public Book insertBookDetails(@RequestBody Book book) {
		return bookStoreService.save(book);
		
	}
	
	@PutMapping(value="/update",produces={MediaType.APPLICATION_JSON_VALUE})
	@ResponseStatus(code=HttpStatus.OK)
	public Book updateBookDetails(@RequestBody Book book) {
		return bookStoreService.updateBookDetails(book);
	}
	
	@GetMapping(value="/getbytitle/{bookTitle}",produces={MediaType.APPLICATION_JSON_VALUE})
	public List<Book> getDetailsByTitle(@PathVariable String bookTitle){
		return bookStoreService.getDetailsByTitle(bookTitle);
	}
	
	@GetMapping(value="/getbypublisher/{bookPublisher}",produces={MediaType.APPLICATION_JSON_VALUE})
	public List<Book> getDetailsByPublisher(@PathVariable String bookPublisher){
		return bookStoreService.getDetailsByPublisher(bookPublisher);
	}
	
	@GetMapping(value="/getbyyear/{bookYear}",produces={MediaType.APPLICATION_JSON_VALUE})
	public List<Book> getDetailsByYear(@PathVariable int bookYear){
		return bookStoreService.getDetailsByYear(bookYear);
	}
	
	@GetMapping(value="/getbyid/{bookId}",produces={MediaType.APPLICATION_JSON_VALUE})
	public Book getDetailsById(@PathVariable Integer bookId){
		return bookStoreService.getDetailsById(bookId);
	}
	
	@DeleteMapping(value="/delete/{bookId}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public void deleteById(@PathVariable Integer bookId) {
		bookStoreService.deleteById(bookId);
	}
}
