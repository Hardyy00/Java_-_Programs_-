import java.util.Scanner;
public class All_Factors {
    public static void printFactors(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }else{
            int i = 1;
            while(i <= number){
                if(number % i == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = cin.nextInt();
        printFactors(number);
    }
}
