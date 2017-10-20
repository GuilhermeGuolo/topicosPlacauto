/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Placauto.actions;

import com.Placauto.modelos.Funcionario;
import com.Placauto.visual.CadastroFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Guilherme
 */
public class ActionsFuncionario implements ActionListener {

    private Funcionario func;
    private final CadastroFuncionario cf;

    public ActionsFuncionario(CadastroFuncionario cf) {
       
        this.cf = cf;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (cf.getJtIdFuncionario().isEmpty() || cf.getJtNomeFuncionario().isEmpty() || cf.getSexoFuncionario().isEmpty()
                || cf.getJtCpfFuncionario().isEmpty() || cf.getJtDataRegistro().isEmpty() || cf.getJtRgFuncionario().isEmpty()
                || cf.getUfFuncionario().isEmpty() || cf.getJtGraduacaoFuncionario().isEmpty() || cf.getJtTelefoneFuncionario().isEmpty()
                || cf.getJtCelularFuncionario().isEmpty() || cf.getJtCidadeFuncionario().isEmpty() || cf.getJtBairroFuncionario().isEmpty()
                || cf.getJtLogradouroFuncionario().isEmpty() || cf.getJtNumeroImovelFunc().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Insira todos os campos!!", "Alerta!!", JOptionPane.ERROR_MESSAGE);

        } else if ("Salvar".equals(e.getActionCommand())) {

            this.func = cf.getFuncionario();

            System.out.println("ID:" + func.getIdFuncionario()
                    + "\n" + "Nome: " + func.getNomeFuncionario()
                    + "\n" + "Sexo: " + func.getSexoFuncionario()
                    + "\n" + "CPF: " + func.getCpfFuncionario()
                    + "\n" + "RG:" + func.getRgFuncionario()
                    + "\n" + "Data Registro: " + func.getDataregistro()
                    + "\n" + "UF: " + func.getUfFuncionario()
                    + "\n" + "Graduação: " + func.getGraduacaoFuncionario()
                    + "\n" + "Telefone:" + func.getTelefoneFuncionario()
                    + "\n" + "Celular: " + func.getCelularFuncionario()
                    + "\n" + "Cidade:" + func.getCidadeFuncionario()
                    + "\n" + "Telefone: " + func.getTelefoneFuncionario()
                    + "\n" + "Bairro: " + func.getBairroFuncionario()
                    + "\n" + "Logradouro: " + func.getLogradouroFuncionario()
                    + "\n" + "Numero imovel: " + func.getNumImovel()
            );

        }

    }
}
