package jdbc.crud;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tlubowiecki
 */
public abstract class AbstractCRUD<T extends AbstractEntity> {
    
    public final String TABLE;

    public AbstractCRUD(String table) {
        this.TABLE = table;
    }
    
    // CREATE
    abstract boolean insert(T obj) throws SQLException;
    
    // READ
    public T find(int id) throws SQLException {
        
        try(Connection con = DBConnectionFactory.getConnection();
                Statement stmt = con.createStatement()) {
            
            ResultSet result = stmt.executeQuery("SELECT * FROM " + TABLE + " WHERE id = " + id);
            result.next(); // Zeiger muss auf den ersten Datensatz gesetzt werden
            return create(result);
        }
    }
    
    public List<T> find() throws SQLException {
        try(Connection con = DBConnectionFactory.getConnection();
                Statement stmt = con.createStatement()) {
            
            ResultSet result = stmt.executeQuery("SELECT * FROM " + TABLE);
            List<T> list = new ArrayList<>();
            while(result.next()) {
                list.add(create(result));
            }
            return list;
        }
    }
    
    public abstract List<T> find(int start, int num) throws SQLException;
    
    
    public boolean save(T obj) throws SQLException {
        
        if(obj.getId() > 0) {
            return update(obj);
        }
        else {
            return insert(obj);
        }
    }
    
    // UPDATE
    abstract boolean update(T obj) throws SQLException;
    
    // DELETE
    public boolean delete(T obj) throws SQLException {
        return delete(obj.getId());
    }
    
    public boolean delete(int id) throws SQLException {
        try(Connection con = DBConnectionFactory.getConnection();
                Statement stmt = con.createStatement()) {
            
//            stmt.execute("DELETE FROM " + TABLE + " WHERE id = " + id);
//            return stmt.getUpdateCount() > 0;
            
            return stmt.executeUpdate("DELETE FROM " + TABLE + " WHERE id = " + id) > 0;
        }
    }
    
    public abstract T create(ResultSet rs) throws SQLException;
}
