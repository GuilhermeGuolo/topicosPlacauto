/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Placauto.actions;

import com.Placauto.classesAdversas.ControlerLog;

import com.Placauto.modelos.Cliente;
import com.Placauto.visual.CadastroCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Guilherme
 */
public class ActionsCliente implements ActionListener {

    private Cliente cli;
    private final CadastroCliente cad;
 
   
    public ActionsCliente(CadastroCliente cad) {

        this.cad = cad;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        /*if (cad.getJtIDcliente().isEmpty() || cad.getJtNomeCliente().isEmpty() || cad.getSexoCliente().isEmpty()
                || cad.getJtCpfCliente().isEmpty() || cad.getJtDataRegistro().isEmpty() || cad.getJtRgCliente().isEmpty()
                || cad.getJtCidadeCliente().isEmpty() || cad.getJtBairroCliente().isEmpty() || cad.getJtLogradouroCliente().isEmpty()
                || cad.getUfCliente().isEmpty() || cad.getJtNumeroImovel().isEmpty() || cad.getJtTelefoneCliente().isEmpty()
                || cad.getJtCelularCliente().isEmpty() || cad.getJtCepCliente().isEmpty() || cad.getJtEmailCliente().isEmpty()
                || cad.getJtObsCliente().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Insira todos os campos!!", "Alerta!!", JOptionPane.ERROR_MESSAGE);

        } else */
        if ("Salvar".equals(e.getActionCommand())) {

            try {
                this.cli = cad.getCliente();
                System.out.println("ID:" + cli.getIdCliente()
                        + "\n" + "Nome: " + cli.getNomeCliente()
                        + "\n" + "Sexo: " + cli.getSexoCliente()
                        + "\n" + "CPF: " + cli.getCpfCliente()
                        + "\n" + "Data Registro: " + cli.getDataRegistro()
                        + "\n" + "RG: " + cli.getRgCliente()
                        + "\n" + "CEP: " + cli.getCepCliente()
                        + "\n" + "UF: " + cli.getUfCliente()
                        + "\n" + "Cidade: " + cli.getCidadeCliente()
                        + "\n" + "Bairro:" + cli.getBairroCliente()
                        + "\n" + "Logradouro: " + cli.getLogradouroCliente()
                        + "\n" + "Número Imóvel:" + cli.getNumImovel()
                        + "\n" + "Telefone: " + cli.getTelCliente()
                        + "\n" + "Celular: " + cli.getCelularCliente()
                        + "\n" + "E-mail: " + cli.getEmailCliente()
                        + "\n" + "Observação: " + cli.getObsCliente()
                );
            } catch (NumberFormatException exep) {
                new ControlerLog().writeStackTrace(exep);
            }
        }

    }

}
