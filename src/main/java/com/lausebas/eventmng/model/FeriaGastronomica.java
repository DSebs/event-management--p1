package com.lausebas.eventmng.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class FeriaGastronomica extends Evento implements Expandible{

    private int numStands;
    private String tipoCocina;
    private boolean expandible;
    public final static int PERSONAS_POR_STAND = 10;

    public FeriaGastronomica(int numStands, String tipoCocina, boolean expandible, String nombre, LocalDate fecha, String ubicacion, double precioEntrada) {
        super(nombre, fecha, ubicacion, precioEntrada);
        this.numStands = numStands;
        this.tipoCocina = tipoCocina;
        this.expandible = expandible;
        verificarInvariantes();
    }

    public boolean isExpandible() {
        return expandible;
    }

    public void setExpandible(boolean expandible) {
        this.expandible = expandible;
    }

    public int getNumStands() {
        return numStands;
    }

    public void setNumStands(int numStands) {
        this.numStands = numStands;
        verificarInvariantes();
    }

    public String getTipoCocina() {
        return tipoCocina;
    }

    public void setTipoCocina(String tipoCocina) {
        this.tipoCocina = tipoCocina;
        verificarInvariantes();
    }

    @Override
    public int calcularAforo() {
        int aforo;
        if( expandible == true){
            aforo = numStands * aumentarCapStands();
        }
        else {
            aforo = numStands * PERSONAS_POR_STAND;
        }
        return aforo;
    }
    
   @Override
    public int aumentarCapStands() {
        return PERSONAS_POR_STAND + EXTRA_DE_PERSONAS;
    }

    
    protected void verificarInvariantes() {
        super.verificarInvariantes();
        assert numStands > 0 : "El número de stands debe ser mayor a 0";
        assert tipoCocina != null && !tipoCocina.isEmpty() : "El tipo de cocina no puede ser nulo ni estar vacío";
    }
}
 
