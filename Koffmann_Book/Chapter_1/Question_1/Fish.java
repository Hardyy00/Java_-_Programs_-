package question1.com.hardik;

public class Fish extends Animal{

    public Fish(String breedName, String name) {
        super(AnimalType.FISH, breedName, name);
    }

    @Override
    public void move() {
        System.out.println("I cannot Walk, so I swim instead.");
    }

    @Override
    public void limbs() {
        System.out.println("I do not have ");
    }

}
