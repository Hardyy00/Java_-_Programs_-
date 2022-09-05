package practice4.com.hardik;

import java.util.LinkedHashMap;
import java.util.Map;

public class Basket {

    private final String name;
    private Map<StockItem , Integer> list;

    public Basket(String name){
        this.name = name;
        this.list = new LinkedHashMap<>();
    }

    public boolean addToBasket(StockItem item , int quantity){

        if(item != null && quantity>0){

            int existedQuantity = list.getOrDefault(item , 0);
            list.put(item , existedQuantity + quantity);
            return true;
        }

        return false;

    }

    @Override
    public String toString(){

        String s= "Your Basket '" + this.name  + "' contains " + list.size() + " Items\n";

        double totalBasketPrice = 0.0d;

        for(Map.Entry<StockItem , Integer> item : list.entrySet()){

            s += "Item : " + item.getKey().getName() + " Quantity : " + item.getValue() + " Total Price : "
                    + item.getKey().getItemPrice() * item.getValue() + " || PURCHASED ||\n";

            totalBasketPrice += item.getKey().getItemPrice() * item.getValue();

        }

        return s+ "Total Basket Price = " + totalBasketPrice;
    }


}
