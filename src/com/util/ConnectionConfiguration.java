package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Lenovo on 21.5.2017 г..
 */
public class ConnectionConfiguration {
    public static Connection getConnection(){
        Connection connection = null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Shitthatfuck1");
        }catch(Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
