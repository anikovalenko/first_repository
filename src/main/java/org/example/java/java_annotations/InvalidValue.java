package org.example.java.java_annotations;

public class InvalidValue extends RuntimeException{

    @Override
    public String getMessage() {
        return "Please input a valid value \nFor Example: Nazuk Geriovna";
    }
}
