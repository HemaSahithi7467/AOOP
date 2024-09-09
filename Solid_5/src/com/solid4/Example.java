package com.solid4;

public class Example {
	 public static void main(String[] args) {
	        
	        MessageServices emailService = new EmailServices();
	        MyApplication app = new MyApplication(emailService);
	        app.processMessages("Hello, Sahithi!", "Sahi@123.com");

	        // Switching to SMSService
	        MessageServices smsService = new SMSServices();
	        app = new MyApplication(smsService);
	        app.processMessages("Hello, Shivani!", "123-456-7890");
	 }
}
