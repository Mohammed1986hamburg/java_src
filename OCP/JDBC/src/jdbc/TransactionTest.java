package jdbc;

import jdbc.crud.MysqlConnectionFactory;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

/**
 *
 * @author tlubowiecki
 */
public class TransactionTest {
    
    public static void main(String[] args) {
        
//        try(Connection con = MysqlConnectionFactory.getConnection();
//                Statement stmt = con.createStatement()) {
//            
//            con.setAutoCommit(false);
//            
//            stmt.executeUpdate("INSERT INTO customers (firstname, lastname) VALUES ('Bruce', 'Wayne')");
//            
//            Savepoint s1 = con.setSavepoint();
//            stmt.executeUpdate("UPDATE customers SET firstname = 'Bob' WHERE id = 1");
//            
//            Savepoint s2 = con.setSavepoint();
//            stmt.executeUpdate("UPDATE customers SET firstname = 'Max' WHERE id = 2");
//            
//            con.rollback(s1);
//            
//            con.commit();
//            
//        }
//        catch(SQLException e) {
//            e.printStackTrace();
//        }

        Connection con = null;
        Savepoint s1 = null;
        Savepoint s2 = null;        
        
        try {
            con = MysqlConnectionFactory.getConnection();
            Statement stmt = con.createStatement();
            
            con.setAutoCommit(false); // Transactions
            
            // 1
            stmt.executeUpdate("INSERT INTO customers (firstname, lastname) VALUES ('Bruce', 'Wayne')");
            
            s1 = con.setSavepoint();
            // 2
            stmt.executeUpdate("UPDATE customers SET firstname = 'Bob' WHERE id = 1");
            
            s2 = con.setSavepoint();
            // 3
            stmt.executeUpdate("UPDATE customers SET firstname = 'Max' WH_ERE id = 2");
            
            con.commit(); // Alles zusammen am DB übermitteln
        }
        catch(SQLException e) {
            
            System.out.println("Erster Versuch auch gescheitert.");
            
            try {
                con.rollback(s2);
                con.commit();
            }
            catch(SQLException ex) {
                System.out.println("Zweiter Versuch auch gescheitert.");
            }
        }
        finally {
            if(con != null) {
                try {
                    con.close();
                }
                catch(SQLException ex) {
                    System.out.println("Connection bereits zu.");
                }
            }
        }
        
    }
    
}
