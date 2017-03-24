package com.pt.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pt.domain.Root;
import com.pt.domain.Stu;
import com.pt.service.RootService;
import com.pt.service.StuService;
import com.pt.utils.MD5Utils;
@Controller
@RequestMapping("/tiles")
public class StuController {
	@Autowired
	private StuService stuService;
	
	@Autowired
	private RootService rootServcie;
	
	@RequestMapping("/index")
	public String list(Model model){
		List<Stu> list = stuService.findBysstatue(3);
		model.addAttribute("list", list);
		return ".test.center";
	}
	
	
	@RequestMapping("/login")
	public String log(){
	  return ".test.login";
	}
	@RequestMapping("/regis")
	public String regis(){
	  return ".test.register";
	}
	@RequestMapping("/register")
	public String res(String rname,String rpass){
		Root root = new Root();
		root.setRname(rname);
		String password = MD5Utils.md5(rname+rpass);
		root.setRpass(password);
		boolean b = rootServcie.insertRoot(root);
		if(b){
			return ".test.login";
		}
			return ".test.register";
	}
}
