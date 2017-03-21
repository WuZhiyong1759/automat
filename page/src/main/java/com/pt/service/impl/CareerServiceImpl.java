package com.pt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.domain.Career;
import com.pt.mapper.CareerMapper;
import com.pt.service.CareerService;
@Service
public class CareerServiceImpl implements CareerService {
	@Autowired
	private CareerMapper careermapper;
	@Override
	public List<Career> findAll() {
		careermapper.updatecStu();
		List<Career> all = careermapper.findAll();
		return all;
	}

	@Override
	public List<Career> findByType(String type) {
		careermapper.updatecStu();
		List<Career> list = careermapper.findByType(type);
		return list;
	}

}
