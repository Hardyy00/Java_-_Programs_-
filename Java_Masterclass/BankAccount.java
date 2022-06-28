public class BankAccount {
    private long accountNumber;
    private long balance;
    private String customerName;
    private String emailID;
    private long phoneNumber;

    public long getAccountNumber(){
        return accountNumber;
    }

    public long getBalance(){
        return balance;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getEmailID(){
        return emailID;
    }

    public long getPhoneNumber(){
        return phoneNumber;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(long balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmailID(String emailID){
        this.emailID = emailID;
    }

    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void fundDeposit(long amount){
        balance += amount;
        System.out.println("Credited Amount Rs " + amount + " to account number " + accountNumber);
        System.out.println("Total Balance : " + balance);
    }

    public void fundWithdraw(long amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Debited Amount Rs " + amount + " from account number "  +  accountNumber);
            System.out.println("Remaining Balance : " +balance);
        }else{
            System.out.println("Insuffucient Balance.Cannot Debit the amount.");
        }
    }

}
