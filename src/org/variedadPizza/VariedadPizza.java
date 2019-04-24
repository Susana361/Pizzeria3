/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.variedadPizza;

import org.pedido.pedido.Pedido;

/**
 *
 * @author Susana
 */
public class VariedadPizza {
    private String menu;
    private String cuatroQueso;
    private String muzzarella;
    private String napolitana;
    private String palmitos;
    private Pedido pedido;
    // Asociacion.

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getCuatroQueso() {
        return cuatroQueso;
    }

    public void setCuatroQueso(String cuatroQueso) {
        this.cuatroQueso = cuatroQueso;
    }

    public String getMuzzarella() {
        return muzzarella;
    }

    public void setMuzzarella(String muzzarella) {
        this.muzzarella = muzzarella;
    }

    public String getNapolitana() {
        return napolitana;
    }

    public void setNapolitana(String napolitana) {
        this.napolitana = napolitana;
    }

    public String getPalmitos() {
        return palmitos;
    }

    public void setPalmitos(String palmitos) {
        this.palmitos = palmitos;
    }

    public VariedadPizza(String menu, String cuatroQueso, String muzzarella, String napolitana, String palmitos) {
        this.menu = menu;
        this.cuatroQueso = cuatroQueso;
        this.muzzarella = muzzarella;
        this.napolitana = napolitana;
        this.palmitos = palmitos;
    }
   

    
    }
    

