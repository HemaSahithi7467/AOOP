package com.music;

public class MainMusic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source localFile = new File1("Codex.mp3");
        Source onlineStream = new Online("http://album.com/stream");
        Source radioStation = new Radio("FM Radio");
        
        localFile.play();
        onlineStream.play();
        radioStation.play();
        System.out.println("Playing...");
        
        Source Features1 = new VolumeControl(new Equaliser(localFile), 7);
        Features1.play();
        Source Features2 = new VolumeControl(new Equaliser(onlineStream), 10);
        Features2.play();



	}

}
