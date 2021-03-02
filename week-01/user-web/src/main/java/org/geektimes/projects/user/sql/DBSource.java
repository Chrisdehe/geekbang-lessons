package org.geektimes.projects.user.sql;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DBSource {

    private DataSource dataSource;
    private static final DBSource dbSource = new DBSource();


    public static DBSource getInstance() {
        return dbSource;
    }


    public void setDataSource(DataSource dataSource) {
        System.out.println("dataSource === " + dataSource.toString());
        DBSource.dbSource.dataSource = dataSource;
    }


    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException("连接数据库失败");
        }

    }


}
