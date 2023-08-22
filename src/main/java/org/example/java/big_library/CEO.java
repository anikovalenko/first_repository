package org.example.java.big_library;

public class CEO extends Person {

    Library currentWorkplace;
    private static int librariansIndex;
    private static int cleanersIndex;

    public CEO(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber, "CEO");
    }

    void admitEmployee(String name, int age, String phoneNumber, String positionTitle) {
        switch (positionTitle) {
            case "librarian":
                currentWorkplace.librarians[librariansIndex++] = new Librarian(name, age, phoneNumber);
                break;
            case "cleaner":
                currentWorkplace.cleaners[cleanersIndex++] = new Cleaner(name, age, phoneNumber);
                break;
        }
    }

    void fireEmployee(String name, String positionTitle){

    }
}
