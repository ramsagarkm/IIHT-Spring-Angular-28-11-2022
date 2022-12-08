package com.resource.controller;
import com.resource.entity.Resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.resource.service.IResourceService;

@RestController
@RequestMapping("/resouce")
public class ResourceController {

	@Autowired
	private IResourceService iResourceService;
	
	@GetMapping("/hr/{userID}")
	public List<Resource> getResource(@PathVariable("userID") Long userID){
		return this.iResourceService.getResourceForUsers(userID);
	}
}
