package com.pt.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pt.domain.Post;
import com.pt.mapper.PostMapper;
import com.pt.service.PostService;


@Service
public class PostServiceImpl implements PostService {
	@Autowired
	private PostMapper postMapper;
	
	
	public boolean delete(long id) {
	int	i =postMapper.delete(id);	
		boolean flag =false;
		if (i>0) {
			
			flag = true ;
		}
	
		return flag;
	}

	public boolean save(Post post) {
		Date date = new Date();
		
		long ctime =date.getTime();
		post.setPosttime(ctime);
		post.setUpdatetime(ctime);
		
		long sid = postMapper.insert(post);
		
		boolean flag =false;
		if (sid>0) {
			
			flag = true ;
		}
		return flag;
	}
	
	

	public boolean update(Post post) {
		Date date = new Date();
		
		long ctime =date.getTime();
		post.setUpdatetime(ctime);
		int j = postMapper.update(post);
		boolean flag =false;
		if (j>0) {
			
			flag = true ;
		}
	
		return flag;
	}

	public List<Post> findbycode(String code) {
		return postMapper.findbycode(code);
	}

	public List<Post> findbyname(String name) {
		Logger logger = Logger.getLogger(PostServiceImpl.class);
		Date t1 = new Date();
		 List<Post> list= postMapper.findbyname(name);
		 Date t2 =new Date();
		  logger.info("DATA"+(t2.getTime()-t1.getTime()));
		 return  list;
		
	}
	

}
