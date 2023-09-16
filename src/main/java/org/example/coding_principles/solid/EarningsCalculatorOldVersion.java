package org.example.coding_principles.solid;

public class EarningsCalculatorOldVersion {
    //this solution is not friendly with SOLID.
    // open for extension, closed for modification

    double calculate(Video video) {
        double result = switch (video.getCategory()) {
            case EDUCATIONAL -> calculateEducationalEarnings(video);
            case GAMING -> calculateGamingEarnings(video);
            case ENTERTAINMENT -> calculateEntertainmentEarnings(video);
        };
        return result;
    }

    double calculateEducationalEarnings(Video video) {
        return video.getLikes() * 0.013 + video.getViews() * 0.013;
    }

    double calculateGamingEarnings(Video video) {
        return video.getLikes() * 0.012 + video.getViews() * 0.012;
    }

    double calculateEntertainmentEarnings(Video video) {
        return video.getLikes() * 0.011 + video.getViews() * 0.011;
    }
}
