package org.example;

import org.example.models.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private LibraryItem item;
    private List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {

        items.add(item);
    }

    public void listAllItems() {
        for (LibraryItem item : items) {
            System.out.println(item);
        }

    }

    public String searchByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return item.toString();
            }
        }
        return "Item not found";
    }

    public String searchByAuthor(String author){
        List<String> matchingItems = new ArrayList<>();
        for (LibraryItem item : items){
            if (item.getAuthor().toLowerCase().contains(author.toLowerCase())){
                matchingItems.add(item.toString());
            }
        }
        if (!matchingItems.isEmpty()) {
            return String.join("\n",matchingItems);
        } else {
            return "Author not found";
        }
    }






















}

