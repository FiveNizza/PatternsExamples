package by.Prohorov.Prototype.ConnectDB;

import by.Prohorov.Prototype.resource.DataBaseManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    public static Connection getConnection() throws SQLException {
        Connection connection = null;

        String url = DataBaseManager.getProperty("db.url");
        String user = DataBaseManager.getProperty("db.user");
        String password = DataBaseManager.getProperty("db.password");

        connection = DriverManager.getConnection(url, user, password);

        return connection;
    }
}
