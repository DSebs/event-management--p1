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
        
    public ArrayList<Artista> listarArtistas() {
        return artistas;
    }
}
