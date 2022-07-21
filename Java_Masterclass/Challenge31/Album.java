
// This code is used to demonstrate the use of inner class
import java.util.ArrayList;

public class Album {

    private String albumName;
    private AlbumBook album;

    public Album(String albumName){

        this.albumName = albumName;
        this.album = new AlbumBook();
    }

    private class AlbumBook{
        private ArrayList<Song> album;

        private AlbumBook(){
            album = new ArrayList<>();
        }

        private void getAlbumInfo(){

            System.out.println("\nAlbum Name : " + Album.this.albumName);

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

        private Song getSong(String songName){

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

        private void addSong(Song song){
            album.add(song);
        }

        private void addSong(String songName, String songDuration){

            this.album.add(new Song(songName, songDuration));
        }

        private ArrayList<Song> getAlbum() {
            return album;
        }

    }

    public void getAlbumInfo(){
        album.getAlbumInfo();
    }


    public Song getSong(String songName){
        return this.album.getSong(songName);
    }

    public void addSong(Song song){
        this.album.addSong(song);
    }

    public void addSong(String songName, String songDuration){
        this.album.addSong(songName , songDuration);
    }

    public ArrayList<Song> getAlbum(){
        return this.album.getAlbum();

    }
    public String getAlbumName() {
        return albumName;
    }


}
