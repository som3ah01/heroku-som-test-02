package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"*"})
public class HerokuController {
	
	@GetMapping("/")
	public String hello() {
		return "Test Heroku Hello";
	}

}
