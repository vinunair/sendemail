package com.github.vinunair.sendemail;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendEmailController 
{
	@RequestMapping("/sendemail")
    public void sendEmail()
    {
        System.out.println( "Email sent successfully!" );
    }
}
