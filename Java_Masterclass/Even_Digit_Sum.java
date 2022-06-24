import java.util.Scanner;
public class Even_Digit_Sum {
    public static int getEvenDigitSum(int number){
        if(number  < 0){
            return -1;
        }

        int sum = 0;
        int digit;
        while(number != 0){
            digit = number % 10;
            if(digit % 2 == 0){
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = cin.nextInt();

        if(getEvenDigitSum(number) == -1){
            System.out.println("Invalid Input");
        }else{
            System.out.println("Sum of Even digits of " +
                                number + " = " + getEvenDigitSum(number));
        }
    }
}
