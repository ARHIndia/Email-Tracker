package com.arh.emailTracker.service;

import com.arh.emailTracker.model.EmailTraking;

public interface EmailService {
	
	public EmailTraking findById(String id);

	EmailTraking saveEmailTraking(EmailTraking emailTraking);

}
