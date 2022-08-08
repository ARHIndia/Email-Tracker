package com.arh.emailTracker.serviceImpl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arh.emailTracker.Repo.EmailDetailsRepo;
import com.arh.emailTracker.model.EmailDetails;
import com.arh.emailTracker.pojo.EmailDetailsConsumer;
import com.arh.emailTracker.service.GenrateUUIDService;

@Service
public class GenrateUUIDServiceImpl implements GenrateUUIDService {
	@Autowired
	EmailDetailsRepo emailDetailsRepo;

	@Override
	public String randomUUID() {
		UUID uuid = UUID.randomUUID();
		String uuidAsString = uuid.toString();
		return uuidAsString;
	}

	@Override
	public EmailDetailsConsumer saveEmailDetails(EmailDetailsConsumer emailDetailsConsumer) {
		EmailDetails emaildetails = new EmailDetails();
		emaildetails.setBody(emailDetailsConsumer.getBody());
		emaildetails.setSubject(emailDetailsConsumer.getSubject());
		emaildetails.setSenderEmail(emailDetailsConsumer.getSenderEmail());
		emaildetails.setSenderName(emailDetailsConsumer.getSenderName());
		emaildetails.setRecipientmail(emailDetailsConsumer.getRecipientmail());
		emaildetails.setRecipientName(emailDetailsConsumer.getRecipientName());
		emaildetails.setTrackCode(randomUUID());
		emailDetailsRepo.save(emaildetails);
		return emailDetailsConsumer;
	}

	public EmailDetails getEmailContantById(String id) {
		return emailDetailsRepo.findById(Integer.parseInt(id));
		
	}

}
