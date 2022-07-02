// Grand-Child Class for Challenge 20

public class BMW extends Car {
    private int intelligence;

    public BMW(String vehicleName, String mode, double move, boolean handSteering,
               int changingGears, double changeInSpeed, int intelligence) {

        super(vehicleName, mode, move, handSteering, changingGears, changeInSpeed);
        this.intelligence = intelligence;
    }

    private void intelligence(){
        System.out.println("BMW " + super.vehicleName()+ " has intelligence " + intelligence);
    }

    @Override
    public void move(){
        intelligence();
        super.move();
    }
}
