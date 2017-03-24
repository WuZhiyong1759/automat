package com.pt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danga.MemCached.MemCachedClient;
import com.pt.domain.Root;
import com.pt.mapper.RootMapper;
import com.pt.service.RootService;
import com.pt.utils.MemcachedUtils;
@Service
public class RootServiceImpl implements RootService{
	
	@Autowired
	private RootMapper rootMapper;
	@Autowired
	private MemcachedUtils memCachedUtils;
	@Override
	public boolean insertRoot(Root root) {
		int i =rootMapper.insertroot(root);
		boolean flag =false;
		if(i>0){
			memCachedUtils.add("String"+root.getRname(),root.getRpass());
			System.out.println("存入名为"+root.getRname()+"的对象");
			flag = true;
		}
		return flag;
	}

	@Override
	public String findpass(String name) {
		String pass1 =(String) memCachedUtils.get("String"+name);
		if(pass1!=null){
			System.out.println("缓存查询密码");
			return pass1;
		}
		String pass = rootMapper.findpass(name);
		System.out.println("数据库查询密码");
		memCachedUtils.add("String"+name, pass);
		return pass;
	}
	
	

}
