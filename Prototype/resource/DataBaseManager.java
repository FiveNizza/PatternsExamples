package by.Prohorov.Prototype.resource;

import java.util.ResourceBundle;

public class DataBaseManager {
    private final static ResourceBundle resourceBundle =
        ResourceBundle.getBundle("by.Prohorov.resources.dataBase");

    private DataBaseManager() {}

    public static String getProperty(String key) {
        return resourceBundle.getString(key);
    }
}
