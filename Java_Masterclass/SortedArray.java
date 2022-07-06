import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {

    public static int[] getIntegers(int n){

        Scanner cin = new Scanner(System.in);
        int[] array = new int[n];


        for(int i=0;i<array.length;i++){
            array[i] = cin.nextInt();
        }

        return array;
    }

    public static int[] sortIntegers(int[] array){

        int[] newArray = Arrays.copyOf(array,array.length);
        int swap;

        for(int i=0;i<newArray.length -1 ;i++){

            for(int j=0 ;j< newArray.length - 1 - i;j++){

                if(newArray[j+1] > newArray[j]){

                    swap = newArray[j+1];
                    newArray[j+1] = newArray[j];
                    newArray[j] = swap;

                }
            }
        }
        return  newArray;
    }

    public static void printArray(int[] array){

        for(int i=0 ;i<array.length ;i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

}
