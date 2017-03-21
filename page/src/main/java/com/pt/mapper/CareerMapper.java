package com.pt.mapper;

import com.pt.domain.Career;
import java.util.List;

public interface CareerMapper {
	 List<Career> findAll();
	 List<Career> findByType(String type);
	 void updatecStu();
}