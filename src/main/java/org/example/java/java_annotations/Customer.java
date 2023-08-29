package org.example.java.java_annotations;

public class Customer {

    @MaxLength
    String name;
    @MaxLength
    String surname;

    Customer(String name, String surname) throws IllegalAccessException {
        Validator validator = new Validator();
//         do validation without an annotation. you have to call the method
//         each time which makes the code not organized
//        validator.validate(name);
        this.name = name;
//        validator.validate(surname);
        this.surname = surname;
        validator.validateByAnnotation(this);

    }
}
