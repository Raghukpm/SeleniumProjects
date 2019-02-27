package com.selenium;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
public class DemoMail {
	//SendMail1.java
 public static void main(String[] args) throws EmailException {				
	 
	System.out.println("=======TEST Started=============");
	Email email = new SimpleEmail();
	email.setHostName("smtp.gmail.com");
	email.setSmtpPort(465);
	//email.setAuthenticator(new DefaultAuthenticator("tejakpm@gmail.com"," "));
	email.setAuthentication("tejakpm@gmail.com", "password");
	email.setSSLOnConnect(true);
	email.setFrom("tejakpm@gmail.com"); 
	email.setSubject("TestMail");
	email.setMsg("This is a test mail.....:-");
	email.addTo("tejakpm@gmail.com");
	email.send();
	System.out.println("=======EMail Sent===============");
	}

	}//SendMail1
	
