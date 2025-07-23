package IteratorDesignPattern;

import java.util.List;

///Concrete aggregator
public class Library implements AggregatorInterface {
    private List<Book> books;

    Library(List<Book> ll) {
        this.books = ll;
    }

    @Override
    public IteratorInterface createIterator(){
        return new ConcreteIterator(books);
    }
}
