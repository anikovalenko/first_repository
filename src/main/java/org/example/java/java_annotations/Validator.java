package org.example.java.java_annotations;

import org.example.java.java_annotations.Customer;
import org.example.java.java_annotations.InvalidValue;
import org.example.java.java_annotations.MaxLength;

import java.lang.reflect.Field;

public class Validator {

//    void validate(String field){
//        if(field.length() > 21){
//            throw new InvalidValue();
//        }
//    }


    void validateByAnnotation(Object obj) throws IllegalAccessException {
        if(obj instanceof Customer){
            Customer customer = (Customer) obj;
            for (Field field : customer.getClass().getDeclaredFields()) {
                if(field.isAnnotationPresent(MaxLength.class)){
                    int value = field.getAnnotation(MaxLength.class).value();
                    String actualValue = (String)field.get(customer);
                    if(actualValue.length() > value){
                     throw new InvalidValue();
                    }
                }
            }
        }

    }
}
