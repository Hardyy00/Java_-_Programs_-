package casestudy.com.hardik;

import java.util.Scanner;

public class Circle extends Shape{

    private double radius;

    public Circle(){
        super("Circle");
        this.radius = 0.0;
    }

    @Override
    public double getPerimeter() {
        return  2*Math.PI * radius ;
    }

    @Override
    public double getArea() {
        return Math.PI * radius*radius;
    }

    @Override
    public void readShapeData() {
        Scanner cin = new Scanner(System.in);

        System.out.println("\nEnter the radius : ");
        this.radius = cin.nextDouble();
        cin.nextLine();

    }


    @Override
    public String toString(){
        return super.toString()
                + "Radius : " + radius
                + "\nPerimeter : " + getPerimeter()
                + "\nArea : " + getArea();
    }

}
