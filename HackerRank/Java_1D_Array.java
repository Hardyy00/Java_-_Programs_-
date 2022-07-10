import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        
        int n = cin.nextInt();
        
        int[] a = new int[n];
        
        for(int i=0;i<a.length;i++){
            a[i] = cin.nextInt();
            System.out.println(a[i]);
        }
        
        cin.close();
    }
}
