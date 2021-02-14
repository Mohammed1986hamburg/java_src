package jdbc;

import jdbc.crud.MysqlConnectionFactory;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author tlubowiecki
 */
public class JDBCTest3 {
    
    public static void main(String[] args) {
        
        String q = "{ call get_num_customer_without_email() }";
        
        try(Connection con = MysqlConnectionFactory.getConnection();
                CallableStatement stmt = con.prepareCall(q)) {
            
            stmt.execute();
            ResultSet rs = stmt.getResultSet();
            rs.next();
            System.out.println(rs.getInt(1));
            
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
}
