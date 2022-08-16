package com.arh.emailTracker.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailInfo {

	@Value("${arh.mail.to}")
	private String emailId;
	
	@Value("${arh.mail.secret.key}")
	private String secretKey;
	
	@Value("${email.url}")
	private String emailUrl;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getEmailUrl() {
		return emailUrl;
	}

	public void setEmailUrl(String emailUrl) {
		this.emailUrl = emailUrl;
	}

	
}
