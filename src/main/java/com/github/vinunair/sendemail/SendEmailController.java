package com.github.vinunair.sendemail;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.vinunair.sendemail.vo.EmailRequest;

@RestController
public class SendEmailController 
{
	@PostMapping("/sendemail")
    public void sendEmail(@Valid EmailRequest emailRequest)
    {
        System.out.println( "Email sent successfully!" );
    }
}
