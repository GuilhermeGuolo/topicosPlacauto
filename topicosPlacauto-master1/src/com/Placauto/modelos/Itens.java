/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Placauto.modelos;

/**
 *
 * @author Guilherme
 */
public class Itens {
    
    private int idItem;
    private String nomeItem;
    private int quantidadeItem;
    private String tipoItem;
    private String fabricanteItem;
    
    public Itens(){
        
    }

    /**
     * @return the idItem
     */
    public int getIdItem() {
        return idItem;
    }

    /**
     * @param idItem the idItem to set
     */
    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    /**
     * @return the nomeItem
     */
    public String getNomeItem() {
        return nomeItem;
    }

    /**
     * @param nomeItem the nomeItem to set
     */
    public void setNomeItem(String nomeItem) {
        this.nomeItem = nomeItem;
    }

    /**
     * @return the quantidadeItem
     */
    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    /**
     * @param quantidadeItem the quantidadeItem to set
     */
    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    /**
     * @return the tipoItem
     */
    public String getTipoItem() {
        return tipoItem;
    }

    /**
     * @param tipoItem the tipoItem to set
     */
    public void setTipoItem(String tipoItem) {
        this.tipoItem = tipoItem;
    }

    /**
     * @return the fabricanteItem
     */
    public String getFabricanteItem() {
        return fabricanteItem;
    }

    /**
     * @param fabricanteItem the fabricanteItem to set
     */
    public void setFabricanteItem(String fabricanteItem) {
        this.fabricanteItem = fabricanteItem;
    }
    
}
