package com.github.vinunair.sendemail.vo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Value;

public class EmailRequest {

  @NotNull	
  @Email(message="Invalid email")
  private String to;
  @Email(message="Invalid email")
  private String cc;
  @Email(message="Invalid email")
  private String bcc ;
  @Value("Hi")
  private String subject;
  @Value("Nothing much happening here")
  private String body;
	
  	
  public String getTo() {
	return to;
}

public void setTo(String to) {
	this.to = to;
}

public String getCc() {
	return cc;
}

public void setCc(String cc) {
	this.cc = cc;
}

public String getBcc() {
	return bcc;
}

public void setBcc(String bcc) {
	this.bcc = bcc;
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
  
  
  
	
}
