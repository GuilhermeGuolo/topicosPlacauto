/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Placauto.banco;

import com.Placauto.actions.login_operacao;
import com.Placauto.banco.Conexao;
import com.Placauto.visual.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jonasamerico
 */
public class Controle_Login {
    
   public login_operacao getPassword(String login) {
        Connection conn = null;
        PreparedStatement ps = null;
     //   String login = "jonas";       
            try {
            conn = Conexao.getConnection();
            String sql = "select nome, senha from login where nome = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            System.out.println("oiii");
            if(rs.next()) {
                String lg = rs.getString(1);
                String sen = rs.getString(2);
                login_operacao p = new login_operacao();
                p.setLogin(lg);
                p.setSenha(sen);
                System.out.println("BANCO"+lg+sen);
                return p;
            }
        } catch(SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if( ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        
        return null;
    }



}