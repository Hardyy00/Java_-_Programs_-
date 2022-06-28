import java.util.Scanner;
public class Java_Subtring{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        int start = cin.nextInt();
        int end = cin.nextInt();
        cin.close();

        System.out.println(s.substring(start,end));
    }
}