/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplohilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class Tarea extends Thread{

    public String nombre;
    
    @Override
    public void run() {
        for (int i=1;i<=500;i++) {
            System.out.println("Soy la tarea:" + nombre +", llevo: "+i +" Segundos ejecutandome");
            try {
            this.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Tarea.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }
}
