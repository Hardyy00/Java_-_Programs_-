import java.util.Scanner;
public class Perfect_Number {
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }

        int sum = 0;
        for(int i=1 ; i< number ;i++){
            if(number % i == 0){
                sum += i;
            }
        }
        return sum == number;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = cin.nextInt();
        cin.close();

        if(isPerfectNumber(number)){
            System.out.println(number + " is a Perfect number.");
        }else{
            System.out.println(number + " is not Perfect number.");
        }
    }
}
