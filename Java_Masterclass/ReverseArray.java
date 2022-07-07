import java.util.Arrays;

public class ReverseArray {


    private static void reverse(int[] array){

        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;

        for(int i=0;i < array.length/2 ; i++){

            int swap = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = swap;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }

}
