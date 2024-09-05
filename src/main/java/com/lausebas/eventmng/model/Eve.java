/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lausebas.eventmng.model;

public class Eve {
    
    private static Eve evento;
    
    private String nombre;
    private String ubicacion;
    private String correo;
    private int añoFundacion;
    
    public static Eve getEve(){
        if(evento == null){
        
        evento = new Eve();
        }
        
        return evento;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getCorreo() {
        return correo;
    }

    public int getAñoFundacion() {
        return añoFundacion;
    }

    private Eve() {
        nombre = "Eventify";
        ubicacion = "Cra 6 #83A-55 ";
        correo = "evemanagement@gmail.com";
        añoFundacion = 2024;
    }

    @Override
    public String toString() {
        return "Eve{" + "nombre=" + nombre + ", ubicacion=" + ubicacion + ", correo=" + correo + ", a\u00f1oFundacion=" + añoFundacion + '}';
    }
    
    
    
}
