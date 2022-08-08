package com.arh.emailTracker.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "email_details")
public class EmailDetails {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "sender_name")
	private String senderName;
	@Column(name = "sender_email")
	private String senderEmail;
	@Column(name = "recipient_email")
	private String recipientmail;
	@Column(name = "subject")
	private String subject;
	@Column(name = "body")
	private String body;
	@Column(name = "recipient_name")
	private String recipientName;
	@Column(name = "track_code")
	private String trackCode;
	@Column(name = "send_date")
	private Date sendDate;
	@Column(name = "sent")
	private Integer sent;
	@Column(name = "created_at")
	private Date createdAt;
	@Column(name = "updated_at")
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

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
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
				+ recipientName + ", trackCode=" + trackCode + ", sendDate=" + sendDate + ", sent=" + sent
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
