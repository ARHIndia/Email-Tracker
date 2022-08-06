package com.arh.emailTracker.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arh.emailTracker.pojo.EmailDetailsConsumer;

@RestController("/v1")
public class EmailController {

	@PostMapping("/consumeEmail")
	public String cosumeEmail(@RequestBody EmailDetailsConsumer emailDetailsConsumer) {

		UUID uuid = UUID.randomUUID();
		String uuidAsString = uuid.toString();
		System.out.println("Your UUID is: " + uuidAsString);
		return "Your UUID is: " + uuidAsString;
	}

	@GetMapping("/getEmailContantById/{emailId}")
	public String emailContantById(@PathVariable("emailId") String emailId) {

		return "getEmailContantById";
	}
}
