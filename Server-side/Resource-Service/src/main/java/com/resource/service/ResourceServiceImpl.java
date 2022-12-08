package com.resource.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.resource.entity.Resource;

@Service
public class ResourceServiceImpl implements IResourceService {

	List<Resource> list = List.of(new Resource(1L, "peter@gmail.com", "peter", "React Dev", 1001L),
			new Resource(2L, "ram@gmail.com", "ram", "jav Dev", 1002L),
			new Resource(3L, "philip@gmail.com", "philip", "jav Dev", 1002L),
			new Resource(4L, "pinki@gmail.com", "pinki", "angular Dev", 1004L),
			new Resource(5L, "raju@gmail.com", "raju", "angular Dev", 1004L),
			new Resource(6L, "ganesh@gmail.com", "ganesh", "microservices Dev", 1005L),
			new Resource(7L, "atul@gmail.com", "atul", "microservices Dev", 1005L),
			new Resource(8L, "ranjan@gmail.com", "ranjan", ".Net Dev", 1008L),
			new Resource(1L, "vikash@gmail.com", "vikash", ".Net Dev", 1008L),
			new Resource(1L, "mukesh@gmail.com", "mukesh", "React Dev", 1001L));

	@Override
	public List<Resource> getResourceForUsers(Long userID) {
		return list.stream().filter(resource -> resource.getUserID().equals(userID)).collect(Collectors.toList());
	}

}
