package ua.training.dao.util;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by allugard on 26.04.17.
 */
public class DataSource {
    private String url;
    private String login;
    private String password;
    private static DataSource dataSource;

    private DataSource(String url, String login, String password) {
        this.url = url;
        this.login = login;
        this.password = password;
    }

    public static DataSource MySqlDataSource()  {
        if (dataSource == null) {
            Properties properties = new Properties();
            InputStream fileInputStream;
            fileInputStream = DataSource.class.getClassLoader().getResourceAsStream("jdbc.properties");
            try {
                properties.load(fileInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                Class.forName(properties.getProperty("jdbc.driver"));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            dataSource = new DataSource(properties.getProperty("jdbc.url"), properties.getProperty("jdbc.login"), properties.getProperty("jdbc.password"));
        }
        return dataSource;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, login, password);
    }
}
