import java.util.Scanner;
public class challenge15 {
    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }

        int sum = 0;
        while(number != 0){
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a 2 or more Digits number : ");
        int number = cin.nextInt();
        cin.close();

        if(sumDigits(number) == -1){
            System.out.println("Invalid Input.");
        }else{
            System.out.println("Sum of digits of " + number + " = " +
                    sumDigits(number));
        }
    }
}
