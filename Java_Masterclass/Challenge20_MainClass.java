// Main method for challenge 20 (Vehicle , Car ,BMW)

public class Challenge20_MainClass {

    public static void main(String[] args){
        BMW cassini = new BMW("Cassini","Road",45,true,2,0,31);

        cassini.move();
        cassini.changeSpeed(2.00d);
        cassini.move();
    }
}
