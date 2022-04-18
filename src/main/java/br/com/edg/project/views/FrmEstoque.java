/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.edg.project.views;

import br.com.edg.project.service.Validador;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dell
 */
public class FrmEstoque extends javax.swing.JFrame {

    /**
     * Creates new form FrmEstoque
     */
    public FrmEstoque() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pblEstoque = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();
        pnlInfo = new javax.swing.JPanel();
        lblCod = new javax.swing.JLabel();
        txtCodProduto = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lblQuant = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        lblVal = new javax.swing.JLabel();
        txtValidade = new javax.swing.JFormattedTextField();
        btnDeletar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pblEstoque.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 0, 24))); // NOI18N

        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código do Produto", "Nome ", "Quantidade", "Validade"
            }
        ));
        jScrollPane1.setViewportView(tblEstoque);

        javax.swing.GroupLayout pblEstoqueLayout = new javax.swing.GroupLayout(pblEstoque);
        pblEstoque.setLayout(pblEstoqueLayout);
        pblEstoqueLayout.setHorizontalGroup(
            pblEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pblEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 708, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pblEstoqueLayout.setVerticalGroup(
            pblEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pblEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editar Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 0, 18))); // NOI18N

        lblCod.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblCod.setText("Código do produto:");

        txtCodProduto.setName("Código do Produto"); // NOI18N
        txtCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProdutoKeyTyped(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblNome.setText("Nome do produto:");

        txtNomeProduto.setName("Nome do Produto"); // NOI18N
        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });
        txtNomeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeProdutoKeyTyped(evt);
            }
        });

        lblQuant.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblQuant.setText("Quantidade:");

        txtQuantidade.setName("Quantidade"); // NOI18N
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });
        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyTyped(evt);
            }
        });

        lblVal.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblVal.setText("Validade:");

        try {
            txtValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("Fab: ##/#### - Venc: ##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtValidade.setName("Validade"); // NOI18N
        txtValidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValidadeKeyTyped(evt);
            }
        });

        btnDeletar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnDeletar.setText("DELETAR");
        btnDeletar.setEnabled(false);
        btnDeletar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeletar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.setEnabled(false);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnMenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnMenu.setText("VOLTAR AO MENU");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodProduto)
                            .addComponent(txtValidade, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtQuantidade)
                            .addComponent(lblQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQuant)
                .addGap(4, 4, 4)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblVal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pblEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pblEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        try {
            if(Validador.validaString(txtCodProduto)) {
                btnDeletar.setEnabled(true);
                btnEditar.setEnabled(true);
            }           
            
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Falha na conversão", JOptionPane.WARNING_MESSAGE);

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Campo obrigatório", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        FrmTelaInicial menu = new FrmTelaInicial();
        
        menu.setLocationRelativeTo(null);
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int indiceLinha = tblEstoque.getSelectedRow();
        DefaultTableModel produto = (DefaultTableModel) tblEstoque.getModel();
        
        if(indiceLinha >= 0) {
            produto.removeRow(indiceLinha);
        } else{
            JOptionPane.showMessageDialog(this, "Selecione uma linha", "Linha não selecionada", 3);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void txtCodProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdutoKeyTyped
        if(txtCodProduto.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodProdutoKeyTyped

    private void txtNomeProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeProdutoKeyTyped
        if (txtNomeProduto.getText().length() >= 120) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNomeProdutoKeyTyped

    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
        if(txtQuantidade.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtQuantidadeKeyTyped

    private void txtValidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValidadeKeyTyped

    }//GEN-LAST:event_txtValidadeKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int indiceLinha = tblEstoque.getSelectedRow();
        DefaultTableModel produto = (DefaultTableModel) tblEstoque.getModel();
        
        if(indiceLinha >= 0) {
            //
        } else{
            JOptionPane.showMessageDialog(this, "Selecione uma linha", "Linha não selecionada", 3);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuant;
    private javax.swing.JLabel lblVal;
    private javax.swing.JPanel pblEstoque;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JTable tblEstoque;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JFormattedTextField txtValidade;
    // End of variables declaration//GEN-END:variables
}
