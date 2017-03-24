package com.pt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danga.MemCached.MemCachedClient;
import com.pt.domain.Stu;
import com.pt.mapper.StuMapper;
import com.pt.service.StuService;
import com.pt.utils.MemcachedUtils;
@Service
public class StuServiceImpl implements StuService {
	@Autowired
	private StuMapper stuMapper;
	@Autowired
	private MemcachedUtils memCachedUtils;
	@Override
	public List<Stu> findBysstatue(int i) {
	/**	List<Stu> list = (List<Stu>) memCachedUtils.get(i+"stu");
		if(list != null){
			System.out.println("缓存");
			return list;
		}
	*/
			List<Stu> list1 = stuMapper.findBysstatue(i);
		//	memCachedUtils.add(i+"stu", list1);
			System.out.println("数据库");
			return list1;
	}

}
