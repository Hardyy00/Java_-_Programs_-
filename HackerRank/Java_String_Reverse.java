import java.io.*;
import java.util.Scanner;

public class Java_String_Reverse {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.next();
        cin.close();
        boolean flag = true;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}