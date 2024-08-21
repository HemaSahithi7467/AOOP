package com.music;

public class Equaliser extends Music{

	public Equaliser(Source musicSource) {
		super(musicSource);
		// TODO Auto-generated constructor stub
	}
	@Override
    public void play() {
        super.play();
        System.out.println("Applying equaliser settings...");
    }

}
