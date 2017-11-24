/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Placauto.banco;

import com.Placauto.modelos.Itens;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Guilherme Guolo
 */
public class ItensDao {

    public void delete(Itens item) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "delete from itens where codigo = ?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, item.getIdItem());
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

    public static void insert(Itens item) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "insert into itens (id_itens, nome ,quantidade, tipo, fabricante) values(?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, item.getIdItem());
            ps.setString(2, item.getNomeItem());
            ps.setInt(3, item.getQuantidadeItem());
            ps.setString(4, item.getTipoItem());
            ps.setString(5, item.getFabricanteItem());

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

    public void update(Itens item) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "update itens set nome, quantidade, tipo fabricante = ? where id = ?";
            ps = conn.prepareStatement(sql);
            //ps.setInt(1, item.getIdItem());
            ps.setString(1, item.getNomeItem());
            ps.setInt(2, item.getQuantidadeItem());
            ps.setString(3, item.getTipoItem());
            ps.setString(4, item.getFabricanteItem());
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

    public List<Itens> getAll() {
        List<Itens> lista = new ArrayList<Itens>();
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = Conexao.getConnection();
            String sql = "select id,nome, quantidade, tipo, fabricante from itens";
            ps = conn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               // Integer id= rs.getInt(1);
               // String nome = rs.getString(2);
                Itens item = new Itens();
                item.setIdItem(rs.getInt(1));
                item.setNomeItem(rs.getString(2));
                item.setQuantidadeItem(rs.getInt(3));
                item.setTipoItem(rs.getString(4));
                item.setFabricanteItem(rs.getString(5));
                //continuar colocando s outros itens
                lista.add(item);
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
