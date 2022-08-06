package com.arh.emailTracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arh.emailTracker.pojo.EmailDetailsConsumer;
import com.arh.emailTracker.serviceImpl.GenrateUUIDServiceImpl;

@RestController
@RequestMapping("/v1")
public class EmailController {
	@Autowired
	GenrateUUIDServiceImpl genrateUUIDService;

	@PostMapping("/consumeEmail")
	public String cosumeEmail(@RequestBody EmailDetailsConsumer emailDetailsConsumer) {

		String uuid = genrateUUIDService.randomUUID();
		return "Your UUID is: " + uuid;
	}

	@GetMapping("/getEmailContantById/{emailId}")
	public String emailContantById(@PathVariable("emailId") String emailId) {

		return "getEmailContantById";
	}
}
