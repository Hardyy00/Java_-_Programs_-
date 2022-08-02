package challenge35.com.hardik;

import java.util.Scanner;

// This code is used to demonstrate the meaning of Scope.
// Usually it's a bad practice to do all of this.

public class Main {

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        X var = new X();

        var.x(2);

        X var2 = new X(3);
        var2.x();
    }

}
