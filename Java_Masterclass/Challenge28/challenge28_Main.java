package challenge28;

import java.util.*;

public class challenge28_Main {

    private static Bank bank = new Bank();
    private static Scanner cin = new Scanner(System.in);
    public static void main(String[] args){


        System.out.println("\nWelcome to The Bank Application :");

        System.out.println("\nMenu :");
        menu();


        boolean quit = false;

        while(!quit){

            System.out.print("\nEnter a choice : ");
            int choice = cin.nextInt();

            switch (choice){
                case 1 :
                    getBankInfo();
                    break;
                case 2 :
                    getBranchInfo();
                    break;
                case 3 :
                    getCustomerInfo();
                    break;
                case 4 :
                    addBank();
                    break;
                case 5 :
                    addBranch();
                    break;
                case 6 :
                    addCustomer();
                    break;
                case 7 :
                    addCustomerTransaction();
                    break;
                case 8 :
                    menu();
                    break;
                case 9 :
                    quit = true;
            }

        }
    }

    public static void menu(){

        System.out.println("\n1.Bank Info" +
                            "\n2. Branch Info" +
                            "\n3. Customer Info" +
                            "\n4. Add Bank" +
                            "\n5. Add Branch" +
                            "\n6. Add Customer" +
                            "\n7. Add Customer Transaction" +
                            "\n8. Show the menu" +
                            "\n9. Quit");

    }

    private static void addBank(){

        cin.nextLine();

        System.out.print("\nEnter the bank name : ");
        String bankName = cin.nextLine();

        bank.setName(bankName);

        System.out.println("\nBank created Successfully.");

    }

    private static void addBranch(){

        cin.nextLine();

        System.out.print("\nEnter the branch name : ");
        String branchName = cin.nextLine();

        boolean ans = bank.addBranch(branchName);

        String ret = ans ? "\nBranch created Successfully." : "\nError while creating the branch.";

        System.out.println(ret);
    }

    private static void addCustomer(){

        cin.nextLine();

        System.out.print("\nEnter the branch Name : ");
        String branchName = cin.nextLine();

        System.out.println("Enter the customer name and his first transaction : ");
        System.out.print("Name : ");
        String customerName = cin.nextLine();
        System.out.print("First Transaction : ");
        double firstTransaction = cin.nextDouble();

        cin.nextLine();

        boolean ans = bank.addCustomer(branchName,customerName,firstTransaction);

        String out = ans ? "\nCustomer Successfully added in " + branchName +
                            " branch" : "\nBranch doesn't exist.";

        System.out.println(out);

    }

    private static void addCustomerTransaction(){

        cin.nextLine();

        System.out.print("\nEnter the branch Name : ");
        String branchName = cin.nextLine();

        System.out.println("Enter the customer name and his new transaction : ");
        System.out.print("Name : ");
        String customerName = cin.nextLine();
        System.out.print("New Transaction : ");
        double newTransaction = cin.nextDouble();

        cin.nextLine();

        bank.addCustomerTransaction(branchName,customerName,newTransaction);
    }

    private static void getBankInfo(){
        bank.getBankInfo();
    }

    private static void getBranchInfo(){

        cin.nextLine();

        System.out.print("\nEnter the branch name : ");
        String branchName = cin.nextLine();

        bank.getBranchCustomers(branchName);
    }

    private static void getCustomerInfo(){


        cin.nextLine();
        System.out.print("\nEnter the branch name : ");
        String branchName = cin.nextLine();

        System.out.print("Enter the customer name : ");
        String customerName = cin.nextLine();

        bank.getCustomerInfo(branchName , customerName);
    }
}
