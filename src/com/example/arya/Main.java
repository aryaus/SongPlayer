package com.example.arya;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album1 = new Album("Taak", "Siavash Ghomaishi");
        album1.addSong("Jazireh", 4.0);
        album1.addSong("Panjereh", 4.0);
        album1.addSong("Farangis", 3.0);
        album1.addSong("Khaste Shodam", 4.2);

        albums.add(album1);

        Album album2 = new Album("Setareh", "Ebi");
        album2.addSong("Baroon", 4.5);
        album2.addSong("Derakht", 3.2);
        album2.addSong("Shaghayegh", 3.0);
        album2.addSong("Ashegh", 4.2);

        albums.add(album2);


    }
}
