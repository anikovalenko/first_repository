package org.example.coding_principles.solid;

public class GamingEarningCalculator extends EarningsCalculator {
    double calculateEarnings(Video video){
        return video.getLikes() * 0.012 + video.getViews() * 0.012;
    }
}
