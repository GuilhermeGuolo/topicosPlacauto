/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Placauto.visual;

import com.Placauto.actions.ActionsFornecedor;
import com.Placauto.modelos.Fornecedor;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author Guilherme
 */
public class CadastroFornecedor extends javax.swing.JInternalFrame {

    ActionsFornecedor l = new ActionsFornecedor(this);

    /**
     * Creates new form cadastroFornecedor
     */
    public CadastroFornecedor() {
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

        botaoEditarFornecedor = new javax.swing.JButton();
        botaoExcluirFornecedor = new javax.swing.JButton();
        botaoLimparFornecedor = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtObsFornecedor = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtIDfornecedor = new javax.swing.JTextField();
        jtNomeFornecedor = new javax.swing.JTextField();
        jtCnpjForncedor = new javax.swing.JTextField();
        jtCidadeFornecedor = new javax.swing.JTextField();
        jtBairroFornecedor = new javax.swing.JTextField();
        jtLogradouroFornecedor = new javax.swing.JTextField();
        jtTelefoneFornecedor = new javax.swing.JTextField();
        jtEmailFornecedor = new javax.swing.JTextField();
        jtCelularFornecedor = new javax.swing.JTextField();
        jtNumeroImovel = new javax.swing.JTextField();
        jtCepFornecedor = new javax.swing.JTextField();
        ufFornecedor = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        botaoSalvarFornecedor = new javax.swing.JButton();
        jtDataRegistroFornecedor = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Fornecedores");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameDeactivated(evt);
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        botaoEditarFornecedor.setText("Editar");

        botaoExcluirFornecedor.setText("Excluir");

        botaoLimparFornecedor.setText("Limpar campos");
        botaoLimparFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparFornecedorActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jtObsFornecedor);

        jLabel15.setText("Observação:");

        jLabel13.setText("E-mail:");

        jLabel11.setText("Telefone:");

        jLabel17.setText("Logradouro:");

        jLabel9.setText("Bairro:");

        jLabel7.setText("Cidade:");

        jLabel4.setText("CNPJ");

        jLabel2.setText("Nome:");

        jLabel1.setText("ID:");

        jtNumeroImovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNumeroImovelActionPerformed(evt);
            }
        });

        ufFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel3.setText("Data Registro:");

        jLabel8.setText("U.F :");

        jLabel10.setText("CEP:");

        jLabel16.setText("Número:");

        jLabel12.setText("Celular:");

        botaoSalvarFornecedor.addActionListener(l);
        botaoSalvarFornecedor.setText("Salvar");

        try {
            jtDataRegistroFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtIDfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(194, 194, 194)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtDataRegistroFornecedor))
                            .addComponent(jtNomeFornecedor))
                        .addGap(173, 173, 173))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtLogradouroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel16))
                                            .addComponent(jtEmailFornecedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jtTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel12))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jtCidadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(59, 59, 59)
                                                .addComponent(jLabel8))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jtBairroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel10)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ufFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtCepFornecedor)
                                            .addComponent(jtCelularFornecedor)
                                            .addComponent(jtNumeroImovel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(botaoSalvarFornecedor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botaoEditarFornecedor)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botaoExcluirFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botaoLimparFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)))
                            .addComponent(jtCnpjForncedor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtIDfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtDataRegistroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtCnpjForncedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtCidadeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ufFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtBairroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jtCepFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtLogradouroFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(jtNumeroImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtTelefoneFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jtCelularFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtEmailFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEditarFornecedor)
                    .addComponent(botaoExcluirFornecedor)
                    .addComponent(botaoLimparFornecedor)
                    .addComponent(botaoSalvarFornecedor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLimparFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoLimparFornecedorActionPerformed

    private void jtNumeroImovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNumeroImovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNumeroImovelActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed

    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameDeactivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameDeactivated


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditarFornecedor;
    private javax.swing.JButton botaoExcluirFornecedor;
    private javax.swing.JButton botaoLimparFornecedor;
    private javax.swing.JButton botaoSalvarFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtBairroFornecedor;
    private javax.swing.JTextField jtCelularFornecedor;
    private javax.swing.JTextField jtCepFornecedor;
    private javax.swing.JTextField jtCidadeFornecedor;
    private javax.swing.JTextField jtCnpjForncedor;
    private javax.swing.JFormattedTextField jtDataRegistroFornecedor;
    private javax.swing.JTextField jtEmailFornecedor;
    private javax.swing.JTextField jtIDfornecedor;
    private javax.swing.JTextField jtLogradouroFornecedor;
    private javax.swing.JTextField jtNomeFornecedor;
    private javax.swing.JTextField jtNumeroImovel;
    private javax.swing.JTextPane jtObsFornecedor;
    private javax.swing.JTextField jtTelefoneFornecedor;
    private javax.swing.JComboBox<String> ufFornecedor;
    // End of variables declaration//GEN-END:variables

    public String getJtBairroFornecedor() {
        return jtBairroFornecedor.getText();
    }

    public String getJtCelularFornecedor() {
        return jtCelularFornecedor.getText();
    }

    public String getJtCepFornecedor() {
        return jtCepFornecedor.getText();
    }

    public String getJtCidadeFornecedor() {
        return jtCidadeFornecedor.getText();
    }

    public String getJtCnpjForncedor() {
        return jtCnpjForncedor.getText();
    }

    public String getJtDataRegistroFornecedor() {
        return jtDataRegistroFornecedor.getText();
    }

    public String getJtEmailFornecedor() {
        return jtEmailFornecedor.getText();
    }

    public String getJtIDfornecedor() {
        return jtIDfornecedor.getText();
    }

    public String getJtLogradouroFornecedor() {
        return jtLogradouroFornecedor.getText();
    }

    public String getJtNomeFornecedor() {
        return jtNomeFornecedor.getText();
    }

    public String getJtNumeroImovel() {
        return jtNumeroImovel.getText();
    }

    public String getJtObsFornecedor() {
        return jtObsFornecedor.getText();
    }

    public String getJtTelefoneFornecedor() {
        return jtTelefoneFornecedor.getText();
    }

    public String getUfFornecedor() {
        return ufFornecedor.getSelectedItem().toString();
    }

    public Fornecedor getFornecedor() {
        Fornecedor fornec = new Fornecedor();

        fornec.setIdFornecedor(Integer.parseInt(getJtIDfornecedor()));
        fornec.setNomeFornecedor(getJtNomeFornecedor());
        fornec.setCnpjFornecedor(getJtCnpjForncedor());
        fornec.setCidadeFornecedor(getJtCidadeFornecedor());
        fornec.setBairroFornecedor(getJtBairroFornecedor());
        fornec.setLogradouroFornecedor(getJtLogradouroFornecedor());
        fornec.setTelFornecedor(getJtTelefoneFornecedor());
        fornec.setCelularFornecedor(getJtCelularFornecedor());
        fornec.setEmailFornecedor(getJtEmailFornecedor());
        fornec.setDataRegistro(getJtDataRegistroFornecedor());
        fornec.setUfFornecedor(getUfFornecedor());
        fornec.setCepFornecedor(getJtCepFornecedor());
        fornec.setNumImovel(getJtNumeroImovel());
        fornec.setObsFornecedor(getJtObsFornecedor());

        return fornec;
    }
}
