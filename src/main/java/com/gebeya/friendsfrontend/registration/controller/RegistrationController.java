package com.gebeya.friendsfrontend.registration.controller;

import java.util.logging.Logger;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gebeya.friendsfrontend.registration.Registration;
import com.gebeya.friendsfrontend.registration.service.RegistrationService;
import com.google.gson.JsonObject;

@Controller
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;

	@GetMapping("registrations")
	public String getRegistration(@ModelAttribute Registration registration) {
		registrationService.saveRegistration(registration);
		return "registration";
	}

	@PostMapping("registrations")
	public String addRegistration(@ModelAttribute Registration registration) {
		return "registration";
	}

}
