package org.geektimes.projects.user.web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Test {

    private static void initJNDIDataSource() throws SQLException {

        String databaseURL = "jdbc:derby:user-platform;create=true";

        Connection connection = DriverManager.getConnection(databaseURL);

        connection.close();

    }

    public static void main(String[] args) throws SQLException {
        initJNDIDataSource();
    }

}
