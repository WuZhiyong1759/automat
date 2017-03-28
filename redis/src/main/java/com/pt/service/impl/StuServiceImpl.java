package com.pt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.domain.Stu;
import com.pt.mapper.StuMapper;
import com.pt.redis.RedisClientTemplate;
import com.pt.service.StuService;
import com.pt.utils.SerializeUtil;

@Service
public class StuServiceImpl implements StuService {
	@Autowired
	private StuMapper stuMapper;
	@Autowired
	private RedisClientTemplate redisClient;
	@Override
	public List<Stu> findBysstatue(int i) {
		byte[] pass1 =redisClient.get((i+"Stu").getBytes());
			if(pass1!=null){
			System.out.println("redis中取Stu"+i);
			List<Stu> list = SerializeUtil.deserialize(pass1);
			return list;
			}
			List<Stu> list1 = stuMapper.findBysstatue(i);
			byte[] value=SerializeUtil.serialize(list1);
			byte[] key =(i+"Stu").getBytes();
			redisClient.set(key, value);
			System.out.println("redis存入：Stu"+i);
			return list1;
	}

}
