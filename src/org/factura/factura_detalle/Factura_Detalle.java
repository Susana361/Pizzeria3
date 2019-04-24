/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.factura.factura_detalle;

import org.factura.factura.Factura;




/**
 *
 * @author Susana
 */
public class Factura_Detalle {

    private Factura factura;

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Factura_Detalle(Factura factura) {
        this.factura = factura;
    }
}
