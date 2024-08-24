package com.lausebas.eventmng.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class FeriaGastronomica extends Evento {

    private int numStands;
    private String tipoCocina;

    public FeriaGastronomica(String nombre, LocalDate fecha, String ubicacion, double precioEntrada, int numStands, String tipoCocina) {
        super(nombre, fecha, ubicacion, precioEntrada);
        this.numStands = numStands;
        this.tipoCocina = tipoCocina;
        verificarInvariantes();
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
        // Implementación específica del cálculo de aforo
        return 0;
    }

    protected void verificarInvariantes() {
        super.verificarInvariantes();
        assert numStands > 0 : "El número de stands debe ser mayor a 0";
        assert tipoCocina != null && !tipoCocina.isEmpty() : "El tipo de cocina no puede ser nulo ni estar vacío";
    }
}
