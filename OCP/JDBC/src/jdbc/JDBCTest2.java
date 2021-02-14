/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import jdbc.crud.DBConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tlubowiecki
 */
public class JDBCTest2 {
    
    public static void main(String[] args) {
        
        
        
        
        
        String sql = "INSERT INTO customers (id, firstname, lastname, email) VALUES(null, ?, ?, ?)";
        
        try(Connection con = DBConnectionFactory.getConnection(); 
                PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            stmt.setString(1, "Clark");
            stmt.setString(2, "Kent");
            stmt.setString(3, "superman@america.com");
            stmt.execute();
            
            ResultSet ids = stmt.getGeneratedKeys();
            System.out.println(ids.getInt(1));
            
            stmt.setString(1, "Hans");
            stmt.setString(2, "Solo");
            stmt.setString(3, "...");
            stmt.execute();
            
            // ResultSet results = stmt.getResultSet(); // bei SELECT
            
            ids = stmt.getGeneratedKeys();
            System.out.println(ids.getInt(1));
            
//            if(stmt.getUpdateCount() > 0)
//                System.out.println("Gespeichert!");
            
            
            
        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
    }
}
