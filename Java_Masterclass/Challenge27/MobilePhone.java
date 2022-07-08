package challenge27;


import java.util.ArrayList;
import java.util.Locale;

public class MobilePhone {

    private ArrayList<String> mobileNumber = new ArrayList<>();
    private ArrayList<String> contactName = new ArrayList<>();

    public void printContacts(){
        if(mobileNumber.isEmpty()){
            System.out.println("\nDirectory is Empty.");
        }else{

            for(int i=0; i<contactName.size(); i++){

                String name = contactName.get(i);
                System.out.println("\n" + (i+1) + ". Name : " + (name.substring(0,1).toUpperCase() + name.substring(1)));
                System.out.println("   Mobile Number : " + mobileNumber.get(i));

            }
        }
    }
    public void addNameAndNumber(String name,String number){

            boolean exist = doesExist(name);

            if (!exist) {

                contactName.add(name);
                mobileNumber.add(number);
                System.out.println("\nContact has been added.");

            } else {
                System.out.println("\nContact is already Present in the directory.");
            }

    }

    public void editContact(String name, String number){

        int index = contactName.indexOf(name);

        if(index >= 0) {

            mobileNumber.set(index, number);
            System.out.println("\nNumber has been edited.");

        }else{
            System.out.println("\nContact doesn't exist.");
        }
    }

    public void removeContact(String element){

        int position = getPosition(element);

        if(position>=0) {

            mobileNumber.remove(position);
            contactName.remove(position);

            System.out.println("\nContact has been deleted.");

        }else{
            System.out.println("\nContact doesn't exist.");
        }
    }

    public void getQuery(String element){

        int poistion = getPosition(element);

        if(poistion >= 0){

            String name = contactName.get(poistion);
            System.out.println("\nName : " + (name.substring(0,1).toUpperCase() + name.substring(1)));
            System.out.println("Mobile Number : " + mobileNumber.get(poistion));

        }else{
            System.out.println("\nContact doesn't exist.");
        }


    }

    private boolean doesExist(String name){

        for(int i=0 ; i<contactName.size();i++){
            if(name.equals(contactName.get(i))){
                return true;
            }
        }
        return false;
    }

    private int getPosition(String element){

        boolean areDigits = digitChecker(element);
        if(areDigits){
            return mobileNumber.indexOf(element);
        }

        return contactName.indexOf(element);
    }
    private boolean digitChecker(String element){
        for(int i=0;i<element.length();i++){

            int ch = element.charAt(i);

            if(ch < 48 || ch > 57){
                return false;
            }
        }
        return  true;
    }

}