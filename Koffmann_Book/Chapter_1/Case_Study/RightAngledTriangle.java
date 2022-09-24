package casestudy.com.hardik;

import java.util.Scanner;

public class RightAngledTriangle extends Shape{

    private double base;
    private double height;

    public RightAngledTriangle(){
        super("Right Angled Triangle");
        base = 0.0d;
        height = 0.0d;
    }

    @Override
    public double getPerimeter() {
        double hypo = Math.sqrt(base*base + height*height);
        double s = (base + height + hypo)/2;
        return Math.sqrt(s*(s-base)*(s-height) * (s-hypo));
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void readShapeData() {
        Scanner cin = new Scanner(System.in);
        System.out.println("\nEnter the Base : ");
        base = cin.nextDouble();
        System.out.println("Enter the height : ");
        height = cin.nextDouble();

    }

    @Override
    public String toString() {
        return super.toString()
                + "Base : " + base
                + "\nHeight : " + height
                + "\nPerimeter : " + getPerimeter()
                + "\nArea : " + getArea() + "\n";
    }

}
