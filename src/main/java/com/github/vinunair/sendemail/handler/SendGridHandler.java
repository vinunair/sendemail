package com.github.vinunair.sendemail.handler;

import com.github.vinunair.sendemail.vo.EmailRequest;
import com.sendgrid.*;
import java.io.IOException;

public class SendGridHandler {
     private String API_KEY="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";
     
     
     public void sendMail(EmailRequest emailRequest) throws IOException {
    	 Email from = new Email("mailvinu@gmail.com");
    	    String subject = emailRequest.getSubject();
    	    Email to = new Email(emailRequest.getTo());
    	    Content content = new Content("text/plain", emailRequest.getBody());
    	    Mail mail = new Mail(from, subject, to, content);
    	    

    	    SendGrid sg = new SendGrid(API_KEY);
    	    Request request = new Request();
    	    try {
    	      request.setMethod(Method.POST);
    	      request.setEndpoint("mail/send");
    	      request.setBody(mail.build());
    	      Response response = sg.api(request);
    	      System.out.println(response.getStatusCode());
    	      System.out.println(response.getBody());
    	      System.out.println(response.getHeaders());
    	    } catch (IOException ex) {
    	      throw ex;
    	    }
     }
}
