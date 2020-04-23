package LinkedList.PlaylistChallenege;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()
public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Life is hard", "Hard1");
        album.addSong("I Know You", 4.55);
        album.addSong("Night Flight (To Nowhere)", 2.30);
        album.addSong("Ode To Lisa", 1.50);
        album.addSong("Look At Me", 6.45);
        album.addSong("She's 40!", 3.55);
        album.addSong("Bad boy", 3.55);

        albums.add(album);


        album = new Album("Peace", "Eurythmics");

        album.addSong("Precious", 4.55);
        album.addSong("See No Evil", 2.30);
        album.addSong("Eye of the sun", 1.50);
        album.addSong("Im here", 6.45);
        album.addSong("Whos that", 1.55);
        album.addSong("Till tomorow", 3.45);
        album.addSong("Dance with me", 2.59);


        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();

        albums.get(0).addToPlaylist("She's 40!", playList);
        albums.get(0).addToPlaylist("Look At Me", playList);
        albums.get(0).addToPlaylist("I Know You", playList);
        albums.get(0).addToPlaylist("Night Flight (To Nowhere)", playList);
        albums.get(0).addToPlaylist("Bad boy", playList); //doesnt exist

        albums.get(0).addToPlaylist(4, playList);
        albums.get(0).addToPlaylist(5, playList);
//        albums.get(0).addToPlaylist(6, playList);
//        albums.get(0).addToPlaylist(16, playList); // There is no track 16


        play(playList);

    }

    public static void play(LinkedList<Song> playList) {
        ListIterator<Song> listIterator = playList.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        if (playList.size() == 0) {
            System.out.println("No songs in playlist");

        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while (!quit) {

            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println(" playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();

                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("reached end of playlist");
                        forward = false;

                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();

                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;

                    }
                    break;
                case 3:
//                    updateContact();
                    break;
                case 4:
//                    printLisy(playList);
                    break;
                case 5:
//                    printMenu();
                    break;


            }


        }

    }

}
