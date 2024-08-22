/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lausebas.eventmng.model;

import java.util.Date;

/**
 *
 * @author Laura
 */
public class Concierto extends Evento {

    @Override
    public int calcularAforo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    private String tipoMusica;
    private int localidades;
    
    public final static int PERSONAS_POR_LOCALIDAD = 135;

    public Concierto(String tipoMusica, int localidades, String nombre, Date fecha, String ubicacion, double precioEntrada) {
        super(nombre, fecha, ubicacion, precioEntrada);
        this.tipoMusica = tipoMusica;
        this.localidades = localidades;
        
        
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    public int getLocalidades() {
        return localidades;
    }

    public void setLocalidades(int localidades) {
        this.localidades = localidades;
    }


    
    
    
    
    
    
}
