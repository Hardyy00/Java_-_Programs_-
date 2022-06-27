import java.util.Scanner;
public class Java_Stdin_And_Stdout_2{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        double b = cin.nextDouble();
        String s1 = cin.nextLine();
        String s = cin.nextLine();
        cin.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
