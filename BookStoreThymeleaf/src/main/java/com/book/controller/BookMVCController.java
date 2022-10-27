package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.book.domain.Book;
import com.book.service.BookStoreService;

@Controller
@Scope("request")
public class BookMVCController {

	@Autowired
	@Qualifier("bookStoreService")
	private BookStoreService bookStoreService;
	
	
	
	@GetMapping("/allbooks")
	public ModelAndView getBooks() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("products",bookStoreService.getAllBookDetails());
		//mv.addObject("books",bookStoreService.updateBookDetails(book));
		
		mv.setViewName("index.html");
		return mv;
	}
}
