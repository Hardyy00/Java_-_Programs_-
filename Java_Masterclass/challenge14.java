import java.util.Scanner;
public class challenge14 {
    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = cin.nextInt();
        cin.close();

        if(isEven(number)){
            System.out.println("\n" + number + " is an Even number.");
        }else{
            System.out.println("\n" + number + " is an Odd number.");
        }

        int start = 4;
        int finish = 20;
        int count = 0;

        while(start <= finish){
            start ++;
            if(!isEven(start)){
                continue;
            }
            count ++;
            System.out.println(start + " is an Even number");
            if(count == 5) {
                break;
            }
        }
        System.out.println("Total " + count + " Even numbers found.");
    }
}
