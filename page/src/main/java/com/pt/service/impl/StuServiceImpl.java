package com.pt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.domain.Stu;
import com.pt.mapper.StuMapper;
import com.pt.service.StuService;
@Service
public class StuServiceImpl implements StuService {
	@Autowired
	private StuMapper stuMapper;
	@Override
	public List<Stu> findBysstatue(int i) {
		
		return stuMapper.findBysstatue(i);
	}

}
