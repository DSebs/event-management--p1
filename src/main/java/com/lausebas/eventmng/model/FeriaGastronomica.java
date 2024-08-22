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
public class FeriaGastronomica extends  Evento implements Expandible{

    private String tipoCocina;
    private int numStands;
    
    public final static int PERSONAS_POR_STANDS = 10;

    public FeriaGastronomica(String tipoCocina, int numStands, String nombre, Date fecha, String ubicacion, double precioEntrada) {
        super(nombre, fecha, ubicacion, precioEntrada);
        this.tipoCocina = tipoCocina;
        this.numStands = numStands;
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
    }

    public int getNumStands() {
        return numStands;
    }

    public void setNumStands(int numStands) {
        this.numStands = numStands;
    }
    
    
  
    
    @Override
    public int calcularAforo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void aumentarNumStands() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
