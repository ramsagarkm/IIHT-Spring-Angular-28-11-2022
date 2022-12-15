package com.book.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SubscribedBooks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String subscriptionId;
	private Integer userId;
	private Integer bookId;
	private String userEmail;
	private Integer subscriptionStatus;

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getSubscriptionStatus() {
		return subscriptionStatus;
	}

	public void setSubscriptionStatus(Integer subscriptionStatus) {
		this.subscriptionStatus = subscriptionStatus;
	}

	public SubscribedBooks(String subscriptionId, Integer userId, Integer bookId, String userEmail,
			Integer subscriptionStatus) {
		super();
		this.subscriptionId = subscriptionId;
		this.userId = userId;
		this.bookId = bookId;
		this.userEmail = userEmail;
		this.subscriptionStatus = subscriptionStatus;
	}

	public SubscribedBooks(Integer userId, Integer bookId, String userEmail, Integer subscriptionStatus) {
		super();
		this.userId = userId;
		this.bookId = bookId;
		this.userEmail = userEmail;
		this.subscriptionStatus = subscriptionStatus;
	}

	public SubscribedBooks() {
		super();
		// TODO Auto-generated constructor stub
	}
}
