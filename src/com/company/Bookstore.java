package com.company;

import java.util.List;

public class Bookstore {
    private List <Book> books;

    public double sell(Book b){
        int a=b.getNumAvailable();
        b.setNumAvailable();
    }
}
