package com.webtemplate.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webtemplate.app.service.LoginService;
import com.webtemplate.app.vo.LoginVO;

@Controller
@RequestMapping("user")
public class LoginController {

	@Autowired
	LoginService loginservice;

	@GetMapping("landing")
	public String landingPage(Model model) {
		model.addAttribute("isLanding", true);
		return "login";
	}

	@PostMapping("login")
	public String login(LoginVO loginObject, Model model) {
		if (loginservice.validateLoginCredential(loginObject.getUserName(), loginObject.getPassword())) {
			return "home";
		} else {
			model.addAttribute("loginFail", false);
			model.addAttribute("isLanding", false);
		}
		return "login";
	}

}
