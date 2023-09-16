package org.example.coding_principles.solid;

import org.example.coding_principles.solid.ConnectionDAO;
import org.example.coding_principles.solid.Video;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

//DAO - data access object
public class VideoDAO {

    void persist(Video video) throws SQLException {
        Connection connection = ConnectionDAO.getConnection();
        Statement statement = connection.createStatement();
        String sql = "INSERT INTO video (Title, Time, Likes, Views, Category) VALUES ("
                + video.getTitle() + "," + video.getTime() + ","
                + video.getLikes() + "," + video.getViews() + video.getCategory() + ")";
        statement.executeQuery(sql);
    }
}
