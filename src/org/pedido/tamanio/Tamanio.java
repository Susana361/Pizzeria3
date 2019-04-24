/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.tamanio;

import org.pedido.pedido.Pedido;
import org.pizzeria.ui.Cliente;

/**
 *
 * @author Susana
 */
public class Tamanio {
    private int ochoPorcione;
    private int diezPorcione;
    private int docePorcione;
    private Pedido pedido;
    private Cliente cliente;
    //Asociacion.

    public int getOchoPorcione() {
        return ochoPorcione;
    }

    public void setOchoPorcione(int ochoPorcione) {
        this.ochoPorcione = ochoPorcione;
    }

    public int getDiezPorcione() {
        return diezPorcione;
    }

    public void setDiezPorcione(int diezPorcione) {
        this.diezPorcione = diezPorcione;
    }

    public int getDocePorcione() {
        return docePorcione;
    }

    public void setDocePorcione(int docePorcione) {
        this.docePorcione = docePorcione;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Tamanio(int ochoPorcione, int diezPorcione, int docePorcione, Pedido pedido) {
        this.ochoPorcione = ochoPorcione;
        this.diezPorcione = diezPorcione;
        this.docePorcione = docePorcione;
        this.pedido = pedido;
    }
    
}
