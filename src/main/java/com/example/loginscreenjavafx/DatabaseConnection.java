package com.example.loginscreenjavafx;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Connection databaseLink;

    public Connection getConnection() {
        //String databaseName = "";
        String databaseUser = "Add UserName your database";
        String databasePassword = "Add Password your database";
        String url = "jdbc:oracle:thin:@//HOST:PORT/ServiceName";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);
        }catch (Exception e) {
            e.printStackTrace();
        }

        return databaseLink;
    }
}
