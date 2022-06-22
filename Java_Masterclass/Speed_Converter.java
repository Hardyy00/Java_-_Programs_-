import java.util.Scanner;
public class Speed_Converter {
    public static long toMilesPerHour(double KilometersPerHour){
        if(KilometersPerHour< 0){
            return -1;
        }
        return Math.round(KilometersPerHour / 1.609);
    }

    public static void printConversion(double KilometersPerHour){
        if(KilometersPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            long miles = toMilesPerHour(KilometersPerHour);
            System.out.println(KilometersPerHour + " km/h = " +
                               miles + " mi/h" );
        }
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Kilometers Per Hour : ");
        double kilometersPerHour = cin.nextDouble();
        long miles = toMilesPerHour(kilometersPerHour);
        System.out.println("Miles = " +miles);

        printConversion(kilometersPerHour);
    }
}
