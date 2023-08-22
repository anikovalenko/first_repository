package org.example.java.big_library;

class Librarian extends Person {
    Library currentWorkplace;
    private static int index = 0;

    public Librarian(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber, "librarian");
    }

    void addBook(String author, String title) {
        currentWorkplace.books[index++] = new Book (author, title);
    }
}
