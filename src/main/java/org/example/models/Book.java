package org.example.models;

import org.example.Borrowable;

public class Book extends LibraryItem implements Borrowable {
    private int pageNumber;
    private String genre;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Book() {
    }

    public Book(String title, String author, int year, int pageNumber, String genre) {
        super(title, author, year);
        this.pageNumber = pageNumber;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + getTitle()+ ", author=" + getAuthor()+ ", year=" +getYear()+
                ", pageNumber=" + pageNumber +
                ", genre='" + genre + '\'' +
                "} " ;
    }

    @Override
    public void returnItem() {


    }

    @Override
    public void checkout() {

    }
}
