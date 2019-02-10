package com.github.vinunair.sendemail.handler.impl;

import com.github.vinunair.sendemail.handler.SendEmailHandler;
import com.github.vinunair.sendemail.vo.EmailRequest;
import com.sendgrid.*;
import java.io.IOException;

import org.springframework.stereotype.Component;

@Component
public class SendGridHandler implements SendEmailHandler{
     private String API_KEY=""; //supply API key here
     
     
     public boolean sendEmail(EmailRequest emailRequest)  {
    	 System.out.println("Sending email using SendGrid implementation ....");
    	 boolean emailSent = true;
    	    Email from = new Email("mailvinu@gmail.com");
    	    String subject = emailRequest.getSubject();
    	    Personalization personalization = new Personalization();
    	    Email to = new Email(emailRequest.getTo());
    	    personalization.addTo(to);
    	    Email cc = new Email(emailRequest.getCc());
    	    personalization.addCc(cc);
    	    Email bcc = new Email(emailRequest.getBcc());
    	    personalization.addBcc(bcc);
    	    
    	    Content content = new Content("text/plain", emailRequest.getBody());
    	    Mail mail = new Mail();
    	    mail.setFrom(from);
    	    mail.setSubject(subject);
    	    mail.addPersonalization(personalization);
    	    mail.addContent(content);
    	    
    	    SendGrid sg = new SendGrid(API_KEY);
    	    Request request = new Request();
    	    Response response = null;
    	    try {
    	      request.setMethod(Method.POST);
    	      request.setEndpoint("mail/send");
    	      request.setBody(mail.build());
    	      response = sg.api(request);
    	    } catch (IOException ex) {
    	      System.out.println(ex.getMessage());	
    	      emailSent=false;
    	    }
    	    System.out.println("Status :" + response.getStatusCode()+" Body "+ response.getBody()+" Headers "+ response.getHeaders());
  	      
    	    return emailSent;
     }
}
