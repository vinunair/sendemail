package com.github.vinunair.sendemail.handler;

import org.springframework.stereotype.Component;

import com.github.vinunair.sendemail.vo.EmailRequest;

@Component
public interface SendEmailHandler {
    
	public boolean sendEmail(EmailRequest emailRequest);
	
}
