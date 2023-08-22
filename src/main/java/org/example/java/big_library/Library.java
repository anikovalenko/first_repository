package org.example.java.big_library;


class Library {
    Librarian[] librarians;
    Cleaner[] cleaners;
    Book[] books;
    CEO ceo;

    Library() {
        librarians = new Librarian[10];
        cleaners = new Cleaner[10];
        books = new Book[10];
    }
}
