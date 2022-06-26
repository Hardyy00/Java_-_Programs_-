import java.util.Scanner;

public class challenge17 {

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        System.out.println("Enter numbers to find the max and min number.");
        System.out.println("Enter an Invalid Number to exit.");

        System.out.print("Enter the number : ");

        if(cin.hasNextInt()){
            int num = cin.nextInt();
            int max , min;
            max = min = num;

            while(true){

                System.out.print("Enter a number : ");

                if(cin.hasNextInt()){
                    num = cin.nextInt();

                    if(max < num){
                        max = num;
                    }
                    if(min > num){
                        min = num;
                    }

                    cin.nextLine();

                }else{
                    System.out.println("\nInvalid Input.\nExisting the loop...");
                    break;
                }
            }

            System.out.println("\nMaximum number = " + max);
            System.out.println("\nMinimum number = " + min);

        }else{
            System.out.println("You did not Enter any number.");
        }

        cin.close();

    }
}
