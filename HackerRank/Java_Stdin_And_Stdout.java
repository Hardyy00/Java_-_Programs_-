import java.util.Scanner;
public class Java_Stdin_And_Stdout{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        cin.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
