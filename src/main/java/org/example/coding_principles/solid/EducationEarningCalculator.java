package org.example.coding_principles.solid;

public class EducationEarningCalculator extends EarningsCalculator {
    double calculateEarnings(Video video){
        return video.getLikes() * 0.013 + video.getViews() * 0.013;
    }
}
