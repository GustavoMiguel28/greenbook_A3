package VIEW;

import DAO.LivroDAO;
import DTO.LivroDTO;
import DTO.UsuarioDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author Gustavo Moreno
 */

public class frmUserMeuslivrosMeuslivrosVIEW extends javax.swing.JFrame {

    UsuarioDTO objusuariodto;
    
    public frmUserMeuslivrosMeuslivrosVIEW(UsuarioDTO objusuariodto) {
        initComponents();
        this.objusuariodto = objusuariodto;
        listarMeusLivros();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLivros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrarLivro = new javax.swing.JButton();
        btnExcluirLivro = new javax.swing.JButton();
        btnEditarLivro = new javax.swing.JButton();

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
                .addContainerGap(619, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(192, 192, 192)
                    .addComponent(btnBiblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnMeuslivros, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(btnRecomendados, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(192, Short.MAX_VALUE)))
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

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        tblLivros.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tblLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Autor", "Gênero", "Avaliações", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLivros.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblLivros.setMaximumSize(new java.awt.Dimension(2147483647, 1000));
        tblLivros.setMinimumSize(new java.awt.Dimension(628, 290));
        tblLivros.setName(""); // NOI18N
        jScrollPane1.setViewportView(tblLivros);
        if (tblLivros.getColumnModel().getColumnCount() > 0) {
            tblLivros.getColumnModel().getColumn(0).setPreferredWidth(35);
            tblLivros.getColumnModel().getColumn(1).setPreferredWidth(268);
            tblLivros.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(88, 175, 156));
        jLabel1.setText("GREENBOOK");

        btnCadastrarLivro.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnCadastrarLivro.setText("Cadastrar novo livro");
        btnCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLivroActionPerformed(evt);
            }
        });

        btnExcluirLivro.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnExcluirLivro.setText("Excluir livro");
        btnExcluirLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLivroActionPerformed(evt);
            }
        });

        btnEditarLivro.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnEditarLivro.setText("Editar livro");
        btnEditarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarLivro)
                        .addGap(272, 272, 272)
                        .addComponent(btnExcluirLivro))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(666, 666, 666)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCadastrarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(btnEditarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addComponent(btnExcluirLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Botão para ir a tela de cadastro de livro
    private void btnCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLivroActionPerformed
        frmUserMeuslivrosCadastrarVIEW objfrmusermeuslivroscadastrarview = new frmUserMeuslivrosCadastrarVIEW(objusuariodto);
        objfrmusermeuslivroscadastrarview.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCadastrarLivroActionPerformed

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

    // Botão para excluir livro
    private void btnExcluirLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLivroActionPerformed
        int index = tblLivros.getSelectedRow();

        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um livro!");
        } else {
            excluirLivro();
            listarMeusLivros();

            JOptionPane.showMessageDialog(null, "Livro excluido do sistema!");
        }
    }//GEN-LAST:event_btnExcluirLivroActionPerformed

    // Botão para ir a tela de edição de livro
    private void btnEditarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLivroActionPerformed
        int index = tblLivros.getSelectedRow();
        
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um livro!");
        } else {
            LivroDTO objlivrodto = livroEditarSelecionado();
        
            frmUserMeuslivrosEditarVIEW objfrmusermeuslivroseditarview = new frmUserMeuslivrosEditarVIEW(objlivrodto, this.objusuariodto);
            objfrmusermeuslivroseditarview.setVisible(true);
        
            dispose();
        }
    }//GEN-LAST:event_btnEditarLivroActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmUserMeuslivrosMeuslivrosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUserMeuslivrosMeuslivrosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUserMeuslivrosMeuslivrosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUserMeuslivrosMeuslivrosVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UsuarioDTO objusuariodto = new UsuarioDTO();
                new frmUserMeuslivrosMeuslivrosVIEW(objusuariodto).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBiblioteca;
    private javax.swing.JButton btnCadastrarLivro;
    private javax.swing.JButton btnEditarLivro;
    private javax.swing.JButton btnExcluirLivro;
    private javax.swing.JButton btnMeuslivros;
    private javax.swing.JButton btnRecomendados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLivros;
    // End of variables declaration//GEN-END:variables
    
    // Função para listar meus livros
    private void listarMeusLivros() {
        try {
            LivroDAO objlivrodao = new LivroDAO();
            
            DefaultTableModel model = (DefaultTableModel) tblLivros.getModel();
            model.setNumRows(0);
            
            ArrayList<LivroDTO> lista = objlivrodao.pesquisarMeusLivros(objusuariodto);
            
            for(int num = 0; num < lista.size(); num ++) {
                model.addRow(new Object[] {
                    lista.get(num).getId_livro(),
                    lista.get(num).getNome_livro(),
                    lista.get(num).getAutor_livro(),
                    lista.get(num).getGenero_livro(),
                    lista.get(num).getQtd_notas(),
                    lista.get(num).getNota_livro()
                });
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "frmUserMeuslivrosMeuslivrosVIEW" + erro);
        }
    }
    
    // Função para identificar livro selecionado para edição
    private LivroDTO livroEditarSelecionado() {
        int index = tblLivros.getSelectedRow();
        
        int id_livro, qtd_notas;
        String nome_livro, autor_livro, genero_livro;
        double nota_livro;
        
        id_livro = Integer.parseInt(tblLivros.getModel().getValueAt(index, 0).toString());
        nome_livro = tblLivros.getModel().getValueAt(index, 1).toString();
        autor_livro = tblLivros.getModel().getValueAt(index, 2).toString();
        genero_livro = tblLivros.getModel().getValueAt(index, 3).toString();
        qtd_notas = Integer.parseInt(tblLivros.getModel().getValueAt(index, 4).toString());
        nota_livro = Double.parseDouble(tblLivros.getModel().getValueAt(index, 5).toString());
        
        LivroDTO objlivrodto = new LivroDTO();
        objlivrodto.setId_livro(id_livro);
        objlivrodto.setNome_livro(nome_livro);
        objlivrodto.setAutor_livro(autor_livro);
        objlivrodto.setGenero_livro(genero_livro);
        objlivrodto.setQtd_notas(qtd_notas);
        objlivrodto.setNota_livro(nota_livro);
        
        return objlivrodto;
    }
    
    // Função para excluir livro
    private void excluirLivro() {
        int index = tblLivros.getSelectedRow();
        
        int id_livro = Integer.parseInt(tblLivros.getModel().getValueAt(index, 0).toString());
        
        LivroDTO objlivrodto = new LivroDTO();
        objlivrodto.setId_livro(id_livro);
        
        LivroDAO objlivrodao = new LivroDAO();
        objlivrodao.excluirLivro(objlivrodto);
    }
}