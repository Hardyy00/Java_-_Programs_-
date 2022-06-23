import java.util.Scanner;
public class challenge9 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char value = cin.next().charAt(0);
        cin.close();

        switch(value){
            case 'A' :
            case 'B' :
            case 'C' :
            case 'D' :
            case 'E' :
                System.out.println("Caught an " + value);
                break;

            default :
                System.out.println("A,B,C,D or E was not typed at all.");
        }
    }
}
