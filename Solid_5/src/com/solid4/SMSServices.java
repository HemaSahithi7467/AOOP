package com.solid4;

public class SMSServices implements MessageServices{

	@Override
	public void sendMessage(String message, String receiver) {
		// TODO Auto-generated method stub
		System.out.println("SMS sent to " + receiver + " with Message: " + message);
	}

}
