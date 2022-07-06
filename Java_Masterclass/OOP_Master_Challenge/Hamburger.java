package OOP_Master_Challenge;
// Bill's Burger
public class Hamburger {

    static final double LETTUCE = 0.12;
    static final double TOMATO = 0.11;
    static  final double CARROT = 0.09;
    static final double PICKLE = 0.33;
    private String breadRoll = "";
    private String meat = "";
    private double basePrice;
    private double totalPrice = 0.0d;


    public Hamburger(String breadRoll,String meat, double basePrice){
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = basePrice;
        totalPrice += basePrice;
    }

    private int lettuce = 0;
    private int tomato = 0;
    private int carrot = 0;
    private int pickle = 0;

    public void setLettuce(){
        lettuce ++;
        totalPrice += lettuce * LETTUCE;
        System.out.println("Lettuce has been added.");
    }

    public void setTomato(){
        tomato++;
        totalPrice += tomato * TOMATO;
        System.out.println("Tomato has been added.");
    }

    public void setCarrot(){
        carrot++;
        totalPrice += carrot * CARROT;
        System.out.println("Carrot has been added.");
    }

    public void setPickle(){
        pickle++;
        totalPrice += pickle * PICKLE;
        System.out.println("Pickle has been added.");
    }

    public void getPrice(){

        if(lettuce > 0){
            System.out.println("\n+$" + LETTUCE + " for the Lettuce.");
        }

        if(tomato > 0){
            System.out.println("\n+$" + TOMATO + " for the Tomato.");
        }

        if(carrot > 0){
            System.out.println("\n+$" + CARROT + " for the Carrot.");
        }

        if(pickle > 0){
            System.out.println("\n+$" + PICKLE + " for the Pickle.");
        }

        System.out.println("\n+$" + basePrice  + " for the base Burger." );

        System.out.println("\nGrand Total = $" + String.format("%.2f",totalPrice));
    }

    public void additional(double price){
        totalPrice += price;
    }

}
