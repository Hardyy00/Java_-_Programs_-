import java.util.Scanner;
public class Sum_Odd {
    public static boolean isOdd(int number){
        if(number <=0){
            return false;
        }

        if(number%2 !=0 ){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start,int end){
        if(end >= start && start > 0){
            int sum = 0;
            for(int i=start ;i <= end ;i++){
                if(isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }

        return -1;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the Start and End value");
        int start = cin.nextInt();
        int end = cin.nextInt();

        System.out.println("Sum of odd numbers in the range = " + sumOdd(start,end));
    }

}

