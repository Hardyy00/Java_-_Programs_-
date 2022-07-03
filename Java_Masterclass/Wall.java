package challenge21;
// part of challenge 21 (Fan, Lights , Room , Wall)
public class Wall {
    private int length;
    private int breadth;

    public Wall(int length,int breadth){

        this.length = length;
        this.breadth = breadth;
    }

    public int getWallArea(){
        return length*breadth;
    }


    public int getLength(){
        return length;
    }

    public int getBreadth(){
        return breadth;
    }

}
