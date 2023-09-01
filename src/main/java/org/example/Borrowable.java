package org.example;

import org.example.models.LibraryItem;

public interface Borrowable {

    public default void returnItem(){}
    public default void checkout(){}
}
