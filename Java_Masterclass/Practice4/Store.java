package practice4.com.hardik;

public class Store {

    private static final StockList stockList =     new StockList("Necessary Things");

    public static void main(String[] args){

        StockItem temp = new StockItem("toy car" , 12.12 , 34);
        stockList.addStock(temp);

        temp = new StockItem("cup" , 2.33, 12);
        stockList.addStock(temp);

        temp = new StockItem("spoon" , 0.23 , 122);
        stockList.addStock(temp);

        temp = new StockItem("lighter" , 1.1, 67);
        stockList.addStock(temp);

        temp = new StockItem("electric Kettle" , 45.12 , 20);
        stockList.addStock(temp);

        temp = new StockItem("dish wash" , 6.77 , 42);
        stockList.addStock(temp);

        temp = new StockItem("pasta" , 3.24 , 34);
        stockList.addStock(temp);

        temp = new StockItem("scrubber" , 1.79 , 77);
        stockList.addStock(temp);

        System.out.println(stockList);
        System.out.println();

        Basket basket = new Basket("Important things");
        sellItem(basket , "scrubber" , 2) ;
        sellItem(basket , "toy car" , 4) ;
        sellItem(basket , "pasta" , 10) ;
        sellItem(basket , "lighter" , 22) ;
        sellItem(basket , "lighter" , 45);
        sellItem(basket , "dish wash" , 12);

        System.out.println(basket);

        System.out.println("\n" + stockList);


    }

    private static void sellItem(Basket bucket , String itemName ,int quantity){

        StockItem item = stockList.get(itemName);

        if(item != null){

            if(stockList.sellStock(itemName , quantity)){

                bucket.addToBasket(item , quantity);
            }else{
                System.out.println("Not enough '" + itemName +"' in the Stock.");
            }
        }else{
            System.out.println("Item doesn't exist in the stock");
        }



    }
}
