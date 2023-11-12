package com.gebeya.friendsfrontend.registration.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("greetings")
	public String greetings(Map<String, Object> model) {

		model.put("message", "Hello John!");
		return "welcome";

	}
}
