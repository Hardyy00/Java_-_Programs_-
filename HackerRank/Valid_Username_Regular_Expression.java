import java.io.*;
import java.util.*;

public class Valid_Username_Regular_Expression {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        cin.nextLine();
        while(n>0){
            String s = cin.nextLine();
            if(s.length()>=8 && s.length()<=30){
                char a = s.charAt(0);
                if(((int)a>=65 && (int)a<=90) || ((int)a>=97 && (int)a<=122)){
                    boolean isValid = true;
                    int i=0;
                    while(i<s.length()){
                        if(((int)s.charAt(i)>=0 && (int)s.charAt(i)<=47) || ((int)s.charAt(i)>=58 && (int)s.charAt(i)<=64)
                                || ((int)s.charAt(i)>=91 &&(int)s.charAt(i)<=94) || ((int)s.charAt(i)>=123 && (int)s.charAt(i)<=127) ||
                                ((int)a==96)){
                            isValid = false;
                            break;
                        }
                        i++;
                    }
                    if(isValid) {
                        System.out.println("Valid");
                    }else{
                        System.out.println("Invalid");
                    }
                }else{
                    System.out.println("Invalid");
                }

            }else{
                System.out.println("Invalid");
            }
            n--;
        }

        cin.close();
    }
}
