package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Bookstore extends Book{
    private final List <Book> books;
    DecimalFormat df = new DecimalFormat("####0.00");

    public Bookstore(List<Book> books) {
        this.books = books;
    }

    public void sell(Book book){
        int a;

        if(book.getNumAvailable()!=0){
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " was sold for " + df.format(book.getPrice()));
        }
        else System.out.println("Not available");

        a = book.getNumAvailable();
        book.setNumAvailable(--a);
    }

    public List<Book> getBooks() {
        return books;
    }

}
