// For this challenge VipCustomer class has been created by me.

public class challenge19_half_part {
    public static void main(String[] args){
        VipCustomer oldCustomer = new VipCustomer("Hardik Gaur","hardikgaur8901@gmail.com");

        System.out.println(oldCustomer.getCustomerName());
        System.out.println(oldCustomer.getCreditLimit());
        System.out.println(oldCustomer.getEmailAddress());
        
        VipCustomer newCustomer = new VipCustomer();

        System.out.println(newCustomer.getCustomerName());
        System.out.println(newCustomer.getCreditLimit());
        System.out.println(newCustomer.getEmailAddress());
        
        VipCustomer regularCustomer = new VipCustomer("Shakira",1000000,"shakira@gmail.com");

        System.out.println(regularCustomer.getCustomerName());
        System.out.println(regularCustomer.getCreditLimit());
        System.out.println(regularCustomer.getEmailAddress());
    }
}
