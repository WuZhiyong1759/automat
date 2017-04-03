package com.pt.web.controller;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pt.domain.Root;
import com.pt.domain.Stu;
import com.pt.service.RootService;
import com.pt.service.StuService;
import com.pt.utils.DESUtils;
import com.pt.utils.MD5Utils;

@RequestMapping("/tiles")
@Controller
public class StuController {
	@Autowired
	private StuService stuService;
	
	@Autowired
	private RootService rootServcie;
	
	@RequestMapping("/index")
	public String list(Model model) throws RemoteException{
		List<Stu> list = stuService.findBysstatue(3);
		model.addAttribute("list", list);
		return ".test.center";
	}
	
	
	@RequestMapping("/login")
	public String log(){
	  return ".test.login";
	}
	@RequestMapping("/login/do")
	public String loggin(HttpServletResponse response,String rname,String rpass) throws IOException, Exception{
		
	String	password = rootServcie.findpass(rname);
	
	String rpassword = MD5Utils.md5(rname+rpass);
	if(password != null && password.equals(rpassword)){
		Calendar ca = Calendar.getInstance();
		long millis = ca.getTimeInMillis();
		String time = String.valueOf(millis);
		String keyString = "9AAB1D2EE004AAC3";
		String result = DESUtils.encrypt(time, keyString);
		String Despass = new String(result);
		Cookie ck = new Cookie(rname, Despass);
		ck.setMaxAge(6*60*60);
		ck.setPath("/controller");
		response.addCookie(ck);
		return "forward:/u/list.do";
	}else{
		return ".test.login";
	}
}
	
	
	
	
	
	
	@RequestMapping("/regis")
	public String regis(){
	  return ".test.register";
	}
	@RequestMapping("/register")
	public String res(String rname,String rpass) throws RemoteException{
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
