import java.util.Scanner;
public class First_And_Last_digit_Sum {
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }

        int lastDigit = number % 10;
        int digits = (int)Math.log10(number);
        if(number == 0){
            return number;
        }
        return (number/(int)Math.pow(10,digits)) + lastDigit;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = cin.nextInt();
        cin.close();

        if(sumFirstAndLastDigit(number) == -1){
            System.out.println("Invalid Input");
        }else{
            System.out.println("Sum of first and Last digits of " +
                                number + " = " + sumFirstAndLastDigit(number));
        }

    }
}
