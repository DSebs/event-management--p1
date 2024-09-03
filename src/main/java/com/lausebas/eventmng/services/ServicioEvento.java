package com.lausebas.eventmng.services;

import com.lausebas.eventmng.model.Artista;
import com.lausebas.eventmng.model.Concierto;
import com.lausebas.eventmng.model.Evento;
import com.lausebas.eventmng.model.FeriaGastronomica;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServicioEvento {

    private ArrayList<Evento> eventos;

    public ServicioEvento() {
        eventos = new ArrayList();
    }

    public Concierto crearConcierto(Artista artista, int localidades, String tipoMusica, String nombre, LocalDate fecha, String ubicacion, double precioEntrada){
        if (nombre == null || nombre.trim().isEmpty()) {
        throw new IllegalArgumentException("El nombre no puede ser null ni estar vacío.");
    }
    if (fecha == null) {
        throw new IllegalArgumentException("La fecha no puede ser null.");
    }
    if (ubicacion == null || ubicacion.trim().isEmpty()) {
        throw new IllegalArgumentException("La ubicación no puede ser null ni estar vacía.");
    }
    if (precioEntrada <= 0) {
        throw new IllegalArgumentException("El precio de la entrada debe ser mayor a 0.");
    }
    if(artista == null){
         throw new IllegalArgumentException("Se tiene que elegir por lo menos un artista");
    }
    if(localidades <= 0){
         throw new IllegalArgumentException("Tiene que haber por lo menos una localidad");
    }
    if(tipoMusica ==  null){
         throw new IllegalArgumentException("El tipo de musica no puede estar vacio");
    }
        Concierto concert = new Concierto(artista, localidades, tipoMusica, nombre, fecha, ubicacion, precioEntrada);
        return concert;
    }
    
    public FeriaGastronomica crearFeriaGastro(int numStands, String tipoCocina, boolean expandible, String nombre, LocalDate fecha, String ubicacion, double precioEntrada){
    if (nombre == null || nombre.trim().isEmpty()) {
        throw new IllegalArgumentException("El nombre no puede ser null ni estar vacío.");
    }
    if (fecha == null) {
        throw new IllegalArgumentException("La fecha no puede ser null.");
    }
    if (ubicacion == null || ubicacion.trim().isEmpty()) {
        throw new IllegalArgumentException("La ubicación no puede ser null ni estar vacía.");
    }
    if (precioEntrada <= 0) {
        throw new IllegalArgumentException("El precio de la entrada debe ser mayor a 0.");
    }
    if(tipoCocina == null){
         throw new IllegalArgumentException("El tipo de cocina no puede ir vacio");
    }
    if(numStands<= 0){
         throw new IllegalArgumentException("Tiene que haber por lo menos un stand");
    }
        FeriaGastronomica feriaG = new FeriaGastronomica(numStands,tipoCocina,expandible,nombre,fecha,ubicacion,precioEntrada);
        return feriaG;
    }
    
    public void añadirConcierto(Concierto concierto) {
        if (concierto == null) {
            throw new IllegalArgumentException("El evento no puede ser null.");
        }

        for (Evento e : eventos) {
            if (e.getNombre().equalsIgnoreCase(concierto.getNombre())) {
                throw new IllegalArgumentException("Ya existe un concierto con el mismo nombre.");
            }
        }

        eventos.add(concierto);
    }
    
        public void añadirFeriaGastro(FeriaGastronomica feriaGastro) {
        if (feriaGastro == null) {
            throw new IllegalArgumentException("El evento no puede ser null.");
        }

        for (Evento e : eventos) {
            if (e.getNombre().equalsIgnoreCase(feriaGastro.getNombre())) {
                throw new IllegalArgumentException("Ya existe una feria con el mismo nombre.");
            }
        }

        eventos.add(feriaGastro);
    }

 public Concierto buscarConcierto(String nombre) {
    if (nombre == null || nombre.isEmpty()) {
        throw new IllegalArgumentException("El nombre del evento no puede estar vacío o ser null.");
    }
    for (Evento evento : eventos) {
        if (evento.getNombre().equalsIgnoreCase(nombre) && evento instanceof Concierto) {
            return (Concierto) evento; 
        }
    }

        throw new IllegalArgumentException("No se encontró un evento con el nombre proporcionado");
    }

  public FeriaGastronomica buscarFeriaGastro(String nombre) {
    if (nombre == null || nombre.isEmpty()) {
        throw new IllegalArgumentException("El nombre del evento no puede estar vacío o ser null.");
    }
    for (Evento evento : eventos) {
        if (evento.getNombre().equalsIgnoreCase(nombre) && evento instanceof FeriaGastronomica) {
            return (FeriaGastronomica) evento; 
        }
    }

        throw new IllegalArgumentException("No se encontró un evento con el nombre proporcionado");
    }
  
    public void eliminarConcierto(Concierto concierto) {
        if (concierto == null) {
            throw new IllegalArgumentException("El evento no puede ser null.");
        }

        if (!eventos.remove(concierto)) {
            throw new IllegalArgumentException("El evento no se encuentra en la lista.");
        }
    }
    
        public void eliminarFeriaGastro(FeriaGastronomica feriaGastro) {
        if (feriaGastro == null) {
            throw new IllegalArgumentException("El evento no puede ser null.");
        }

        if (!eventos.remove(feriaGastro)) {
            throw new IllegalArgumentException("El evento no se encuentra en la lista.");
        }
    }


   public ArrayList<Concierto> listarConciertos() {
    List<Concierto> conciertosFiltrados = eventos.stream()
                                                 .filter(evento -> evento instanceof Concierto)
                                                 .map(evento -> (Concierto) evento)
                                                 .collect(Collectors.toList());

    return new ArrayList<>(conciertosFiltrados);
}

   
   public ArrayList<FeriaGastronomica> listarFeriasGastronomicas() {
    List<FeriaGastronomica> feriasFiltradas = eventos.stream()
                                                     .filter(evento -> evento instanceof FeriaGastronomica)
                                                     .map(evento -> (FeriaGastronomica) evento)
                                                     .collect(Collectors.toList());

    return new ArrayList<>(feriasFiltradas);
}
   
    public int calcularAforo(Evento evento) {
        if (evento == null) {
            throw new IllegalArgumentException("El evento no puede ser null.");
        }
        return evento.calcularAforo();
    }
    
  
}
