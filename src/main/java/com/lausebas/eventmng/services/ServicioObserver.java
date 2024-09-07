/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lausebas.eventmng.services;

import com.lausebas.eventmng.model.Concierto;
import com.lausebas.eventmng.model.Evento;
import com.lausebas.eventmng.model.FeriaGastronomica;
import com.lausebs.eventmng.view.Notificable;
import java.util.ArrayList;

/**
 *
 * @author Laura
 */
public class ServicioObserver {
    
    private ArrayList <Notificable> igInteresadas;
   
    
    public ServicioObserver() {
        igInteresadas = new ArrayList();
    }
    
    
    public void añadirigInteresadas(Notificable igInteresada){
        igInteresadas.add(igInteresada);
        
    }
    
    public void notificarCambio(){
        for (Notificable igInteresada : igInteresadas) {
                igInteresada.avisoCambio();
            }
    }
    
    
    
    public void eliminarigInteresadas(Notificable igInteresada){
        igInteresadas.remove(igInteresada);
    }
    
    
}
