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

public class frmUserRecomendadosVIEW extends javax.swing.JFrame {

    UsuarioDTO objusuariodto;
    
    public frmUserRecomendadosVIEW(UsuarioDTO objusuariodto) {
        initComponents();
        this.objusuariodto = objusuariodto;
        listarImagensRecomendados();
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
        btnRecomendadosMais = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblImagemR1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblImagemR2 = new javax.swing.JLabel();
        lblImagemR3 = new javax.swing.JLabel();
        lblImagemR4 = new javax.swing.JLabel();
        lblImagemR5 = new javax.swing.JLabel();
        lblImagemR6 = new javax.swing.JLabel();
        lblImagemR7 = new javax.swing.JLabel();
        lblImagemR8 = new javax.swing.JLabel();
        lblImagemR9 = new javax.swing.JLabel();
        lblImagemR10 = new javax.swing.JLabel();

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

        btnRecomendadosMais.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnRecomendadosMais.setText("+");
        btnRecomendadosMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecomendadosMaisActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(88, 175, 156));
        jLabel1.setText("GREENBOOK");

        lblImagemR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemR1.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemR1.setMinimumSize(new java.awt.Dimension(60, 60));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel3.setText("Recomendados para você:");

        lblImagemR2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemR2.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemR2.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemR3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemR3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemR3.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemR3.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemR4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemR4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemR4.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemR4.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemR5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemR5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemR5.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemR5.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemR6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemR6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemR6.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemR6.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemR7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemR7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemR7.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemR7.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemR8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemR8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemR8.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemR8.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemR9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemR9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemR9.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemR9.setMinimumSize(new java.awt.Dimension(60, 60));

        lblImagemR10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemR10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_Imagens/Capas/padrao_pequeno.jpg"))); // NOI18N
        lblImagemR10.setMaximumSize(new java.awt.Dimension(60, 60));
        lblImagemR10.setMinimumSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblImagemR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblImagemR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblImagemR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblImagemR4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblImagemR5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnRecomendadosMais, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblImagemR6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblImagemR7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblImagemR8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblImagemR9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblImagemR10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(664, 664, 664)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagemR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemR3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemR4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemR5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRecomendadosMais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagemR6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemR7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemR8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemR9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagemR10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Botão para ir a tela detalhada dos recomendados
    private void btnRecomendadosMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecomendadosMaisActionPerformed
        frmUserRecomendadosMaisVIEW objfrmuserrecomendadosmaisview = new frmUserRecomendadosMaisVIEW(objusuariodto);
        objfrmuserrecomendadosmaisview.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnRecomendadosMaisActionPerformed

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
            java.util.logging.Logger.getLogger(frmUserRecomendadosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUserRecomendadosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUserRecomendadosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUserRecomendadosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UsuarioDTO objusuariodto = new UsuarioDTO();
                new frmUserRecomendadosVIEW(objusuariodto).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBiblioteca;
    private javax.swing.JButton btnMeuslivros;
    private javax.swing.JButton btnRecomendados;
    private javax.swing.JButton btnRecomendadosMais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagemR1;
    private javax.swing.JLabel lblImagemR10;
    private javax.swing.JLabel lblImagemR2;
    private javax.swing.JLabel lblImagemR3;
    private javax.swing.JLabel lblImagemR4;
    private javax.swing.JLabel lblImagemR5;
    private javax.swing.JLabel lblImagemR6;
    private javax.swing.JLabel lblImagemR7;
    private javax.swing.JLabel lblImagemR8;
    private javax.swing.JLabel lblImagemR9;
    // End of variables declaration//GEN-END:variables

    // Função para listar imagens dos recomendados
    private void listarImagensRecomendados() {
        try {
            LivroDAO objlivrodao = new LivroDAO();
            
            ArrayList<LivroDTO> lista = objlivrodao.pesquisarRecomendados(objusuariodto);
            
            String imagemr1, imagemr2, imagemr3, imagemr4, imagemr5, imagemr6, imagemr7, imagemr8, imagemr9, imagemr10;
            
            if (lista.size() >= 1) {
                imagemr1 = lista.get(0).getImagem_livro();
                ImageIcon imagem1 = new ImageIcon(imagemr1);
                lblImagemR1.setIcon(new ImageIcon(imagem1.getImage().getScaledInstance(lblImagemR1.getWidth(), lblImagemR1.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 2) {
                imagemr2 = lista.get(1).getImagem_livro();
                ImageIcon imagem2 = new ImageIcon(imagemr2);
                lblImagemR2.setIcon(new ImageIcon(imagem2.getImage().getScaledInstance(lblImagemR2.getWidth(), lblImagemR2.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 3) {
                imagemr3 = lista.get(2).getImagem_livro();
                ImageIcon imagem3 = new ImageIcon(imagemr3);
                lblImagemR3.setIcon(new ImageIcon(imagem3.getImage().getScaledInstance(lblImagemR3.getWidth(), lblImagemR3.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 4) {
                imagemr4 = lista.get(3).getImagem_livro();
                ImageIcon imagem4 = new ImageIcon(imagemr4);
                lblImagemR4.setIcon(new ImageIcon(imagem4.getImage().getScaledInstance(lblImagemR4.getWidth(), lblImagemR4.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 5) {
                imagemr5 = lista.get(4).getImagem_livro();
                ImageIcon imagem5 = new ImageIcon(imagemr5);
                lblImagemR5.setIcon(new ImageIcon(imagem5.getImage().getScaledInstance(lblImagemR5.getWidth(), lblImagemR5.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 6) {
                imagemr6 = lista.get(5).getImagem_livro();
                ImageIcon imagem6 = new ImageIcon(imagemr6);
                lblImagemR6.setIcon(new ImageIcon(imagem6.getImage().getScaledInstance(lblImagemR6.getWidth(), lblImagemR6.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 7) {
                imagemr7 = lista.get(6).getImagem_livro();
                ImageIcon imagem7 = new ImageIcon(imagemr7);
                lblImagemR7.setIcon(new ImageIcon(imagem7.getImage().getScaledInstance(lblImagemR7.getWidth(), lblImagemR7.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 8) {
                imagemr8 = lista.get(7).getImagem_livro();
                ImageIcon imagem8 = new ImageIcon(imagemr8);
                lblImagemR8.setIcon(new ImageIcon(imagem8.getImage().getScaledInstance(lblImagemR8.getWidth(), lblImagemR8.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 9) {
                imagemr9 = lista.get(8).getImagem_livro();
                ImageIcon imagem9 = new ImageIcon(imagemr9);
                lblImagemR9.setIcon(new ImageIcon(imagem9.getImage().getScaledInstance(lblImagemR9.getWidth(), lblImagemR9.getHeight(), Image.SCALE_DEFAULT)));
            }
            
            if (lista.size() >= 10) {
                imagemr10 = lista.get(9).getImagem_livro();
                ImageIcon imagem10 = new ImageIcon(imagemr10);
                lblImagemR10.setIcon(new ImageIcon(imagem10.getImage().getScaledInstance(lblImagemR10.getWidth(), lblImagemR10.getHeight(), Image.SCALE_DEFAULT)));
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "frmUserMeuslivrosVIEW" + erro);
        }
    }
}