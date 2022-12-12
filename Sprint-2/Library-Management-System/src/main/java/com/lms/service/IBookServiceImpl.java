package com.lms.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lms.exception.BookNotFoundExceptionHandler;
import com.lms.entity.Book;
import com.lms.repository.IBookRepo;

@Service
public class IBookServiceImpl implements IBookService {

	@Autowired
	private IBookRepo ibookRepo;

	public Integer saveBook(Book book) {
		Book saveBook = ibookRepo.save(book);
		return saveBook.getBookId();
	}

	public List<Book> getAllBook() {
		return ibookRepo.findAll();
	}

	public Optional<Book> getBook(Integer id) {
		return ibookRepo.findById(id);
	}

	public Book updateBook(Book book, Integer id) {
		// lets check if the book exists with the given value or not
		Book existingBook = ibookRepo.findById(id)
				.orElseThrow(() -> new BookNotFoundExceptionHandler("Book", "id", id));
		existingBook.setBookName(book.getBookName());
		existingBook.setBookAuthor(book.getBookAuthor());
		existingBook.setBookPrice(book.getBookPrice());
		existingBook.setBookGenration(book.getBookGenration());
		existingBook.setBorrowedStatus(book.getBorrowedStatus());
		ibookRepo.save(existingBook);
		return existingBook;
	}

	public Book changeStatus(Book book, Integer id) {
		// lets check if the book status exists with the given value or not
		Book existingBook = ibookRepo.findById(id)
				.orElseThrow(() -> new BookNotFoundExceptionHandler("Book", "id", id));
		existingBook.setBorrowedStatus(book.getBorrowedStatus());
		ibookRepo.save(existingBook);
		return existingBook;
	}

	public void deleteBook(Integer id) {
		ibookRepo.deleteById(id);
	}
}
