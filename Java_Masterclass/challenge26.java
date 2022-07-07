
import java.util.Scanner;

public class challenge26 {
    public static Scanner cin = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("Enter the count of the Elements : ");
        int count = cin.nextInt();

        int[] myArray = new int[count];

        System.out.println("\nEnter the elements :");

        for(int i=0; i < myArray.length; i++){
            myArray[i] = cin.nextInt();
        }

        System.out.println("Original Elements : ");

        for(int i=0;i< myArray.length; i++){
            System.out.println(myArray[i]);
        }

        reverse(myArray);

        System.out.println("Reversed Elements : ");

        for(int i=0;i< myArray.length; i++){
            System.out.println(myArray[i]);
        }

    }

    private static void reverse(int[] array){

        int maxIndex = array.length - 1;

        for(int i=0;i < array.length/2 ; i++){

            int swap = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = swap;
        }
    }

}
