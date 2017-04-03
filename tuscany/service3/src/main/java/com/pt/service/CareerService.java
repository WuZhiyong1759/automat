package com.pt.service;


import java.util.List;

import org.oasisopen.sca.annotation.Remotable;



import com.pt.domain.Career;
@Remotable
public interface CareerService {
	
	public List<Career> findAll();
	
	public List<Career> findByType(String type);
	
}
