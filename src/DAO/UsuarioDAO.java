package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
            pstm.setString(1, objusuariodto.getLogin_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
            return null;
        }
    }
    
    public ArrayList<UsuarioDTO> pesquisarUsuario() {
        conn = new ConexaoDAO().conectaBD();
        
        ArrayList<UsuarioDTO> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT * FROM usuario WHERE login_usuario != 'admin' ORDER BY 1";
            pstm = conn.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()) {
                UsuarioDTO objusuariodto = new UsuarioDTO();
                objusuariodto.setId_usuario(rs.getInt("id_usuario"));
                objusuariodto.setLogin_usuario(rs.getString("login_usuario"));
                objusuariodto.setSenha_usuario(rs.getString("senha_usuario"));
                objusuariodto.setNome_usuario(rs.getString("nome_usuario"));
                objusuariodto.setSexo_usuario(rs.getString("sexo_usuario"));
                objusuariodto.setIdade_usuario(rs.getInt("idade_usuario"));
                objusuariodto.setEmail_usuario(rs.getString("email_usuario"));
                objusuariodto.setEstado_usuario(rs.getString("estado_usuario"));
                objusuariodto.setCidade_usuario(rs.getString("cidade_usuario"));
                objusuariodto.setRua_usuario(rs.getString("rua_usuario"));
                objusuariodto.setNumero_usuario(rs.getInt("numero_usuario"));
                
                lista.add(objusuariodto);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
        }
        
        return lista;
    }
    
    public void cadastrarUsuario(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "INSERT INTO usuario "
                         + "(login_usuario,senha_usuario,nome_usuario,sexo_usuario,idade_usuario,"
                         + "email_usuario,estado_usuario,cidade_usuario,rua_usuario,numero_usuario) " 
                         + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getLogin_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            pstm.setString(3, objusuariodto.getNome_usuario());
            pstm.setString(4, objusuariodto.getSexo_usuario());
            pstm.setInt(5, objusuariodto.getIdade_usuario());
            pstm.setString(6, objusuariodto.getEmail_usuario());
            pstm.setString(7, objusuariodto.getEstado_usuario());
            pstm.setString(8, objusuariodto.getCidade_usuario());
            pstm.setString(9, objusuariodto.getRua_usuario());
            pstm.setInt(10, objusuariodto.getNumero_usuario());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
        }
    }
    
    public void editarUsuario(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "UPDATE usuario SET"
                    + " login_usuario = ?"
                    + ", senha_usuario = ?"
                    + ", nome_usuario = ?"
                    + ", sexo_usuario = ?"
                    + ", idade_usuario = ?"
                    + ", email_usuario = ?"
                    + ", estado_usuario = ?"
                    + ", cidade_usuario = ?"
                    + ", rua_usuario = ?"
                    + ", numero_usuario = ?"
                    + " WHERE id_usuario = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getLogin_usuario());
            pstm.setString(2, objusuariodto.getSenha_usuario());
            pstm.setString(3, objusuariodto.getNome_usuario());
            pstm.setString(4, objusuariodto.getSexo_usuario());
            pstm.setInt(5, objusuariodto.getIdade_usuario());
            pstm.setString(6, objusuariodto.getEmail_usuario());
            pstm.setString(7, objusuariodto.getEstado_usuario());
            pstm.setString(8, objusuariodto.getCidade_usuario());
            pstm.setString(9, objusuariodto.getRua_usuario());
            pstm.setInt(10, objusuariodto.getNumero_usuario());
            pstm.setInt(11, objusuariodto.getId_usuario());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
        }
    }
    
    public void excluirUsuario(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "DELETE FROM usuario WHERE id_usuario = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objusuariodto.getId_usuario());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
        }
    }
}