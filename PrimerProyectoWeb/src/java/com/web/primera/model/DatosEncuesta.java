/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.primera.model;

/**
 *
 * @author manza
 */
public class DatosEncuesta {
    
    /*
    * Con esta clase, le permite al servlet acceder a los datos
    */

    private String nombreCompleto;
    private String[] progLeng;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String[] getProgLeng() {
        return progLeng;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setProgLeng(String[] progLeng) {
        this.progLeng = progLeng;
    }
    
    
}
