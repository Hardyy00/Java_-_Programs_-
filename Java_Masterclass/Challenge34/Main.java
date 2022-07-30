package com.hardik;

//This code is used to demonstrate Packaging

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum :");
        for(int i=0;i<=10; i++){
            System.out.print(Series.nSum(i) + " ");
        }

        System.out.println("\n\nFactorial :");
        for(int i=0;i<=10; i++){
            System.out.print(Series.factorial(i) + " ");
        }

        System.out.println("\n\nFibonacci :");
        for(int i=0;i<=10; i++){
            System.out.print(Series.fibonacci(i) + " ");
        }

    }
}
