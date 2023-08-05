package org.example.java.java_oop.airport;

public class Test {

    public static void main(String[] args) {
        AirportService service = new AirportService();
        Plane plane = service.createPlane();
        System.out.println(plane.toString());
    }
    

}
