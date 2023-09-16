package org.example.coding_principles.solid;

public class VideoManager {

    String title;
    int time;
    int likes;
    int views;

    double getNumberOfHours(){
        return (time/3600.0) * views;
    }

    void playRandomAd(){

    }

}
