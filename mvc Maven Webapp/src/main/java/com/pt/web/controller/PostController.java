package com.pt.web.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pt.domain.Post;
import com.pt.service.PostService;


@Controller
@RequestMapping("/post")
public class PostController {
	@Autowired
	private PostService postService;
	
	@RequestMapping(value="/post/{stu_name}",method = RequestMethod.GET)
	@ResponseBody
	public List<Post> list(@PathVariable String stu_name,Model model) throws JsonGenerationException, JsonMappingException, FileNotFoundException, IOException{
		Logger logger = Logger.getLogger(PostController.class);
		Date t1 = new Date();
		List<Post> postList = postService.findbyname(stu_name);
		System.out.println(postList.toString());
		model.addAttribute("postlist", postList);
		 Date t2 =new Date();
		  logger.info("MVCTRO"+(t2.getTime()-t1.getTime()));
		return postList ;
	}
	
	@RequestMapping(value="/post",method=RequestMethod.POST)
	public String save(Post post,Model model){
		
		boolean flag = postService.save(post);
		String message = "增加失败";
		if (flag) {
			 message ="增加成功";
		}
		Long stu_id = post.getStu_id();
		model.addAttribute("stu_id",stu_id );
		model.addAttribute("message", message);
		return"message";
	}
	
	@RequestMapping(value="/post/{stu_id}/{stu_statue}",method=RequestMethod.PUT)
	public String update(@PathVariable long stu_id ,@PathVariable int stu_statue, Model model){
		Post post = new Post();
		post.setStu_id(stu_id);
		post.setStu_statue(stu_statue);
		boolean flag = postService.update(post);
		String message = "修改失败";
		if (flag) {
			 message ="修改成功";
		}
		model.addAttribute("stu_id",stu_id);
		model.addAttribute("message", message);
		return"message";
	}
	
	@RequestMapping(value ="post/{stu_id}" )
	public String delete(@PathVariable long stu_id,Model model){
		
		boolean flag = postService.delete(stu_id);
		String message = "删除失败";
		if (flag) {
			 message ="删除成功";
		}
		model.addAttribute("stu_id",stu_id);
		model.addAttribute("message", message);
		return "message";
	}
}
