package Challenge22;
// Part of challenge 22
public class Printer {
    private int tonerLevel = 100;
    private int printedPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel ,boolean duplexPrinter){
        if(tonerLevel >=0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.printedPages = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner(int tonerLevel){
        if(this.tonerLevel + tonerLevel > 100){
            System.out.println("Maximum Capacity Crossed. Fill Tonner to 100%");
            this.tonerLevel = 100;
        }else{
            this.tonerLevel += tonerLevel;
            System.out.println("Toner Level has been increased to " + this.tonerLevel);
        }
    }

    public void printPage(int pages){
        if(getTonerLevel() > 0){
            String sides = duplexPrinter ? "both sides" : "single side";
            printedPages += duplexPrinter ? (pages%2 ==0 ? pages/2 : pages/2 + 1)  : pages;
            System.out.println("Printing " + pages + " pages on " + sides + " of the paper....");
            System.out.println("Total Printed Pages = " + getPrintedPages());
            this.tonerLevel -= pages;
        }else{
            System.out.println("Insuficient Toner . Please refill the Toner to print more Pages.");

        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
