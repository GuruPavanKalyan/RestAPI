package com.sopra.rest.entity;

public class Book {
private long bookId;
private String bookTitle;
private String bookDescription;
public long getBookId() {
	return bookId;
}
public void setBookId(long bookId) {
	this.bookId = bookId;
}
public String getBookTitle() {
	return bookTitle;
}
public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}
public String getBookDescription() {
	return bookDescription;
}
public void setBookDescription(String bookDescription) {
	this.bookDescription = bookDescription;
}
public Book(long bookId, String bookTitle, String bookDescription) {
	super();
	this.bookId = bookId;
	this.bookTitle = bookTitle;
	this.bookDescription = bookDescription;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookDescription=" + bookDescription + "]";
}

}
