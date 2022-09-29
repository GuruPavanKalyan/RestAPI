package com.sopra.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sopra.rest.bookservice.bookServices;
import com.sopra.rest.entity.Book;

@RestController
public class Controller {
	@Autowired
	private  bookServices services;
	@RequestMapping("/sopra")
public String home() {
return "Hello  18 1 13 25 1  18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 18 1 13 25 1 ";
}
	@GetMapping("/books")
	public List<Book> getBooks(){
		return this.services.getBooks();
	}
	@GetMapping("/book/{bookid}")
	public Book getbook(@PathVariable String bookid)
	{
		return this.services.getbook(Long.parseLong(bookid));
	}
	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book) {
		return this.services.addBook(book);
	}
	@DeleteMapping("/delbook/{bookid}")
	public void delBook(@PathVariable String bookid) {
		 this.services.delBook(Long.parseLong(bookid));
	}
}
