package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class IndexPageController {
	public IndexPageController() {
		System.out.println("in ctor"+getClass());
	}
	//URl- http:
 @GetMapping("/")
 public String showIndexPage() {
	 System.out.println("in show index page");
	 return "/index";
 }
}
