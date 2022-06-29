// PART OF CARPET COST CALCULATOR (FLOOR , CARPET & CALCULATOR)

public class Floor {
    private double width;
    private double length;

    public Floor(double width,double length){
        this.width = Math.max(width,0.0d);
        this.length = Math.max(length,0.0d);
    }

    public double getArea(){
        return this.width * this.length;
    }

}
