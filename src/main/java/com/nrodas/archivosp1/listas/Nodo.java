/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.listas;

/**
 *
 * @author lroda
 */
public class Nodo {
    
    /*Atributos*/
    private Nodo siguiente;
    private Object contenido;

    /*Constructor*/
    public Nodo(Nodo siguiente, Object contenido) {
        this.siguiente = siguiente;
        this.contenido = contenido;
        
    }

    /*Getters y Setters*/
    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Object getContenido() {
        return contenido;
    }

    public void setContenido(Object contenido) {
        this.contenido = contenido;
    }
    
    
    
    
    
}
