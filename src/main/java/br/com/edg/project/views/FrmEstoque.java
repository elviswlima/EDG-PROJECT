/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.edg.project.views;

import br.com.edg.project.controller.EstoqueController;
import br.com.edg.project.model.Produto;
import br.com.edg.project.service.Validador;
import java.sql.Date;
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
                "Código do Produto", "Nome ", "Valor", "Qtde", "Kg", "Validade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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

        txtCodProduto.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        txtCodProduto.setName("Código do Produto"); // NOI18N
        txtCodProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdutoActionPerformed(evt);
            }
        });
        txtCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProdutoKeyTyped(evt);
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
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(txtCodProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnDeletar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblEstoque.getModel();
        Produto prod = new Produto();
        /* ArrayList para receber valores */
        
        if (modelo.getRowCount() > 0) {
            for (int i = 0; i <= modelo.getRowCount(); i++) {
                modelo.removeRow(0);
            }
        }
        
        try {
            /* Try catch para validar que, o que está dentro do try vai ser executado com sucesso, se não, entra no catch.*/

            Validador.validaInteger(txtCodProduto);
            /* Chama o método da classe <b>Validador</b> para validação do text field*/
            prod = EstoqueController.consultarEstoque(Integer.parseInt(txtCodProduto.getText()));
            /* prod recebe valores da controller para exibição */

            if (prod.getNomeProduto() != null) {
                /* Se os dados existirem, os botões "deletar" e "editar" sãoa ativados */
                btnDeletar.setEnabled(true);
                btnEditar.setEnabled(true);

                Object[] at = {prod.getCodProduto(), prod.getNomeProduto(), prod.getValorProduto(),
                    prod.getQtdeProduto(), prod.getQtdePorKg(), prod.getValidade()};

                modelo.addRow(at);
            } else {
                JOptionPane.showMessageDialog(this, "Não existe produto para consulta.");
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERRO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        FrmTelaInicial menu = new FrmTelaInicial();
        /* criamos objeto da tela inicial */

        menu.setLocationRelativeTo(null);
        /* Para iniciar frame no centro da tela */
        menu.setVisible(true);
        /* chamamos a tela inicial (menu) */
        dispose();
        /* Fechamos a tela estoque */
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int indiceLinha = tblEstoque.getSelectedRow();
        /* Variável do tipo int para armazenar linha selecionada na tabela */
        DefaultTableModel linha = (DefaultTableModel) tblEstoque.getModel();

        if (indiceLinha >= 0) {
            /* If se a linha foi selecionada */
            boolean resultado = EstoqueController.excluirProduto(Integer.parseInt(linha.getValueAt(indiceLinha, 0).toString()));
            /* Variável booleana para saber se produto foi deletado ou não */

            if (resultado) {
                /* Se for deletado, remove linha tbm da tabela que está na frame */
                linha.removeRow(indiceLinha);
                JOptionPane.showMessageDialog(this, "Linha deletada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao deletar", "Erro ao deletar", 3);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para deletar", "Erro ao deletar", 3);
        }

    }//GEN-LAST:event_btnDeletarActionPerformed

    private void txtCodProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdutoKeyTyped
        /* Validação de quantidade de caracteres */
        if (txtCodProduto.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCodProdutoKeyTyped

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int indiceLinha = tblEstoque.getSelectedRow();
        /* Variável do tipo int para armazenar linha selecionada na tabela */
        DefaultTableModel linha = (DefaultTableModel) tblEstoque.getModel();

        Produto produto = new Produto();
        /* Objeto da classe Produto instanciado */

        produto.setCodProduto(Integer.parseInt(linha.getValueAt(indiceLinha, 0).toString()));
        produto.setNomeProduto(linha.getValueAt(indiceLinha, 1).toString());
        produto.setValorProduto(Double.parseDouble(linha.getValueAt(indiceLinha, 2).toString()));
        produto.setQtdeProduto(Integer.parseInt(linha.getValueAt(indiceLinha, 3).toString()));
        produto.setQtdePorKg(Double.parseDouble(linha.getValueAt(indiceLinha, 4).toString()));
        produto.setValidade(Date.valueOf(linha.getValueAt(indiceLinha, 5).toString()));
        
        if (indiceLinha >= 0) {
            boolean validate = EstoqueController.alterarProduto(produto);

            if (validate) {
                JOptionPane.showMessageDialog(this, "Linha alterado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Falha ao alterar", "Erro ao alterar", 3);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para alterar", "Erro ao alterar", 3);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtCodProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdutoActionPerformed

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
    private javax.swing.JPanel pblEstoque;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JTable tblEstoque;
    private javax.swing.JTextField txtCodProduto;
    // End of variables declaration//GEN-END:variables
}
