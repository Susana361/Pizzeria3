/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.variedadPizza.ingrediente;

import org.pedido.pedido.Pedido;

/**
 *
 * @author Susana
 */
public class Ingrediente {
    private String id;
    private String sinTacc;
    private String conTacc;
    private String disponibilidad;
    private Pedido pedido;
    // Asociacion.

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSinTacc() {
        return sinTacc;
    }

    public void setSinTacc(String sinTacc) {
        this.sinTacc = sinTacc;
    }

    public String getConTacc() {
        return conTacc;
    }

    public void setConTacc(String conTacc) {
        this.conTacc = conTacc;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Ingrediente(String id, String sinTacc, String conTacc, String disponibilidad) {
        this.id = id;
        this.sinTacc = sinTacc;
        this.conTacc = conTacc;
        this.disponibilidad = disponibilidad;
    }
    
}
