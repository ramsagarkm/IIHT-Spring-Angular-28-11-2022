package com.user.service;

import java.util.List;
import java.util.Optional;

import com.user.entity.Book;
import com.user.entity.User;
import com.user.entity.UserDetails;

public interface IUserService {

	public Integer addUser(User user);
	
	public Optional<User> getUserById(Integer userId);

	public List<User> getAllUsers();

	public List<Book> getBookByUserId(Integer userId);

	public UserDetails getUserAndBookByUserId(Integer id);

	public List<UserDetails> getAllUsersBooks();

	public User updateUser(User user, Integer id);

	public void deleteUser(Integer id);

}
