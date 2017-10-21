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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
    public boolean login_operacao(JTextField jtLoginSistema, JPasswordField jtSenhaSistema) throws IOException {

        if (jtLoginSistema.getText().equals(login)) {

            if (jtSenhaSistema.getText().equals(senha)) {
                Login log = new Login();
                new Principal().setVisible(true);
                return true;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Login ou senha incorreta");
        }
        return false;

    }

    //Funcao para salvar em disco o ultimo login digitado.
    public void salvarLogin(String mensagem, String logFile) throws IOException {

        FileWriter fileWriter = new FileWriter(logFile, false);

        try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String msg = mensagem + "\n";
            bufferedWriter.write(msg);
            bufferedWriter.flush();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar arquivo!" + e);
        }

    }

    public String lerLoginSalvo() throws IOException {
        // Criado um sistema de seguraca, caso o arquivo original for exluido
        // será detectado e criara um outro no else
        File file = new File("login.txt");
        if (file.exists()) {
            FileReader fileReader = new FileReader("login.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = bufferedReader.readLine();
            bufferedReader.close();
            return linha;

        } else {
            salvarLogin("Não há necessidade de excluir o arquivo", "login.txt");

        }
        return null;
    }
}
