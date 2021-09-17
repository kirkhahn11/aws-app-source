package com.revature;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/hello")
@RestController
public class HelloControler {
	
	@GetMapping
	public String hello() { 
		return "What's good?!";
	}
}
