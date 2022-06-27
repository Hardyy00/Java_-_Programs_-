import java.util.Scanner;
public class Java_Static_Initializer_Block{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int b = cin.nextInt();
        int h = cin.nextInt();

        if(b<=0 || h<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            System.out.println(h * b);
        }

        cin.close();
    }
}