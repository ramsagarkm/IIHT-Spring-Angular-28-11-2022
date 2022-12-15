package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.user.entity.User;
import com.user.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private IUserService iUserService;
	
	// Create user..
		@PostMapping("/create")
		Integer saveUser(@RequestBody User user) {
			Integer id = iUserService.addUser(user);
			return id;
		}
	
}
