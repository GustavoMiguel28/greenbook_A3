package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * @author Gustavo Moreno
 */

public class ConexaoDAO {
    
    public Connection conectaBD() {
        
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/greenbook",
            "root",
            "root");
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
        
        return conn;
    }
}