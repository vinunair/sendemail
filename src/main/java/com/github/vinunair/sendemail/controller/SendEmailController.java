package com.github.vinunair.sendemail.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.vinunair.sendemail.service.SendEmailService;
import com.github.vinunair.sendemail.vo.EmailRequest;

@RestController
public class SendEmailController 
{
	@Autowired
	private SendEmailService emailService;
	
	@PostMapping("/sendemail")
    public void sendEmail(@Valid @RequestBody EmailRequest emailRequest)
    {
	  
       System.out.println(emailService.processEmailRequest(emailRequest));
    }
}
