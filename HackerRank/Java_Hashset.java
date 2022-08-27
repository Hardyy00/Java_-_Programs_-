import java.io.*;
import java.util.*;

class Pair {

    private final String a;
    private final String b;

    public Pair(String a, String b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj instanceof Pair) {

            Pair anotherPair = (Pair) obj;

            return this.a.equals(anotherPair.a) &&
                    this.b.equals(anotherPair.b);
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

}

public class Solution {

    public static void main(String[] args) {

        Set<Pair> set = new HashSet<>();

        Scanner cin = new Scanner(System.in);

        int t = cin.nextInt();

        while (t-- > 0) {

            String a = cin.next();
            String b = cin.next();

            set.add(new Pair(a, b));

            System.out.println(set.size());
        }

        cin.close();

    }
}
