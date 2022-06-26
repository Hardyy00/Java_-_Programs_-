import java.util.Scanner;
public class challenge16 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while(count<=10){
            System.out.print("Enter number " + count + " = ");
            if(cin.hasNextInt()){
                sum += cin.nextInt();
                count++;
            }else{
                System.out.println("Invalid Input.");
            }

            cin.nextLine();
        }

        System.out.print("Sum of Entered numbers = " + sum);
        cin.close();
    }
}
