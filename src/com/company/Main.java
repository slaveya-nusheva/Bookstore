package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int numberBooks = sc.nextInt();

        for (int i=0;i<numberBooks;i++) {
            Book b;
            System.out.println("Enter book details: <book type-COMICS/CHILD_BOOK/BOOK> <title> <author> <number of copies> <price>");
            BookType type = BookType.valueOf(sc.next().toUpperCase());
            switch (type) {
                case COMICS:
                    b = new ComicBook();
                    break;
                case CHILD_BOOK:
                    b = new ChildBook();
                    break;
                case BOOK:
                    b = new Book();
                    break;
                default: b = new Book();
            }
            b.setType(type);
            b.setTitle(sc.next());
            Author author=new Author();
            author.setName(sc.next());
            b.setAuthor(author);
            b.setNumAvailable(sc.nextInt());
            b.setPrice(sc.nextDouble());
            books.add(b);

            Bookstore bookstore = new Bookstore(books);
            if(i%2==1){
                bookstore.sell(b);
            }
        }

        sc.close();
    }
}
