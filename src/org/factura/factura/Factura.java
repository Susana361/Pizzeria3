/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.factura.factura;

import org.pedido.pedido.Pedido;

/**
 *
 * @author Susana
 */
public class Factura {

    public Factura(Pedido pedido, String numerodeFactura, String puntodeVenta, String tipodeVenta) {
        this.pedido = pedido;
        this.numerodeFactura = numerodeFactura;
        this.puntodeVenta = puntodeVenta;
        this.tipodeVenta = tipodeVenta;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getNumerodeFactura() {
        return numerodeFactura;
    }

    public void setNumerodeFactura(String numerodeFactura) {
        this.numerodeFactura = numerodeFactura;
    }

    public String getPuntodeVenta() {
        return puntodeVenta;
    }

    public void setPuntodeVenta(String puntodeVenta) {
        this.puntodeVenta = puntodeVenta;
    }

    public String getTipodeVenta() {
        return tipodeVenta;
    }

    public void setTipodeVenta(String tipodeVenta) {
        this.tipodeVenta = tipodeVenta;
    }
    private Pedido pedido;
    private String numerodeFactura;
    private String puntodeVenta;
    private String tipodeVenta;
}
