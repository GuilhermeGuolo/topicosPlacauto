/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Placauto.actions;

import com.Placauto.classesAdversas.ControlerLog;
import com.Placauto.modelos.Itens;
import com.Placauto.visual.CadastroItens;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Guilherme
 */
public class ActionsItens implements ActionListener {

    
    private CadastroItens cad;
    private Itens item;
    

    public ActionsItens(CadastroItens cad) {
        
        this.cad = cad;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

       /* if (cad.getJtIDitem().isEmpty() || cad.getJtNomeitem().isEmpty()
                || cad.getJtQuantitem().isEmpty() || cad.getJtTipoItem().isEmpty()
                || cad.getJtFabricanteItem().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Preencha os campos!!", "Alerta!!", JOptionPane.ERROR_MESSAGE);

        } else*/
       
        try {
            if ("Salvar".equals(e.getActionCommand())) {
            
            this.item = cad.getItens();

           

            System.out.println("ID: " + item.getIdItem()
                    + "\n" + "Nome Item: " + item.getNomeItem()
                    + "\n" + "Quantidade: " + item.getQuantidadeItem()
                    + "\n" + "Tipo de Item: " + item.getTipoItem()
                    + "\n" + "Fabricante: " + item.getFabricanteItem()
            );
        }
        } catch (NumberFormatException exep) {
                new ControlerLog().writeStackTrace(exep);}
       

     
    }
}
