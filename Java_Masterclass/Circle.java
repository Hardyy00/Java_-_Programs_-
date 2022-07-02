package Cylinder;
// part of question Cylinder
public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = Math.max(radius , 0.0);
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius ;
    }

}
