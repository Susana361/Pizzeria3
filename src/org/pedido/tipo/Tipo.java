/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.tipo;

import org.pedido.pedido.Pedido;

/**
 *
 * @author Susana
 */
public class Tipo {
    private String alaPiedra;
    private String alaParrilla;
    private String deMolde;
    private Pedido pedido;
    //Asociacion.

    public String getAlaPiedra() {
        return alaPiedra;
    }

    public void setAlaPiedra(String alaPiedra) {
        this.alaPiedra = alaPiedra;
    }

    public String getAlaParrilla() {
        return alaParrilla;
    }

    public void setAlaParrilla(String alaParrilla) {
        this.alaParrilla = alaParrilla;
    }

    public String getDeMolde() {
        return deMolde;
    }

    public void setDeMolde(String deMolde) {
        this.deMolde = deMolde;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Tipo(String alaPiedra, String alaParrilla, String deMolde, Pedido pedido) {
        this.alaPiedra = alaPiedra;
        this.alaParrilla = alaParrilla;
        this.deMolde = deMolde;
        this.pedido = pedido;
    }
    
}
