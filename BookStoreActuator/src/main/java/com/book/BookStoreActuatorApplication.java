package com.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.book.domain.Book;
import com.book.repository.BookRepository;

@SpringBootApplication
public class BookStoreActuatorApplication implements CommandLineRunner {
	
	@Autowired
	@Qualifier("bookRepository")
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookStoreActuatorApplication.class, args);
		System.out.println("Spring Boot Actuator");
	}
	@Override
	public void run(String... args) throws Exception {

	   bookRepository.save(new Book(0,"English","ravi",2000));
	   bookRepository.save(new Book(0,"Telugu","hari",2001));
	   bookRepository.save(new Book(0,"Tamil","stephen",2002));
	   bookRepository.save(new Book(0,"Kannada","manoj",2003));
          
	   System.out.println(bookRepository.findAll());
	}	
}
