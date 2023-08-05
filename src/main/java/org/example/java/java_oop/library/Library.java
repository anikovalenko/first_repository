package org.example.java.java_oop.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;
    List<Librarian> workers;

    Library() {
        books = new ArrayList<>();
        workers = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Librarian> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Librarian> workers) {
        this.workers = workers;
    }

    public void addBook(Book book) {
        books.add(book);
    }
}
