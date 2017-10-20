/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Placauto.actions;

import com.Placauto.visual.Login;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import com.Placauto.visual.Principal;

/**
 *
 * @author Jonas
 */
public class login_operacao {

    private final String senha = "";
    private final String login = "";

    /**
     *
     * @param jtLoginSistema
     * @param jtSenhaSistema
     * @return
     */
    public boolean login_operacao(JTextField jtLoginSistema, JPasswordField jtSenhaSistema) {

        
        if (jtLoginSistema.getText().equals(login)) {

            if (jtSenhaSistema.getText().equals(senha)) {
                Login log = new Login();
                new Principal().setVisible(true);
                return true;
            } 
        }else{
            JOptionPane.showMessageDialog(null, "Login ou senha incorreta");
        }
        return false;

    }

}
