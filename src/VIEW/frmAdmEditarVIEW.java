package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import javax.swing.JOptionPane;

/*
 * @author Gustavo Moreno
 */

public class frmAdmEditarVIEW extends javax.swing.JFrame {

    public frmAdmEditarVIEW(UsuarioDTO objusuariodto) {
        initComponents();
        carregarDadosUsuarioEditar(objusuariodto);
    }

    // Componentes visuais - gerados pelo NetBeans
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        lblIdade = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 175));
        setMinimumSize(new java.awt.Dimension(750, 500));
        setSize(new java.awt.Dimension(750, 500));

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

        lblId.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblId.setText("Id:");

        lblLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblLogin.setText("Login:");

        lblSenha.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblSenha.setText("Senha:");

        lblNome.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblNome.setText("Nome:");

        lblSexo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblSexo.setText("Sexo:");

        lblTipo.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblTipo.setText("Tipo:");

        lblEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblEmail.setText("E-mail:");

        lblEstado.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblEstado.setText("Estado:");

        lblCidade.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblCidade.setText("Cidade:");

        txtId.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtId.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtId.setEnabled(false);

        txtTipo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        lblIdade.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblIdade.setText("Idade");

        btnEditar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        txtLogin.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        txtSenha.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        txtNome.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        txtSexo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        txtIdade.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        txtEstado.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        txtCidade.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        lblRua.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        lblRua.setText("Rua:");

        txtRua.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        btnCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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
                .addGap(80, 80, 80)
                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblRua, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(664, 664, 664)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblId)
                            .addComponent(lblTipo))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLogin)
                            .addComponent(lblEmail))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSenha)
                            .addComponent(lblEstado))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblCidade))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSexo)
                            .addComponent(lblRua))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblIdade))
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Botão para confirmar edição dos dados do usuário
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        editarUsuario();
        frmAdmHomeVIEW objfrmadmhomeview = new frmAdmHomeVIEW();
        objfrmadmhomeview.setVisible(true);
                
        dispose();
    }//GEN-LAST:event_btnEditarActionPerformed

    // Botão para cancelar ação de edição e retornar para a tela anterior
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frmAdmHomeVIEW objfrmadmhomeview = new frmAdmHomeVIEW();
        objfrmadmhomeview.setVisible(true);
                
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmAdmEditarVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdmEditarVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdmEditarVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdmEditarVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UsuarioDTO objusuariodto = new UsuarioDTO();
                new frmAdmEditarVIEW(objusuariodto).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
    
    // Função para carregar os dados do usuário selecionado para edição
    private void carregarDadosUsuarioEditar(UsuarioDTO objusuariodto) {
        String login_usuario, senha_usuario, nome_usuario, sexo_usuario, tipo_usuario, email_usuario, estado_usuario, cidade_usuario, rua_usuario;
        int id_usuario, idade_usuario;
        
        id_usuario = objusuariodto.getId_usuario();
        login_usuario = objusuariodto.getLogin_usuario();
        senha_usuario = objusuariodto.getSenha_usuario();
        nome_usuario = objusuariodto.getNome_usuario();
        sexo_usuario = objusuariodto.getSexo_usuario();
        idade_usuario = objusuariodto.getIdade_usuario();
        tipo_usuario = objusuariodto.getTipo_usuario();
        email_usuario = objusuariodto.getEmail_usuario();
        estado_usuario = objusuariodto.getEstado_usuario();
        cidade_usuario = objusuariodto.getCidade_usuario();
        rua_usuario = objusuariodto.getRua_usuario();
        
        txtId.setText(Integer.toString(id_usuario));
        txtLogin.setText(login_usuario);
        txtSenha.setText(senha_usuario);
        txtNome.setText(nome_usuario);
        txtSexo.setText(sexo_usuario);
        txtIdade.setText(Integer.toString(idade_usuario));
        txtTipo.setText(email_usuario);
        txtTipo.setText(tipo_usuario);
        txtEmail.setText(email_usuario);
        txtEstado.setText(estado_usuario);
        txtCidade.setText(cidade_usuario);
        txtRua.setText(rua_usuario);
    }
    
    // Função para editar dados do usuário
    private void editarUsuario() {
        String login_usuario, senha_usuario, nome_usuario, sexo_usuario, tipo_usuario, email_usuario, estado_usuario, cidade_usuario, rua_usuario;
        int id_usuario, idade_usuario;
        
        id_usuario = Integer.parseInt(txtId.getText());
        login_usuario = txtLogin.getText();
        senha_usuario = txtSenha.getText();
        nome_usuario = txtNome.getText();
        sexo_usuario = txtSexo.getText();
        idade_usuario = Integer.parseInt(txtIdade.getText());
        tipo_usuario = txtTipo.getText();
        email_usuario = txtEmail.getText();
        estado_usuario = txtEstado.getText();
        cidade_usuario = txtCidade.getText();
        rua_usuario = txtRua.getText();
        
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
        
        UsuarioDAO objusuariodao = new UsuarioDAO();
        objusuariodao.editarUsuario(objusuariodto);
        
        JOptionPane.showMessageDialog(null, "Usuário editado no sistema!");        
    } 
}