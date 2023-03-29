/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.listas;

/**
 *
 * @author lroda
 */
public class Matriz {
    
    /*Atributos*/
    private Lista primera;
    private Lista ultima;
    
    /*Contructor*/
    public Matriz() {
        this.primera = null;
        this.ultima = null;
    }
    
    /*Metodo para agregar una nueva lista*/
    public void agregarNuevaLista(Lista lista) {
        if (this.primera == null) {
            this.ultima = lista;
            this.primera = this.ultima;
        } else {
            this.ultima.setSiguiente(lista);
            this.ultima = lista;
        }
    }

    public Lista getPrimera() {
        return primera;
    }

    public void setPrimera(Lista primera) {
        this.primera = primera;
    }

    public Lista getUltima() {
        return ultima;
    }

    public void setUltima(Lista ultima) {
        this.ultima = ultima;
    }
    
    
    
}
