package com.book.service;

import com.book.entity.Book;

public interface IBookService {
	
	public Book addBook(Book book, Integer authorId);

	public Book editBook(Book book, Integer bookId);
	
	public Book getBookBySubId(String userEmail , Integer subscriptionId);

	public Boolean setBookState(String block);
	
	public Boolean cancelSubscription(Integer subscriptionId);
}
