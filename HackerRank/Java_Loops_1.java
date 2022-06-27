import java.util.Scanner;
public class Java_Loops_1{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int number = cin.nextInt();

        for(int i=0;i<10;i++){
            System.out.println(number + " x " + (i+1) + " = " + number*(i+1));
        }
        cin.close();
    }
}