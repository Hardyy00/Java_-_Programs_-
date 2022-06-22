import java.util.Scanner;
public class Barking_Dog {
    public static boolean shouldWakeUp(boolean isBarking,int hourOfTheDay){
        if(hourOfTheDay < 0 || hourOfTheDay > 23 ) {
            return false;
        }else if(isBarking && (hourOfTheDay < 8 || hourOfTheDay > 22)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Is dog barking ?");
        boolean bool = cin.nextBoolean();
        System.out.println("Enter the hour of the day :");
        int hours = cin.nextInt();
        cin.close();
        boolean answer = shouldWakeUp(bool,hours);
        System.out.println("Should wake up ?");
        System.out.println(answer);
    }

}
