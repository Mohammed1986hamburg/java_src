package jdbc.crud;

import de.gfn.java.ocp.jdbc.crud.DBConnectionFactory;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public class CustomerCRUD extends AbstractCRUD<Customer> {

    public CustomerCRUD() {
        super("customers");
    }
    
    @Override
    boolean insert(Customer obj) throws SQLException {
        
        String sql = "INSERT INTO " + TABLE + " (id, firstname, lastname, email) VALUES(null, ?, ?, ?)";
        
        try(Connection con = DBConnectionFactory.getConnection();
                PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            stmt.setString(1, obj.getFirstName());
            stmt.setString(2, obj.getLastName());
            stmt.setString(3, obj.getEmail());
            stmt.execute();
            
            ResultSet ids = stmt.getGeneratedKeys();
            int id = ids.getInt(1);
            if(id > 0) {
                obj.setId(id);
                return true;
            }
            return false;
        }
    }

    @Override
    public List<Customer> find(int start, int num) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    boolean update(Customer obj) throws SQLException {
        
        String sql = "UPDATE " + TABLE + " SET firstname = ?, lastname = ?, email = ? WHERE id = ?";
        
        try(Connection con = DBConnectionFactory.getConnection();
                PreparedStatement stmt = con.prepareStatement(sql)) {
            
            stmt.setString(1, obj.getFirstName());
            stmt.setString(2, obj.getLastName());
            stmt.setString(3, obj.getEmail());
            stmt.setInt(4, obj.getId());
            stmt.execute();
            
            return stmt.getUpdateCount() > 0;
            
        }
    }

    @Override
    public Customer create(ResultSet rs) throws SQLException {
        // ID hinzufügen
        return new Customer(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("email"));
    }
    
}
