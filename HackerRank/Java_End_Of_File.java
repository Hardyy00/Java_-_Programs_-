import java.util.Scanner;
public class Java_End_Of_File{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int count = 1;
        while(cin.hasNext()){
            String s = cin.nextLine();
            System.out.println(count + " " + s);

            count++;
        }

        cin.close();
    }
}