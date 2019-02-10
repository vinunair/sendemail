package com.github.vinunair.sendemail.handler.impl;

import org.springframework.stereotype.Component;

import com.github.vinunair.sendemail.handler.SendEmailHandler;
import com.github.vinunair.sendemail.vo.EmailRequest;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Component
public class MailGunHandler implements SendEmailHandler{
	
	public static final String DOMAIN_NAME = "sandbox57d086acb6f74def9c15a76745cdd490.mailgun.org";
	public static final String API_KEY="";
	
	@Override
	public boolean sendEmail(EmailRequest emailRequest)  {
		System.out.println("Sending email using MailGun implementation ....");
		boolean emailSent = true;
		HttpResponse<String> request = null;
		try {
			     request = Unirest.post("https://api.mailgun.net/v3/" + DOMAIN_NAME+ "/messages")
			        .basicAuth("api", API_KEY)
			        .field("from", "mailvinu@gmail.com")
			        .field("to", emailRequest.getTo())
			        .field("cc", emailRequest.getCc())
			        .field("bcc", emailRequest.getBcc())
			        .field("subject", emailRequest.getSubject())
			        .field("text", emailRequest.getBody())
			        .asString();
		} catch (UnirestException e) {
			System.out.println(e.getMessage());
			emailSent=false;
		}
		System.out.println("Body "+ request.getBody()+ " status "+ request.getStatusText());
		return emailSent;
	        
	}
	
}
