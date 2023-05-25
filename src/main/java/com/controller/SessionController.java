package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.UserBean;

@Controller  
public class SessionController {
	
	@RequestMapping(value="signup", method = RequestMethod.GET)
	public String signup() {
		System.out.println("im from signup");
		return "Signup";
	}
	
	
	@RequestMapping(value="login",method = RequestMethod.GET)
	public String login() {
		return "Login";
	}
	
	@RequestMapping(value="forgetpassword", method = RequestMethod.GET)
	public String forgetpassword() {
		return "ForgetPassword";
	}
	
	@RequestMapping(value="saveuser", method=RequestMethod.POST) 
	public String saveUser(UserBean user) {
		System.out.println(user.getFirstName());
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		return "Login";
	}

}
