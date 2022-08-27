package question1.com.hardik;

public class Dog extends Animal{

    public Dog( String breedName, String name) {
        super(AnimalType.DOG, breedName, name);
    }

    @Override
    public void move() {
        System.out.println("I walk with my four legs.");
    }

    @Override
    public void limbs() {
        System.out.println("I have 4 legs");
    }
}
