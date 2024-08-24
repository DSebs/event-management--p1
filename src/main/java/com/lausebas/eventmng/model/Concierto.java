/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lausebas.eventmng.model;

import java.time.LocalDate;


/**
 *
 * @author Laura
 */
public class Concierto extends Evento {

    @Override
    public int calcularAforo() {
        return localidades * PERSONAS_POR_LOCALIDAD;
    }
    
    private String tipoMusica;
    private int localidades;
    private Artista artista;
    
    public final static int PERSONAS_POR_LOCALIDAD = 135;

    public Concierto(String tipoMusica, int localidades, String nombre, LocalDate fecha, String ubicacion, double precioEntrada) {
        super(nombre, fecha, ubicacion, precioEntrada);
        this.tipoMusica = tipoMusica;
        this.localidades = localidades;
        
        
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
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
