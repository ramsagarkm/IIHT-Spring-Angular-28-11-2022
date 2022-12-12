package com.user.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.entity.User;
import com.user.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	public UserRepository userRepo;

	@Override
	public User addUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

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

	@Override
	public void deleteUser(Integer id) {
		userRepo.deleteById(id);

	}
}