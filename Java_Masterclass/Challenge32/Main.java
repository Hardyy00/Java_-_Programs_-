package Challenge32;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        MyLinkedList list = new MyLinkedList();



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

        System.out.println("\nAfter deleting : ");
        list.remove(new Node("4"));

        list.traverse();

        System.out.println("\nAfter deleting : ");
        list.remove(new Node("3"));
        list.remove(new Node("8"));

        list.traverse();

        System.out.println("\nAfter deleting : ");
        list.remove(new Node("1"));
        list.remove(new Node("9"));

        list.traverse();


        list.remove(new Node("5"));

        if(list.getRoot() != null){
            System.out.println("After deleting : ");
        }
        list.traverse();

        MyLinkedList secondList = new MyLinkedList();

        System.out.println("\nNew List Processing...");

        System.out.println("\nEnter certain items : ");
        String[] data = cin.nextLine().split(" ");

        for(String s : data){
            secondList.addItem(new Node(s));
        }


        System.out.println("New List : ");
        secondList.traverse();

        cin.close();
    }
}
