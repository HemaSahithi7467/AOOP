package com.music;

public class VolumeControl extends Music{
	private int volumecontrol;
	public VolumeControl(Source musicSource, int volumecontrol) {
		super(musicSource);
		this.volumecontrol = volumecontrol;
		// TODO Auto-generated constructor stub
		}
	
	@Override
	public void play() {
        super.play();
        System.out.println("Setting volume to level: " + volumecontrol);
    }

}
