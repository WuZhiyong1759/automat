package com.pt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.domain.Root;
import com.pt.mapper.RootMapper;
import com.pt.redis.RedisClientTemplate;
import com.pt.service.RootService;
import com.pt.utils.SerializeUtil;
@Service
public class RootServiceImpl implements RootService{
	
	@Autowired
	private RootMapper rootMapper;
	@Autowired
	private RedisClientTemplate redisClient;
	@Override
	public boolean insertRoot(Root root) {
		int i =rootMapper.insertroot(root);
		boolean flag =false;
		if(i>0){
			byte[] value=SerializeUtil.serialize(root);
			byte[] key =("root"+root.getRname()).getBytes();
			redisClient.set(key, value);
			System.out.println("redis存入："+root.getRname());
			flag = true;
		}
		return flag;
	}

	@Override
	public String findpass(String name) {
		
		byte[] pass1 =redisClient.get(("root"+name).getBytes());
		if(pass1!=null){
			System.out.println("redis中取");
			Root root =(Root) SerializeUtil.unserialize(pass1);
			return root.getRpass();
		}
		Root root1 = rootMapper.findpass(name);
		byte[] value=SerializeUtil.serialize(root1);
		byte[] key =("root"+root1.getRname()).getBytes();
		redisClient.set(key, value);
		System.out.println("redis存入："+root1.getRname());
		return root1.getRpass();
	}
	
	

}
