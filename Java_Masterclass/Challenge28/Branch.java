package challenge28;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> branch ;

    public Branch(String branchName){

        this.branchName = branchName;
    }

    public void addCustomer(String name , double transaction){

        Customer customer = Customer.makeContact(name , transaction);

        if(branch == null){

            branch = new ArrayList<>();
            branch.add(customer);
            System.out.println("\nNew Customer added.");

        }else if(doesExist(customer.getName())){

            System.out.println("\nCustomer already exist.");

        }else {

            branch.add(customer);
            System.out.println("\nNew Customer added.");
        }

    }

    public void getBranchInfo(){

        System.out.println("\nBranch name : " + getBranchName());
        if(branch == null) {

            System.out.println("\nThe Branch has no customers");

        }else {

            for (int i = 0; i < branch.size(); i++) {
                Customer customer = branch.get(i);

                System.out.print("\n" + (i+1));

                customer.viewCustomer();
            }
        }

    }

    public boolean addTransaction(String name , double transaction){

        if(branch == null || !doesExist(name)){
            System.out.println("\nCustomer does not Exist.");
            return false;
        }

        int position = findCustomer(name);
        branch.get(position).addTransaction(transaction);

        System.out.println("\nNew Transaction added for Mr. " + name);
        return true;
    }

    public String getBranchName(){
        return branchName;
    }

    public ArrayList<Customer> getBranch() {
        return branch;
    }

    private boolean doesExist(String customerName){

        for(int i=0;i<branch.size();i++){
            if(branch.get(i).getName().toLowerCase().equals(customerName.toLowerCase())){
                return true;
            }
        }

        return false;
    }

    public int findCustomer(String name){

        for(int i=0; i<branch.size(); i++){
            if(branch.get(i).getName().toLowerCase().equals(name.toLowerCase())){
                return i;
            }
        }

        return -1;
    }


}
