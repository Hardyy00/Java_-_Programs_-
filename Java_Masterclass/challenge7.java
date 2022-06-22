import java.util.Scanner;
public class challenge7 {
    public static double calFeetAndInchesToCentimeters(double feet,double inches){
        if(feet >=0 && (inches >=0 && inches<=12)) {
            double feetToInches = feet * 12;
            return (feetToInches + inches) * 2.54;
        }
        return -1;
    }

    public static double calFeetAndInchesToCentimeters(double inches){
        if(inches >=0) {
            double feet = inches / 12;

            return calFeetAndInchesToCentimeters(feet, 0);
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter feet : ");
        double feet = cin.nextDouble();
        System.out.println("Enter inches : ");
        double inches = cin.nextDouble();

        double centimeters = calFeetAndInchesToCentimeters(feet,inches);
        if(centimeters < 0.0){
            System.out.println("\nInvalid Input.");
        }else{
            System.out.println("Centimeters = " + centimeters);

        }
    }
}
