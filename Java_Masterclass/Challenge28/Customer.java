package challenge28;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions ;

    public Customer(String name , double firstTransaction){

        this.name = name;
        transactions = new ArrayList<Double>();
        transactions.add(firstTransaction);
    }


    public static Customer makeContact(String name , double firstTransaction){
        return new Customer(name , firstTransaction);
    }

    public void viewCustomer(){

        System.out.println("\nName : " + name);

        System.out.println("\nTransactions : ");

        for(int i=0;i<transactions.size(); i++) {
            if (transactions.get(i) < 0) {
                System.out.println(transactions.get(i));

            }else {
                System.out.println("+" + transactions.get(i));
            }
        }

        System.out.println("\nTotal Balance = " + getCustomerBalance());
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
    }

    public String getName(){
        return name;
    }

    public ArrayList<Double> getTransactions(){
        return  transactions;
    }

    public double getCustomerBalance(){

        double sum = 0.0d ;

        for (int i=0;i<transactions.size(); i++){
            sum += transactions.get(i);
        }

        return sum;
    }

}
