
import java.util.Scanner;

public class Java_String_Introduction {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String a = cin.next();
        String b = cin.next();

        System.out.println(a.length() + b.length());

        if(a.compareTo(b)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        System.out.print(a.substring(0,1).toUpperCase() + a.substring(1)+" ");
        System.out.print(b.substring(0,1).toUpperCase() + b.substring(1));

        cin.close();

    }
}
