/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.entidades;

/**
 *
 * @author lroda
 */
public class Cliente {
    
    /*Atributos de entidad*/
    private int nitCliente;
    private String apellidoCliente;
    private String nombreCliente;
    
    /*Constructores*/
    public Cliente() {
        //Constructor por defecto
    }

    public Cliente(int nitCliente, String apellidoCliente, String nombreCliente) {
        //Constructor con parametros
        this.nitCliente = nitCliente;
        this.apellidoCliente = apellidoCliente;
        this.nombreCliente = nombreCliente;
    }
    
    /*Getters y Setters*/
    public int getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(int nitCliente) {
        this.nitCliente = nitCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
     
}
