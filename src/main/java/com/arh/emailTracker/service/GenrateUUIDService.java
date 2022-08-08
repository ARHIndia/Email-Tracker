package com.arh.emailTracker.service;

import com.arh.emailTracker.model.EmailDetails;
import com.arh.emailTracker.pojo.EmailDetailsConsumer;

public interface GenrateUUIDService {

	public String randomUUID();
	
	public EmailDetailsConsumer saveEmailDetails(EmailDetailsConsumer emailDetailsConsumer);
	
	public EmailDetails getEmailContantById(String emailId);
}
