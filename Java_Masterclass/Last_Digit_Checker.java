import java.util.Scanner;
public class Last_Digit_Checker {
    public static boolean hasSameLastDigit(int num1,int num2,int num3){
        if(!isValid(num1) || !isValid(num2) || !isValid(num3)){
            return false;
        }

        return (num1 % 10 == num2 % 10) || (num2 % 10 == num3 % 10)
                || (num1 % 10 == num3 % 10);
    }
    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int num1 = cin.nextInt();
        int num2 = cin.nextInt();
        int num3 = cin.nextInt();

        if(hasSameLastDigit(num1,num2,num3)){
            System.out.println("At least two of the numbers " +
                                "share a common right most digit.");
        }else{
            System.out.println("Wrong Input or No same rightmost digit found.");
        }
    }
}
