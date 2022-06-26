import java.util.Scanner;
public class Input_Calculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner cin = new Scanner(System.in);
        int sum = 0, average = 0;
        int count = 0;
        if(cin.hasNextInt()){
            int number = cin.nextInt();
            sum += number;
            count++;
            cin.nextLine();
            while(true){
                if(cin.hasNextInt()){
                    number = cin.nextInt();
                    sum += number;
                    count++;
                }else{
                    System.out.println("SUM = " + sum + " AVG = " + Math.round((double)sum/count));
                    break;
                }
                cin.nextLine();
            }
        }else{
            System.out.println("SUM = " + sum + " AVG = " + average);
        }

    }
    
    public static void main(String[] args){
        inputThenPrintSumAndAverage();

    }
}
