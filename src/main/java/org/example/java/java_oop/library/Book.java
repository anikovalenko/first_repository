package org.example.java.java_oop.library;

public class Book {
    private final String author;
    private final String title;
    private final int isbn;


    Book(String author, String title, int isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }



    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}
