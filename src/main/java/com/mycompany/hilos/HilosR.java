/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hilos;

import java.util.logging.Level;
import java.util.logging.Logger;
import runnable.RunnableSimple;
import threads.ThreadSimple;

/**
 * @author Alumno
 */
public class HilosR {
    public static void main(String[] args) throws InterruptedException {
        Thread main= Thread.currentThread();
        
        Runnable hilo =() ->{
            for (int i = 0; i < 10; i++) {
                System.out.println( i +" " + Thread.currentThread().getName());
                try {
                    Thread.sleep((long) (Math.random()*1000));
                } catch (Exception e) {
                    System.out.println(e);
                }
                  System.out.println("Estado :" + Thread.currentThread().getState());
            }
        
        };
        
        Thread.currentThread().getState();
        
        System.out.println(Thread.currentThread().getName());
        
        //metodo main 
        Thread hilo1 =new Thread(hilo,"carrera de caballos 1");
        
        Thread hilo2 =new Thread(hilo,"carrera de caballos 2");
        
        Thread hilo3 =new Thread(hilo,"carrera de caballos 3");
        
        Thread hilo4 =new Thread(hilo,"carrera de caballos 4");
        
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
        hilo1.join();
        hilo2.join();
        hilo3.join();
        hilo4.join();
        
        System.out.println(hilo1.getState());
        System.out.println(hilo2.getState());
        System.out.println(hilo3.getState());
        System.out.println(hilo4.getState());
        
        System.out.println("Continuando con el main" +Thread.currentThread().getName());
        
    }
    
}
