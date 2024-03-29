/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.TelaViewController;
import Model.Produto;
import Service.ProdutoService;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rapha
 */
public class CriarProduto extends javax.swing.JFrame {

    /**
     * Creates new form CriarProduto
     */
    public CriarProduto() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

        DefaultTableCellRenderer head_render = new DefaultTableCellRenderer();
        head_render.setBackground(new Color(254,254,254));
        tabela.getTableHeader().setDefaultRenderer(head_render);
        head_render.setOpaque(true);

        atualizarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        botaoVoltar = new javax.swing.JButton();
        botaoCriarItem = new javax.swing.JButton();
        labelDescricao = new javax.swing.JLabel();
        labelPreco = new javax.swing.JLabel();
        campoDeTexto_Descricao = new javax.swing.JTextField();
        campoDeTexto_ID = new javax.swing.JTextField();
        botaoEditarItem = new javax.swing.JButton();
        labelID = new javax.swing.JLabel();
        campoDeTexto_Preco = new javax.swing.JTextField();
        labelQtdEstoque1 = new javax.swing.JLabel();
        campoDeTexto_QtdEstoque = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Produto");
        setMinimumSize(new java.awt.Dimension(10, 10));

        jPanel1.setBackground(new java.awt.Color(180, 142, 243));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Preço R$", "Em estoque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabela.setShowGrid(true);
        jScrollPane1.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(200);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(200);
            tabela.getColumnModel().getColumn(0).setMaxWidth(200);
            tabela.getColumnModel().getColumn(2).setMinWidth(300);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(300);
            tabela.getColumnModel().getColumn(2).setMaxWidth(300);
        }

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));

        botaoVoltar.setBackground(new java.awt.Color(254, 254, 254));
        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/back.png"))); // NOI18N
        botaoVoltar.setText("<html><br />Voltar</html>");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoCriarItem.setBackground(new java.awt.Color(254, 254, 254));
        botaoCriarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Add.png"))); // NOI18N
        botaoCriarItem.setText("<html><br />Criar Novo Item</html>");
        botaoCriarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarItemActionPerformed(evt);
            }
        });

        labelDescricao.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelDescricao.setText("Descrição");

        labelPreco.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelPreco.setText("Preço ");

        campoDeTexto_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeTexto_IDActionPerformed(evt);
            }
        });

        botaoEditarItem.setBackground(new java.awt.Color(254, 254, 254));
        botaoEditarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Icon Editor.png"))); // NOI18N
        botaoEditarItem.setText("Editar Item");
        botaoEditarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarItemActionPerformed(evt);
            }
        });

        labelID.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelID.setText("ID");

        campoDeTexto_Preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeTexto_PrecoActionPerformed(evt);
            }
        });

        labelQtdEstoque1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        labelQtdEstoque1.setText("Quantidade em estoque");

        campoDeTexto_QtdEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDeTexto_QtdEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoEditarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(botaoCriarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelDescricao)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(labelPreco)
                                .addComponent(campoDeTexto_Descricao, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                                .addComponent(campoDeTexto_ID)
                                .addComponent(labelID)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(campoDeTexto_Preco)
                        .addContainerGap())
                    .addComponent(campoDeTexto_QtdEstoque)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelQtdEstoque1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoDeTexto_Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(labelPreco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoDeTexto_Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(labelQtdEstoque1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoDeTexto_QtdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(labelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoDeTexto_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoCriarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoEditarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1286, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCriarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarItemActionPerformed
        Produto produto = new Produto();
        TelaViewController controller = new TelaViewController();
        ProdutoService service = new ProdutoService();

        float Preco;
        int QtdEstoque;

        try {
            if ("".equals(campoDeTexto_Preco.getText()) || " ".equals(campoDeTexto_Preco.getText())) { Preco = 0; } else { Preco = Float.parseFloat(campoDeTexto_Preco.getText()); }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Preço não é um Número", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            if ("".equals(campoDeTexto_QtdEstoque.getText()) || " ".equals(campoDeTexto_QtdEstoque.getText())) { QtdEstoque = 0; } else { QtdEstoque = Integer.parseInt(campoDeTexto_QtdEstoque.getText()); }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Quantidade de estoque não é um Número", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        produto.setDescricao(String.valueOf(campoDeTexto_Descricao.getText()));
        produto.setPreco(Preco);
        produto.setQtdEstoque(QtdEstoque);

        if (!controller.validarCriacaoDeProduto(produto)) {
            JOptionPane.showMessageDialog(null, controller.getCodigoDeErro(), "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (service.CriarProduto(produto)){
            JOptionPane.showMessageDialog(null, "Item criado com sucesso", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela();
        } else {
            JOptionPane.showMessageDialog(null, service.getCodigoDeErro(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoCriarItemActionPerformed

    private void campoDeTexto_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeTexto_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeTexto_IDActionPerformed

    private void botaoEditarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarItemActionPerformed
        Produto produto = new Produto();
        TelaViewController controller = new TelaViewController();
        ProdutoService service = new ProdutoService();

        float Preco = 0;
        int QtdEstoque = 0, ID = 0;

        try {
            if ("".equals(campoDeTexto_Preco.getText()) || " ".equals(campoDeTexto_Preco.getText())) { Preco = 0; } else { Preco = Float.parseFloat(campoDeTexto_Preco.getText()); }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Preço não é um Número", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            if ("".equals(campoDeTexto_QtdEstoque.getText()) || " ".equals(campoDeTexto_QtdEstoque.getText())) { QtdEstoque = 0; } else { QtdEstoque = Integer.parseInt(campoDeTexto_QtdEstoque.getText()); }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Quantidade de estoque não é um Número", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            if ("".equals(campoDeTexto_ID.getText()) || " ".equals(campoDeTexto_ID.getText())) { ID = 0; } else { JOptionPane.showMessageDialog(null, "Não há ID para identificar produto", "ERRO", JOptionPane.ERROR_MESSAGE); return; }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID não é um Número", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ID = Integer.parseInt(campoDeTexto_ID.getText());

        produto.setDescricao(String.valueOf(campoDeTexto_Descricao.getText()));
        produto.setPreco(Preco);
        produto.setQtdEstoque(QtdEstoque);
        produto.setId(ID);

        if (!controller.validarEdicaoDeProduto(produto)) {
            JOptionPane.showMessageDialog(null, controller.getCodigoDeErro(), "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (service.EditarProduto(produto)) {
            JOptionPane.showMessageDialog(null, "Item editado com sucesso", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            atualizarTabela();
        } else {
            JOptionPane.showMessageDialog(null, service.getCodigoDeErro(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoEditarItemActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void campoDeTexto_PrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeTexto_PrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeTexto_PrecoActionPerformed

    private void campoDeTexto_QtdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDeTexto_QtdEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDeTexto_QtdEstoqueActionPerformed


    private void atualizarTabela() {
        ProdutoService produtoService = new ProdutoService();
        List<Produto> produtos = new ArrayList(produtoService.AtualizarTabelaDeProdutos());
        int n = produtos.size();
        DefaultTableModel dfm = (DefaultTableModel) tabela.getModel();

        dfm.removeRow(0);
        for (int i = 0; i < dfm.getRowCount(); i++) {
            dfm.removeRow(i);
        }

        dfm.setRowCount(0);

        for (int i = 0; i < n; i++) {
            Produto produto = (Produto) produtos.get(i);
            dfm.insertRow(i, produtoService.AdicionarItem(produto));
        }
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCriarItem;
    private javax.swing.JButton botaoEditarItem;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField campoDeTexto_Descricao;
    private javax.swing.JTextField campoDeTexto_ID;
    private javax.swing.JTextField campoDeTexto_Preco;
    private javax.swing.JTextField campoDeTexto_QtdEstoque;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescricao;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JLabel labelQtdEstoque1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
