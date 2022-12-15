package com.user.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.user.entity.Book;
import com.user.entity.User;
import com.user.entity.UserDetails;
import com.user.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	public UserRepository userRepo;

	/*
	 * addUser user in db..
	 */
	@Override
	public Integer addUser(User user) {
		User saveUser=userRepo.save(user);
		return saveUser.getUserId();
	}
	
	/*
	 * getUserById by user id..
	 */
	@Override
	public Optional<User> getUserById(Integer userId) {
		return userRepo.findById(userId);
	}

	/*
	 * get all user from db..
	 */
	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	/*
	 * get book from book service..
	 */
	public List<Book> getBookByUserId(Integer userId) {
		@SuppressWarnings("unchecked")
		List<Book> userBooks = this.restTemplate.getForObject("http://order-service/order/" + userId, List.class);
		return userBooks;
	}

	/*
	 * get book and user details based on userId..
	 */
	public UserDetails getUserAndBookByUserId(Integer id) {
		UserDetails userDetails = new UserDetails();
		userDetails.setUser(userRepo.findById(id).get());
		userDetails.setBooks(getBookByUserId(id));
		return userDetails;
	}

	/*
	 * get book for all user based on user id.
	 */
	public List<UserDetails> getAllUsersBooks() {
		List<User> users = userRepo.findAll();
		return users.stream().map(user -> {
			UserDetails userDetails = new UserDetails();
			userDetails.setUser(user);
			userDetails.setBooks(getBookByUserId(user.getUserId()));
			return userDetails;
		}).collect(Collectors.toList());
	}

	/*
	 *updateUser user based on user id.
	 */
	@Override
	public User updateUser(User user, Integer id) {
		// TODO Auto-generated method stub
		Optional<User> optional = userRepo.findById(id);
		User existingUser = optional.get();
		if (Objects.nonNull(existingUser)) {
			existingUser.setUserFirstName(user.getUserFirstName());
			existingUser.setUserLastName(user.getUserLastName());
			existingUser.setUserPassword(user.getUserPassword());
			existingUser.setUserEmail(user.getUserEmail());
			existingUser.setUserRole(user.getUserRole());
		}
		User updatedUser = userRepo.save(existingUser);
		return updatedUser;
	}
	/*
	 *deleteUser user based on user id.
	 */
	@Override
	public void deleteUser(Integer id) {
		userRepo.deleteById(id);

	}
}
