package question1.com.hardik;

public abstract class Animal {

    private final AnimalType animalType;
    private final String breedName;
    private final String name;
    private boolean isNocturnal;
    private String diet;

    public enum AnimalType{
        DOG,
        CAT,
        FISH,
        MONKEY,
        BIRD,
        KANGAROO,
        CROCODILE,
        SNAKE,
        MOUSE
    }

    public Animal(AnimalType animalType, String breedName, String name) {
        this.animalType = animalType;
        this.breedName = breedName;
        this.name = name;
    }

    public abstract void move();
    public abstract void limbs();

    public void eat(){
        System.out.println("I am a " + this.diet);
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public String getBreedName() {
        return breedName;
    }

    public String getName() {
        return name;
    }

    public boolean isNocturnal() {
        return isNocturnal;
    }

    public String getDiet() {
        return diet;
    }

    public void setNocturnal(boolean nocturnal) {
        isNocturnal = nocturnal;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    @Override
    public String toString(){

        return "Animal Type - " + this.animalType
                +"\nBreed Name - " + this.breedName
                + "\nAnimal Name - " + this.name
                + "\nNocturnal - " + this.isNocturnal
                + "\nDiet - " + this.diet;
    }


}
