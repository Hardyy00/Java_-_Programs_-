// Made for challenge 19
public class VipCustomer {
    private String customerName;
    private long creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("Unknown",1000,"xx@yy.com");

    }

    public VipCustomer(String customerName,String emailAddress){
        this(customerName,1000,emailAddress);
    }

    public VipCustomer(String customerName,long creditLimit,String emailAddress){
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
