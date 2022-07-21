
// This code is for demonstrating the Inner classes.
import java.util.ArrayList;

public class Album {

    private String albumName;
    private SongList albumBook;

    public Album(String albumName){

        this.albumName = albumName;
        albumBook = new SongList();
    }


    private class SongList{
        private ArrayList<Song> albumBook;

        public SongList(){

            this.albumBook = new ArrayList<>();
        }

        public Song getSong(String songName){

            if(albumBook.isEmpty()){
                System.out.println("The Album is empty");
                return null;
            }else{

                for(int i = 0; i< albumBook.size(); i++){
                    if(albumBook.get(i).getSongName().toLowerCase().compareTo(songName.toLowerCase()) == 0){
                        return albumBook.get(i);
                    }
                }

                System.out.println("Song doesn't exist in the Album.");
                return null;
            }
        }

        public void getAlbumInfo(){

            System.out.println("\nAlbum Name : " + Album.this.albumName);

            if(this.albumBook.isEmpty()){
                System.out.println("\nNo Songs in the album.");
            }else{

                System.out.println("\nSongs : ");
                for(int i = 0; i< this.albumBook.size(); i++){

                    Song song = this.albumBook.get(i);
                    System.out.println((i+1) + ". Name - " + song.getSongName());
                    System.out.println("   Duration : " + song.getSongDuration());
                }
            }
        }

        public void addSong(Song song){
            albumBook.add(song);
        }
        public void addSong(String songName, String songDuration){

            this.albumBook.add(new Song(songName, songDuration));
        }

        public ArrayList<Song> getAlbumBook() {
            return albumBook;
        }

    }


    public Song getSong(String songName){
        return this.albumBook.getSong(songName);
    }

    public void getAlbumInfo(){

        albumBook.getAlbumInfo();
    }

    public void addSong(Song song){

        albumBook.addSong(song);
    }

    public ArrayList<Song> getAlbumBook(){

        return  albumBook.getAlbumBook();
    }

    public void addSong(String songName, String songDuration){
        albumBook.addSong(songName , songDuration);

    }



    public String getAlbumName() {
        return albumName;
    }


}
