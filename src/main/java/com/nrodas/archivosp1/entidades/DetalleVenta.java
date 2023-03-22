/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.entidades;

/**
 *
 * @author lroda
 */
public class DetalleVenta {
    
    /*Atributos*/
    private int idVenta;
    private String codigoProducto;
    private String descripcionProducto;
    private int cantidadProducto;
    private double subTotal;
    
    /*Constructores*/
    public DetalleVenta() {
        //Constructor por defecto
    }

    public DetalleVenta(int idVenta, String codigoProducto, String descripcionProducto, int cantidadProducto, double subTotal) {
        //Constructor con parametros
        this.idVenta = idVenta;
        this.codigoProducto = codigoProducto;
        this.descripcionProducto = descripcionProducto;
        this.cantidadProducto = cantidadProducto;
        this.subTotal = subTotal;
    }
    
    //Getters y Setters
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
       
}
