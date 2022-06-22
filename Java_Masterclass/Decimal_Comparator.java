import java.util.Scanner;
public class Decimal_Comparator {
    public static boolean  areEqualByThreeDecimalPlaces(double var_1,double var_2){
        var_1= (int)(var_1 * 1000);
        var_1/=1000;

        var_2 = (int)(var_2*1000);
        var_2 /= 1000;

        if(var_1 == var_2){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter variable 1 : ");
        double var_1 = cin.nextDouble();
        System.out.println("Enter variable 2 : ");
        double var_2 = cin.nextDouble();

        boolean answer = areEqualByThreeDecimalPlaces(var_1,var_2);
        System.out.println(answer);
    }
}
