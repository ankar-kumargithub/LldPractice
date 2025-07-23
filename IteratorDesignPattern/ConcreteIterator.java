package IteratorDesignPattern;

import java.util.List;

public class ConcreteIterator implements IteratorInterface {
    List<Book> books;
    int idx = 0;

    ConcreteIterator(List<Book> bookList) {
        this.books = bookList;
    }

    @Override
    public Boolean hasNext(){
        return idx < books.size();
    }

    @Override
    public Object next(){
        if(this.hasNext()){
            return this.books.get(idx++);
        }
        return null;
    }
}
