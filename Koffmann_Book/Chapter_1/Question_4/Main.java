package question4.com.hardik;

public class Main {
    public static void main(String[] args) {

        SavingAccount account = new SavingAccount(new Customer("Harik Gaur") ,12345);
        account.depositMoney(123);
        account.withdrawMoney(23);
        account.addInterest(6);
        System.out.println(account);

        CheckingAccount account1 = new CheckingAccount(new Customer("Priya") , 67890);

        for(int i=1;i<=26; i++){
            account1.depositMoney(1);
        }



        account1.getBalance();
        System.out.println(account1);


    }
}
