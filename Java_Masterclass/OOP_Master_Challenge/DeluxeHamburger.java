package OOP_Master_Challenge;

public class DeluxeHamburger extends Hamburger{
    static final double CHIPS = 2.01;
    static final double DRINKS = 1.90;
    static final double BASE_PRICE = 4.00;

    public DeluxeHamburger(){
        super("Deluxe Bun","Wague",BASE_PRICE);
    }

    private double additionalPrice = CHIPS + DRINKS;

    @Override
    public void setLettuce() {
        System.out.println("\nCannot add an item to a Deluxe Burger.");
    }

    @Override
    public void setTomato() {
        System.out.println("\nCannot add an item to a Deluxe Burger.");
    }

    @Override
    public void setCarrot() {
        System.out.println("\nCannot add an item to a Deluxe Burger.");
    }

    @Override
    public void setPickle() {
        System.out.println("\nCannot add an item to a Deluxe Burger.");
    }

    @Override
    public void getPrice(){
        System.out.println("\n+$" + CHIPS + " for the Chips");
        System.out.println("\n+$" + DRINKS + " for the Drinks.");

        super.additional(additionalPrice);

        super.getPrice();
    }
}
