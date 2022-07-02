// Child class for Challenge 20
public class Car extends Vehicle{
    private boolean handSteering;
    private int changingGears;
    private double changeInSpeed;

    public Car(String vehicleName,String mode,double move,boolean handSteering
            ,int changingGears ,double changeInSpeed){
        super(vehicleName,mode,move);
        this.handSteering = handSteering;
        this.changingGears = changingGears;
        this.changeInSpeed = changeInSpeed;
    }

    private void gears(){
        System.out.println("Car is in gear " + changingGears);
    }

    @Override
    public void move() {
        gears();
        super.move();
    }

    public void changeGears(int changeGears){
        changingGears = changeGears;
    }


}
