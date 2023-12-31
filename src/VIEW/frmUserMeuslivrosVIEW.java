package VIEW;

import DAO.LivroDAO;
import DTO.LivroDTO;
import DTO.UsuarioDTO;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @author Gustavo Moreno
 */

public class frmUserMeuslivrosVIEW extends javax.swing.JFrame {

    UsuarioDTO objusuariodto;
    
    public frmUserMeuslivrosVIEW(UsuarioDTO objusuariodto) {
        initComponents();
        this.objusuariodto = objusuariodto;
        listarImagensMeusLivros();
        listarImagensFavoritos();
    }

    // Componentes visuais - gerados pelo NetBeans
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBiblioteca = new javax.swing.JButton();
        btnMeuslivros = new javax.swing.JButton();
        btnRecomendados = new javax.swing.JButton();
        btnMeusLivrosMais = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblImagemM1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFavoritosMais = new javax.swing.JButton();
        lblImagemM2 = new javax.swing.JLabel();
        lblImagemM3 = new javax.swing.JLabel();
        lblImagemM4 = new javax.swing.JLabel();
        lblImagemM5 = new javax.swing.JLabel();
        lblImagemF1 = new javax.swing.JLabel();
        lblImagemF2 = new javax.swing.JLabel();
        lblImagemF3 = new javax.swing.JLabel();
        lblImagemF4 = new javax.swing.JLabel();
        lblImagemF5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 175));
        setMinimumSize(new java.awt.Dimension(750, 500));

        jPanel1.setBackground(new java.awt.Color(88, 175, 156));
        jPanel1.setMaximumSize(new java.awt.Dimension(750, 70));
        jPanel1.setMinimumSize(new java.awt.Dimension(750, 70));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GB.");

        btnBiblioteca.setBackground(new java.awt.Color(88, 175, 156));
        btnBiblioteca.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnBiblioteca.setForeground(new java.awt.Color(255, 255, 255));
        btnBiblioteca.setText("Biblioteca");
        btnBiblioteca.setBorder(null);
        btnBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBibliotecaActionPerformed(evt);
            }
        });

        btnMeuslivros.setBackground(new java.awt.Color(88, 175, 156));
        btnMeuslivros.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnMeuslivros.setForeground(new java.awt.Color(255, 255, 255));
        btnMeuslivros.setText("Meus Livros");
        btnMeuslivros.setBorder(null);
        btnMeuslivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeuslivrosActionPerformed(evt);
            }
        });

        btnRecomendados.setBackground(new java.awt.Color(88, 175, 156));
        btnRecomendados.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnRecomendados.setForeground(new java.awt.Color(255, 255, 255));
        btnRecomendados.setText("Recomendados");
        btnRecomendados.setBorder(null);
        btnRecomendados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecomendadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(620, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(btnBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnMeuslivros, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnRecomendados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(193, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMeuslivros, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRecomendados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(10, Short.MAX_VALUE)))
        );

        btnMeusLivrosMais.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnMeusLivrosMais.setText("+");
        btnMeusLivrosMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeusLivrosMaisActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(88, 175, 156));
        jLabel1.setText("GREENBOOK");

        lblImagemM1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemM1.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemM1.setMinimumSize(new java.awt.Dimension(60, 60));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Meus livros:");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel4.setText("Favoritos:");

        btnFavoritosMais.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnFavoritosMais.setText("+");
        btnFavoritosMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFavoritosMaisActionPerformed(evt);
            }
        });

        lblImagemM2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemM2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemM2.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemM2.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemM3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemM3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemM3.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemM3.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemM4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemM4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemM4.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemM4.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemM5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemM5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemM5.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemM5.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemF1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemF1.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemF1.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemF2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemF2.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemF2.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemF3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemF3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemF3.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemF3.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemF4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemF4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemF4.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemF4.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemF5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemF5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemF5.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemF5.setMinimumSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagemM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblImagemM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblImagemM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblImagemM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblImagemM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnMeusLivrosMais, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagemF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblImagemF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblImagemF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblImagemF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(lblImagemF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnFavoritosMais, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagemM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemM3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemM4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMeusLivrosMais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagemF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFavoritosMais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Botão para ir a tela detalhada dos meus livros
    private void btnMeusLivrosMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeusLivrosMaisActionPerformed
        frmUserMeuslivrosMeuslivrosVIEW objfrmusermeuslivrosmeuslivrosview = new frmUserMeuslivrosMeuslivrosVIEW(objusuariodto);
        objfrmusermeuslivrosmeuslivrosview.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnMeusLivrosMaisActionPerformed

    // Botão para ir a tela detalhada dos favoritos
    private void btnFavoritosMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFavoritosMaisActionPerformed
        frmUserMeuslivrosFavoritosVIEW objfrmusermeuslivrosfavoritosview = new frmUserMeuslivrosFavoritosVIEW(objusuariodto);
        objfrmusermeuslivrosfavoritosview.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnFavoritosMaisActionPerformed

    // Botão para ir a sessão biblioteca
    private void btnBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBibliotecaActionPerformed
        frmUserBibliotecaVIEW objfrmuserbibliotecaview = new frmUserBibliotecaVIEW(objusuariodto);
        objfrmuserbibliotecaview.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnBibliotecaActionPerformed

    // Botão para ir a sessão meus livros
    private void btnMeuslivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeuslivrosActionPerformed
        frmUserMeuslivrosVIEW objfrmusermeuslivrosview = new frmUserMeuslivrosVIEW(objusuariodto);
        objfrmusermeuslivrosview.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnMeuslivrosActionPerformed

    // Botão para ir a sessão recomendados
    private void btnRecomendadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecomendadosActionPerformed
        frmUserRecomendadosVIEW objfrmuserrecomendadosview = new frmUserRecomendadosVIEW(objusuariodto);
        objfrmuserrecomendadosview.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnRecomendadosActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmUserMeuslivrosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUserMeuslivrosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUserMeuslivrosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUserMeuslivrosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UsuarioDTO objusuariodto = new UsuarioDTO();
                new frmUserMeuslivrosVIEW(objusuariodto).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBiblioteca;
    private javax.swing.JButton btnFavoritosMais;
    private javax.swing.JButton btnMeusLivrosMais;
    private javax.swing.JButton btnMeuslivros;
    private javax.swing.JButton btnRecomendados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagemF1;
    private javax.swing.JLabel lblImagemF2;
    private javax.swing.JLabel lblImagemF3;
    private javax.swing.JLabel lblImagemF4;
    private javax.swing.JLabel lblImagemF5;
    private javax.swing.JLabel lblImagemM1;
    private javax.swing.JLabel lblImagemM2;
    private javax.swing.JLabel lblImagemM3;
    private javax.swing.JLabel lblImagemM4;
    private javax.swing.JLabel lblImagemM5;
    // End of variables declaration//GEN-END:variables

    // Função para listar imagens dos meus livros
    private void listarImagensMeusLivros() {
        try {
            LivroDAO objlivrodao = new LivroDAO();
            
            ArrayList<LivroDTO> lista = objlivrodao.pesquisarMeusLivros(objusuariodto);
            
            String imagemm1, imagemm2, imagemm3, imagemm4, imagemm5;
            
            if (lista.size() >= 1) {
                imagemm1 = lista.get(0).getImagem_livro();
                ImageIcon imagem1 = new ImageIcon(imagemm1);
                lblImagemM1.setIcon(new ImageIcon(imagem1.getImage().getScaledInstance(lblImagemM1.getWidth(), lblImagemM1.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 2) {
                imagemm2 = lista.get(1).getImagem_livro();
                ImageIcon imagem2 = new ImageIcon(imagemm2);
                lblImagemM2.setIcon(new ImageIcon(imagem2.getImage().getScaledInstance(lblImagemM2.getWidth(), lblImagemM2.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 3) {
                imagemm3 = lista.get(2).getImagem_livro();
                ImageIcon imagem3 = new ImageIcon(imagemm3);
                lblImagemM3.setIcon(new ImageIcon(imagem3.getImage().getScaledInstance(lblImagemM3.getWidth(), lblImagemM3.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 4) {
                imagemm4 = lista.get(3).getImagem_livro();
                ImageIcon imagem4 = new ImageIcon(imagemm4);
                lblImagemM4.setIcon(new ImageIcon(imagem4.getImage().getScaledInstance(lblImagemM4.getWidth(), lblImagemM4.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 5) {
                imagemm5 = lista.get(4).getImagem_livro();
                ImageIcon imagem5 = new ImageIcon(imagemm5);
                lblImagemM5.setIcon(new ImageIcon(imagem5.getImage().getScaledInstance(lblImagemM5.getWidth(), lblImagemM5.getHeight(), Image.SCALE_DEFAULT)));
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "frmUserMeuslivrosVIEW" + erro);
        }
    }
    
    // Função para listar imagens dos favoritos
    private void listarImagensFavoritos() {
        try {
            LivroDAO objlivrodao = new LivroDAO();
            
            ArrayList<LivroDTO> lista = objlivrodao.pesquisarFavoritos(objusuariodto);
            
            String imagemf1, imagemf2, imagemf3, imagemf4, imagemf5;
            
            if (lista.size() >= 1) {
                imagemf1 = lista.get(0).getImagem_livro();
                ImageIcon imagem1 = new ImageIcon(imagemf1);
                lblImagemF1.setIcon(new ImageIcon(imagem1.getImage().getScaledInstance(lblImagemF1.getWidth(), lblImagemF1.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 2) {
                imagemf2 = lista.get(1).getImagem_livro();
                ImageIcon imagem2 = new ImageIcon(imagemf2);
                lblImagemF2.setIcon(new ImageIcon(imagem2.getImage().getScaledInstance(lblImagemF2.getWidth(), lblImagemF2.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 3) {
                imagemf3 = lista.get(2).getImagem_livro();
                ImageIcon imagem3 = new ImageIcon(imagemf3);
                lblImagemF3.setIcon(new ImageIcon(imagem3.getImage().getScaledInstance(lblImagemF3.getWidth(), lblImagemF3.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 4) {
                imagemf4 = lista.get(3).getImagem_livro();
                ImageIcon imagem4 = new ImageIcon(imagemf4);
                lblImagemF4.setIcon(new ImageIcon(imagem4.getImage().getScaledInstance(lblImagemF4.getWidth(), lblImagemF4.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 5) {
                imagemf5 = lista.get(4).getImagem_livro();
                ImageIcon imagem5 = new ImageIcon(imagemf5);
                lblImagemF5.setIcon(new ImageIcon(imagem5.getImage().getScaledInstance(lblImagemF5.getWidth(), lblImagemF5.getHeight(), Image.SCALE_DEFAULT)));
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "frmUserMeuslivrosVIEW" + erro);
        }
    }
}