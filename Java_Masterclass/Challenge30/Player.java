package Challenge30;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private int strength;
    private int score;
    private String weapon;

    public Player(String name , int strength , int score){
        this.name = name;
        this.strength = strength;
        this.score = score;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString(){

        return "Player : { Name - '" +
                this.name + "', Strength - '" +
                this.strength + "', Score - '" +
                this.score + "', Weapon - '" +
                this.weapon +"' }";
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();

        values.add(0,this.name);
        values.add(1, "" + this.strength);
        values.add(2, "" + this.score);
        values.add(3, this.weapon);

        return values;

    }

    @Override
    public void read(List<String> values){

        if(values != null && values.size() >0){
            this.name = values.get(0);
            this.strength = Integer.parseInt(values.get(1));
            this.score = Integer.parseInt(values.get(2));
            this.weapon = values.get(3);
        }

    }
}
