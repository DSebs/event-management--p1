package com.lausebas.eventmng.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concierto extends Evento {

    private Artista artista;
    private int localidades;
    public String tipoMusica;
     public final static int PERSONAS_POR_LOCALIDAD = 235;

    public Concierto(Artista artista, int localidades, String tipoMusica, String nombre, LocalDate fecha, String ubicacion, double precioEntrada) {
        super(nombre, fecha, ubicacion, precioEntrada);
        this.artista = artista;
        this.localidades = localidades;
        this.tipoMusica = tipoMusica;
        verificarInvariantes();
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
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
        return localidades * PERSONAS_POR_LOCALIDAD;
    }

    protected void verificarInvariantes() {
        super.verificarInvariantes();
        assert artista != null : "El artista no puede ser nulo";
        assert localidades > 0 : "El número de localidades debe ser mayor a 0";
        assert tipoMusica != null: "El tipo de musica no puede estar vacio";
    }

    
}
