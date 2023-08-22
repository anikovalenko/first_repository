package org.example.java.big_library;

public class Test {
    public static void main(String[] args) {
        Owner yeghia = new Owner("Yeghia", 29, "+37477994477");
        yeghia.openBusiness();
        yeghia.hireCEO("Ani", 26,"+37495028355");
        System.out.println(yeghia);
    }
}
