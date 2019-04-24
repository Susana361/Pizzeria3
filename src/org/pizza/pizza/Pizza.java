/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pizza.pizza;

import java.math.BigDecimal;
import org.pedido.pedido.Pedido;
import org.variedadPizza.VariedadPizza;

/**
 *
 * @author Susana
 */
public class Pizza {
    private int numeroPizza;
    private String nombre;
    private BigDecimal precio;
    private Pedido pedido;
    
   //Asociación.

    public Pizza(int numeroPizza, String nombre, BigDecimal precio, Pedido pedido) {
        this.numeroPizza = numeroPizza;
        this.nombre = nombre;
        this.precio = precio;
        this.pedido = pedido;
    }

    public int getNumeroPizza() {
        return numeroPizza;
    }

    public void setNumeroPizza(int numeroPizza) {
        this.numeroPizza = numeroPizza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
   
}
