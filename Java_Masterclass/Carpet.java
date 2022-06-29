// PART OF CARPET COST CALCULATOR (FLOOR , CARPET & CALCULATOR)

public class Carpet {
    private double cost;

    public Carpet(double cost){
        this.cost = Math.max(cost , 0.0d);
    }

    public double getCost(){
        return this.cost;
    }


}
