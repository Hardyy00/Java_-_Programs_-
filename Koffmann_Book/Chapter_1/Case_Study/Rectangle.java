package casestudy.com.hardik;

import java.util.Scanner;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(){
        super("Rectangle");
        this.width = 0.0;
        this.length = 0.0;
    }


    @Override
    public void readShapeData(){

        Scanner cin = new Scanner(System.in);
        System.out.println("\nEnter the length : ");
        this.length = cin.nextDouble();
        System.out.println("Enter the width : ");
        this.width = cin.nextDouble();
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Length : " + length
                + "\nBreadth : " + width
                + "\nPerimeter : " + getPerimeter()
                + "\nArea : " + getArea() + "\n";
    }
}
