package com.lms.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.entity.Book;
import com.lms.service.IBookService;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	private IBookService iIBookService;

	// Create book “/add/book” -> post
	@PostMapping("/addBook")
	Integer saveBook(@RequestBody Book book) {
		Integer id = iIBookService.saveBook(book);
		return id;
	}

	// Get all books “/allbooks” -> get
	@GetMapping("/getAllBooks")
	public List<Book> getAllBooks() {
		return iIBookService.getAllBook();
	}

	// Get a book by id “/read/{id} -> get
	@GetMapping("/getBook/{id}")
	public Optional<Book> getBook(@PathVariable Integer id) {
		Optional<Book> employee = iIBookService.getBook(id);
		return employee;
	}

	// Edit a book” /update/{id} -> put
	@PutMapping("/update/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable("id") Integer id, @RequestBody Book book) {
		return new ResponseEntity<Book>(iIBookService.updateBook(book, id), HttpStatus.OK);
	}

	// Change status “/borrow/{id}” -> put/patch
	@PutMapping("/status/{id}")
	public ResponseEntity<Book> changeStatus(@PathVariable("id") Integer id, @RequestBody Book book) {
		return new ResponseEntity<Book>(iIBookService.changeStatus(book, id), HttpStatus.OK);
	}

	// Delete a book by id “/remove/{id} -> delete
	@DeleteMapping("/deleleBook/{id}")
	public ResponseEntity<Book> deleteBook(@PathVariable Integer id) {
		ResponseEntity<Book> responseEntity = new ResponseEntity<>(HttpStatus.OK);
		try {
			iIBookService.deleteBook(id);
		} catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}

}
