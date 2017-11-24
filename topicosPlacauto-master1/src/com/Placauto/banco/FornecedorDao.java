/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Placauto.banco;

import com.Placauto.modelos.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author comp8
 */
public class FornecedorDao {
    
        public void delete( Fornecedor fornec) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from fornecedor where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, fornec.getIdFornecedor());
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

    public void insert(Fornecedor fornec) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into fornecedor (id_fornecedor, data_registro ,nome, cnpj, cidade, estado, bairro, cep, logradouro,"
                    + "numero, telefone, celular, email, observacao  ) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, fornec.getIdFornecedor());
            ps.setString(2, fornec.getDataRegistro());
            ps.setString(3, fornec.getNomeFornecedor());
            ps.setString(4, fornec.getCnpjFornecedor());
            ps.setString(5, fornec.getCidadeFornecedor());
            ps.setString(6, fornec.getUfFornecedor());
            ps.setString(7, fornec.getBairroFornecedor());
            ps.setString(8, fornec.getCepFornecedor());
            ps.setString(9, fornec.getLogradouroFornecedor());
            ps.setString(10, fornec.getNumImovel());
            ps.setString(11, fornec.getTelFornecedor());
            ps.setString(12, fornec.getCelularFornecedor());
            ps.setString(13, fornec.getEmailFornecedor());
            ps.setString(14, fornec.getObsFornecedor());

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

    public void update(Fornecedor fornec) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update itens set nome, quantidade, tipo, fabricante = ? where id = ?";
            ps = conn.prepareStatement(sql);
            //ps.setInt(1, fornec.getIdFornecedor());
            ps.setString(1, fornec.getDataRegistro());
            ps.setString(2, fornec.getNomeFornecedor());
            ps.setString(3, fornec.getCnpjFornecedor());
            ps.setString(4, fornec.getCidadeFornecedor());
            ps.setString(5, fornec.getUfFornecedor());
            ps.setString(6, fornec.getBairroFornecedor());
            ps.setString(7, fornec.getCepFornecedor());
            ps.setString(8, fornec.getLogradouroFornecedor());
            ps.setString(9, fornec.getNumImovel());
            ps.setString(10, fornec.getTelFornecedor());
            ps.setString(11, fornec.getCelularFornecedor());
            ps.setString(12, fornec.getEmailFornecedor());
            ps.setString(13, fornec.getObsFornecedor());
            ps.setInt(14, fornec.getIdFornecedor());
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

    public List<Fornecedor> getAll() {
        List<Fornecedor> lista = new ArrayList<Fornecedor>();
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
                Fornecedor fornec = new Fornecedor();
                fornec.setIdFornecedor(rs.getInt(1));
                fornec.setDataRegistro(rs.getString(2));
                fornec.setNomeFornecedor(rs.getString(3));
                fornec.setCnpjFornecedor(rs.getString(4));
                fornec.setCidadeFornecedor(rs.getString(5));
                fornec.setUfFornecedor(rs.getString(6));
                fornec.setBairroFornecedor(rs.getString(7));
                fornec.setCepFornecedor(rs.getString(8));
                fornec.setLogradouroFornecedor(rs.getString(9));
                fornec.setNumImovel(rs.getString(10));
                fornec.setTelFornecedor(rs.getString(11));
                fornec.setCelularFornecedor(rs.getString(12));
                fornec.setEmailFornecedor(rs.getString(13));
                fornec.setObsFornecedor(rs.getString(14));
                //continuar colocando s outros itens AQUI!!!!!!
                lista.add(fornec);
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
