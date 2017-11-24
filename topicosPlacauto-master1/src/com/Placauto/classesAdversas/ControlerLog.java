/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Placauto.classesAdversas;

import com.Placauto.visual.Login;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.swing.JInternalFrame;

/**
 *
 * @author Jonas
 */
public class ControlerLog {

    public ControlerLog() {

    }

    public void writeLog(String logFile, String mensagem) throws IOException {

        //Afim de descobrir o funcionário em uso
        Login login = new Login();
        String funcionario = login.getJtLoginSistema().getText();

        //O segundo parametro "true" indica append para o arquivo em questao.
        FileWriter fileWriter = new FileWriter(logFile, true);
        try (BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String data = (new java.util.Date()).toString();
            String msg = data + " : " + "O Funcionário " + funcionario + " Está acessando " + mensagem + "\n";
            bufferedWriter.write(msg);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

    }

    public void readLog(String logFile) throws FileNotFoundException, IOException {

        FileReader fileReader = new FileReader(logFile);
        try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            while (bufferedReader.ready()) {
                String linha = bufferedReader.readLine();
                System.out.println(linha);
            }
        }
    }

    public void writeStackTrace(Exception ex) {

        StringWriter sw = new StringWriter();
        ex.printStackTrace(new PrintWriter(sw));
        try {
            writeLog("log.txt", sw.toString());
        } catch (IOException ex1) {
            new ControlerLog().writeStackTrace(ex);
        }
    }

}
