import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();
        cin.nextLine();

        Map<String,Long> phoneBook = new HashMap<>();

        while(n-->0){
            String name = cin.nextLine();
            long number = cin.nextLong();
            cin.nextLine();

            phoneBook.put(name , number);
        }

        while(cin.hasNextLine()){
            String st = cin.nextLine();

            if(phoneBook.containsKey(st)){
                System.out.println(st + "=" + phoneBook.get(st) );
            }else{
                System.out.println("Not found");
            }
        }
        cin.close();
    }
}
