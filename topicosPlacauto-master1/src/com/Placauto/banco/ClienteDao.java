/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Placauto.banco;

import com.Placauto.modelos.Cliente;
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
public class ClienteDao {

    public void delete(Cliente cli) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from cliente where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cli.getIdCliente());
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

    public static void  insert(Cliente cli) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into cliente (id_cliente, data_registro ,nome, cpf, rg, sexo, cidade, estado, bairro,"
                    + "cep, logradouro, numero, telefone, celular, email, observacao  ) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, cli.getIdCliente());
            ps.setString(2, cli.getDataRegistro());
            ps.setString(3, cli.getNomeCliente());
            ps.setString(4, cli.getCpfCliente());
            ps.setString(5, cli.getRgCliente());
            ps.setString(6, cli.getSexoCliente());
            ps.setString(7, cli.getCidadeCliente());
            ps.setString(8, cli.getUfCliente());
            ps.setString(9, cli.getBairroCliente());
            ps.setString(10, cli.getCepCliente());
            ps.setString(11, cli.getLogradouroCliente());
            ps.setString(12, cli.getNumImovel());
            ps.setString(13, cli.getTelCliente());
            ps.setString(14, cli.getCelularCliente());
            ps.setString(15, cli.getEmailCliente());
            ps.setString(16, cli.getObsCliente());

            ps.setInt(0, 0);
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

    public void update(Cliente cli) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update itens set data_registro ,nome, cpf, rg, sexo, cidade, estado, bairro,"
                    + "cep, logradouro, numero, telefone, celular, email, observacao = ? where id = ?";
            ps = conn.prepareStatement(sql);
            //ps.setInt(1, fornec.getIdFornecedor());
            ps.setString(1, cli.getDataRegistro());
            ps.setString(2, cli.getNomeCliente());
            ps.setString(3, cli.getCpfCliente());
            ps.setString(4, cli.getRgCliente());
            ps.setString(5, cli.getSexoCliente());
            ps.setString(6, cli.getCidadeCliente());
            ps.setString(7, cli.getUfCliente());
            ps.setString(8, cli.getBairroCliente());
            ps.setString(9, cli.getCepCliente());
            ps.setString(10, cli.getLogradouroCliente());
            ps.setString(11, cli.getNumImovel());
            ps.setString(12, cli.getTelCliente());
            ps.setString(13, cli.getCelularCliente());
            ps.setString(14, cli.getEmailCliente());
            ps.setString(15, cli.getObsCliente());
            ps.setInt(16, cli.getIdCliente());
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

    public List<Cliente> getAll() {
        List<Cliente> lista = new ArrayList<Cliente>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select id_cliente, data_registro ,nome, cpf, rg, sexo, cidade, estado, bairro,"
                    + "cep, logradouro, numero, telefone, celular, email, observacao from cliente";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                // Integer id= rs.getInt(1);
                // String nome = rs.getString(2);
                Cliente cli = new Cliente();
                cli.setIdCliente(rs.getInt(1));
                cli.setDataRegistro(rs.getString(2));
                cli.setNomeCliente(rs.getString(3));
                cli.setCpfCliente(rs.getString(4));
                cli.setRgCliente(rs.getString(5));
                cli.setSexoCliente(rs.getString(6));
                cli.setCidadeCliente(rs.getString(7));
                cli.setUfCliente(rs.getString(8));
                cli.setBairroCliente(rs.getString(9));
                cli.setCepCliente(rs.getString(10));
                cli.setLogradouroCliente(rs.getString(11));
                cli.setNumImovel(rs.getString(12));
                cli.setTelCliente(rs.getString(13));
                cli.setCelularCliente(rs.getString(14));
                cli.setEmailCliente(rs.getString(15));
                cli.setObsCliente(rs.getString(16));
                //continuar colocando s outros itens AQUI!!!!!!
                lista.add(cli);
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
