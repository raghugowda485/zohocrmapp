package com.zohocrm.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {

	@Autowired
	private JavaMailSender javaMailsender;
	@Override
	public void sendMail(String to, String sub, String body) {
		  try {
			  
	            SimpleMailMessage mailMessage
	                = new SimpleMailMessage();
	 
	            mailMessage.setTo(to);
	            mailMessage.setText(body);
	            mailMessage.setSubject(sub);
	 
	            javaMailsender.send(mailMessage);
	        }
	 
	        catch (Exception e) {
	        	e.printStackTrace();
	        }
	    }
	 	}


