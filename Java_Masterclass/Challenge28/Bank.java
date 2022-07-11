package challenge28;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;


    public boolean addCustomer(String branchName , String customerName, double transaction){

        if(branches == null){
            System.out.println("\nThe Bank has no Branches");

        }else if(doesBranchExist(branchName)){

            int position = getPosition(branchName);
            branches.get(position).addCustomer(customerName,transaction);

            return true;
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public boolean addBranch(String branch){

        if(branches == null ){

            branches = new ArrayList<Branch>();

            branches.add(new Branch(branch));

            return true;

        }else if(!doesBranchExist(branch)){

            branches.add(new Branch(branch));
            return true;
        }

        System.out.println("\nBranch already Exist.");
        return false;
    }


    public void getBankInfo(){

        System.out.println("\nBank name : " + getName());

        if(branches == null){

            System.out.println("\nThe Bank has no Branches.");

        }else{

            System.out.println("\nBranches : ");

            for(int i=0;i<branches.size();i++){
                System.out.println((i+1) + ". " + branches.get(i).getBranchName());
            }
        }
    }



    public void getBranchCustomers(String name){

        if(branches == null){

            System.out.println("\nNo Such Branch Exist");

        }else if(!doesBranchExist(name)){

            System.out.println("\nNo Such Branch Exist.");

        }else{

            int position = getPosition(name);

            branches.get(position).getBranchInfo();
        }

    }

    public void getCustomerInfo(String branchName ,String customerName){

        if(branches == null){

            System.out.println("\nNo such Branch Exist.");

        }else if(doesBranchExist(branchName)){

            int position = getPosition(branchName);
            Branch branch = branches.get(position);

            int customerPosition = branch.findCustomer(customerName);

            if(branch.getBranch() == null){
                System.out.println("\nCustomer does not exist.");
            }else if(customerPosition != -1){
                branch.getBranch().get(customerPosition).viewCustomer();
            }else{
                System.out.println("\nCustomer does not exist");
            }

        }else{
            System.out.println("\nBranch doesn't exist.");
        }

    }

    public boolean addCustomerTransaction(String branchName , String customerName , double amount){

        if(doesBranchExist(branchName)){
            Branch branch = branches.get(getPosition(branchName));

            return branch.addTransaction(customerName,amount);
        }

        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean doesBranchExist(String branch){

        for(int i=0; i<branches.size() ; i++){
            if(branches.get(i).getBranchName().toLowerCase().equals(branch.toLowerCase())){
                return true;
            }
        }
        return false;
    }

    private int getPosition(String name){

        for(int i=0;i<branches.size(); i++){
            if(branches.get(i).getBranchName().toLowerCase().equals(name.toLowerCase())){
                return i;
            }
        }

        return -1;
    }

}
