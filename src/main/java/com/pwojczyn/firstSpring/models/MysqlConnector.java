package com.pwojczyn.firstSpring.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.pwojczyn.firstSpring.models.Config.*;

public class MysqlConnector {
    private static final String SQL_LINK = "jdbc:mysql://5.135.218.27:3306/"+ SQL_BASE+"?useUnicode=true&characterEncoding=UTF-8";
    private static final String SQL_USER = Config.SQL_USER;
    private static final String SQL_PASS = Config.SQL_PASS;
    private static final String SQL_CLASS = "com.mysql.jdbc.Driver";

    private static MysqlConnector connector = new MysqlConnector();
    public static MysqlConnector getInstance() {
        return connector;
    }

    private Connection connection;

    private MysqlConnector(){
        connect();
    }

    private void connect() {
        try {
            Class.forName(SQL_CLASS);
            connection = DriverManager.getConnection(SQL_LINK, SQL_USER, SQL_PASS);
           // System.out.println("Połączono");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return connection;
    }
}
