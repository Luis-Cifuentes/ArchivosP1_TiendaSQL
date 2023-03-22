/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.entidades;

import java.util.Date;

/**
 *
 * @author lroda
 */
public class Venta {
    
    /*Atributos*/
    private int sucursal;
    private Date fechaVenta;
    private int codigoEmpleado;
    private int nitCliente;
    private boolean cFinal;
    private double total;
    
    /*Constructor*/
    public Venta() {
        //Constructor por defecto
    }

    public Venta(int sucursal, Date fechaVenta, int codigoEmpleado, int nitCliente, boolean cFinal, double total) {
        this.sucursal = sucursal;
        this.fechaVenta = fechaVenta;
        this.codigoEmpleado = codigoEmpleado;
        this.nitCliente = nitCliente;
        this.cFinal = cFinal;
        this.total = total;
    }
    
    //Getters y Setters
    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public int getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(int nitCliente) {
        this.nitCliente = nitCliente;
    }

    public boolean iscFinal() {
        return cFinal;
    }

    public void setcFinal(boolean cFinal) {
        this.cFinal = cFinal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
}
