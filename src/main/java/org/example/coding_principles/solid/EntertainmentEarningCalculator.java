package org.example.coding_principles.solid;

public class EntertainmentEarningCalculator extends EarningsCalculator {
    double calculateEarnings(Video video){
        return video.getLikes() * 0.011 + video.getViews() * 0.011;
    }
}
