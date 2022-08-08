package com.arh.emailTracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arh.emailTracker.model.EmailDetails;
import com.arh.emailTracker.pojo.EmailDetailsConsumer;
import com.arh.emailTracker.serviceImpl.GenrateUUIDServiceImpl;

@RestController
@RequestMapping("/v1")
public class EmailController {
	@Autowired
	GenrateUUIDServiceImpl genrateUUIDService;

	@PostMapping("/consumeEmail")
	public String cosumeEmail(@RequestBody EmailDetailsConsumer emailDetailsConsumer) {

		EmailDetailsConsumer edc = genrateUUIDService.saveEmailDetails(emailDetailsConsumer);
		return "Your EmailDetailsConsumer is: " + edc;
	}

	@GetMapping("/getEmailContantById/{emailId}")
	public EmailDetails emailContantById(@PathVariable("emailId") String emailId) {
		System.out.println(emailId);
		EmailDetails  emailDetails=genrateUUIDService.getEmailContantById(emailId);
		return emailDetails;
	}
}
