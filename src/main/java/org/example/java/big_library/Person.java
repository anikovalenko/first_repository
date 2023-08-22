package org.example.java.big_library;

abstract class Person {
    String name;
    int age;
    String phoneNumber;
    String positionTitle;
    Person(String name, int age, String phoneNumber, String positionTitle) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.positionTitle = positionTitle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", positionTitle='" + positionTitle + '\'' +
                '}';
    }
}
