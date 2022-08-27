import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Integer[] arr = { 1, 2, 3 };
        printArray(arr);
        String[] s = { "Hello", "World" };
        printArray(s);

    }

    private static <E> void printArray(E[] arr) {

        for (E value : arr) {
            System.out.println(value);
        }
    }
}
