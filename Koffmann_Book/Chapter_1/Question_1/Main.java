package question1.com.hardik;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static final LinkedList<Animal> animalsList = new LinkedList<>();

    public static void main(String[] args) {

        Fish nemo = new Fish("Gold Fish" , "Nemo");
        animalsList.add(nemo);
        nemo.setDiet("Eats Oceanic things");
        nemo.setNocturnal(false);

        Dog ron = new Dog("Labrador" , "Ron");
        animalsList.add(ron);
        ron.setDiet("Fish , Dog Food , Leftovers");
        ron.setNocturnal(false);

        Snake chubi = new Snake("Python" , "Chubi");
        animalsList.add(chubi);
        chubi.setNocturnal(true);
        chubi.setDiet("Rats , Other Snakes , Boars etc.");

        Kangaroo pasty =  new Kangaroo("Normal Kangaroo" , "Pasty");
        animalsList.add(pasty);
        pasty.setDiet("Herbivore");
        pasty.setNocturnal(false);

        for (Animal animal : animalsList) {

            System.out.println(animal);
            System.out.println();
        }


    }
}
