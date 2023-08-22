package org.example.java.java_oop.library;

import java.util.ArrayList;
import java.util.List;

public class CEO {
    private final String name;
    private Library library;


    CEO(String name) {
        this.name = name;
    }

    Library openBusiness(String businessTitle) {
        library = new Library(businessTitle, this);
        return library;
    }

    List<Librarian> hireStaff() {
        List<Librarian> workers = new ArrayList<>();
        Librarian susanTota = new Librarian(library);
        Librarian aniTota = new Librarian(library);
        Librarian ruzanTota = new Librarian(library);
        Librarian vardushTota = new Librarian(library);
        workers.add(susanTota);
        workers.add(aniTota);
        workers.add(ruzanTota);
        workers.add(vardushTota);
        return workers;
    }

}
