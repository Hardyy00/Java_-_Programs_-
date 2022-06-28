
import java.util.Scanner;

public class Java_Substring_Comparison {
    public static String getSmallestAndLargest(String s ,int k){
        String st = s.substring(0,k);
        String max,min;
        max = min = st;
        for(int i=1;i<s.length()-k+1;i++){
            st = s.substring(i,k+i);
            if(max.compareTo(st)<0){
                max = st;
            }

            if(min.compareTo(st)>0){
                min = st;
            }
        }
        return min+"\n"+max;

    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();
        int k = cin.nextInt();
        cin.close();

        System.out.println(getSmallestAndLargest(s,k));
    }
}
