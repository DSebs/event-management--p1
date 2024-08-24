/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lausebas.eventmng.services;

import com.lausebas.eventmng.model.Artista;
import com.lausebas.eventmng.model.Evento;
import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class ServicioArtista {
    
    private ArrayList <Artista> artistas;   

    public ServicioArtista(ArrayList<Artista> artistas) {
        this.artistas = artistas;
    }
    
        public void añadirArtista(Artista artista) {
        artistas.add(artista);
    }
        
        public ArrayList listarArtistas(){
            return artistas;
        }
}
