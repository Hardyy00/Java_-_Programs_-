package com.hardik;

//This code is used to demonstrate Packaging

/**
 This Class had been converted into JAR file.
 Artifact was also built.
 And then JAR file was included into the project
 through the library.
 */

public class Series {

    public static int nSum(int n){

        return (n*(n+1))/2 ;
    }

    public static int factorial(int n){

        int factorial = 1;

        for(int i= 1; i<=n; i++ ){
            factorial*= i;
        }

        return factorial;
    }

    public static int fibonacci(int n){

        if(n>=0 && n<=1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
