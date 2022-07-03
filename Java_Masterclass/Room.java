package challenge21;
// part of challenge 21 (Fan, Lights , Room , Wall)
public class Room {
    private Wall wall ;
    private Fan fan;
    private Lights lights ;

    public Room(Wall wall1, Fan fan, Lights lights) {
        this.wall = wall1;
        this.fan = fan;
        this.lights = lights;
    }

    public void setLights(String state){
        getLights().setCurrentState(state);
    }

    public void setFan(String currentState , int rpm){
        getFan().setCurrentState(currentState);
        getFan().setRPM( rpm);
    }
    public void setFan(int rpm){
        getFan().setRPM( rpm);
    }

    public Wall getWall1() {
        return wall;
    }

    public Fan getFan() {
        return fan;
    }

    public Lights getLights() {
        return lights;
    }
}
