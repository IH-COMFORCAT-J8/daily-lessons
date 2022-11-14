package com.ironhack;

import java.util.*;

public class Author {
    private String name;
    private String lastName;
    private List<Book> publishedBooks;

    public Author(String name, String lastName, List<Book> publishedBooks) {
        this.name = name;
        this.lastName = lastName;
        this.publishedBooks = publishedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Book> getPublishedBooks() {
        return publishedBooks;
    }

    public void setPublishedBooks(List<Book> publishedBooks) {
        this.publishedBooks = publishedBooks;
    }
}
