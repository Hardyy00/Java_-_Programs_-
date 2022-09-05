package practice4.com.hardik;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {

    private final String stockName;
    private Map<String , StockItem> list;

    public StockList(String stockName) {
        this.stockName = stockName;
        this.list = new LinkedHashMap<>();
    }

    public Map<String , StockItem> getStockList() {
       return Collections.unmodifiableMap(this.list);
    }

    public boolean sellStock(String item , int quantity){
        StockItem currentItem = list.get(item);

        if(currentItem != null && (currentItem.getQuantity()>=quantity) && quantity>0){
            currentItem.adjustQuantity(-quantity);
            return true;

        }
        System.out.println("Item selection gone wrong....");
        return false;

    }

    public int addStock(StockItem item){

        if(item != null){

            StockItem newItem = list.getOrDefault(item.getName() , item);
            if(newItem != item){
                item.adjustQuantity(newItem.getQuantity());
            }

            list.put(item.getName() , item);
            return item.getQuantity();
        }
        System.out.println("Item didn't added.");
        return  0;
    }

    public StockItem get(String key){
        return list.get(key);
    }

    @Override
    public String toString(){

        double totalPrice = 0.0d;

        String s =  "Stock Name : " + this.stockName + "\n";
        for(Map.Entry<String  , StockItem> item : list.entrySet()){

            StockItem currentItem = item.getValue();
            double itemsPrice = currentItem.getItemPrice() * currentItem.getQuantity();

            s += currentItem + " Net Value = " + itemsPrice + "\n";
            totalPrice += itemsPrice;

        }

        return s + "Total Stock Price = " + totalPrice ;

    }


}
