package com.music;

public class File1 implements Source{
	private String filePath;

    public File1(String filePath) {
        this.filePath = filePath;
    }


	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing music from file"+filePath);
	}

}
