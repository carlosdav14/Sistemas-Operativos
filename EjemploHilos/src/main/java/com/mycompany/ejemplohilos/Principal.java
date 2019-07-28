/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplohilos;

/**
 *
 * @author Carlos
 */
public class Principal {
    
    public static void main(String[] args) {       
        Tarea tarea1 = new Tarea();
        tarea1.nombre = "Tarea 1";
        Tarea tarea2 = new Tarea();
        tarea2.nombre = "Tarea 2";
        tarea1.start();
        tarea2.start();
    }
    
}
