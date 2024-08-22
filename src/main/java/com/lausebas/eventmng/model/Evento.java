/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lausebas.eventmng.model;

import java.util.Date;

/**
 *
 * @author Laura
 */
public abstract class Evento {
   
    private String nombre;
    private Date fecha;
    private String ubicacion;
    private double precioEntrada;

    public Evento(String nombre, Date fecha, String ubicacion, double precioEntrada) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.precioEntrada = precioEntrada;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
    
    
    public abstract int calcularAforo();
    
    
    
}
