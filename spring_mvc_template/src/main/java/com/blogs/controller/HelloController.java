package com.blogs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // this to tell spring controller , following is spring bean containing request
			// handling annotation--- and its is mandatory
// singleton and Eager
public class HelloController {
	public HelloController() {
		System.out.println("in ctor" + getClass());
	}
	
	//add requesting handling method , to say hello to the client(to test mvc flow)
	
	/*
	 * SC adds the entry in the HandlerMapping bean
	 * key- /hello
	 * value- F.Q controller class name+method name
	 * (com.blogs.controller.HelloController.sayHello)
	 */
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("in say hello");
		return "/welcome";
		/*
		 * Handler (=req handling controller) methods returns LVN=logical view name or Forward view name--->D.S
		 * --> V.R(view resolver) --> AVN(prefix+LVN+suffix)
		 * AVN-/WEB-INF/views/welcome.jsp
		 */
	}
}
