package OOP_Master_Challenge;

public class HealthyBurger extends Hamburger {
    static final double PEAS = 0.23;
    static final double CABBAGE = 0.29;

    static final double BASE_PRICE = 3.00;

    public HealthyBurger(String meat){
        super("Brown Rye" , meat , BASE_PRICE);
    }

    private int peas = 0;
    private int cabbage = 0;

    private double totalCharges = 0.0d;

    public void setPeas(){
        peas++;
        System.out.println("Peas have been added.\n");
    }

    public void setCabbage(){
        cabbage++;
        System.out.println("Cabbage has been added.\n");
    }

    @Override
    public void getPrice(){
        if(peas > 0.0d){
            peas++;
            totalCharges += peas * PEAS;
            System.out.println("\n+$" + PEAS + " for the Peas." );
        }

        if(cabbage > 0.0d){
            cabbage++;
            totalCharges += cabbage * CABBAGE;
            System.out.println("\n+$" + CABBAGE + " for the Cabbage.");
        }

        super.additional(totalCharges);
        super.getPrice();
    }
}
