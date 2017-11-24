/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Placauto.banco;

import com.Placauto.modelos.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme
 */
public class FuncionarioDao {

    public void delete(Funcionario func) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from funcionario where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, func.getIdFuncionario());
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public static void insert(Funcionario func) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into funcionario (id_funcionario, data_registro ,nome, sexo, estado, graduacao, cpf, rg, telefone,"
                    + "celular,  cidade, bairro, numero, logradouro  ) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, func.getIdFuncionario());
            ps.setString(2, func.getDataregistro());
            ps.setString(3, func.getNomeFuncionario());
            ps.setString(4, func.getSexoFuncionario());
            ps.setString(5, func.getUfFuncionario());
            ps.setString(6, func.getGraduacaoFuncionario());
            ps.setString(7, func.getCpfFuncionario());
            ps.setString(8, func.getRgFuncionario());
            ps.setString(9, func.getTelefoneFuncionario());
            ps.setString(10, func.getCelularFuncionario());
            ps.setString(11, func.getCidadeFuncionario());
            ps.setString(12, func.getBairroFuncionario());
            ps.setString(13, func.getNumImovel());
            ps.setString(14, func.getLogradouroFuncionario());

            //ps.setInt(0, 0);
            ps.execute();

            conn.commit();

        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public void update(Funcionario func) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update itens set nome, quantidade, tipo, fabricante = ? where id = ?";
            ps = conn.prepareStatement(sql);
            //ps.setInt(1, fornec.getIdFornecedor());

            ps.setString(1, func.getDataregistro());
            ps.setString(2, func.getNomeFuncionario());
            ps.setString(3, func.getSexoFuncionario());
            ps.setString(4, func.getUfFuncionario());
            ps.setString(5, func.getGraduacaoFuncionario());
            ps.setString(6, func.getCpfFuncionario());
            ps.setString(7, func.getRgFuncionario());
            ps.setString(8, func.getTelefoneFuncionario());
            ps.setString(9, func.getCelularFuncionario());
            ps.setString(10, func.getCidadeFuncionario());
            ps.setString(11, func.getBairroFuncionario());
            ps.setString(12, func.getNumImovel());
            ps.setString(13, func.getLogradouroFuncionario());
            ps.setInt(14, func.getIdFuncionario());
            //continuar aqui
            ps.execute();

            conn.commit();
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());

            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }

        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
    }

    public List<Funcionario> getAll() {
        List<Funcionario> lista = new ArrayList<Funcionario>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select id_fornecedor, data_registro ,nome, cnpj, cidade, estado, bairro, cep, logradouro,"
                    + "numero, telefone, celular, email, observacao from fornecedor";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                // Integer id= rs.getInt(1);
                // String nome = rs.getString(2);
                
                    /*    ps.setInt(1, func.getIdFuncionario());
            ps.setString(2, func.getDataregistro());
            ps.setString(3, func.getNomeFuncionario());
            ps.setString(4, func.getSexoFuncionario());
            ps.setString(5, func.getUfFuncionario());
            ps.setString(6, func.getGraduacaoFuncionario());
            ps.setString(7, func.getCpfFuncionario());
            ps.setString(8, func.getRgFuncionario());
            ps.setString(9, func.getTelefoneFuncionario());
            ps.setString(10, func.getCelularFuncionario());
            ps.setString(11, func.getCidadeFuncionario());
            ps.setString(12, func.getBairroFuncionario());
            ps.setString(13, func.getNumImovel());
            ps.setString(14, func.getLogradouroFuncionario());*/
                Funcionario func = new Funcionario();
                func.setIdFuncionario(rs.getInt(1));
                func.setDataregistro(rs.getString(2));
                func.setNomeFuncionario(rs.getString(3));
                func.setSexoFuncionario(rs.getString(4));
                func.setUfFuncionario(rs.getString(5));
                func.setGraduacaoFuncionario(rs.getString(6));
                func.setCpfFuncionario(rs.getString(7));
                func.setRgFuncionario(rs.getString(8));
                func.setTelefoneFuncionario(rs.getString(9));
                func.setCelularFuncionario(rs.getString(10));
                func.setCidadeFuncionario(rs.getString(11));
                func.setBairroFuncionario(rs.getString(12));
                func.setNumImovel(rs.getString(13));
                func.setLogradouroFuncionario(rs.getString(14));
                //continuar colocando s outros itens AQUI!!!!!!
                lista.add(func);
            }
        } catch (SQLException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    System.out.println("ERRO: " + ex.getMessage());
                }
            }
        }
        return lista;
    }

}
