/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Placauto.actions;

import com.Placauto.classesAdversas.ControlerLog;
import com.Placauto.modelos.Fornecedor;
import com.Placauto.visual.CadastroFornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class ActionsFornecedor implements ActionListener {

    private Fornecedor fornec;
    private final CadastroFornecedor cad;

    public ActionsFornecedor(CadastroFornecedor cad) {
        
        this.cad = cad;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        /*if (cad.getJtIDfornecedor().isEmpty() || cad.getJtNomeFornecedor().isEmpty() || cad.getJtCnpjForncedor().isEmpty()
                || cad.getJtCidadeFornecedor().isEmpty() || cad.getJtBairroFornecedor().isEmpty() || cad.getJtLogradouroFornecedor().isEmpty()
                || cad.getJtTelefoneFornecedor().isEmpty() || cad.getJtCelularFornecedor().isEmpty() || cad.getJtEmailFornecedor().isEmpty()
                || cad.getJtDataRegistroFornecedor().isEmpty() || cad.getUfFornecedor().isEmpty() || cad.getJtCepFornecedor().isEmpty()
                || cad.getJtNumeroImovel().isEmpty() || cad.getJtObsFornecedor().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha os campos!!", "Alerta!!", JOptionPane.ERROR_MESSAGE);

        } else */
            
            try {
                if ("Salvar".equals(e.getActionCommand())) {

                    this.fornec = cad.getFornecedor();

                    System.out.println("ID:" + fornec.getIdFornecedor()
                            + "\n" + "Nome: " + fornec.getNomeFornecedor()
                            + "\n" + "CNPJ: " + fornec.getCnpjFornecedor()
                            + "\n" + "Data Registro: " + fornec.getDataRegistro()
                            + "\n" + "CEP: " + fornec.getCepFornecedor()
                            + "\n" + "UF: " + fornec.getUfFornecedor()
                            + "\n" + "Cidade: " + fornec.getCidadeFornecedor()
                            + "\n" + "Bairro:" + fornec.getBairroFornecedor()
                            + "\n" + "Logradouro: " + fornec.getLogradouroFornecedor()
                            + "\n" + "Número Imóvel:" + fornec.getNumImovel()
                            + "\n" + "Telefone: " + fornec.getTelFornecedor()
                            + "\n" + "Celular: " + fornec.getCelularFornecedor()
                            + "\n" + "E-mail: " + fornec.getEmailFornecedor()
                            + "\n" + "Observação: " + fornec.getObsFornecedor()
                    );

                }
        } catch (NumberFormatException exep) {
                new ControlerLog().writeStackTrace(exep);}
            
            

    }

}
