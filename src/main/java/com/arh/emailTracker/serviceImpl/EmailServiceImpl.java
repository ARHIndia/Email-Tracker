package com.arh.emailTracker.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arh.emailTracker.Repo.EmailTrakingRepo;
import com.arh.emailTracker.model.EmailTraking;
import com.arh.emailTracker.service.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

	@Autowired
	EmailTrakingRepo emailTrakingRepo;

	@Override
	public EmailTraking findById(String id) {

		return emailTrakingRepo.findById(Integer.parseInt(id));
	}

	@Override
	public EmailTraking saveEmailTraking(EmailTraking emailTraking) {

		return emailTrakingRepo.save(emailTraking);
	}
}
