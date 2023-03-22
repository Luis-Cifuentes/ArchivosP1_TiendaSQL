/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.entidades;

/**
 *
 * @author lroda
 */
public class Producto {
    
    /*Atributos*/
    private String codigoProducto;
    private int inventario;
    private String descripcionProducto;
    private int cantidad;
    private double precioUnitario;
    
    /*Contructores*/
    public Producto() {
        //Constructor por defecto
    }

    public Producto(String codigoProducto, int inventario, String descripcionProducto, int cantidad, double precioUnitario) {
        this.codigoProducto = codigoProducto;
        this.inventario = inventario;
        this.descripcionProducto = descripcionProducto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    /*Getters y Setters*/
    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
}
