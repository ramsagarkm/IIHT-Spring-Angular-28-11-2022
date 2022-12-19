package com.lms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bookId;
	private String bookName;
	private String bookAuthor;
	private Double bookPrice;
	private String bookGenration;
	private Boolean borrowedStatus;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public Double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookGenration() {
		return bookGenration;
	}

	public void setBookGenration(String bookGenration) {
		this.bookGenration = bookGenration;
	}

	public Boolean getBorrowedStatus() {
		return borrowedStatus;
	}

	public void setBorrowedStatus(Boolean borrowedStatus) {
		this.borrowedStatus = borrowedStatus;
	}

	public Book(String bookName, String bookAuthor, Double bookPrice, String bookGenration, Boolean borrowedStatus) {
		super();
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookGenration = bookGenration;
		this.borrowedStatus = borrowedStatus;
	}

	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + ", bookGenration=" + bookGenration + ", borrowedStatus=" + borrowedStatus + "]";
	}
}
