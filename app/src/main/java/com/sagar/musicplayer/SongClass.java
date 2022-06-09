package com.sagar.musicplayer;

public class SongClass {
    String songName,songUrl;

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }

    public SongClass(String songName, String songUrl) {
        this.songName = songName;
        this.songUrl = songUrl;
    }

    public SongClass() {
    }
}
