import java.util.Scanner;
public class Equal_Sum_Checker {
    public static boolean hasEqualSum(int var_1 ,int var_2,int var_3){
        if((var_1 + var_2) == var_3){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Variable 1 : ");
        int var_1 = cin.nextInt();
        System.out.println("Enter the Variable 2 : ");
        int var_2 = cin.nextInt();
        System.out.println("Enter the Variable 3 : ");
        int var_3 = cin.nextInt();
        
        boolean answer = hasEqualSum(var_1,var_2,var_3);
        System.out.println("Is the sum and the variable equal ?");
        System.out.println(answer);
    }
}
