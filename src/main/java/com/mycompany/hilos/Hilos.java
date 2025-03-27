
package com.mycompany.hilos;

import threads.ThreadSimple;

/**
 * @author Alumno
 */
public class Hilos {

    public static void main(String[] args) 
            throws InterruptedException {
        Thread hilo = new ThreadSimple("juan");
        hilo.start();
        Thread hilo2 = new ThreadSimple("Jose");
        hilo2.start();
        System.out.println(hilo.getState());
      
    }
}
