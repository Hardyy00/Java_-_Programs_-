import java.util.Scanner;
public class Shared_Digit {
    public static boolean hasSharedDigit(int number1,int number2){
        if((number1 < 10 || number1 > 99) || (number2< 10 || number2 > 99)){
            return false;
        }

        int copy = number2;
        int digit;
        boolean answer = false;
        while(number1 != 0){
            digit = number1 % 10;
            while(copy!=0){
                if(copy % 10 == digit){
                    return true;
                }
                copy /= 10;
            }
            copy = number2;
            number1 /= 10;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int number1 = cin.nextInt();
        int number2 = cin.nextInt();

        if(hasSharedDigit(number1,number2)){
            System.out.println(number1 + " and " + number2 + " has" +
                                " atleast one same digit.");
        }else{
            System.out.println("Numbers do not have a same digit.");
        }
    }
}
