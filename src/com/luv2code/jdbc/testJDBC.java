package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class testJDBC {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:8889/luv2code?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pass = "root";
        try {

            System.out.println("Connecting to database: " + jdbcUrl);

            Connection myConn =
                    DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("Connection successful!!!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
