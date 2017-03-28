package com.pt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.domain.Career;
import com.pt.mapper.CareerMapper;
import com.pt.redis.RedisClientTemplate;
import com.pt.service.CareerService;
import com.pt.utils.SerializeUtil;
@Service
public class CareerServiceImpl implements CareerService {
	@Autowired
	private CareerMapper careermapper;
	@Autowired
	private RedisClientTemplate redisClient;
	@Override
	public List<Career> findAll() {
		careermapper.updatecStu();
		byte[] pass1 =redisClient.get(("allCareer").getBytes());
		if(pass1!=null){
			System.out.println("redis中取allCareer");
			List<Career> list = SerializeUtil.deserialize(pass1);
			return list;
		}
		List<Career> all = careermapper.findAll();
		byte[] value=SerializeUtil.serialize(all);
		byte[] key =("allCareer").getBytes();
		redisClient.set(key, value);
		System.out.println("redis存入：所有Career");
		return all;
	}

	@Override
	public List<Career> findByType(String type) {
		careermapper.updatecStu();
		byte[] pass1 =redisClient.get((type+"Career").getBytes());
		if(pass1!=null){
			System.out.println("redis中取Career"+type);
			List<Career> list = SerializeUtil.deserialize(pass1);
			return list;
		}
		List<Career> list = careermapper.findByType(type);
		byte[] value=SerializeUtil.serialize(list);
		byte[] key =(type+"Career").getBytes();
		redisClient.set(key, value);
		System.out.println("redis存入Career"+type);
		return list;
	}

}
