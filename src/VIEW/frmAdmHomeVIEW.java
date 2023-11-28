package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author Gustavo Moreno
 */

public class frmAdmHomeVIEW extends javax.swing.JFrame {

    public frmAdmHomeVIEW() {
        initComponents();
        listarUsuarios();
    }
    
    // Componentes visuais - gerados pelo NetBeans
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnCadastrarUsuario = new javax.swing.JButton();
        btnExcluirUsuario = new javax.swing.JButton();
        btnEditarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 175));
        setMinimumSize(new java.awt.Dimension(750, 500));

        jPanel1.setBackground(new java.awt.Color(88, 175, 156));
        jPanel1.setMaximumSize(new java.awt.Dimension(750, 70));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 70));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GB.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(619, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        tblUsuarios.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Login", "Senha", "Nome", "Sexo", "Idade", "Genêro", "Email", "Estado", "Cidade", "Rua"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblUsuarios.setMaximumSize(new java.awt.Dimension(2147483647, 2000));
        tblUsuarios.setMinimumSize(new java.awt.Dimension(165, 290));
        jScrollPane1.setViewportView(tblUsuarios);
        if (tblUsuarios.getColumnModel().getColumnCount() > 0) {
            tblUsuarios.getColumnModel().getColumn(0).setPreferredWidth(35);
            tblUsuarios.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblUsuarios.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblUsuarios.getColumnModel().getColumn(3).setPreferredWidth(250);
            tblUsuarios.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblUsuarios.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblUsuarios.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblUsuarios.getColumnModel().getColumn(7).setPreferredWidth(100);
            tblUsuarios.getColumnModel().getColumn(8).setPreferredWidth(250);
            tblUsuarios.getColumnModel().getColumn(9).setPreferredWidth(250);
            tblUsuarios.getColumnModel().getColumn(10).setPreferredWidth(150);
        }

        btnCadastrarUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnCadastrarUsuario.setText("Cadastrar");
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        btnExcluirUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });

        btnEditarUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(88, 175, 156));
        jLabel1.setText("GREENBOOK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(257, 257, 257)
                .addComponent(btnExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(664, 664, 664)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Botão para ir a tela de cadastro de usuário
    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        frmAdmCadastrarVIEW objfrmadmcadastrarview = new frmAdmCadastrarVIEW();
        objfrmadmcadastrarview.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    // Botão para ir a tela de edição de usuário
    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
        int index = tblUsuarios.getSelectedRow();
        
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um usuário!");
        } else {
            UsuarioDTO objusuariodto = usuarioEditarSelecionado();
        
            frmAdmEditarVIEW objfrmadmeditarview = new frmAdmEditarVIEW(objusuariodto);
            objfrmadmeditarview.setVisible(true);
        
            dispose();
        }     
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    // Botão para excluir usuário
    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        int index = tblUsuarios.getSelectedRow();
        
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um usuário!");
        } else {
           excluirUsuario();
            listarUsuarios();
        
            JOptionPane.showMessageDialog(null, "Usuário excluido do sistema!"); 
        }
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAdmHomeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdmHomeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdmHomeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdmHomeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdmHomeVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
    
    // Função para listar todos os usuários cadastrados
    private void listarUsuarios() {
        try {
            UsuarioDAO objusuariodao = new UsuarioDAO();
            
            DefaultTableModel model = (DefaultTableModel) tblUsuarios.getModel();
            model.setNumRows(0);
            
            ArrayList<UsuarioDTO> lista = objusuariodao.pesquisarUsuarios();
            
            for(int num = 0; num < lista.size(); num ++) {
                model.addRow(new Object[] {
                    lista.get(num).getId_usuario(),
                    lista.get(num).getLogin_usuario(),
                    lista.get(num).getSenha_usuario(),
                    lista.get(num).getNome_usuario(),
                    lista.get(num).getSexo_usuario(),
                    lista.get(num).getIdade_usuario(),
                    lista.get(num).getTipo_usuario(),
                    lista.get(num).getEmail_usuario(),
                    lista.get(num).getEstado_usuario(),
                    lista.get(num).getCidade_usuario(),
                    lista.get(num).getRua_usuario()
                });
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "frmHomeAdmVIEW" + erro);
        }
    }
    
    // Função para identificar o usuário selecionado na tabela para edição
    private UsuarioDTO usuarioEditarSelecionado() {
        int index = tblUsuarios.getSelectedRow();
        
        String login_usuario, senha_usuario, nome_usuario, sexo_usuario, tipo_usuario, email_usuario, estado_usuario, cidade_usuario, rua_usuario;
        int id_usuario, idade_usuario;
        
        id_usuario = Integer.parseInt(tblUsuarios.getModel().getValueAt(index, 0).toString());
        login_usuario = tblUsuarios.getModel().getValueAt(index, 1).toString();
        senha_usuario = tblUsuarios.getModel().getValueAt(index, 2).toString();
        nome_usuario = tblUsuarios.getModel().getValueAt(index, 3).toString();
        sexo_usuario = tblUsuarios.getModel().getValueAt(index, 4).toString();
        idade_usuario = Integer.parseInt(tblUsuarios.getModel().getValueAt(index, 5).toString());
        tipo_usuario = tblUsuarios.getModel().getValueAt(index, 6).toString();
        email_usuario = tblUsuarios.getModel().getValueAt(index, 7).toString();
        estado_usuario = tblUsuarios.getModel().getValueAt(index, 8).toString();
        cidade_usuario = tblUsuarios.getModel().getValueAt(index, 9).toString();
        rua_usuario = tblUsuarios.getModel().getValueAt(index, 10).toString();
        
        UsuarioDTO objusuariodto = new UsuarioDTO();
        objusuariodto.setId_usuario(id_usuario);
        objusuariodto.setLogin_usuario(login_usuario);
        objusuariodto.setSenha_usuario(senha_usuario);
        objusuariodto.setNome_usuario(nome_usuario);
        objusuariodto.setSexo_usuario(sexo_usuario);
        objusuariodto.setIdade_usuario(idade_usuario);
        objusuariodto.setTipo_usuario(tipo_usuario);
        objusuariodto.setEmail_usuario(email_usuario);
        objusuariodto.setEstado_usuario(estado_usuario);
        objusuariodto.setCidade_usuario(cidade_usuario);
        objusuariodto.setRua_usuario(rua_usuario);
        
        return objusuariodto;
    }
    
    // Função para excluir usuário
    private void excluirUsuario() {
        int index = tblUsuarios.getSelectedRow();
        
        int id_usuario = Integer.parseInt(tblUsuarios.getModel().getValueAt(index, 0).toString());
        
        UsuarioDTO objusuariodto = new UsuarioDTO();
        objusuariodto.setId_usuario(id_usuario);
        
        UsuarioDAO objusuariodao = new UsuarioDAO();
        objusuariodao.excluirUsuario(objusuariodto);
    }
}