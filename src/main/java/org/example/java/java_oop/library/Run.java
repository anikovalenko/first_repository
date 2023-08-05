package org.example.java.java_oop.library;

import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        Librarian susanTota = new Librarian();
        Librarian aniTota = new Librarian();
        Librarian ruzanTota = new Librarian();
        Librarian vardushTota = new Librarian();
        List<Librarian> workers = new ArrayList<>();
        workers.add(susanTota);
        workers.add(aniTota);
        workers.add(ruzanTota);
        workers.add(vardushTota);

        Library marzayinLibrary = new Library();
        marzayinLibrary.addBook(new Book("H. Tumanyan", "Anush", 7565196));
        marzayinLibrary.setWorkers(workers);
    }
}
