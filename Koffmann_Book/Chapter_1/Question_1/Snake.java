package question1.com.hardik;

import org.w3c.dom.ls.LSOutput;

public class Snake extends Animal{

    private boolean isPoisonous;

    public Snake(String breedName, String name) {
        super(AnimalType.SNAKE , breedName, name);
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }

    @Override
    public void move() {
        System.out.println("I move by Crawling on the ground.");
    }

    @Override
    public void limbs() {
        System.out.println("I do not have any limbs");
    }

    @Override
    public String toString(){
        return super.toString() +
                    "\nPoisonous - " + this.isPoisonous;
    }
}
