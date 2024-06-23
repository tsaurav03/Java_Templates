package com.blogs.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blogs.entities.User;
import com.blogs.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	public UserController() {
		System.out.println("in ctor" + getClass());

	}

	@GetMapping("/login")
	public String userLogin() {
		System.out.println("in login form");

		return "/user/login";

	}

	@PostMapping("/login")
	public String processLoginForm(@RequestParam String em, @RequestParam String pass, Model map, HttpSession session) {
		try {
			User user = userService.loginUser(em, pass);
			session.setAttribute("user_dtls", user);
			return "redirect:/blogger/home";
		} catch (RuntimeException e) {
			map.addAttribute("mesg", e.getMessage());
			return "/user/login";
		}

	}
	
	@GetMapping("/logout")
	public String userLogout(HttpSession session,Model map)
	{
		System.out.println("in logout ");
		//store user details as model attribute
		map.addAttribute("user_details",
				session.getAttribute("user_dtls"));
		//invalidate session
		session.invalidate();		
		return "/user/logout";
	}
}
