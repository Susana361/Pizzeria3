/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.factura.estadoFactura;

import org.factura.factura.Factura;

/**
 *
 * @author Susana
 */
public class EstadoFactura {
    private int numeroEstado;
    private String nombre;
    private String descripcion;
    private Factura factura;

    public int getNumeroEstado() {
        return numeroEstado;
    }

    public void setNumeroEstado(int numeroEstado) {
        this.numeroEstado = numeroEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoFactura(int numeroEstado, String nombre, String descripcion) {
        this.numeroEstado = numeroEstado;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
}
