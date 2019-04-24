/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.precio.formadePago;

import org.pedido.pedido.Pedido;

/**
 *
 * @author Susana
 */
public class FormadePago {
    private String efectivo;
    private String cheque;
    private String dolar;
    private String euro;
    private String tarjetaCredito;
    private String tarjetaDebito;
    private Pedido pedido;
    //Asociacion.

    public String getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(String efectivo) {
        this.efectivo = efectivo;
    }

    public String getCheque() {
        return cheque;
    }

    public void setCheque(String cheque) {
        this.cheque = cheque;
    }

    public String getDolar() {
        return dolar;
    }

    public void setDolar(String dolar) {
        this.dolar = dolar;
    }

    public String getEuro() {
        return euro;
    }

    public void setEuro(String euro) {
        this.euro = euro;
    }

    public String getTarjetaCredito() {
        return tarjetaCredito;
    }

    public void setTarjetaCredito(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaDebito() {
        return tarjetaDebito;
    }

    public void setTarjetaDebito(String tarjetaDebito) {
        this.tarjetaDebito = tarjetaDebito;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public FormadePago(String efectivo, String cheque, String dolar, String euro, String tarjetaCredito, String tarjetaDebito, Pedido pedido) {
        this.efectivo = efectivo;
        this.cheque = cheque;
        this.dolar = dolar;
        this.euro = euro;
        this.tarjetaCredito = tarjetaCredito;
        this.tarjetaDebito = tarjetaDebito;
        this.pedido = pedido;
    }
    
}
