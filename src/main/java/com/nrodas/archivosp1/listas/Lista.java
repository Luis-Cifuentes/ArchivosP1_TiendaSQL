/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.listas;

/**
 *
 * @author lroda
 */
public class Lista {
    
    /*Atributos*/
    private Nodo primero;
    private Nodo ultimo;
    private Lista siguiente;

    /*Constructor*/
    public Lista(Lista siguiente) {
        this.primero = null;
        this.ultimo = null;
        this.siguiente = siguiente;
    }
    
    /*Metodo para expandir la matriz*/
    public void agregarNodo(Object objeto) {
        if (this.primero == null) {
            this.ultimo = new Nodo(null, objeto);
            this.primero = this.ultimo;
        } else {
            Nodo nuevo = new Nodo(null, objeto);
            this.ultimo.setSiguiente(nuevo);
            this.ultimo = nuevo;
        }
    }
    
    //Metodo para hallar su tamanio
    public int hallarTamanio() {
        int tamanio = 0;
        Nodo temp = this.primero;
        while (temp != null) {            
            temp = temp.getSiguiente();
            tamanio++;
        }
        return tamanio;
    }

    public Nodo getPrimero() {
        return primero;
    }

    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }  

    public Lista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Lista siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
