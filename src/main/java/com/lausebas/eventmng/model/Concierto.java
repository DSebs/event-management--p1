package com.lausebas.eventmng.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concierto extends Evento {

    private Artista artista;
    private int localidades;

    public Concierto(String nombre, LocalDate fecha, String ubicacion, double precioEntrada, Artista artista, int localidades) {
        super(nombre, fecha, ubicacion, precioEntrada);
        this.artista = artista;
        this.localidades = localidades;
        verificarInvariantes();
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
        verificarInvariantes();
    }

    public int getLocalidades() {
        return localidades;
    }

    public void setLocalidades(int localidades) {
        this.localidades = localidades;
        verificarInvariantes();
    }

    @Override
    public int calcularAforo() {
        // Implementación específica del cálculo de aforo
        return 0;
    }

    protected void verificarInvariantes() {
        super.verificarInvariantes();
        assert artista != null : "El artista no puede ser nulo";
        assert localidades > 0 : "El número de localidades debe ser mayor a 0";
    }
}
