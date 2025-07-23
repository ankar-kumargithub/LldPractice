package IteratorDesignPattern;

public class Book {
    private String bookName;
    private int bookPrice;

    Book(int price, String name){
        this.bookName = name;
        this.bookPrice = price;
    }

    public int getBookPrice(){
        return this.bookPrice;
    }

    public String getBookName(){
        return this.bookName;
    }

    @Override
    public String toString(){
        return "BookName: " + this.bookName + " BookPrice: " + this.bookPrice;
    }
}
