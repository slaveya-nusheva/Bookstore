package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bookstore extends Book{
    private List <Book> books = new ArrayList<>();

    public double sell(Book book){
       return super.getNumAvailable();
    }
}
