/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.empleado;

import org.pedido.tamanio.Tamanio;
import org.pedido.tipo.Tipo;
import org.persona.persona.Persona;
import org.variedadPizza.VariedadPizza;

/**
 *
 * @author Susana
 */
public class Empleado extends Persona {
    private String cuil;
    private VariedadPizza variedadPizza;
    private Tipo tipo;
    private Tamanio tamanio;
    //Asociación.

    public Empleado(String cuil, VariedadPizza variedadPizza, Tipo tipo, Tamanio tamanio, String nombre, String apellido, int dni, String direccion, int celular, String email) {
        super(nombre, apellido, dni, direccion, celular, email);
        this.cuil = cuil;
        this.variedadPizza = variedadPizza;
        this.tipo = tipo;
        this.tamanio = tamanio;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public VariedadPizza getVariedadPizza() {
        return variedadPizza;
    }

    public void setVariedadPizza(VariedadPizza variedadPizza) {
        this.variedadPizza = variedadPizza;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    
   
}
