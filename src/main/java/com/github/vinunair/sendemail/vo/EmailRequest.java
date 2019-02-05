package com.github.vinunair.sendemail.vo;

import javax.validation.constraints.Email;

public class EmailRequest {

  @Email
  public String[] to;
  @Email
  public String[] cc;
  @Email
  public String[] bcc ;
  
  public String subject;
  
  public String body;
	
  public String[] getTo() {
		return to;
	}
	
  public void setTo(String[] to) {
		this.to = to;
	}
	
  public String[] getCc() {
		return cc;
	}
	
  public void setCc(String[] cc) {
		this.cc = cc;
	}
	
  public String[] getBcc() {
		return bcc;
	}
	
  public void setBcc(String[] bcc) {
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
