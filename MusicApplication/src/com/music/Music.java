package com.music;

public abstract class Music implements Source{
	protected Source musicSource;

    public Music(Source musicSource) {
        this.musicSource = musicSource;
    }
    
    @Override
    public void play() {
        musicSource.play();
    }

}
