package com.example.testdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.example.testdemo.DBConstants.*;

public enum DBApp {
    INSTANCE;
    private Connection connection;

//    public Connection connection() throws SQLException {
//        if (connection == null) {
//            this.connection = DriverManager.getConnection(
//                    "jdbc:postgresql://"
//                            + DB_HOST
//                            + ":"
//                            + PORT
//                            + "/"
//                            + DB_NAME,
//                    USER,
//                    PASSWORD);
//            ;
//        }
//        return connection;
//    }
}
