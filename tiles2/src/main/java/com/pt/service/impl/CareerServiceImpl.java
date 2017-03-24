package com.pt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danga.MemCached.MemCachedClient;
import com.pt.domain.Career;
import com.pt.domain.Stu;
import com.pt.mapper.CareerMapper;
import com.pt.service.CareerService;
import com.pt.utils.MemcachedUtils;
@Service
public class CareerServiceImpl implements CareerService {
	@Autowired
	private CareerMapper careermapper;
	@Autowired
	private MemcachedUtils memCachedUtils;
	@Override
	public List<Career> findAll() {
		List<Career> listall =	(List<Career>) memCachedUtils.get("alltype");
		if(listall!=null){
			System.out.println("缓存取得所有值");
			return listall;
		}
		careermapper.updatecStu();
		List<Career> all = careermapper.findAll();
		System.out.println("数据库取得所有值");
		memCachedUtils.add("alltype", all);
		return all;
	}

	@Override
	public List<Career> findByType(String type) {
		List<Career> typelist =	(List<Career>) memCachedUtils.get(type+"Career");
		if(typelist!=null){
			System.out.println("缓存取得类型值");
			return typelist;
		}
		careermapper.updatecStu();
		System.out.println("数据库取得类型值");
		List<Career> list = careermapper.findByType(type);
		memCachedUtils.add(type+"Career", list);
		return list;
	}

}
