import java.util.Scanner;
public class Java_Loop_2{
    public static void main(String[] args){
        Scanner cin =  new Scanner(System.in);
        int q = cin.nextInt();
        while(q>0){
            int a = cin.nextInt();
            int b =cin.nextInt();
            int n = cin.nextInt();

            for(int i=1;i<=n;i++){
                int sum = a;
                for(int j=0;j<i;j++){
                    sum += (int)Math.pow(2,j) * b;
                }
                System.out.print(sum + " ");
            }
            System.out.println();
            q--;
        }

        cin.close();

    }
}