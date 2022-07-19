package Challenge30;

import java.util.*;

public class Monster implements ISaveable{

    private String name;
    private int strength;
    private int score;

    public Monster(String name, int strength , int score){
        this.name = name;
        this.strength = strength;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Player : { Name - '" +
                this.name + "', Strength - '" +
                this.strength + "', Score - '" +
                this.score +"'}";

    }

    @Override
    public List<String> write() {

        List<String> values = new ArrayList<>();

        values.add(0,this.name);
        values.add(1, "" + this.strength);
        values.add(2, "" + this.score);

        return values;
    }

    @Override
    public void read(List<String> values) {

        if(values != null && values.size() >0){
            this.name = values.get(0);
            this.strength = Integer.parseInt(values.get(1));
            this.score = Integer.parseInt(values.get(2));
        }
    }
}
