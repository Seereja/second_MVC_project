package com.example.testdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.example.testdemo.DBConstants.*;

@Configuration
public class DBConfig {
    //добавление бина в спринг контекст - можем использовать везде где угодно
    @Bean
    @Scope("singleton")
//    @Scope("prototype")
//    @Scope("session")
    public Connection connection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://"
                        + DB_HOST
                        + ":"
                        + PORT
                        + "/"
                        + DB_NAME,
                USER,
                PASSWORD);
    }

//    @Bean
//    public BookingDAO bookingDAO() throws SQLException {
//        return new BookingDAO(connection());
//    }
}
