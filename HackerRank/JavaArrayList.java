import java.util.Scanner;
import java.util.ArrayList;

public class JavaArrayList {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        int n = cin.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        while (n-- > 0) {

            int num = cin.nextInt();
            ArrayList<Integer> temp = new ArrayList();

            for (int i = 0; i < num; i++) {
                int val = cin.nextInt();
                temp.add(val);
            }

            list.add(temp);
        }

        int query = cin.nextInt();

        while (query-- > 0) {

            int x = cin.nextInt();
            int y = cin.nextInt();
            ArrayList<Integer> temp = list.get(x - 1);

            if (temp.isEmpty() || ((y - 1) >= temp.size()))
                System.out.println("ERROR!");
            else
                System.out.println(temp.get(y - 1));
        }

        cin.close();
    }

}
