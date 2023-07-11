package com.webtemplate.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webtemplate.app.service.RegisterService;
import com.webtemplate.app.vo.UserVO;

@Controller
@RequestMapping("register")
public class RegisterController {
	
	@Autowired
	RegisterService registerservice;
	
	@GetMapping("landing")
	public String landingPage() {
		return "register";
	}
	
	@PostMapping("user")
	public String userRegister(UserVO userVOObject, Model model) {
		registerservice.save(userVOObject);
		return "register";
	}

}
