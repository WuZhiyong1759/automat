package com.pt.mapper;

import java.util.List;

import com.pt.domain.Post;

public interface PostMapper {
	public long insert(Post post);
	public int delete(long stu_id);
	public int update(Post post);
	public List<Post> findbycode(String code);
	public List<Post>  findbyname (String name);
	
	
}
