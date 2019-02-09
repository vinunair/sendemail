package com.github.vinunair.sendemail.service;

import org.springframework.stereotype.Service;

import com.github.vinunair.sendemail.vo.EmailRequest;

@Service
public interface SendEmailService {

	public boolean processEmailRequest(EmailRequest emailRequest);
	
	
}
