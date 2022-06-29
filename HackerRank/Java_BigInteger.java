import java.math.BigInteger;
import java.util.Scanner;

public class Java_BigInteger{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        BigInteger a = cin.nextBigInteger();
        BigInteger b = cin.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

        cin.close();
    }
}