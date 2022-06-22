import javax.swing.*;
import java.util.Scanner;
public class Leap_Year_Calculator {
    public static boolean isLeapYear(int year){
       if(year >= 1 || year <= 9999){
            if(year%400==0 && (year%4==0 && year%100!=0)){
                return true;
            }else{
                return false;
            }
       }
       return false;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int year = cin.nextInt();

        boolean answer = isLeapYear(year);

        System.out.println("Is entered year a leap year ?");
        System.out.println(answer);
    }
}
