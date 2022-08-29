import java.io.*;
import java.util.*;

abstract class Book {

    String title;

    public Book(String title) {
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }
}

class Novel extends Book {

    public Novel(String title) {
        super(title);
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        String title = cin.nextLine();

        Novel book = new Novel(title);

        System.out.println("The title is: " + book.getTitle());
    }
}
