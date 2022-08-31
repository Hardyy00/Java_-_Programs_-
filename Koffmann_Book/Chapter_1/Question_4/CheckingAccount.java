package question4.com.hardik;

public class CheckingAccount extends Account{

    public CheckingAccount(Customer customer, long accountNumber) {
        super(customer, accountNumber);
    }

    private void addTransaction(Transaction transaction){

        if(super.getIncrementer() < 20){
            super.reallocate();
        }

        super.transactions[getIncrementer()] = transaction;
        setIncrementer();
    }

    public void depositMoney(double money){
        addTransaction(new Transaction(money));
        System.out.println("Money Deposited Successfully !");
    }

    public void withdrawMoney(double money){
        addTransaction(new Transaction(-money));
        System.out.println("Money withdrawn Successfully !");
    }

    public void addInterest(double interest){

        double balance = getBalance();
        setBalance(balance - (balance*0.06));
        System.out.println("Interest Added Successfully");

    }
}
