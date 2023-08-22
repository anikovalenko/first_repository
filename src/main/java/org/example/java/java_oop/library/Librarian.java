package org.example.java.java_oop.library;

import java.util.List;

public class Librarian extends Worker {
    boolean isBusy = false;
    Library currentWorkplace;

    Librarian(Library certainLibrary) {
        currentWorkplace = certainLibrary;
    }

    void addBook(String author, String title, int isbn) {
        List<Book> books = currentWorkplace.getBooks();
        books.add(new Book(author, title, isbn));
        isBusy = true;
    }
}
