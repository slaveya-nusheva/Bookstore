package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bookstore extends Book{
    private List <Book> books = new ArrayList<>();

    public void sell(Book book){
        int a;

        if(book.getNumAvailable()!=0){
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " was sold for " + book.getPrice());
        }
        else System.out.println("Not available");

        a = book.getNumAvailable();
        book.setNumAvailable(a--);
    }
}
