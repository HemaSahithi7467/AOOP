package com.gaming;

public class Game {
	 private static Game instance;
	    private int level;
	    private String difficulty;

	    private Game() {
	        this.level = 1;
	        this.difficulty = "Easy";
	    }

	    public static Game getInstance() {
	        if (instance == null) {
	            instance = new Game();
	        }
	        return instance;
	    }

	    public int getLevel() {
	        return level;
	    }

	    public void nextLevel() {
	        level++;
	    }

	    public String getDifficulty() {
	        return difficulty;
	    }

	    public void setDifficulty(String difficulty) {
	        this.difficulty = difficulty;
	    }

}
