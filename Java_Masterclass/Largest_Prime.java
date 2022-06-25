import java.util.Scanner;
public class Largest_Prime {
    public static int getLargestPrime(int number){
        if(number <=1){
            return -1;
        }
        int prime = 0;
        int i = 1;
        while(i<=number) {
            if (number % i == 0){
                int j = 2;
                while(j < i){
                    if(i % j == 0){
                        break;
                    }
                    j++;
                }
                if(i==j){
                    prime = i;
                }
            }
            i++;
        }
        if(prime == 0){
            return -1;
        }else{
            return prime;
        }
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = cin.nextInt();
        cin.close();

        if(getLargestPrime(number) == -1){
            System.out.println("Either input is valid" +
                                " or the number doesn't has any prime factor");
        }else{
            System.out.println("Largest Prime Factor of " + number  + " = " +
                                getLargestPrime(number));
        }
    }
}
