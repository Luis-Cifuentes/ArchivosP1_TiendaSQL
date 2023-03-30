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
        if (this.primero == null) { //Si el primer nodo es nulo
            this.ultimo = new Nodo(null, objeto); //El ultimo sera un nuevo nodo
            this.primero = this.ultimo; //El primero apuntara al ultimo
        } else {
            Nodo nuevo = new Nodo(null, objeto); //Se crea un nuevo nodo
            this.ultimo.setSiguiente(nuevo); //El siguiente del ultimo sera este nuevo nodo
            this.ultimo = nuevo; //El ultimo ahora sea este nuevo nodo
        }
    }
    
    //Metodo para hallar su tamanio
    public int hallarTamanio() {
        int tamanio = 0; //Se inicializa una variable tamanio
        Nodo temp = this.primero; //Se crea un nodo temporal
        while (temp != null) { //Se recorre la lista dependiendo sus nodos
            temp = temp.getSiguiente();
            tamanio++; //Incrementa el tamanio en 1
        }
        return tamanio; //Retorna el tamanio
    }

    /*Getters y Setters*/
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
