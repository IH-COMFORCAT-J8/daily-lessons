package org.example;

import java.util.*;

public class Book {

    private long isbn;
    private String name;
    private String author;
    private int yearPublished;

    public Book(long isbn, String name, String author, int yearPublished) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getIsbn() == book.getIsbn() && getYearPublished() == book.getYearPublished() && Objects.equals(getName(), book.getName()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn(), getName(), getAuthor(), getYearPublished());
    }
}
