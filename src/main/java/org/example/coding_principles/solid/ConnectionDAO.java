package org.example.coding_principles.solid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {
    //we make a separate class to create and return the connection
    // to avoid the code duplication (DRY)

    static Connection instance;

    void createConnection() throws SQLException {
        String url = "https://www.youtube.com/watch?v=7D4Wn0GndCA";
        instance = DriverManager.getConnection(url, "root", "");
    }

    static Connection getConnection() {
        return instance;
    }
}
