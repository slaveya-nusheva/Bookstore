package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book book;
        System.out.println("Enter book details: <title> <author> <book type-COMICS/CHILD_BOOK/REGULAR> <number of copies> <price>");
        BookType type = BookType.valueOf(sc.next().toUpperCase());
        switch (type){
            case COMICS: book = new Comics(); break;
            case CHILD_BOOK: book = new ChildBook(); break;
            case REGULAR: book = new Book(); break;
        }
        book.setTitle(sc.next());
        book.setAuthor(sc.next());
        book.setType(type);
        book.setNumAvailable(sc.nextInt());
        book.setPrice(sc.nextDouble());

        sc.close();
    }
}
