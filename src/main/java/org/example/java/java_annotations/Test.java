package org.example.java.java_annotations;

import org.example.java.java_annotations.Customer;

public class Test {

    public static void main(String[] args) throws IllegalAccessException {
        Customer customer = new Customer("Yeghiaaaaaaaaaaaaaaaaaaa", "Ansuryan");
        System.out.println(customer.name + " " + customer.surname);
    }
}
