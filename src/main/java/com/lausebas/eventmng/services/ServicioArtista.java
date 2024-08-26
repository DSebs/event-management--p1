/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lausebas.eventmng.services;

import com.lausebas.eventmng.model.Artista;
import java.util.ArrayList;

public class ServicioArtista {
    
    private ArrayList<Artista> artistas;   

    public ServicioArtista(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }
    
    public Artista crearArtista(String nombre, String disquera){
        if (nombre == null || nombre.trim().isEmpty()) {
        throw new IllegalArgumentException("El nombre no puede ser null ni estar vacío.");
    }
    if (disquera == null|| disquera.trim().isEmpty() ) {
        throw new IllegalArgumentException("La disquera no puede estar vacial.");
    }
        return new Artista(nombre, disquera);
    }
    
    public void añadirArtista(Artista artista) {
        if (artista == null) {
            throw new IllegalArgumentException("El artista no puede ser null.");
        }

        for (Artista a : artistas) {
            if (a.getNombre().equalsIgnoreCase(artista.getNombre())) {
                throw new IllegalArgumentException("Ya existe un artista con el mismo nombre.");
            }
        }

        artistas.add(artista);
    }
    
    public Artista buscarArtista(String nombre){
        for (Artista artista : artistas) {
            if(artista.getNombre().equalsIgnoreCase(nombre));
            return artista;
        }
        return null;
    }
        
    public ArrayList<Artista> listarArtistas() {
        return artistas;
    }
}
