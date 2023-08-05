package org.example.java.java_oop.airport;

import java.util.Scanner;

public class AirportService {

    Plane createPlane(){
        Plane plane = new Plane();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name of the plane");
        plane.setName(s.next());
        System.out.println("Enter release year");
        plane.setReleaseYear(s.nextInt());
        System.out.println("Enter hours in the air");
        plane.setHoursInAir(s.nextInt());
        System.out.println("Is the plane of military use?");
        plane.setMilitary(s.nextBoolean());
        return plane;
    }

    void printNameAndReleaseDate(Plane plane){
        System.out.println(plane.getName() + " " + plane.getReleaseYear());
    }
}
