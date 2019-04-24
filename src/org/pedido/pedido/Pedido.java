/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.pedido;

import org.variedadPizza.VariedadPizza;

/**
 *
 * @author Susana
 */
public class Pedido {
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombredelPedido() {
        return nombredelPedido;
    }

    public void setNombredelPedido(String nombredelPedido) {
        this.nombredelPedido = nombredelPedido;
    }

    public VariedadPizza getVariedadPizza() {
        return variedadPizza;
    }

    public void setVariedadPizza(VariedadPizza variedadPizza) {
        this.variedadPizza = variedadPizza;
    }

    public Pedido(String codigo, String nombredelPedido, VariedadPizza variedadPizza) {
        this.codigo = codigo;
        this.nombredelPedido = nombredelPedido;
        this.variedadPizza = variedadPizza;
    }
    private String nombredelPedido;
    private VariedadPizza variedadPizza;
    //Asociacion.

   
    }

    
    
    
    
   
