package com.example.server.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.server.model.User;

import jakarta.validation.Valid;

//@CrossOrigin(origins = "https://ongduythangclient.azurewebsites.net")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class UserController {

	@PostMapping("/login")
	public String login(@Valid @RequestBody User user) {
		return user.getUserName().equals("admin") && user.getPassword().equals("admin")
		? "success"
		: "fail";
	}
	
}
