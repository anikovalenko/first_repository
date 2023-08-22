package org.example.java.big_library;

public class Owner extends Person{
    private Library regionalLibrary;

    public Owner(String name, int age, String phoneNumber) {
        super(name, age, phoneNumber,"Business Owner");
    }

    void openBusiness() {
        regionalLibrary = new Library();
    }

    CEO hireCEO(String name, int age, String phoneNumber) {
        return new CEO(name, age, phoneNumber);
    }

    @Override
    public String toString() {
        return "Owner{" +
                "regionalLibrary=" + regionalLibrary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", positionTitle='" + positionTitle + '\'' +
                '}';
    }
}
