package com.arh.emailTracker.pojo;

import java.util.Date;

public class EmailDetailsConsumer {

	private Integer id;
	private String senderName;
	private String senderEmail;
	private String recipientmail;
	private String subject;
	private String body;
	private String recipient_name;
	private String trackCode;
	private Date sendDate;
	private Integer sent;
	private Date createdAt;
	private Date updatedAt;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getSenderEmail() {
		return senderEmail;
	}

	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}

	public String getRecipientmail() {
		return recipientmail;
	}

	public void setRecipientmail(String recipientmail) {
		this.recipientmail = recipientmail;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getRecipient_name() {
		return recipient_name;
	}

	public void setRecipient_name(String recipient_name) {
		this.recipient_name = recipient_name;
	}

	public String getTrackCode() {
		return trackCode;
	}

	public void setTrackCode(String trackCode) {
		this.trackCode = trackCode;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public Integer getSent() {
		return sent;
	}

	public void setSent(Integer sent) {
		this.sent = sent;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "EmailDetails [id=" + id + ", senderName=" + senderName + ", senderEmail=" + senderEmail
				+ ", recipientmail=" + recipientmail + ", subject=" + subject + ", body=" + body + ", recipient_name="
				+ recipient_name + ", trackCode=" + trackCode + ", sendDate=" + sendDate + ", sent=" + sent
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
