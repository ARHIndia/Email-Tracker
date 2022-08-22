package com.arh.emailTracker.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.arh.emailTracker.Utils.SendEmail;
import com.arh.emailTracker.model.EmailDetails;
import com.arh.emailTracker.model.EmailTraking;
import com.arh.emailTracker.pojo.EmailDetailsConsumer;
import com.arh.emailTracker.pojo.EmailInfo;
import com.arh.emailTracker.serviceImpl.EmailServiceImpl;
import com.arh.emailTracker.serviceImpl.GenrateUUIDServiceImpl;

@RestController
@RequestMapping("/v1")
public class EmailController {
	@Autowired
	GenrateUUIDServiceImpl genrateUUIDService;
	@Autowired
	EmailInfo emailInfo;
	@Autowired
	EmailServiceImpl emailServiceImpl;
	@Autowired
	SendEmail sendEmail;

	@PostMapping("/consumeEmail")
	public String cosumeEmail(@RequestBody EmailDetailsConsumer emailDetailsConsumer) {

		EmailDetailsConsumer edc = genrateUUIDService.saveEmailDetails(emailDetailsConsumer);
		return "Your EmailDetailsConsumer is: " + edc;
	}

	@GetMapping("/getEmailContantById/{emailId}")
	public EmailDetails emailContantById(@PathVariable("emailId") String emailId) {
		System.out.println(emailId);
		EmailDetails emailDetails = genrateUUIDService.getEmailContantById(emailId);
		return emailDetails;
	}

	@GetMapping("/emailtriger/{id}")
	public String emailsendComponet(@PathVariable("id") String id) {
		// EmailInfo emailInfo = new EmailInfo();
		EmailDetails emailDetails = genrateUUIDService.getEmailContantById(id);

		sendEmail.send(emailInfo.getEmailId(), emailInfo.getSecretKey(), emailDetails.getRecipientmail(),
				emailDetails.getSubject(), emailDetails.getBody(),id);

		return "email sent";
	}

	@GetMapping("/acknowledgement-email/{id}")
	public @ResponseBody ResponseEntity<InputStreamResource> acknowledgementEmail(@PathVariable("id") String id)
			throws IOException {
		System.out.println("/acknowledgement-email/{id}-----"+id);
		EmailTraking emailtrak = new EmailTraking();
		emailtrak.setTrackCode(id);
		
		emailServiceImpl.saveEmailTraking(emailtrak);
		InputStream in = getClass().getResourceAsStream("/static/img/img.jpg");
		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(new InputStreamResource(in));
	}

	@GetMapping("/get-image-dynamic-type")
	@ResponseBody
	public ResponseEntity<InputStreamResource> getImageDynamicType() {
		InputStream in =
				getClass().getResourceAsStream("/static/img/img.jpg");
		return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(new InputStreamResource(in));
	}

	@Scheduled(fixedDelay = 10000)
	public void emailSheduler() {

		List<EmailDetails> emailDetails = genrateUUIDService.findBySent();

		for (EmailDetails emailDetail : emailDetails) {

			sendEmail.send(emailInfo.getEmailId(), emailInfo.getSecretKey(), emailDetail.getRecipientmail(),
					emailDetail.getSubject(), emailDetail.getBody(), emailDetail.getId().toString());
			emailDetail.setSent(1);
			genrateUUIDService.updateById(emailDetail);
		}

	}
}
