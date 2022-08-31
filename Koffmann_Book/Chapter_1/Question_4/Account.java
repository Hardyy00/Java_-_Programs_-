package question4.com.hardik;

import java.util.Arrays;

public class Account {
    private Customer customer;
    private double balance;
    private long accountNumber;
    Transaction[] transactions;

    private int incrementer = 0;

    public Account(Customer customer , long accountNumber){
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.balance = 0.0d;
        transactions = new Transaction[20];
    }

    public int getIncrementer() {
        return incrementer;
    }

    public void setIncrementer() {
        this.incrementer += 1;
    }

    @Override
    public String toString(){
        return customer.toString()
                +"\nAccount Number - " + accountNumber
                +"\nBalance - $" + balance;
    }



    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void reallocate(){
        transactions = Arrays.copyOf(transactions , 2*transactions.length);
    }

    public double getBalance(){

        double balance  = 0.0d;


        for(Transaction transaction : transactions) {

            if (transaction == null) {
                break;
            }

            balance += transaction.getTransaction();


        }



        this.balance = balance;
        return balance;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
