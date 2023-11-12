package com.gebeya.friendsfrontend.registration.serviceimpl;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.stereotype.Service;

import com.gebeya.friendsfrontend.registration.Registration;
import com.gebeya.friendsfrontend.registration.service.RegistrationService;
import com.google.gson.JsonObject;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Override
	public String saveRegistration(Registration registration) {
		HttpPost post = new HttpPost("http://localhost:9090/friend");
		HttpClient client = new DefaultHttpClient();
		post.setHeader("Accept", "application/json");
		post.setHeader("Content-type", "application/json");
		JsonObject friend = new JsonObject();

		try {

			friend.addProperty("firstName", registration.getFirstName());
			friend.addProperty("lastName", registration.getLastName());
			friend.addProperty("age", 40);

			post.setEntity(new StringEntity(friend.toString(), ContentType.APPLICATION_JSON));
			HttpResponse response = client.execute(post);
			
			return "Success";

		} catch (Exception e) {

			e.printStackTrace();
            return "fail";
		}

	
	}

}
