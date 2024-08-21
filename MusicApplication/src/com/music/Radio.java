package com.music;

public class Radio implements Source{
	private String stationName;

    public Radio(String stationName) {
        this.stationName = stationName;
    }

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing music from radio"+stationName);
	}

}
