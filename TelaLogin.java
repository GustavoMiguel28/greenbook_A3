import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }
                       
    private void initComponents() {

        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        backLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setName("LoginFrame");
        getContentPane().setLayout(null);

        txtLogin.setBackground(new java.awt.Color(236, 240, 241));
        txtLogin.setFont(new java.awt.Font("Yu Gothic UI", 0, 18));
        txtLogin.setBorder(null);
        txtLogin.setMaximumSize(new java.awt.Dimension(60, 20));
        txtLogin.setMinimumSize(new java.awt.Dimension(60, 20));
        getContentPane().add(txtLogin);
        txtLogin.setBounds(590, 240, 270, 30);

        txtSenha.setBackground(new java.awt.Color(236, 240, 241));
        txtSenha.setFont(new java.awt.Font("Calibri", 0, 18));
        txtSenha.setBorder(null);
        txtSenha.setMaximumSize(new java.awt.Dimension(60, 20));
        txtSenha.setMinimumSize(new java.awt.Dimension(60, 20));
        getContentPane().add(txtSenha);
        txtSenha.setBounds(590, 320, 270, 30);

        btnIniciar.setBackground(new java.awt.Color(88, 175, 156));
        btnIniciar.setFont(new java.awt.Font("Yu Gothic UI", 1, 18));
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("ENTRAR");
        btnIniciar.setBorder(null);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar);
        btnIniciar.setBounds(540, 390, 330, 40);

        backLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("Imagens/TelaLogin.png")));
        getContentPane().add(backLogin);
        backLogin.setBounds(0, 0, 1000, 600);

        pack();
    }                                                          

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String login = txtLogin.getText();
        String senha = new String(txtSenha.getPassword());
        
        if (login.equals("admin") && senha.equals("senha123")) {
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Login/senha incorretos!");
        }
    }                                          

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }
                 
    private javax.swing.JLabel backLogin;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
               
}