package IteratorDesignPattern;

import java.util.Arrays;
import java.util.List;

public class Main { 
    public static void main(String args[]) {
        List<Book> bookList = Arrays.asList(
                new Book(100, "GK"),
                new Book(200, "Science"),
                new Book(300, "Maths"));

        Library library = new Library(bookList);
        IteratorInterface itr = library.createIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }
    }
}
