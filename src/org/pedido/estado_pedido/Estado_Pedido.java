/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.estado_pedido;

import org.factura.factura.Factura;

/**
 *
 * @author Susana
 */
public class Estado_Pedido {
    private int numeroEstado;
    private String nombre;
    Factura factura;

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

    public Estado_Pedido(int numeroEstado, String nombre, String descripcion) {
        this.numeroEstado = numeroEstado;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    private String descripcion;
    
    
}
