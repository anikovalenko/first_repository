package org.example.coding_principles.solid;

public class Video implements IVideoActions, IAdActions {


    private final Category category;
    private VideoManager manager;

    Video(String title, int time, int likes, int views, Category category) {
        manager.title = title;
        manager.time = time;
        manager.likes = likes;
        manager.views = views;
        this.category = category;
    }


//     The class should have only one responsibility
//     SOLID S = single responsibility

//    void persist(Video video) throws SQLException {
//        String url = "https://www.youtube.com/watch?v=7D4Wn0GndCA";
//        Connection connection = DriverManager.getConnection(url, "root", "");
//        Statement statement = connection.createStatement();
//        String sql = "INSERT INTO video (Title, Time, Likes, Views) VALUES ("
//                + video.getTitle() + "," + video.getTime() + ","
//                + video.getLikes() + "," + video.getViews();
//        statement.executeQuery(sql);
//    }

    public double getNumberOfHours() {
        return manager.getNumberOfHours();
    }

    public void playRandomAd() {
        manager.playRandomAd();
    }

    public Category getCategory() {
        return category;
    }

    int getTime(){
        return 5;
    }

    String getTitle(){
       return "bla";
    }

    int getLikes(){
        return manager.likes;
    }

    int getViews(){
        return manager.views;
    }

    enum Category {
        EDUCATIONAL, GAMING, ENTERTAINMENT;
    }
}
