package com.github.vinunair.sendemail.service.impl;

import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.vinunair.sendemail.handler.SendEmailHandler;
import com.github.vinunair.sendemail.service.SendEmailService;
import com.github.vinunair.sendemail.vo.EmailRequest;

@Service
public class SendEmailServiceImpl implements SendEmailService{

	List<SendEmailHandler> emailHandlers;
	
	@Autowired
	public SendEmailServiceImpl(List<SendEmailHandler> emailHandlers) {
		this.emailHandlers = emailHandlers;
	}
	
	@Override
	public boolean processEmailRequest(EmailRequest emailRequest) {
		boolean isEmailSentSuccessully = false;
		
		Iterator<SendEmailHandler> emailIter = emailHandlers.iterator();
		
		while(!isEmailSentSuccessully && emailIter.hasNext()) {
			SendEmailHandler emailHandler = emailIter.next();
			isEmailSentSuccessully = emailHandler.sendEmail(emailRequest);
		}
		
		return isEmailSentSuccessully;
	}

}
