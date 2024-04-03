package com.example.apidemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to spring boot Application";
	}
}
