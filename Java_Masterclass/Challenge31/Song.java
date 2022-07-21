
// This code is used to demonstrate the use of inner class
public class Song {

    private String songName;
    private String songDuration;

    public Song(String songName , String songDuration){

        this.songName = songName;
        this.songDuration = songDuration;
    }

    public String getSongName(){
        return songName;
    }

    public String getSongDuration(){
        return songDuration;
    }

    public static Song makeSong(String songName , String songDuration){

        return new Song(songName , songDuration);
    }
}
