
import java.util.Scanner;

public class MinimumElement {

    private static int readInteger(){
        Scanner cin = new Scanner(System.in);
        int count = cin.nextInt();

        cin.close();

        return count;
    }

    private static int[] readElements(int count){

        Scanner cin = new Scanner(System.in);
        int[] array = new int[count];


        for(int i=0;i<count;i++){
            array[i] = cin.nextInt();
        }

        cin.close();

        return array;

    }

    private static int findMin(int[] array){

        int min = array[0];

        for(int i=1;i<array.length;i++){

            if(min > array[i]){
                min = array[i];
            }

        }

        return  min;
    }
}
