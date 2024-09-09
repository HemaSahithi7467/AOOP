package com.solid4;

public class MyApplication {
	private MessageServices service;

    public MyApplication(MessageServices service) {
        this.service = service;
    }

    public void processMessages(String message, String receiver) {
        service.sendMessage(message, receiver);
    }

}
