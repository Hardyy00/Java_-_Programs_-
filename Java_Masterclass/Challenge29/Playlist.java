package Challenge29;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Playlist {
    private static Scanner cin = new Scanner(System.in);
    private static Album englishSongs = new Album("English Songs");
    private static Album favouriteSongs = new Album("Favourite Songs");

    private static LinkedList<Song> playlist = new LinkedList<>();

    public static void main(String[] args) {


        englishSongs.addSong("Havana" ,"2:07" );
        englishSongs.addSong("Casualidad" , "3:21");
        englishSongs.addSong("Hold On" , "2:45");
        englishSongs.addSong("The Way You Felt" , "3:11");



        favouriteSongs.addSong("One Love" , "3:44");
        favouriteSongs.addSong("Eeenie Meenie" , "3.01");
        favouriteSongs.addSong("Unravel" , "3:13");


        printMenu();
        boolean quit = false;
        while(!quit){

            System.out.print("\nEnter a choice : ");
            int choice = cin.nextInt();
            cin.nextLine();

            switch(choice){

                case 1 :
                    viewAlbums();
                    break;

                case 2 :
                    viewAlbum();
                    break;

                case 3 :
                    addSongsToPlaylist();
                    break;

                case 4 :
                    playThePlayList();
                    break;

                case 5 :
                    printMenu();
                    break;

                case 6 :
                    quit = true;

            }

        }

    }

    private static void printMenu(){

        System.out.println("\n1. View Albums" +
                            "\n2. View an Album" +
                            "\n3. Create a Playlist" +
                            "\n4. Play the Playlist" +
                            "\n5. Print the Menu Again" +
                            "\n6. Quit");

    }

    private static void viewAlbums(){

        System.out.println("\nAlbums : ");
        System.out.println("\n1. " + englishSongs.getAlbumName());
        System.out.println("2. " + favouriteSongs.getAlbumName());

        System.out.println("Do you want to check out the album songs ?[yes/no]");
        String answer = cin.nextLine();

        if(answer.strip().toLowerCase().compareTo("yes") == 0 ){
            viewAlbum();
        }
    }

    private static void viewAlbum(){

        System.out.print("\nEnter the album name : ");
        String name = cin.nextLine();

        if(englishSongs.getAlbumName().toLowerCase().compareTo(name.toLowerCase()) == 0){

            englishSongs.getAlbumInfo();

        }else if(favouriteSongs.getAlbumName().toLowerCase().compareTo(name.toLowerCase()) == 0){

            favouriteSongs.getAlbumInfo();
        }else{

            System.out.println("\nNo such Album Exist.");
        }

    }

    private static void addSongsToPlaylist(){

        System.out.println("\nEnter the album name : ");
        String name = cin.nextLine();

        if(englishSongs.getAlbumName().toLowerCase().compareTo(name.toLowerCase()) == 0){

            addSong(englishSongs);


        }else if(favouriteSongs.getAlbumName().toLowerCase().compareTo(name.toLowerCase()) == 0){

             addSong(favouriteSongs);

        }else{

            System.out.println("\nNo such Album Exist.");
        }
    }

    private static void addSong(Album album){

        album.getAlbumInfo();

        while(true){

            System.out.println("\nEnter a song : ");
            String song = cin.nextLine();

            Song music = album.getSong(song);

            if(music != null) {
                playlist.add(music);
                System.out.println("\nSong has been added to the Playlist.");
            }
            System.out.println("\nDo you want to add another song ?[yes/no]");
            String ans = cin.nextLine();

            if(ans.strip().toLowerCase().compareTo("yes") == 0){
                continue;
            }

            break;
        }

    }

    private static void playThePlayList() {

        System.out.println("\nWelcome to the playlist.");
        playlistMenu();

        System.out.print("Enter a choice : ");
        int choice = cin.nextInt();

        ListIterator<Song> listIterator = playlist.listIterator();

        if(listIterator.hasNext()){

            System.out.println("\nCurrently Playing [ " + listIterator.next().getSongName() + " ]");

            boolean moveForward = true;
            boolean quit = false;
            while(listIterator.hasNext() || !quit){

                System.out.print("\nEnter a choice : ");
                int take = cin.nextInt();

                switch(take){

                    case 2 :
                        if(listIterator.hasNext()){
                            if(!moveForward){
                                listIterator.next();
                            }
                            System.out.println("\nCurrently Playing [ " + listIterator.next().getSongName() + " ]");
                            moveForward = true;

                        }else{
                            System.out.println("\nYou have reached the end of the playlist.");
                            moveForward = false;
                        }
                        break;

                    case 3 :

                        if(listIterator.hasPrevious()){
                            if(moveForward){
                                listIterator.previous();
                            }

                            System.out.println("\nCurrently Playing [ " + listIterator.previous().getSongName() + " ]");
                            moveForward = false;

                        } else{

                            System.out.println("\nYou have reached the starting of the Playlist.");
                            moveForward = true;
                        }
                        break;

                    case 4 :

                        if(listIterator.hasNext()){

                            if(!moveForward){
                                listIterator.next();
                            }

                            if(listIterator.hasNext()) {
                                listIterator.next();
                                moveForward = true;
                            }

                            if(listIterator.hasNext()) {

                                System.out.println("\nCurrently Playing [ " + listIterator.next().getSongName() + " ]");
                                moveForward = true;

                            }else{
                                System.out.println("\nCannot skip more . You have reached the end of the Playlist.");
                                moveForward = false;
                            }

                        } else{

                            System.out.println("You have reached the end of the playlist.");
                            moveForward = false;
                        }
                        break;

                    case 5 :

                            System.out.println("\nCurrently Playing [ " + listIterator.previous().getSongName() + " ]");
                            listIterator.next();
                            moveForward = true;

                        break;

                    case 6 :

                        if(moveForward) {
                            if (listIterator.hasPrevious()) {

                                System.out.println("\n(" + listIterator.previous().getSongName() + ") has been deleted");
                                listIterator.remove();


                            } else {
                                System.out.println("\nError . Something wrong happened");
                            }

                        }else{
                            if (listIterator.hasNext()) {

                                System.out.println("\n(" + listIterator.next().getSongName() + ") has been deleted");
                                listIterator.remove();


                            } else {
                                System.out.println("\nError . Something wrong happened");
                            }
                        }


                        break;

                    case 7 :

                        System.out.println("\nQuitting the playlist....");
                        return;

                    case 8 :

                        System.exit(0);

                }

            }

        } else {

            System.out.println("\n No songs to play");

        }

        System.out.println("Playlist Ended . Returning to the main menu.");
    }

    private static void playlistMenu(){

        System.out.println("\nMenu :");

        System.out.println("\n1. Play the Playlist" +
                "\n2. Play the next song" +
                "\n3. Play the Previous Song" +
                "\n4. Skip the next song" +
                "\n5. Replay the Current song" +
                "\n6. Delete the current song." +
                "\n7. Quit the playlist" +
                "\n8. Quit the application");

    }
}
