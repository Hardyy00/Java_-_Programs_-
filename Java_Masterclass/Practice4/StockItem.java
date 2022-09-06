package practice4.com.hardik;

public final class StockItem implements Comparable<StockItem>{

    private final String name ;
    private int quantity;
    private double  price;

    public StockItem(String name , double price){
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public StockItem(String name , double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }



    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getItemPrice() {
        return price;
    }

    public void adjustQuantity(int quantity){

        int newQuantity = this.quantity + quantity;

        if(newQuantity>=0){
            this.quantity  = newQuantity;
        }

    }

    @Override
    public String toString(){

        return "Item Name : " + this.name + ". Price : " + this.price
                + ". Quantity : " + this.quantity;

    }


    @Override
    public int compareTo(StockItem item){

        if(this == item){
            return 0;
        }

        if(item != null){
            return this.getName().compareTo(item.getName());
        }

        return -1;
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }

        if((obj instanceof StockItem nextItem)){

            return this.getName().equals(nextItem.getName());
        }

        return false;
    }

    @Override
    public int hashCode(){
        return this.name.hashCode();
    }


}
