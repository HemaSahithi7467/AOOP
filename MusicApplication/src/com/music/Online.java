package com.music;

public class Online implements Source{
	 private String streamUrl;

	    public Online(String streamUrl) {
	        this.streamUrl = streamUrl;
	    }


	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing music from Online source"+streamUrl);
	}

}
