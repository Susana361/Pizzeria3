/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.persona.cocinero;

import org.persona.persona.Persona;

/**
 *
 * @author Susana
 */
public class Cocinero extends Persona {

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }

    public Cocinero(String cuil, String cv, String nombre, String apellido, int dni, String direccion, int celular, String email) {
        super(nombre, apellido, dni, direccion, celular, email);
        this.cuil = cuil;
        this.cv = cv;
    }
    private String cuil;
    private String cv;
    
}
