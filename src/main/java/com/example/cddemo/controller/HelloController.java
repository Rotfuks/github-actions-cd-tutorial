package com.example.cddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "<h2>Juhu!</h2><p>Glückwunsch, das war ein erfolgreiches Deployment!</p>";
	}

}