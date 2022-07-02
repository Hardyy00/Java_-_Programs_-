package PoolArea;
// Part of the Pool Area Problem
public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width,double length){
        this.width = Math.max(width , 0.0d);
        this.length = Math.max(length , 0.0d);
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        return width * length ;
    }
}
