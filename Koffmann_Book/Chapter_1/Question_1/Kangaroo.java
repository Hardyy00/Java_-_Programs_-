package question1.com.hardik;

public class Kangaroo extends Animal{

    public Kangaroo(String breedName, String name) {
        super(AnimalType.KANGAROO , breedName, name);
    }

    @Override
    public void move() {
        System.out.println("I Jump with my two legs");
    }

    @Override
    public void limbs() {
        System.out.println("I have two Hands and two Legs");
    }
}
