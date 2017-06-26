package com.email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;

import org.apache.commons.mail.SimpleEmail;

public class JavaEmail {
	
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("email ======= started");
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("kismahen@gmail.com", "g00glemale"));
		email.setSSLOnConnect(true);
		email.setDebug(true); 
		email.setFrom("kismahen@gmail.com");
		email.setSubject("selenium test report	");
		email.setMsg("This is a test mail of selenium)");
		email.addTo("kismahen@gmail.com");
		email.send();
		System.out.println("email==========sent ");
	}

}
