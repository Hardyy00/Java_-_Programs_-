import java.util.Scanner;
public class Number_Of_Days_In_Month {
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999 ){
            return false;
        }

        if(year%4 == 0 && year%100 != 0){
            return true;
        }else if(year%100 == 0 && year%400 == 0){
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month,int year){

        if(month >= 1 && month <= 12 && year >=1 && year <= 9999 ){
            switch (month) {
                case 1:
                    return 31;
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    }
                    return 28;
                case 3:
                    return 31;
                case 4:
                    return 30;
                case 5:
                    return 31;
                case 6:
                    return 30;
                case 7:
                    return 31;
                case 8:
                    return 31;
                case 9:
                    return 30;
                case 10:
                    return 31;
                case 11:
                    return 30;
                case 12:
                    return 31;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = cin.nextInt();
        System.out.println("Is year a Leap Year ?");
        System.out.println(isLeapYear(year));

        System.out.println("Enter the month and the Year : ");
        int month = cin.nextInt();
        year = cin.nextInt();

        System.out.println("Number of days in the month = " + getDaysInMonth(month,year));
    }
}
