
public class challenge18_half_part {
    public static void  main(String[] args){
        BankAccount customer = new BankAccount();

        customer.setAccountNumber(2115000424);
        customer.setBalance(9999);
        customer.setCustomerName("Hardik Gaur");
        customer.setEmailID("hardikgaur8901@gmail.com");
        customer.setPhoneNumber(7906372967L);

        System.out.println(customer.getAccountNumber());
        System.out.println(customer.getBalance());
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getEmailID());
        System.out.println(customer.getPhoneNumber());

        System.out.println();

        customer.fundDeposit(1);

        System.out.println();

        customer.fundWithdraw(5000);

        System.out.println();

        customer.fundWithdraw(5001);

    }

}
