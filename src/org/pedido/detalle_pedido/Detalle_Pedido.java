/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pedido.detalle_pedido;

import java.math.BigDecimal;
import org.pedido.pedido.Pedido;
import org.pizza.pizza.Pizza;

/**
 *
 * @author Susana
 */
public class Detalle_Pedido {
    private String tamanio;
    private int numeroPedido;
    private int cantidad;
    private BigDecimal precio;
    private Pizza pizza;
    private EstadoPedido estado;
    Pedido pedido;
    //Asociacion.

    private static class EstadoPedido {

        public EstadoPedido() {
        }
    }
}
