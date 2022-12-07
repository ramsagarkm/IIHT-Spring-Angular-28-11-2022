package com.hr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hr.entity.HR;

@Service
public class HrServiceImpl implements IhrService{

	//fake hr creation
	
	List<HR> list=List.of(new HR(1001L,"Vivek","123345678"),
			new HR(1001L,"Ramsagar","123345678"),
			new HR(1002L,"Saurabh","123345678"),
			new HR(1003L,"Raju","123345678"),
			new HR(1004L,"Pankaj","123345678"),
			new HR(1005L,"Rohan","123345678"));
	
	@Override
	public HR getHR(Long id) {
		
		return list.stream().filter(hr -> hr.getUserID().equals(id)).findAny().orElse(null);
	}

	
}
