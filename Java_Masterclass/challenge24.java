import java.util.Scanner;
import java.util.Arrays;

public class challenge24 {
    private static Scanner cin = new Scanner(System.in);
    public static void main(String[] args){

        System.out.print("Enter the number of elements : ");
        int n = cin.nextInt();

        int[] array = getInteger(n);

        int[] sortedArray = sortIntegers(array);

        printArray(sortedArray);

        cin.close();
    }

    public static int[] getInteger(int n){

        int[] array = new int[n];
        System.out.println("\nEnter the Elements :");

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

        System.out.println("\nElements of the array are :");

        for(int i=0 ;i<array.length ;i++){
            System.out.println(array[i]);
        }
    }

}
