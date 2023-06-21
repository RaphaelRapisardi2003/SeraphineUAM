/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.TelaViewController;
import Model.Produto;
import Model.Venda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class FormaDePagamentoView extends javax.swing.JFrame {

    private boolean focusCartaoCredito = false;
    private boolean focusCartaoDebito = false;
    private boolean focusDinheiro = false;
    private boolean focusPix = false;

    private List<Produto> produtos;
    private Venda venda;

    /**
     * Creates new form FormaDePagamentoView
     *
     * @param produto
     */
    private int usuarioID;

    public FormaDePagamentoView(List<Produto> produto, Venda venda, int id) {
        initComponents();

        produtos = new ArrayList(produto);
        this.venda = venda;
        usuarioID = id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBordaRoxa = new javax.swing.JPanel();
        panelMain = new javax.swing.JPanel();
        panelCartaoCredito = new javax.swing.JPanel();
        CampoDeTexto_CartaoCredito = new javax.swing.JTextField();
        labelCartaoCredito = new javax.swing.JLabel();
        panelCartaoDebito = new javax.swing.JPanel();
        CampoDeTexto_CartaoDebito = new javax.swing.JTextField();
        labelCartaoDebito = new javax.swing.JLabel();
        panelDinheiro = new javax.swing.JPanel();
        CampoDeTexto_Dinheiro = new javax.swing.JTextField();
        labelDinheiro = new javax.swing.JLabel();
        panelPix = new javax.swing.JPanel();
        CampoDeTexto_Pix = new javax.swing.JTextField();
        labelPix = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        CampoDeTexto_CartaoDebito3 = new javax.swing.JTextField();
        labelDinheiro2 = new javax.swing.JLabel();
        botaoConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Forma de Pagamento");

        panelBordaRoxa.setBackground(new java.awt.Color(180, 142, 243));

        panelCartaoCredito.setBackground(new java.awt.Color(224, 224, 224));

        CampoDeTexto_CartaoCredito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CampoDeTexto_CartaoCredito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoDeTexto_CartaoCredito.setText("00.00");
        CampoDeTexto_CartaoCredito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoDeTexto_CartaoCreditoFocusGained(evt);
            }
        });
        CampoDeTexto_CartaoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDeTexto_CartaoCreditoActionPerformed(evt);
            }
        });

        labelCartaoCredito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCartaoCredito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCartaoCredito.setText("Cartão de Crédito");

        javax.swing.GroupLayout panelCartaoCreditoLayout = new javax.swing.GroupLayout(panelCartaoCredito);
        panelCartaoCredito.setLayout(panelCartaoCreditoLayout);
        panelCartaoCreditoLayout.setHorizontalGroup(
            panelCartaoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartaoCreditoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCartaoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CampoDeTexto_CartaoCredito)
                    .addComponent(labelCartaoCredito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCartaoCreditoLayout.setVerticalGroup(
            panelCartaoCreditoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartaoCreditoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelCartaoCredito)
                .addGap(45, 45, 45)
                .addComponent(CampoDeTexto_CartaoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelCartaoDebito.setBackground(new java.awt.Color(224, 224, 224));

        CampoDeTexto_CartaoDebito.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CampoDeTexto_CartaoDebito.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoDeTexto_CartaoDebito.setText("00.00");
        CampoDeTexto_CartaoDebito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoDeTexto_CartaoDebitoFocusGained(evt);
            }
        });
        CampoDeTexto_CartaoDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDeTexto_CartaoDebitoActionPerformed(evt);
            }
        });

        labelCartaoDebito.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCartaoDebito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCartaoDebito.setText("Cartão de Débito");

        javax.swing.GroupLayout panelCartaoDebitoLayout = new javax.swing.GroupLayout(panelCartaoDebito);
        panelCartaoDebito.setLayout(panelCartaoDebitoLayout);
        panelCartaoDebitoLayout.setHorizontalGroup(
            panelCartaoDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartaoDebitoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCartaoDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CampoDeTexto_CartaoDebito)
                    .addComponent(labelCartaoDebito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCartaoDebitoLayout.setVerticalGroup(
            panelCartaoDebitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartaoDebitoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelCartaoDebito)
                .addGap(45, 45, 45)
                .addComponent(CampoDeTexto_CartaoDebito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        panelDinheiro.setBackground(new java.awt.Color(224, 224, 224));

        CampoDeTexto_Dinheiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CampoDeTexto_Dinheiro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoDeTexto_Dinheiro.setText("00.00");
        CampoDeTexto_Dinheiro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoDeTexto_DinheiroFocusGained(evt);
            }
        });
        CampoDeTexto_Dinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDeTexto_DinheiroActionPerformed(evt);
            }
        });

        labelDinheiro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDinheiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDinheiro.setText("Dinheiro");
        labelDinheiro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelDinheiroLayout = new javax.swing.GroupLayout(panelDinheiro);
        panelDinheiro.setLayout(panelDinheiroLayout);
        panelDinheiroLayout.setHorizontalGroup(
            panelDinheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDinheiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDinheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(CampoDeTexto_Dinheiro))
                .addContainerGap())
        );
        panelDinheiroLayout.setVerticalGroup(
            panelDinheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDinheiroLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelDinheiro)
                .addGap(45, 45, 45)
                .addComponent(CampoDeTexto_Dinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        panelPix.setBackground(new java.awt.Color(224, 224, 224));

        CampoDeTexto_Pix.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CampoDeTexto_Pix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoDeTexto_Pix.setText("00.00");
        CampoDeTexto_Pix.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoDeTexto_PixFocusGained(evt);
            }
        });
        CampoDeTexto_Pix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDeTexto_PixActionPerformed(evt);
            }
        });

        labelPix.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPix.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPix.setText("Pix");
        labelPix.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelPixLayout = new javax.swing.GroupLayout(panelPix);
        panelPix.setLayout(panelPixLayout);
        panelPixLayout.setHorizontalGroup(
            panelPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPixLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPix, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(CampoDeTexto_Pix))
                .addContainerGap())
        );
        panelPixLayout.setVerticalGroup(
            panelPixLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPixLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelPix)
                .addGap(45, 45, 45)
                .addComponent(CampoDeTexto_Pix, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(224, 224, 224));

        CampoDeTexto_CartaoDebito3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CampoDeTexto_CartaoDebito3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CampoDeTexto_CartaoDebito3.setText("00.00");
        CampoDeTexto_CartaoDebito3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CampoDeTexto_CartaoDebito3FocusGained(evt);
            }
        });
        CampoDeTexto_CartaoDebito3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDeTexto_CartaoDebito3ActionPerformed(evt);
            }
        });

        labelDinheiro2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDinheiro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDinheiro2.setText("***");
        labelDinheiro2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDinheiro2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                    .addComponent(CampoDeTexto_CartaoDebito3))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(labelDinheiro2)
                .addGap(45, 45, 45)
                .addComponent(CampoDeTexto_CartaoDebito3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoConfirmar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botaoConfirmar.setText("Confirmar");
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(panelCartaoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(panelCartaoDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(panelDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(panelPix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(botaoConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCartaoDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelCartaoCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelPix, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout panelBordaRoxaLayout = new javax.swing.GroupLayout(panelBordaRoxa);
        panelBordaRoxa.setLayout(panelBordaRoxaLayout);
        panelBordaRoxaLayout.setHorizontalGroup(
            panelBordaRoxaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordaRoxaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBordaRoxaLayout.setVerticalGroup(
            panelBordaRoxaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBordaRoxaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBordaRoxa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBordaRoxa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoDeTexto_CartaoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDeTexto_CartaoCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDeTexto_CartaoCreditoActionPerformed

    private void CampoDeTexto_CartaoCreditoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoDeTexto_CartaoCreditoFocusGained
        if (focusCartaoCredito == false) {
            focusCartaoCredito = true;
            CampoDeTexto_CartaoDebito.setText("");
        }
    }//GEN-LAST:event_CampoDeTexto_CartaoCreditoFocusGained

    private void CampoDeTexto_CartaoDebitoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoDeTexto_CartaoDebitoFocusGained
        if (focusCartaoDebito == false) {
            focusCartaoDebito = true;
            CampoDeTexto_CartaoCredito.setText("");
        }
    }//GEN-LAST:event_CampoDeTexto_CartaoDebitoFocusGained

    private void CampoDeTexto_CartaoDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDeTexto_CartaoDebitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDeTexto_CartaoDebitoActionPerformed

    private void CampoDeTexto_DinheiroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoDeTexto_DinheiroFocusGained
        if (focusDinheiro == false) {
            focusDinheiro = true;
            CampoDeTexto_Dinheiro.setText("");
        }
    }//GEN-LAST:event_CampoDeTexto_DinheiroFocusGained

    private void CampoDeTexto_DinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDeTexto_DinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDeTexto_DinheiroActionPerformed

    private void CampoDeTexto_PixFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoDeTexto_PixFocusGained
        if (focusPix == false) {
            focusPix = true;
            CampoDeTexto_Pix.setText("");
        }
    }//GEN-LAST:event_CampoDeTexto_PixFocusGained

    private void CampoDeTexto_PixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDeTexto_PixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDeTexto_PixActionPerformed

    private void CampoDeTexto_CartaoDebito3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CampoDeTexto_CartaoDebito3FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDeTexto_CartaoDebito3FocusGained

    private void CampoDeTexto_CartaoDebito3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDeTexto_CartaoDebito3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDeTexto_CartaoDebito3ActionPerformed

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        TelaViewController telaViewController = new TelaViewController();
        boolean continuaVenda = true;
        
        if (Double.parseDouble(CampoDeTexto_CartaoCredito.getText()) == 0) {
            if (Double.parseDouble(CampoDeTexto_CartaoDebito.getText()) == 0) {
                if (Double.parseDouble(CampoDeTexto_Dinheiro.getText()) == 0) {
                    if (Double.parseDouble(CampoDeTexto_Pix.getText()) == 0) {
                        JOptionPane.showMessageDialog(null, "Forma de pagamento inválida", "ERRO", JOptionPane.ERROR_MESSAGE);
                        continuaVenda = false;
                    } else {
                        venda.setFormaDePagamento("Pix");
                    }
                } else {
                    venda.setFormaDePagamento("Dinheiro");
                }
            } else {
                venda.setFormaDePagamento("Cartão de Débito");
            }
        } else {
            venda.setFormaDePagamento("Cartão de Crédito");
        }
        if (continuaVenda == true) {
            if (telaViewController.finalizarVenda(venda, produtos) == true) {
                JOptionPane.showMessageDialog(null, "Venda Finalizada com Sucesso", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, telaViewController.getCodigoDeErro(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoDeTexto_CartaoCredito;
    private javax.swing.JTextField CampoDeTexto_CartaoDebito;
    private javax.swing.JTextField CampoDeTexto_CartaoDebito3;
    private javax.swing.JTextField CampoDeTexto_Dinheiro;
    private javax.swing.JTextField CampoDeTexto_Pix;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel labelCartaoCredito;
    private javax.swing.JLabel labelCartaoDebito;
    private javax.swing.JLabel labelDinheiro;
    private javax.swing.JLabel labelDinheiro2;
    private javax.swing.JLabel labelPix;
    private javax.swing.JPanel panelBordaRoxa;
    private javax.swing.JPanel panelCartaoCredito;
    private javax.swing.JPanel panelCartaoDebito;
    private javax.swing.JPanel panelDinheiro;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelPix;
    // End of variables declaration//GEN-END:variables
}
