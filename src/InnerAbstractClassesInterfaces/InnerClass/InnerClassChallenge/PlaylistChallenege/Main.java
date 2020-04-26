package InnerAbstractClassesInterfaces.InnerClass.InnerClassChallenge.PlaylistChallenege;

import java.util.*;

// Modify the playlist challenge so that the Album class uses an inner class.
// Instead of using an ArrayList to hold its tracks, it will use an inner class called SongList
// The inner SongList class will use an ArrayList and will provide a method to add a song.
// It will also provide findSong() methods which will be used by the containing Album class
// to add songs to the playlist.
// Neither the Song class or the Main class should be changed.
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
            System.out.println("Now playing -  " + listIterator.next().toString());
            printMenu();
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
                        System.out.println("Now playing - " + listIterator.next().toString());
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
                        System.out.println("Now playing - " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;

                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying - " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying - " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("reached end of playlist");
                            forward = false;
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("Available actions: ");
        System.out.println("\t 0 - Quit.");
        System.out.println("\t 1 - Next song.");
        System.out.println("\t 2 - Previous song.");
        System.out.println("\t 3 - Replay current song.");
        System.out.println("\t 4 - List songs in playlist.");
        System.out.println("\t 5 - Print available actions.");
        System.out.println("\t 6 - Delete current song.");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("+++++++++++++++++++++++++");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("+++++++++++++++++++++++++");
    }

}
