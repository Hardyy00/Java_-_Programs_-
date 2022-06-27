import java.util.Scanner;

public class Java_If_Else{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int myInt = cin.nextInt();
        cin.close();

        if(myInt % 2 !=0){
            System.out.println("Weird");
        }else{
            if(myInt > 20){
                System.out.println("Not Weird");
            }else if(myInt >=6){
                System.out.println("Weird");
            }else if(myInt >=2){
                System.out.println("Not Weird");
            }
        }
    }
}
