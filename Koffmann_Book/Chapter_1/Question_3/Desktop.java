package question3.com.hardik;

public class Desktop extends Computer{
    private static double DESKTOP_BASE_PRICE = 77.55;
    private static double DESKTOP_SHIPPING_PRICE = 10.79;

    public Desktop() {
        super(DESKTOP_BASE_PRICE);
    }

    @Override
    public double shippingCost() {
        return DESKTOP_SHIPPING_PRICE;
    }

    @Override
    public void displayMyComputerPrice() {
        double netPrice = super.getComputerNetPrice();
        System.out.println("\nDesktop Base Price : $." + DESKTOP_BASE_PRICE);
        super.displayMyComputerPrice();
        System.out.println("\n--->Desktop Net Price : $." +String.format("%.4f" ,netPrice));
        System.out.println("--->Shipping Cost : $." + DESKTOP_SHIPPING_PRICE);
        System.out.println("--->Total money to pay : $." + String.format("%.4f" , netPrice + DESKTOP_SHIPPING_PRICE) );
    }
}
