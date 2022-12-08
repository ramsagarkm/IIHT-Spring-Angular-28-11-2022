package com.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hr.entity.HR;
import com.hr.service.IhrService;

@RestController
@RequestMapping("/hr")
public class HRController {

	@Autowired
	private IhrService ihrService;
	
	@Autowired
	private RestTemplate restTemplate;
	/*
	@GetMapping("/{userID}")
	public HR getHR(@PathVariable("userID") Long userID) {
		HR hr=this.ihrService.getHR(userID);
		return hr;
	}*/
	
	@SuppressWarnings("unchecked")
	@GetMapping("/{userID}")
	public HR getHR(@PathVariable("userID") Long userID) {
		HR hr=this.ihrService.getHR(userID);
		@SuppressWarnings("rawtypes")
		List resources=this.restTemplate.getForObject("http://Resource-Service/resouce/hr/"+userID, List.class);
		hr.setResource(resources);
		return hr;
	}
	
	
}
