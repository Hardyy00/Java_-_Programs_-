import java.util.Scanner;
public class MegaBytes_Converter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes <0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) +
                    " MB and " + (kiloBytes % 1024) +
                    " KB");
        }
    }
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int kiloBytes = cin.nextInt();
        cin.close();

        printMegaBytesAndKiloBytes(kiloBytes);
    }


}
