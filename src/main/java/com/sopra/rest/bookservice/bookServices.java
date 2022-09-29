package com.sopra.rest.bookservice;

import java.util.List;

import com.sopra.rest.entity.Book;

public interface bookServices {
	public List<Book> getBooks();

	public Book getbook(long bookid);

	public Book addBook(Book book);

	public void delBook(long bookid);

}
