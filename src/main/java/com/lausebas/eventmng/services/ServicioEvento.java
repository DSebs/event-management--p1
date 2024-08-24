package com.lausebas.eventmng.services;

import com.lausebas.eventmng.model.Evento;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Servicio para gestionar eventos.
 */
public class ServicioEvento {

    private ArrayList<Evento> eventos;

    public ServicioEvento(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public void añadirEvento(Evento evento) {
        eventos.add(evento);
    }

    public Evento buscarEvento(String nombre, Class<?> tipoEvento) {
        for (Evento evento : eventos) {
            if (evento.getNombre().equalsIgnoreCase(nombre) && tipoEvento.isInstance(evento)) {
                return evento;
            }
        }
        return null; 
    }
    
    public void eliminarEvento(Evento evento) {
        eventos.remove(evento);
    }
    
    public ArrayList<Evento> listarEventos(Class<?> tipoEvento) {
        List<Evento> eventosFiltrados = eventos.stream()
                                               .filter(tipoEvento::isInstance)
                                               .collect(Collectors.toList());
        
        return new ArrayList<>(eventosFiltrados);
    }
    
    public int calcularAforo(Evento evento){
        return evento.calcularAforo();
    }
}
