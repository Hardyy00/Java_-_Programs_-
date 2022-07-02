package PoolArea;
import java.util.Scanner;
// Part of the Pool Area Problem
public class PoolAreaMainMethod {

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("\nEnter the width , length and height of a cuboid respectively:");
        double width = cin.nextDouble();
        double length = cin.nextDouble();
        double height = cin.nextDouble();

        Cuboid cuboid = new Cuboid(width,length,height);
        System.out.println("Volume of the Cuboid = " + cuboid.getVolume());

        cin.close();
    }
}
