package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * @author Gustavo Moreno
 */

public class UsuarioDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "SELECT * FROM usuario WHERE login_usuario = ? AND senha_usuario = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getNome_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
            return null;
        }
    }
    
    public void cadastrarUsuario(UsuarioDTO objnovousuariodto) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "INSERT INTO usuario (login_usuario, senha_usuario) VALUES (?, ?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objnovousuariodto.getNome_usuario());
            pstm.setString(2, objnovousuariodto.getSenha_usuario());
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
        }
    }
}