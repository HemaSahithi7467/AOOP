package com.system;

import java.util.LinkedList;

public class Playlist {
    private LinkedList<String> songs;

    public Playlist() {
        songs = new LinkedList<>();
    }

    // Add a song to the playlist
    public void addSong(String song) {
        songs.add(song);
    }

    // Remove a song by name
    public void removeSong(String song) {
        if (songs.remove(song)) {
            System.out.println("Removed: " + song);
        } else {
            System.out.println("Song not found");
        }
    }

    // Move a song to a different position in the playlist
    public void moveSong(int oldIndex, int newIndex) {
        if (oldIndex >= 0 && oldIndex < songs.size() && newIndex >= 0 && newIndex < songs.size()) {
            String song = songs.remove(oldIndex);
            songs.add(newIndex, song);
        } else {
            System.out.println("Invalid indices");
        }
    }

    // Display all songs in the playlist
    public void displayPlaylist() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the playlist");
        } else {
            for (int i = 0; i < songs.size(); i++) {
                System.out.println((i + 1) + ". " + songs.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Playlist pl = new Playlist();
        pl.addSong("Song A");
        pl.addSong("Song B");
        pl.displayPlaylist();
        pl.moveSong(0, 1);
        pl.displayPlaylist();
        pl.removeSong("Song B");
        pl.displayPlaylist();
    }
}

