package challenge27;

import java.util.Scanner;

public class challenge27_Main {
    private static MobilePhone contact = new MobilePhone();
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args){
        boolean exit = false;

        while(!exit){
            System.out.println("\nOptions : ");
            System.out.println("1. Print Contact List");
            System.out.println("2. Add New Contact");
            System.out.println("3. Update Existing Contact");
            System.out.println("4. Remove Contact");
            System.out.println("5. Search Contact");
            System.out.println("6. Quit");

            System.out.print("\nEnter your choice : ");
            int choice =  cin.nextInt();
            cin.nextLine();

            switch (choice){
                case 1 :
                    contact.printContacts();
                    break;

                case 2 :

                    addNewContact();
                    break;

                case 3 :

                    updateContact();
                    break;

                case 4 :
                    removeContact();
                    break;

                case 5 :
                    searchContact();
                    break;

                case 6 :
                    exit = true;
            }
        }
    }

    public static void addNewContact(){

        System.out.print("\nEnter the name : ");
        String name = cin.nextLine();
        System.out.print("Enter the number : ");
        String number = cin.nextLine();

        contact.addNameAndNumber(name.strip().toLowerCase(),number.toLowerCase());
    }

    private static void updateContact(){
        System.out.print("\nEnter the name of the contact you want to edit : ");
        String name = cin.nextLine();

        System.out.print("Enter the new number : ");
        String number = cin.nextLine();

        contact.editContact(name.strip().toLowerCase(),number.strip().toLowerCase());
    }

    private static void removeContact(){
        System.out.print("\nEnter the name or number you want to delete : ");
        String element = cin.nextLine();

        contact.removeContact(element.strip().toLowerCase());
    }

    private static void searchContact(){

        System.out.print("\nEnter the name or number you want to search : ");
        String element = cin.nextLine();

        contact.getQuery(element.strip().toLowerCase());
    }

}
