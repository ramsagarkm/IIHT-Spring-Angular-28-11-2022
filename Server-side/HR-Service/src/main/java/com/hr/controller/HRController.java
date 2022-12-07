package com.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.entity.HR;
import com.hr.service.IhrService;

@RestController
@RequestMapping("/hr")
public class HRController {

	@Autowired
	private IhrService ihrService;
	
	@GetMapping("/{userID}")
	public HR getHR(@PathVariable("userID") Long userID) {
		HR hr=this.ihrService.getHR(userID);
		return hr;
	}
	
}
