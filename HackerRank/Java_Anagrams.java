import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        String str1 = cin.nextLine();
        String str2 = cin.nextLine();

        boolean anagram = isAnagram(str1.toLowerCase(),str2.toLowerCase());

        if(anagram)
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

        cin.close();
    }

    public static boolean isAnagram(String str1,String str2){

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        str1 = new String(arr1);
        str2 = new String(arr2);

        return str1.equals(str2);
    }
}
