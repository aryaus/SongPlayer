package com.example.arya;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public Song findSong(String title){
        for (Song checksong: songs
             ) {
            if (checksong.getTitle().equals(title)){
                return checksong;
            }
        }
        return null;
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null){
            songs.add(new Song(title, duration));
            System.out.println( title + " has been successfully added!");
            return true;
        } else{
            System.out.println("The song "+ title + " is already exist!");
            return false;
        }

    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
        int index = trackNumber -1;
        if(index > 0 && index <= this.songs.size()){
            PlayList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have song with track number "+ trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> PlayList){
        for (Song checkSong: this.songs){
            if (checkSong.getTitle().equals(title)){
                PlayList.add(checkSong);
                return true;
            }
        }
        System.out.println("There not exist such song with the title: "+title);
        return false;
    }


}
