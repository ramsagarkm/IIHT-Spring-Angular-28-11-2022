package com.lms.service;

import java.util.List;
import java.util.Optional;
import com.lms.entity.Book;

public interface IBookService {

	Integer saveBook (Book book);
	
	public List<Book> getAllBook();
	
	Optional<Book> getBook(Integer id);
	
	Book updateBook(Book book, Integer id);
	
	Book changeStatus(Book book, Integer id);
	
	public void deleteBook(Integer id);
	
	
}
