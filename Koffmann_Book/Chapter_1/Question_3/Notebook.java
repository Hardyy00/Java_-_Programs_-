package question3.com.hardik;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Notebook extends Computer{

    private double noteBookScreenSizePrice;
    static Scanner cin = new Scanner(System.in);
    static double SCREENSIZE_8INCH = 109.00;
    static double SCREENSIZE_9INCH = 120.00;
    static double NOTEBOOK_BASE_PRICE = 69.13;

    static double NOTEBOOK_SHIPPING_PRICE = 9.93;

    public Notebook() {
        super(NOTEBOOK_BASE_PRICE);
        noteBookScreenSizePrice = 0.0d;
    }

    public void incrementNotebookScreenSizePrice(double noteBookScreenSizePrice){
        this.noteBookScreenSizePrice = noteBookScreenSizePrice;
        incrementComputerPrice(noteBookScreenSizePrice);
    }

    @Override
    public void chooseComputer() {

        System.out.println("\nAvailable Screen Sizes : ");
        System.out.println("1. 8 INCH");
        System.out.println("2. 9 INCH");
        System.out.println("\nChoose a screen size : ");
        int option = cin.nextInt();

        switch(option){
            case 1 :
                System.out.println("$"+SCREENSIZE_8INCH + " added for Screen size 8 INCH.");
                incrementNotebookScreenSizePrice(SCREENSIZE_8INCH);
                break;
            case 2 :
                System.out.println("$"+ SCREENSIZE_9INCH + " added for Screen size 9 INCH.");
                incrementNotebookScreenSizePrice(SCREENSIZE_9INCH);
                break;
        }
        super.chooseComputer();
    }

    @Override
    public double shippingCost() {
        return NOTEBOOK_SHIPPING_PRICE;
    }

    @Override
    public void displayMyComputerPrice() {

        double netPrice = super.getComputerNetPrice();
        System.out.println("\nNotebook Base Price : $" + NOTEBOOK_BASE_PRICE);
        System.out.println("Notebook Screen Size Price : $" + this.noteBookScreenSizePrice );
        super.displayMyComputerPrice();
        System.out.println("\n--->Notebook Net Price : $" +String.format("%.4f" ,netPrice));
        System.out.println("--->Shipping Cost : $" + NOTEBOOK_SHIPPING_PRICE);
        System.out.println("--->Total money to pay : $" + String.format("%.4f" , netPrice + NOTEBOOK_SHIPPING_PRICE) );
    }
}
