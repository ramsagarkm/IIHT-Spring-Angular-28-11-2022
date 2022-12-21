package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Book;
import com.book.bean.BookFilter;
import com.book.service.IBookService;

@RestController
public class AuthorController {
	
	@Autowired
	private IBookService bookService;
	
	@PostMapping("/add")
	public ResponseEntity<?> createBook(@RequestBody Book book) {
		return new ResponseEntity<>(bookService.createBook(book), HttpStatus.OK);
	}
	
	@PutMapping("/update/{book-id}")
	public ResponseEntity<?> updateBook(@PathVariable("book-id") Long id, @RequestBody Book updateBook) {
		return new ResponseEntity<>(bookService.updateBook(id, updateBook), HttpStatus.OK);
	}

	@PutMapping("/update/is-active/{book-id}")
	public ResponseEntity<?> updateBorrowed(@PathVariable("book-id") Long id, @RequestBody Boolean isActive) {
		Book book = bookService.getBookById(id);
		if (book == null) {
			return new ResponseEntity<>("No such book available !", HttpStatus.NOT_FOUND);
		} else {
			bookService.changeBookStatus(id, isActive);
			return new ResponseEntity<>("Book status updated successfully !", HttpStatus.OK);
		}
	}
	
	@PostMapping("/search")
	public ResponseEntity<?> searchBooks(@RequestBody BookFilter filter) {
		return new ResponseEntity<>(bookService.searchBook(filter), HttpStatus.OK);
	}

}