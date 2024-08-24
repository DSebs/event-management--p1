package com.lausebas.eventmng.model;

import java.time.LocalDate;

public abstract class Evento {
   
    private String nombre;
    private LocalDate fecha;
    private String ubicacion;
    private double precioEntrada;

    public Evento(String nombre, LocalDate fecha, String ubicacion, double precioEntrada) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.precioEntrada = precioEntrada;
        verificarInvariantes();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        verificarInvariantes();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
        verificarInvariantes();
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
        verificarInvariantes();
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
        verificarInvariantes();
    }
    
    public abstract int calcularAforo();

    protected void verificarInvariantes() {
        assert nombre != null && !nombre.trim().isEmpty() : "El nombre no puede ser null ni estar vacío.";
        assert fecha != null : "La fecha no puede ser null.";
        assert ubicacion != null && !ubicacion.trim().isEmpty() : "La ubicación no puede ser null ni estar vacía.";
        assert precioEntrada > 0 : "El precio de la entrada debe ser mayor a 0.";
    }
}
