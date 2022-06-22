import java.util.Scanner;
public class challenge7 {
    public static double calFeetAndInchesToCentimeters(double feet,double inches){
        double feetToInches = feet*12;
        return (feetToInches + inches)*2.54;
    }

    public static double calFeetAndInchesToCentimeters(double inches){
        double feet = inches/12;

        return  calFeetAndInchesToCentimeters(feet , 0);
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter feet : ");
        double feet = cin.nextDouble();
        System.out.println("Enter inches : ");
        double inches = cin.nextDouble();

        double centimeters = calFeetAndInchesToCentimeters(inches);
        System.out.println("Centimeters = " + centimeters);
    }
}
