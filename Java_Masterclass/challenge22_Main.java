package Challenge22;
// Includes Printer class
public class challenge22_Main {
    public static void main(String[] args){
        Printer printer = new Printer(10,true);

        printer.fillToner(10);

        printer.printPage(7);

        printer.printPage(2);

        printer.printPage(20);

        printer.printPage(11);

        ;
    }
}
