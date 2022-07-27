package Challenge32;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        MyLinkedList list = new MyLinkedList();

//        String stringValues = cin.nextLine();
//        System.out.println("Enter the values :");
//        String[] values = stringValues.split(" ");
//        for(String s : values){
//            list.addItem(new Node(s));
//        }


        list.addItem(new Node("7"));
        list.addItem(new Node("3"));
        list.addItem(new Node("9"));
        list.addItem(new Node("2"));
        list.addItem(new Node("8"));
        list.addItem(new Node("1"));
        list.addItem(new Node("4"));
        list.addItem(new Node("3"));
        list.addItem(new Node("5"));
        list.addItem(new Node("5"));


        list.traverse();

    }
}
