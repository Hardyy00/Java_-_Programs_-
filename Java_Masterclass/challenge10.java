import java.util.Scanner;
public class challenge10 {
    public static void printDayOfTheWeek1(int day){
        switch (day){
            case 0 :
                System.out.println("Its a Sunday");
                break;
            case 1 :
                System.out.println("Its a Monday");
                break;
            case 2 :
                System.out.println("Its a Tuesday");
                break;
            case 3 :
                System.out.println("Its a Wednesday");
                break;
            case 4 :
                System.out.println("Its a Thursday");
                break;
            case 5 :
                System.out.println("Its a Friday");
                break;
            case 6 :
                System.out.println("Its a Saturday");
                break;
            default :
                System.out.println("Invalid Day");
        }
    }

    public static void printDayOfTheWeek2(int day){
        if(day ==0){
            System.out.println("Its a Sunday");
        }else if(day==1){
            System.out.println("Its a Monday");
        }else if(day==2){
            System.out.println("Its a Tuesday");
        }else if(day==3){
            System.out.println("Its a Wednesday");
        }else if(day==4){
            System.out.println("Its a Thursday");
        }else if(day==5){
            System.out.println("Its a Friday");
        }else if(day == 6){
            System.out.println("Its a Saturday");
        }else{
            System.out.println("Invalid Day");
        }

    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a day : ");
        int day = cin.nextInt();

        printDayOfTheWeek1(day);
        printDayOfTheWeek2(day);

    }

}

















