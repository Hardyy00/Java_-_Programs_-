import java.math.BigInteger;
import java.util.Scanner;

public class Java_Primality_Test{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        BigInteger bigInt = cin.nextBigInteger();
        String answer = bigInt.isProbablePrime(1) ? "prime" : "not prime";
        System.out.println(answer);

        cin.close();

    }
}