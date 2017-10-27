/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Placauto.classesAdversas;

import java.io.IOException;

/**
 *
 * @author Jonas
 */
public class ControleExcecoes extends Exception {
ControlerLog control = new ControlerLog();
    public ControleExcecoes() {
        super("Arquivo duplicado.");
    }

    public ControleExcecoes(String mensagem) throws IOException {
        super(mensagem);
        
       // ControlerLog control = new ControlerLog();
        control.writeLog("log.txt", mensagem);
    }
  

}
