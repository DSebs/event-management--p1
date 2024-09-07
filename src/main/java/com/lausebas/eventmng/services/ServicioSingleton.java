/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lausebas.eventmng.services;

import com.lausebas.eventmng.model.Eve;

/**
 *
 * @author Laura
 */
public class ServicioSingleton {
     private Eve eveInfo;

    public ServicioSingleton() {
        eveInfo = Eve.getEve();
    }

    public Eve getEveInfo() {
        return eveInfo;
    }
    
    
     
     
     
    
}
