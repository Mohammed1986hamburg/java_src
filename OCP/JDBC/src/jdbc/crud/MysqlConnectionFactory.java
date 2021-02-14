/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tlubowiecki
 */
public class MysqlConnectionFactory {
    
    private static final String DB_TYPE = "mysql";
    private static final String DB_NAME = "kundenverwaltung";
    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "8889";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    private MysqlConnectionFactory() {
    }
    
    public static Connection getConnection() throws SQLException {
        // jdbc:mysql://localhost:3306/kundenverwaltung
        String url = String.format("jdbc:%s://%s:%s/%s?useSSL=false", DB_TYPE, DB_HOST, DB_PORT, DB_NAME);
        return DriverManager.getConnection(url, DB_USER, DB_PASSWORD);
    }  
}
