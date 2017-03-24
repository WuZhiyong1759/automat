package com.pt.service;

import java.util.List;

import com.pt.domain.Career;

public interface CareerService {
	
	public List<Career> findAll();
	
	public List<Career> findByType(String type);
	
}
