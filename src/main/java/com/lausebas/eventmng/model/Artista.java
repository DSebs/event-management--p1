/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lausebas.eventmng.model;

/**
 *
 * @author Laura
 */
public class Artista  {
    
    private String nombre;
    private String disquera;

    public Artista(String nombre, String disquera) {
        this.nombre = nombre;
        this.disquera = disquera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDisquera() {
        return disquera;
    }

    public void setDisquera(String disquera) {
        this.disquera = disquera;
    }
    
      private void verificarInvariantes() {
        assert nombre != null && !nombre.isEmpty() : "El nombre del artista no puede ser null ni estar vacío";
        assert disquera != null && !disquera.isEmpty() : "La disquera no puede ser null ni estar vacía";
    }
    
    
}
