//challenge 20 base class......

public class Vehicle {
    private double move;
    private String mode;
    private String vehicleName;

    public Vehicle(String vehicleName, String mode, double move){
        this.vehicleName = vehicleName;
        this.mode = mode;
        this.move = move;
    }
    public String vehicleName(){
       return vehicleName;
    }

    public void mode(){
        System.out.println("Your vehicle is a " + mode + "vehicle");
    }

    public void move(){
        System.out.println("The speed is " + move + " km/hr");
    }

    public void changeSpeed(double changeInSpeed){
        move+= changeInSpeed;
    }



}
