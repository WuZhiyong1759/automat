package com.pt.service;

import java.util.List;

import com.pt.domain.Post;

public interface PostService {
	
	public  boolean delete(long id);
	
	public boolean save(Post post);
	
	public  boolean update(Post post);
	
	public List<Post> findbycode(String code);
	public List<Post> findbyname(String name);
}
