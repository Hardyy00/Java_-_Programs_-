package Challenge33;

// This code is used to demonstrate the use of Generics in Java

public abstract class Player {

    private String name;

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
