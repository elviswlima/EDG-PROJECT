/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.edg.project.views;

import br.com.edg.project.controller.CaixaController;
import br.com.edg.project.controller.EstoqueController;
import br.com.edg.project.controller.NotaFiscalController;
import br.com.edg.project.controller.ProdutoController;
import br.com.edg.project.model.Caixa;
import br.com.edg.project.model.Cliente;
import br.com.edg.project.model.Produto;
import br.com.edg.project.service.Validador;
import br.com.edg.project.utils.SomaTotalUtils;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Tela de venda (Caixa)
 * 
 * @author Dell
 */
public class FrmCaixa extends javax.swing.JFrame {

    /**
     * Creates new form FrmCaixa
     */
    public FrmCaixa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupFormaPagamento = new javax.swing.ButtonGroup();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListaProduto = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        txtCodProduto = new javax.swing.JTextField();
        lblCodProduto = new javax.swing.JLabel();
        lblTotalCompra = new javax.swing.JLabel();
        txtValorCompra = new javax.swing.JFormattedTextField();
        btnRemoveProduto = new javax.swing.JButton();
        btnAddProd = new javax.swing.JButton();
        btnFinalizarCompra = new javax.swing.JButton();
        ldlCpfCliente = new javax.swing.JLabel();
        txtCpfPesquisa = new javax.swing.JTextField();
        btnPesquisarCpf = new javax.swing.JButton();
        lblQuantidade = new javax.swing.JLabel();
        txtQuantidadeProduto = new javax.swing.JTextField();
        chkKg = new javax.swing.JCheckBox();
        lblPeso = new javax.swing.JLabel();
        txtPesoProduto = new javax.swing.JTextField();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.setMaximizable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Caixa");
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(1140, 600));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Produtos"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(295, 295, 295))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 0, 24))); // NOI18N

        tblListaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??d. Produto", "Nome", "Validade", "Valor", "Quantidade", "Cliente", "Kg ?"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblListaProduto);
        if (tblListaProduto.getColumnModel().getColumnCount() > 0) {
            tblListaProduto.getColumnModel().getColumn(0).setResizable(false);
            tblListaProduto.getColumnModel().getColumn(1).setResizable(false);
            tblListaProduto.getColumnModel().getColumn(2).setResizable(false);
            tblListaProduto.getColumnModel().getColumn(3).setResizable(false);
            tblListaProduto.getColumnModel().getColumn(4).setResizable(false);
            tblListaProduto.getColumnModel().getColumn(5).setResizable(false);
            tblListaProduto.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informa????es de Compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 0, 18))); // NOI18N

        txtCodProduto.setEnabled(false);
        txtCodProduto.setName("C??digo do Produto"); // NOI18N
        txtCodProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProdutoKeyTyped(evt);
            }
        });

        lblCodProduto.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblCodProduto.setText("C??digo do Produto: ");

        lblTotalCompra.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTotalCompra.setText("Total da Compra");

        txtValorCompra.setEditable(false);
        txtValorCompra.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtValorCompra.setName("Valor total da compra"); // NOI18N
        txtValorCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorCompraKeyTyped(evt);
            }
        });

        btnRemoveProduto.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnRemoveProduto.setText("REMOVER PRODUTO ");
        btnRemoveProduto.setEnabled(false);
        btnRemoveProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveProdutoActionPerformed(evt);
            }
        });

        btnAddProd.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnAddProd.setText("ADICIONAR PRODUTO");
        btnAddProd.setEnabled(false);
        btnAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdActionPerformed(evt);
            }
        });

        btnFinalizarCompra.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnFinalizarCompra.setText("Finalizar Compra");
        btnFinalizarCompra.setEnabled(false);
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });

        ldlCpfCliente.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        ldlCpfCliente.setText("CPF Cliente:");

        txtCpfPesquisa.setName("CPF "); // NOI18N
        txtCpfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCpfPesquisaKeyTyped(evt);
            }
        });

        btnPesquisarCpf.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        btnPesquisarCpf.setText("Pesquisar");
        btnPesquisarCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarCpfActionPerformed(evt);
            }
        });

        lblQuantidade.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblQuantidade.setText("Quantidade:");

        txtQuantidadeProduto.setEnabled(false);
        txtQuantidadeProduto.setName("Quantidade"); // NOI18N
        txtQuantidadeProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeProdutoKeyTyped(evt);
            }
        });

        chkKg.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        chkKg.setText("?? por kg?");
        chkKg.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkKgItemStateChanged(evt);
            }
        });
        chkKg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkKgActionPerformed(evt);
            }
        });

        lblPeso.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        lblPeso.setText("Peso em KG:");

        txtPesoProduto.setEnabled(false);
        txtPesoProduto.setName("Peso"); // NOI18N
        txtPesoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoProdutoKeyTyped(evt);
            }
        });

        btnMenu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnMenu.setText("Voltar para tela inicial");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCpfPesquisa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisarCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtValorCompra)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnRemoveProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(ldlCpfCliente))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(btnAddProd))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblQuantidade))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(lblCodProduto))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblPeso)
                                .addGap(30, 30, 30)
                                .addComponent(chkKg)))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCodProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPesoProduto)
                            .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTotalCompra)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(ldlCpfCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCpfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnPesquisarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblCodProduto)
                .addGap(3, 3, 3)
                .addComponent(txtCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPeso)
                    .addComponent(chkKg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQuantidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAddProd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoveProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblTotalCompra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 516, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 515, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 363, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 364, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Bot??o para voltar ?? tela inicial
     * @param evt 
     */
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        FrmTelaInicial frmTelaInicial = new FrmTelaInicial();
        frmTelaInicial.setLocationRelativeTo(null);
        frmTelaInicial.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    /**
     * Bot??o para remover produto da compra
     * @param evt 
     */
    private void btnRemoveProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveProdutoActionPerformed

    private void txtPesoProdutoKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtPesoProdutoKeyTyped
        if (txtPesoProduto.getText().length() >= 16) {
            evt.consume();
        }
    }// GEN-LAST:event_txtPesoProdutoKeyTyped

    private void txtQuantidadeProdutoKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtQuantidadeProdutoKeyTyped
        if (txtQuantidadeProduto.getText().length() >= 10) {
            evt.consume();
        }
    }// GEN-LAST:event_txtQuantidadeProdutoKeyTyped

    private void txtValorCompraKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtValorCompraKeyTyped
        if (txtValorCompra.getText().length() >= 16) {
            evt.consume();
        }
    }// GEN-LAST:event_txtValorCompraKeyTyped

    private void txtCodProdutoKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtCodProdutoKeyTyped
        if (txtCodProduto.getText().length() >= 10) {
            evt.consume();
        }
    }// GEN-LAST:event_txtCodProdutoKeyTyped

    /**
     * Bot??o para finalizar compra
     * @param evt 
     */
    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFinalizarCompraActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) tblListaProduto.getModel();
            Caixa caixa = new Caixa();
            caixa.setIdCliente(cliente.getId());
            caixa.setValorTotal(Double.parseDouble(txtValorCompra.getText()));
            caixa.setKg(0.0);
            caixa.setQtde(0);
            
            ArrayList<Produto> list = new ArrayList<>();

            for (int i = 0; i < dtm.getRowCount(); i++) {
                Produto produto = new Produto();
                produto.setCodProduto(Integer.parseInt(dtm.getValueAt(i, 0).toString()));
                produto.setNomeProduto(dtm.getValueAt(i, 1).toString());
                produto.setValidade(Date.valueOf(dtm.getValueAt(i, 2).toString()));
                produto.setValorProduto(Double.parseDouble(dtm.getValueAt(i, 3).toString()));
                
                if (dtm.getValueAt(i, 6).toString().equalsIgnoreCase("SIM")) {
                    caixa.setKg(Double.parseDouble(dtm.getValueAt(i, 4).toString()) + caixa.getKg());
                    produto.setQtdePorKg(Double.parseDouble(dtm.getValueAt(i, 4).toString()));
                } else {
                    caixa.setQtde(Integer.parseInt(dtm.getValueAt(i, 4).toString()) + caixa.getQtde());
                    produto.setQtdeProduto(Integer.parseInt(dtm.getValueAt(i, 4).toString()));
                }
                
                list.add(produto);
            }
            
            if (CaixaController.registrarVenda(caixa, list)) {
                JOptionPane.showMessageDialog(this, "Venda realizada com sucesso! ", "Produto vendido com sucesso!", JOptionPane.INFORMATION_MESSAGE);

                while (tblListaProduto.getRowCount() > 0) {
                    dtm.removeRow(0);
                }

                txtValorCompra.setText("");

                JOptionPane.showMessageDialog(this, "Nota fiscal gerada, N??: " + NotaFiscalController.findByCliente(cliente), "Nota fiscal!", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    ex.getMessage(),
                    "Erro na convers??o",
                    JOptionPane.WARNING_MESSAGE);
        }
    }// GEN-LAST:event_btnFinalizarCompraActionPerformed

    /**
     * Bot??o para pesquisar o cliente que est?? comprando ou se ele tem cadastro para realizar a compra
     * @param evt 
     */
    private void btnPesquisarCpfActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            cliente.setId(CaixaController.consultaCliente(txtCpfPesquisa.getText()));
            if (cliente.getId() > 0) {
                txtCpfPesquisa.setEditable(false);
                txtCodProduto.setEnabled(true);
                txtCodProduto.setEnabled(true);
                txtQuantidadeProduto.setEnabled(true);
                txtPesoProduto.setEnabled(false);
                txtValorCompra.setEnabled(true);
                btnAddProd.setEnabled(true);
                btnRemoveProduto.setEnabled(true);
                btnFinalizarCompra.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(this, "CPF n??o encontrado", "Erro ao consultar", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Campo obrigat??rio", JOptionPane.WARNING_MESSAGE);
        }

    }

    private void txtCpfPesquisaKeyTyped(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtCpfPesquisaKeyTyped
        if (txtCpfPesquisa.getText().length() >= 11) {
            evt.consume();
        }
    }// GEN-LAST:event_txtCpfPesquisaKeyTyped

    private void txtCpfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtCpfPesquisaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtCpfPesquisaActionPerformed

    /**
     * Bot??o para adicionar produto na compra
     * @param evt 
     */
    private void btnAddProdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddProdActionPerformed
        DefaultTableModel novoProduto = (DefaultTableModel) tblListaProduto.getModel();
        try {
            // Valida se produto existe na base, e retorna o produto pesquisado
            Produto produto = ProdutoController.findById(Integer.parseInt(txtCodProduto.getText()));

            if (produto != null && chkKg.isSelected() && produto.getQtdePorKg() >= Double.parseDouble(txtPesoProduto.getText())) { // Valida se foi retornado o produto e se ?? quilo
                novoProduto.addRow(new Object[]{
                    produto.getCodProduto(),
                    produto.getNomeProduto(),
                    produto.getValidade(),
                    produto.somaValorProduto(chkKg.isSelected(), txtPesoProduto.getText()), // Se for quilo m??ltiplica o valor do produto * quantidade por quilo
                    Double.parseDouble(txtPesoProduto.getText()),
                    cliente.getId(),
                    "SIM"
                });

                txtValorCompra.setText(
                        "" + SomaTotalUtils.somaValorTotal(
                                txtValorCompra.getText(),
                                produto.somaValorProduto(chkKg.isSelected(), txtPesoProduto.getText())
                        ));
            } else if (produto != null && !chkKg.isSelected() && produto.getQtdeProduto() >= Integer.parseInt(txtQuantidadeProduto.getText())) {
                novoProduto.addRow(new Object[]{
                    produto.getCodProduto(),
                    produto.getNomeProduto(),
                    produto.getValidade(),
                    produto.somaValorProduto(chkKg.isSelected(), txtQuantidadeProduto.getText()), // Se for quilo m??ltiplica o valor do produto * por quantidade
                    Integer.parseInt(txtQuantidadeProduto.getText()),
                    cliente.getId(),
                    "N??O"
                });
                StringBuilder sb = new StringBuilder();

                txtValorCompra.setText(
                        "" + SomaTotalUtils.somaValorTotal(
                                txtValorCompra.getText(),
                                produto.somaValorProduto(chkKg.isSelected(), txtQuantidadeProduto.getText())
                        ));
            } else {
                JOptionPane
                        .showMessageDialog(
                                this,
                                "Erro ao adicionar produto a lista, verifique o c??digo utilizado ou a quantidade solicitada",
                                "Erro ao adicionar produto", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Falha na convers??o", JOptionPane.WARNING_MESSAGE);

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Campo obrigat??rio", JOptionPane.WARNING_MESSAGE);

        }

        txtCodProduto.setText(null);
        txtPesoProduto.setText(null);
        txtQuantidadeProduto.setText(null);
    }// GEN-LAST:event_btnAddProdActionPerformed

    private void chkKgActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_chkKgActionPerformed

    }// GEN-LAST:event_chkKgActionPerformed

    private void chkKgItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_chkKgItemStateChanged
        if (chkKg.isSelected()) {
            txtPesoProduto.setEnabled(true);
            txtQuantidadeProduto.setEnabled(false);
        } else {
            txtPesoProduto.setEnabled(false);
            txtQuantidadeProduto.setEnabled(true);

        }
    }// GEN-LAST:event_chkKgItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCaixa().setVisible(true);
            }
        });
    }

    private Cliente cliente = new Cliente();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProd;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.ButtonGroup btnGroupFormaPagamento;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnPesquisarCpf;
    private javax.swing.JButton btnRemoveProduto;
    private javax.swing.JCheckBox chkKg;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCodProduto;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblTotalCompra;
    private javax.swing.JLabel ldlCpfCliente;
    private javax.swing.JTable tblListaProduto;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtCpfPesquisa;
    private javax.swing.JTextField txtPesoProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
    private javax.swing.JFormattedTextField txtValorCompra;
    // End of variables declaration//GEN-END:variables
}
