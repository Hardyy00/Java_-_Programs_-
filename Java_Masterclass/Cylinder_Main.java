package Cylinder;
// part of question cylinder

import java.util.Scanner;

public class Cylinder_Main {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter radius and height of a cylinder :");
        double radius = cin.nextDouble();
        double height = cin.nextDouble();
        cin.close();

        Cylinder cylinder = new Cylinder(radius,height);

        System.out.println("Volume of the cylinder = " + String.format("%.4f",cylinder.getVolume()));
    }
}
