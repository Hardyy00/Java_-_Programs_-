import java.util.Scanner;
public class Minutes_To_Year_And_Days_Calculator {
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid Value");
        }else{
            long days = (minutes/60)/24;
            long years = days/365;
            long remainingDays = days%365;

            System.out.println(minutes + " min = " + years + " y and "
                                + remainingDays + " d");
        }
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the minutes : ");
        long minutes = cin.nextLong();
        printYearsAndDays(minutes);
    }
}
