package com.sopra.rest.bookservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sopra.rest.entity.Book;

@Service
public class CourseImpl implements bookServices {
	List<Book> list;

	public CourseImpl() {
		list = new ArrayList<>();
		list.add(new Book(100, "Java", "Java Core"));
		list.add(new Book(101, "Python", "DataModel"));
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return this.list;
	}

	@Override
	public Book getbook(long bookid) {
		Book bk = null;
		for (Book books : list) {
			if (books.getBookId() == bookid) {
				bk = books;
				break;
			}
		}
		return bk;
	}

	@Override
	public Book addBook(Book book) {
		list.add(book);
		return book;
	}

	@Override
	public void delBook(long bookid) {
		// TODO Auto-generated method
		Book bk = null;
		for (Book books : list) {
			if (books.getBookId() == bookid) {
				bk = books;
				break;
			}
			
		}
		list.remove(bk);
	}
}
