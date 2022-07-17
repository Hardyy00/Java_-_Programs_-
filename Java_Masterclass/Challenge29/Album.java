package Challenge29;

import java.util.ArrayList;

public class Album {

    private String albumName;
    private ArrayList<Song> album;

    public Album(String albumName){

        this.albumName = albumName;
        album = new ArrayList<>();
    }

    public void getAlbumInfo(){

        System.out.println("\nAlbum Name : " + this.albumName);

        if(album.isEmpty()){
            System.out.println("\nNo Songs in the album.");
        }else{

            System.out.println("\nSongs : ");
            for(int i=0;i<album.size(); i++){

                Song song = album.get(i);
                System.out.println((i+1) + ". Name - " + song.getSongName());
                System.out.println("   Duration : " + song.getSongDuration());
            }
        }
    }
    public void addSong(Song song){
        album.add(song);
    }

    public void addSong(String songName, String songDuration){

        this.album.add(new Song(songName, songDuration));
    }

    public Song getSong(String songName){

        if(album.isEmpty()){
            System.out.println("The Album is empty");
            return null;
        }else{

            for(int i=0 ; i< album.size(); i++){
                if(album.get(i).getSongName().toLowerCase().compareTo(songName.toLowerCase()) == 0){
                    return album.get(i);
                }
            }

            System.out.println("Song doesn't exist in the Album.");
            return null;
        }
    }

    public String getAlbumName() {
        return albumName;
    }

    public ArrayList<Song> getAlbum() {
        return album;
    }
}
