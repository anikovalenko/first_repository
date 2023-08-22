package org.example.java.java_oop.library;

import java.util.ArrayList;
import java.util.List;

public class Library extends Business{
    private String title;
    private final CEO ceo;
    private List<Book> books;
    private List<Worker> workers;

    Library(String title, CEO ceo) {
        this.ceo = ceo;
        this.title = title;
        books = new ArrayList<>();
        workers = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Worker> getWorkers() {
        return workers;
    }


    public void addBook(Book book) {
        books.add(book);
    }

    public CEO getCeo() {
        return ceo;
    }

    public String getTitle() {
        return title;
    }
}
