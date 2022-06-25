import java.util.Scanner;
public class Greatest_Common_Divisor {
    public static int getGreatestCommonDivisor(int num1,int num2) {
        if (num1 < 10 || num2 < 10) {
            return -1;
        }

        int min;
        if (num1 < num2) {
            min = num1;
        } else{
            min = num2;
        }
        int i = 1;
        int gcd = 1;

        while(i <= min ){
            if(num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = cin.nextInt();
        int num2 = cin.nextInt();

        if(getGreatestCommonDivisor(num1,num2) == -1){
            System.out.println("Invalid Input.");
        }else{
            System.out.println("GCD of " + num1 + " and " +
                                num2 + " = " +
                                getGreatestCommonDivisor(num1,num2));
        }
    }
}
