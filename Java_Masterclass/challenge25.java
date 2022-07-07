
import java.util.Scanner;

public class challenge25 {
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Enter the count of elements : ");
        int count = cin.nextInt();

        int[] myArray = readIntegers(count);

        int minElement = findMin(myArray);

        System.out.println("Minimum element in the array : " + minElement);
    }

    public static int[] readIntegers(int count){

        int[] array = new int[count];

        System.out.println("\nEnter the elements :");

        for(int i=0;i<count;i++){
            array[i] = cin.nextInt();
        }

        return array;
    }

    public static int findMin(int[] array){

        int min = array[0];

        for(int i=1;i<array.length;i++){

            if(min > array[i]){
                min = array[i];
            }

        }

        return  min;
    }
}
