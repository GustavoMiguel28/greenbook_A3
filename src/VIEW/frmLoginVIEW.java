package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * @author Gustavo Moreno
 */

public class frmLoginVIEW extends javax.swing.JFrame {

    public frmLoginVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        lblNomeUsuario = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        lblSenhaUsuario = new javax.swing.JLabel();
        btnEntrarLogin = new javax.swing.JButton();
        txtSenhaUsuario = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeUsuario.setText("Usuário");

        lblSenhaUsuario.setText("Senha");

        btnEntrarLogin.setText("ENTRAR");
        btnEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                    .addComponent(btnEntrarLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenhaUsuario)
                    .addComponent(lblNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSenhaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblNomeUsuario)
                .addGap(18, 18, 18)
                .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSenhaUsuario)
                .addGap(18, 18, 18)
                .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnEntrarLogin)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {                                               
        logar();
                
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLoginVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarLogin;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblSenhaUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables

    private void logar() {                                               
        try {
            String nome_usuario, senha_usuario;
        
            nome_usuario = txtNomeUsuario.getText();
            senha_usuario = new String(txtSenhaUsuario.getPassword());
        
            UsuarioDTO objusuariodto = new UsuarioDTO();
            objusuariodto.setNome_usuario(nome_usuario);
            objusuariodto.setSenha_usuario(senha_usuario);
            
            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet rsusuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);
            
            if (rsusuariodao.next()) {
                if (nome_usuario.equals("admin")) {
                frmHomeAdmVIEW objfrmhomeadmview = new frmHomeAdmVIEW();
                objfrmhomeadmview.setVisible(true);
                
                dispose();
                
                } else {
                frmHomeVIEW objfrmhomeview = new frmHomeVIEW();
                objfrmhomeview.setVisible(true);
                
                dispose();
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuário/Senha incorreto(s)");
            }
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "frmLoginVIEW" + erro);
        }
        
    }

}
