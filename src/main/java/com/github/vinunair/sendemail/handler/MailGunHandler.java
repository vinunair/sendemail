package com.github.vinunair.sendemail.handler;

import com.github.vinunair.sendemail.vo.EmailRequest;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class MailGunHandler {
	
	public static final String DOMAIN_NAME = "sandbox57d086acb6f74def9c15a76745cdd490.mailgun.org";
	public static final String API_KEY="b9c15f4c-f5d1d4af";
	

	public JsonNode sendMail(EmailRequest emailRequest) throws UnirestException {
		HttpResponse<JsonNode> request = Unirest.post("https://api.mailgun.net/v3/" + DOMAIN_NAME+ "/messages")
	            .basicAuth("api", API_KEY)
	            .field("from", "Excited User <USER@YOURDOMAIN.COM>")
	            .field("to", emailRequest.getTo())
	            .field("cc", emailRequest.getCc())
	            .field("bcc", emailRequest.getBcc())
	            .field("subject", emailRequest.getSubject())
	            .field("text", emailRequest.getBody())
	            .asJson();

	        return request.getBody();
	}
	
}
