package org.example.models;

import org.example.Borrowable;
import org.example.Playable;

public class DVD extends LibraryItem implements Borrowable, Playable {
    private double duration;
    private String director;


    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }



    public DVD(String title, String author, int year, double duration, String director) {
        super(title, author, year);
        this.duration = duration;
        this.director = director;
    }

    @Override
    public String toString() {
        return "DVD{" + "title=" + getTitle()+ ", author=" + getAuthor()+ ", year=" +getYear()+
                ", duration=" + duration +
                ", director='" + director + '\'' +
                "} " ;
    }

    @Override
    public void returnItem() {

    }

    @Override
    public void checkout() {

    }

    @Override
    public void play() {
        System.out.println("DVD :"+"'"+getTitle()+"'"+" is playing");

    }

    @Override
    public void stop() {
        System.out.println("DVD :"+"'"+getTitle()+"'"+ " is stopped");

    }
}
