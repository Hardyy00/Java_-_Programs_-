package Challenge30;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Hardik" ,999,1000);
        System.out.println(player1);
        saveObject(player1);
        System.out.println();

        loadObject(player1);
        System.out.println(player1);

        Monster elve1 = new Monster("Elves" , 88 , 100);
        saveObject(elve1);
        System.out.println(elve1);
    }

    public static List<String> readValues(){

        ArrayList<String> values = new ArrayList<>();
        Scanner cin = new Scanner(System.in);

        System.out.println("\nChoices : ");
        System.out.println("\n1. Enter the value." +
                            "\n2. Exit");

        boolean quit = false;
        int index = 0;

        while (!quit){

            System.out.print("Enter your choice : ");
            int choice = cin.nextInt();
            cin.nextLine();

            switch (choice){
                case 1 :
                    System.out.print("Enter the value : ");
                    String value = cin.nextLine();

                    values.add(index , value);
                    index++;
                    break;

                case 2 :
                    quit = true;
                    break;
            }

        }

        return values;
    }

    public static void saveObject(ISaveable object){

        for(String value : object.write() ){
            System.out.println("Saving the value " + value + " to the device");
        }
    }

    public static void loadObject(ISaveable object){

        List<String> values = readValues();

        object.read(values);
    }
}
