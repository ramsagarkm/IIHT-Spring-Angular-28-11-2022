package com.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.book.entity.Book;
import com.book.exception.BookNotFoundExceptionHandler;
import com.book.repository.BookRepository;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	public BookRepository bookRepository;

	@Override
	public Book addBook(Book book, Integer authorId) {
		book.setAuthorId(authorId);
		return bookRepository.save(book);
	}

	@Override
	public Book editBook(Book book, Integer bookId) {
		Book existbook = bookRepository.findById(bookId)
				.orElseThrow(() -> new BookNotFoundExceptionHandler("Book", "id", Integer.toString(bookId)));
		if(book!=null) {
			existbook.setTitle(book.getTitle());
			existbook.setActive(book.isActive());
			existbook.setAuthor(book.getAuthor());
			existbook.setCategory(book.getCategory());
			existbook.setContent(book.getContent());
			existbook.setLogo(book.getLogo());
			existbook.setPrice(book.getPrice());
			existbook.setPublishedDate(book.getPublishedDate());
			existbook.setPublisher(book.getPublisher());
		}
		return bookRepository.save(book);
	}

	@Override
	public Boolean setBookState(String block) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getBookBySubId(String userEmail, Integer subscriptionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cancelSubscription(Integer subscriptionId) {
		// TODO Auto-generated method stub
		return null;
	}

}