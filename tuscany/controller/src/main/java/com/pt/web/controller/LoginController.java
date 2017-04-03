package com.pt.web.controller;

import java.rmi.RemoteException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pt.domain.Career;
import com.pt.service.CareerService;

@RequestMapping("/u")
@Controller
public class LoginController  {
	@Autowired
	private CareerService careerService;
	

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

