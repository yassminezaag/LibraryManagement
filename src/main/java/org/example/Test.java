package org.example;

import org.example.models.Book;
import org.example.models.DVD;
import org.example.models.LibraryItem;

public class Test {
    public static void main(String[] args) {


        LibraryItem item1 = new LibraryItem("Candide","Voltaire",1947);
        Book book1 = new Book("Les Misérables","Victor Hugo",1862,320,"Roman");
        Book book2 = new Book("Les Misérables","Victor Hugo",1862,1492,"Roman");
        Book book3 = new Book("Adolphe","Benjamin",1816,292,"Roman");
        Book book4 = new Book("Madame Bovary","Gustave",1957,329,"Roman");
        Book book5 = new Book("The Hunchback of Notre-Dame","Victor Hugo",1831,480,"Roman");
        Book book6 = new Book("William Shakespeare","Victor Hugo",1864,500,"Roman");
        Book book7 = new Book("Ninety-Three","Victor Hugo",1874,360,"Roman");
        DVD dvd1 = new DVD("Je t'aime","Lara Fabian",1996,4.55,"Vicent Soyez");





        Library library = new Library();



        library.addItem(item1);
        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);
        library.addItem(book4);
        library.addItem(book5);
        library.addItem(book6);
        library.addItem(book7);
        library.addItem(dvd1);

     //   library.listAllItems();

        String searchByTitleResult = library.searchByTitle("madame bovary");
       // System.out.println(searchByTitleResult);

        String searchByAuthorResult = library.searchByAuthor("victor");
        //System.out.println(searchByAuthorResult);

        //System.out.println(dvd1.toString());
        //dvd1.play();
        //dvd1.stop();
        String searchDVDResult = library.searchByTitle("je t'aime");
       // System.out.println(searchDVDResult);

        //System.out.println(book1.toString());

        String searchBookResult = library.searchByAuthor("Victor ");
        System.out.println(searchBookResult);









    }
}