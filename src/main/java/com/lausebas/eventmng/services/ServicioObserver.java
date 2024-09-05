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
    
    public void notificarCreacion(Evento evento){
        for (Notificable igInteresada : igInteresadas) {
            if(evento instanceof Concierto){
                igInteresada.avisoCreacion((Concierto)evento);
                
            }
            else if(evento instanceof FeriaGastronomica){
                igInteresada.avisoCreacion((FeriaGastronomica)evento);
            }
            
        }
 
    }
    
    public void notificarActualizacion(Evento evento){
        for (Notificable igInteresada : igInteresadas) {
            if(evento instanceof Concierto){
                igInteresada.avisoActualizacion((Concierto)evento);
                
            }
            else if(evento instanceof FeriaGastronomica){
                igInteresada.avisoActualizacion((FeriaGastronomica)evento);
            }
            
        } 
    }
    
    public void notificarEliminacion(Evento evento){
         for (Notificable igInteresada : igInteresadas) {
            if(evento instanceof Concierto){
                igInteresada.avisoEliminacion((Concierto)evento);
                
            }
            else if(evento instanceof FeriaGastronomica){
                igInteresada.avisoEliminacion((FeriaGastronomica)evento);
            }
            
        }
    }
    
    public void eliminarigInteresadas(Notificable igInteresada){
        igInteresadas.remove(igInteresada);
    }
    
    
}
