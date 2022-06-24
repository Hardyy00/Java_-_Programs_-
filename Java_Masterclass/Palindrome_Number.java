import java.util.Scanner;
public class Palindrome_Number {
    public static boolean isPalindrome(int number){
        int copy = number;
        int reversedNumber = 0;
        while(copy != 0){
            reversedNumber = reversedNumber * 10 + (copy % 10);
            copy /= 10;
        }

        return number == reversedNumber;
    }

    public static void main(String[] args){
        Scanner cin =new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = cin.nextInt();
        cin.close();

        if(isPalindrome(number)){
            System.out.println("\n" + number + " is a Palindrome number");
        }else{
            System.out.println("\n" + number + " is not Palindrome number");

        }
    }
}
