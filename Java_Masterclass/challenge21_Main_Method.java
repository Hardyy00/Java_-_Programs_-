package challenge21;
// part of challenge 21 (Fan, Lights , Room , Wall)
public class challenge21_Main_Method {

    public static void main(String[] args){
        Wall wall = new Wall(50,50);
        Fan fan = new Fan("Cyber" , 100 , "OFF");

        Room myRooom = new Room(wall , fan , new Lights("Orrient" , 120 , "OFF"));

        myRooom.setLights("ON");
        myRooom.setFan("ON",63);

        myRooom.getFan().setCurrentState("off");
        myRooom.getLights().setCurrentState("off");

    }
}
