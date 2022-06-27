import java.util.Scanner;
public class Java_Output_Formatting {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s = cin.next();
            int number = cin.nextInt();

            String numberString = "" + number;
            if(number < 10){
                numberString = "00" + numberString;
            }else if(number < 100){
                numberString = "0" + numberString;
            }

            System.out.printf("%-15s%s\n",s,numberString);

        }
        System.out.println("================================");
        cin.close();
    }
}
