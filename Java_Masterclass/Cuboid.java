package PoolArea;
// Part of the Pool Area Problem
public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length , double height){
        super(width, length);
        this.height = Math.max(height , 0.0d);
    }

    public double getHeight(){
        return height;
    }

    public double getVolume(){
        return super.getArea() * height;
    }

}
