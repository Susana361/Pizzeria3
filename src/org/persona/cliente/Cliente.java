/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.cliente;
 

import org.persona.persona.Persona;

/**
 *
 * @author Susana
 */
public class Cliente extends Persona {
    
    
    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public Cliente(String cuit, String nombre, String apellido, int dni, String direccion, int celular, String email) {
        super(nombre, apellido, dni, direccion, celular, email);
        this.cuit = cuit;
    }
    private String cuit;

    public Cliente(String nombre, String apellido, int dni, String direccion, int celular, String email) {
        super(nombre, apellido, dni, direccion, celular, email);
    }

   
    }

  

