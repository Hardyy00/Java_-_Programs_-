import java.util.Scanner;
public class Teen_Number_Checker {
    public static boolean hasTeen(int var_1,int var_2,int var_3){
        if((var_1 >=13 && var_1<=19) || (var_2>=13 && var_2 <=19) ||
                (var_3 >=13 && var_3 <=19)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the value 1 : ");
        int var_1 = cin.nextInt();
        System.out.println("Enter the value 2 : ");
        int var_2 = cin.nextInt();
        System.out.println("Enter the value 3 : ");
        int var_3 = cin.nextInt();

        boolean answer = hasTeen(var_1,var_2,var_3);
        System.out.println("Is there a teen ?");
        System.out.println(answer);
    }
}
