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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pt.domain.Career;
import com.pt.service.CareerService;
import com.pt.service.RootService;
import com.pt.utils.DESUtils;
import com.pt.utils.MD5Utils;

@RequestMapping("/u")
@Controller
public class LoginController  {

	@Autowired
	private RootService rootService;
	@Autowired
	private CareerService careerService;
	
	@RequestMapping("/login")
	public String loggin(HttpServletResponse response,String rname,String rpass) throws IOException, Exception{
		
	String	password = rootService.findpass(rname);
	
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
		response.addCookie(ck);
		return "forward:/u/list.do";
	}else{
		return ".test.login";
	}
}

	@RequestMapping("/list")
	public String career(Model model) throws RemoteException{
		List<Career> list = careerService.findAll();
		model.addAttribute("list", list);
		return ".test.center2";
	}
	
	@RequestMapping("/delete")
	public String delete(Model model) throws RemoteException {
		List<Career> list = careerService.findAll();
		model.addAttribute("list", list);
		return ".test.center2";
	}
	@RequestMapping("/list/{type}")
	public String byType(@PathVariable String type ,Model model) throws RemoteException{
		List<Career> list = careerService.findByType(type);
		model.addAttribute("list", list);
		String type1 = "";
		switch (type) {
		case "1":
			type1 = "前端开发";
			break;
		case "2":
			 type1 = "后端开发";
			break;
		case "3":
			type1 = "移动开发";
			break;	
		case "4":
			type1 = "整体开发";
			break;
		default:
			type1 = "运营维护";
			break;
		}
		model.addAttribute("type", type1);
		return ".test.center3";
	}	
}

