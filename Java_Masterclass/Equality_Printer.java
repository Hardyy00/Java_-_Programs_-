import java.util.Scanner;
public class Equality_Printer {
    public static void printEqual(int var_1,int var_2,int var_3){
        if(var_1 < 0 || var_2 <0 || var_3<0){
            System.out.println("Invalid Value");
        }else if(var_1 == var_2 && var_2 == var_3){
            System.out.println("All numbers are equal");
        }else if(var_1 != var_2 && var_2 != var_3 && var_3 != var_1){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }

    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int var_1 = cin.nextInt();
        int var_2 = cin.nextInt();
        int var_3 = cin.nextInt();

        printEqual(var_1,var_2,var_3);
    }
}
