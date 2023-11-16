package DAO;

import DTO.LivroDTO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo Moreno
 */

public class LivroDAO {
    
    Connection conn;
    PreparedStatement pstm;
    
    public ArrayList<LivroDTO> pesquisarLivros() {
        conn = new ConexaoDAO().conectaBD();
        
        ArrayList<LivroDTO> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT A.id_livro, A.nome_livro, A.autor_livro, A.genero_livro, "
                         + "COUNT(DISTINCT id_nota) AS qtd_notas, ROUND(AVG(B.nota_livro), 1) AS nota_livro "
                         + "FROM livro AS A "
                         + "LEFT JOIN livro_nota AS B "
                         + "ON A.id_livro = B.id_livro "
                         + "GROUP BY A.id_livro, A.nome_livro, A.autor_livro, A.genero_livro "
                         + "ORDER BY AVG(B.nota_livro) DESC, COUNT(DISTINCT id_nota) DESC, A.nome_livro ASC";
            pstm = conn.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()) {
                LivroDTO objlivrodto = new LivroDTO();
                objlivrodto.setId_livro(rs.getInt("id_livro"));
                objlivrodto.setNome_livro(rs.getString("nome_livro"));
                objlivrodto.setAutor_livro(rs.getString("autor_livro"));
                objlivrodto.setGenero_livro(rs.getString("genero_livro"));
                objlivrodto.setQtd_notas(rs.getInt("qtd_notas"));
                objlivrodto.setNota_livro(rs.getDouble("nota_livro"));
                
                lista.add(objlivrodto);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }
        
        return lista;
    }
    
    public ArrayList<LivroDTO> pesquisarMeusLivros(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();
        
        ArrayList<LivroDTO> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT A.id_livro, A.nome_livro, A.autor_livro, A.genero_livro, "
                         + "A.imagem_livro, COUNT(DISTINCT B.id_nota) AS qtd_notas, ROUND(AVG(B.nota_livro), 1) AS nota_livro  "
                         + "FROM livro AS A "
                         + "LEFT JOIN livro_nota AS B "
                         + "ON A.id_livro = B.id_livro "
                         + "WHERE A.id_usuario = ? "
                         + "GROUP BY A.id_livro, A.nome_livro, A.autor_livro, A.genero_livro "
                         + "ORDER BY AVG(B.nota_livro) DESC, COUNT(DISTINCT id_nota) DESC, A.nome_livro ASC";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objusuariodto.getId_usuario());
            
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()) {
                LivroDTO objlivrodto = new LivroDTO();
                objlivrodto.setId_livro(rs.getInt("id_livro"));
                objlivrodto.setNome_livro(rs.getString("nome_livro"));
                objlivrodto.setAutor_livro(rs.getString("autor_livro"));
                objlivrodto.setGenero_livro(rs.getString("genero_livro"));
                objlivrodto.setQtd_notas(rs.getInt("qtd_notas"));
                objlivrodto.setNota_livro(rs.getDouble("nota_livro"));
                objlivrodto.setImagem_livro(rs.getString("imagem_livro"));
                
                lista.add(objlivrodto);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }
        
        return lista;
    }
    
    public ArrayList<LivroDTO> pesquisarFavoritos(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();
        
        ArrayList<LivroDTO> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT * "
                         + "FROM (SELECT MAX(id_favorito) AS id_favorito, id_usuario, id_livro FROM livro_favorito GROUP BY id_usuario, id_livro) AS A "
                         + "LEFT JOIN (SELECT * FROM livro) AS B "
                         + "ON A.id_livro = B.id_livro "
                         + "LEFT JOIN (	SELECT id_livro, COUNT(DISTINCT id_nota) AS qtd_notas, ROUND(AVG(nota_livro), 1) AS nota_livro "
                         + "FROM livro_nota GROUP BY id_livro) AS C "
                         + "ON A.id_livro = C.id_livro "
                         + "WHERE A.id_usuario = ? "
                         + "ORDER BY id_favorito DESC";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objusuariodto.getId_usuario());
            
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()) {
                LivroDTO objlivrodto = new LivroDTO();
                objlivrodto.setId_livro(rs.getInt("id_livro"));
                objlivrodto.setNome_livro(rs.getString("nome_livro"));
                objlivrodto.setAutor_livro(rs.getString("autor_livro"));
                objlivrodto.setGenero_livro(rs.getString("genero_livro"));
                objlivrodto.setQtd_notas(rs.getInt("qtd_notas"));
                objlivrodto.setNota_livro(rs.getDouble("nota_livro"));
                objlivrodto.setImagem_livro(rs.getString("imagem_livro"));
                
                lista.add(objlivrodto);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }
        
        return lista;
    }
    
    public ArrayList<LivroDTO> pesquisarRecomendados(UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();
        
        ArrayList<LivroDTO> lista = new ArrayList<>();
        
        try {
            String sql = "SELECT A.id_livro, A.nome_livro, A.autor_livro, A.genero_livro, A.imagem_livro, "
                         + "ROUND(AVG(B.nota_livro), 1) AS nota_livro, COUNT(DISTINCT id_nota) AS qtd_Notas, " 
                         + "CASE WHEN A.genero_livro = (SELECT DISTINCT tipo_usuario FROM usuario WHERE id_usuario = ?) THEN 0 ELSE 1 END AS Class_livro " 
                         + "FROM livro AS A " 
                         + "LEFT JOIN livro_nota AS B " 
                         + "ON A.id_livro = B.id_livro " 
                         + "WHERE A.id_usuario != ? " 
                         + "AND A.id_livro NOT IN (SELECT DISTINCT id_livro FROM livro_favorito WHERE id_usuario = ?) " 
                         + "GROUP BY A.id_livro, A.nome_livro, A.autor_livro, A.genero_livro, A.imagem_livro " 
                         + "ORDER BY Class_livro ASC, AVG(B.nota_livro) DESC, COUNT(DISTINCT id_nota) DESC, A.nome_livro ASC "
                         + "LIMIT 10";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objusuariodto.getId_usuario());
            pstm.setInt(2, objusuariodto.getId_usuario());
            pstm.setInt(3, objusuariodto.getId_usuario());
            
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()) {
                LivroDTO objlivrodto = new LivroDTO();
                objlivrodto.setId_livro(rs.getInt("id_livro"));
                objlivrodto.setNome_livro(rs.getString("nome_livro"));
                objlivrodto.setAutor_livro(rs.getString("autor_livro"));
                objlivrodto.setGenero_livro(rs.getString("genero_livro"));
                objlivrodto.setQtd_notas(rs.getInt("qtd_notas"));
                objlivrodto.setNota_livro(rs.getDouble("nota_livro"));
                objlivrodto.setImagem_livro(rs.getString("imagem_livro"));
                
                lista.add(objlivrodto);
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }
        
        return lista;
    }
    
    public int buscarIdLivro(LivroDTO objlivrodto) {
        conn = new ConexaoDAO().conectaBD();
        
        int id_livro = 0;
        
        try {
            String sql = "SELECT * FROM livro WHERE nome_livro = ? ORDER BY 1 DESC LIMIT 1";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objlivrodto.getNome_livro());
            
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()) {
                id_livro = rs.getInt("id_livro");
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }
        
        return id_livro;
    }
    
    public String buscarImagemLivro(LivroDTO objlivrodto) {
        conn = new ConexaoDAO().conectaBD();
        
        String imagem_livro = "";
        
        try {
            String sql = "SELECT imagem_livro FROM livro WHERE id_livro = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objlivrodto.getId_livro());
            
            ResultSet rs = pstm.executeQuery();
            
            while(rs.next()) {
                imagem_livro = rs.getString("imagem_livro");
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }
        
        return imagem_livro;
        
    }
    
    public void cadastrarLivro(LivroDTO objlivrodto, UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "INSERT INTO livro "
                         + "(nome_livro, autor_livro, genero_livro, imagem_livro, id_usuario) " 
                         + "VALUES (?, ?, ?, ?, ?)";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objlivrodto.getNome_livro());
            pstm.setString(2, objlivrodto.getAutor_livro());
            pstm.setString(3, objlivrodto.getGenero_livro());
            pstm.setString(4, objlivrodto.getImagem_livro());
            pstm.setInt(5, objusuariodto.getId_usuario());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }
    }
    
    public void cadastrarNota(LivroDTO objlivrodto, UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "INSERT INTO livro_nota "
                         + "(id_livro, id_usuario, nota_livro) " 
                         + "VALUES (?, ?, ?)";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objlivrodto.getId_livro());
            pstm.setInt(2, objusuariodto.getId_usuario());
            pstm.setDouble(3, objlivrodto.getNota_livro());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }
    }
    
    public void favoritarLivro(LivroDTO objlivrodto, UsuarioDTO objusuariodto) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "INSERT INTO livro_favorito "
                         + "(id_usuario, id_livro) "
                         + "VALUES (?, ?)";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objusuariodto.getId_usuario());
            pstm.setInt(2, objlivrodto.getId_livro());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }
    }
    
    public void excluirLivro(LivroDTO objlivrodto) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "DELETE FROM livro WHERE id_livro = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objlivrodto.getId_livro());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }
        
        try {
            String sql = "DELETE FROM livro_nota WHERE id_livro = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objlivrodto.getId_livro());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }
        
        try {
            String sql = "DELETE FROM livro_favorito WHERE id_livro = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objlivrodto.getId_livro());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }
    }
    
    public void excluirFavorito(UsuarioDTO objusuariodto, LivroDTO objlivrodto) {
        conn = new ConexaoDAO().conectaBD();
        
        try {
            String sql = "DELETE FROM livro_favorito WHERE id_usuario = ? AND id_livro = ?";
            pstm = conn.prepareStatement(sql); 
            pstm.setInt(1, objusuariodto.getId_usuario());
            pstm.setInt(2, objlivrodto.getId_livro());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "LivroDAO" + erro);
        }
    }
}
