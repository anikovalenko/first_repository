package org.example.java.java_oop.library;

import java.util.List;

public class Run {

    public static void main(String[] args) {
        CEO ceoAlfred = new CEO("Alfred");
        Business certainBusiness = ceoAlfred.openBusiness("Marzayin Library");
        List<Librarian> workers = ceoAlfred.hireStaff();
        for (Librarian librarian : workers) {
            if (!librarian.isBusy) {
                librarian.addBook("H.Tumanyan", "Anush", 544610055);
                librarian.addBook("H.Tumanyan", "Tmbkaberdi Arum", 544611155);
                librarian.addBook("H.Tumanyan", "Heqiatner", 544610005);
                break;
            }
        }
        if (certainBusiness instanceof Library library) {
            for (Book book : library.getBooks()) {
                System.out.println(book);
            }
        }
    }
}
