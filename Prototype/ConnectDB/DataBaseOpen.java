package by.Prohorov.Prototype.ConnectDB;

import by.Prohorov.Prototype.Human;
import by.Prohorov.Prototype.resource.DataBaseManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseOpen {
    private static final String selectInformation = "SELECT * FROM \"user\";";
    private static Connection connection = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;
    private static String tempString;

    public static Human getInformationFromDataBase(Human human, String dataBaseName) {
        try { //1
            Class.forName(DataBaseManager.getProperty("db.forName"));

            try { //2
                connection = DataBaseConnection.getConnection();

                try { //3
                    statement = connection.createStatement();

                    try { //4
                        String nameDB = "user1";
                        resultSet = statement.executeQuery("SELECT * FROM \""+dataBaseName+"\";");

                        while (resultSet.next()) {
                            human.setName(resultSet.getString(1));
                            human.setAge(resultSet.getInt(2));
                        }
                    } finally {
                        if (resultSet != null)
                            resultSet.close();
                    }
                } finally {
                    if (statement != null)
                        statement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (connection != null)
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
        return human;
    }
}
