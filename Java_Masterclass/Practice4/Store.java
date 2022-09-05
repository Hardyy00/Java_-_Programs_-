package practice4.com.hardik;

public class Store {

    private static StockList stockList =     new StockList("Necessary Things");

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

        temp = new StockItem("dildo" , 6.77 , 42);
        stockList.addStock(temp);

        temp = new StockItem("pussy eater" , 3.24 , 34);
        stockList.addStock(temp);

        temp = new StockItem("scrubber" , 1.79 , 77);
        stockList.addStock(temp);

        System.out.println(stockList);
        System.out.println();

        Basket basket = new Basket("Important things");
        sellItem(basket , "scrubber" , 2) ;
        sellItem(basket , "toy car" , 4) ;
        sellItem(basket , "pussy eater" , 10) ;
        sellItem(basket , "lighter" , 22) ;

        System.out.println(basket);

        System.out.println("\n" + stockList);


    }

    private static void sellItem(Basket bucket , String itemName ,int quantity){

        StockItem item = stockList.get(itemName);

        if(item != null){

            if(stockList.sellStock(itemName , quantity)){

                bucket.addToBasket(item , quantity);
            }
        }else{
            System.out.println("Item didn't added");
        }


    }
}
