/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.entidades;

import com.nrodas.archivosp1.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author lroda
 */
public class DetalleVenta {
    
    /*Atributos*/
    private int idVenta;
    private String codigoProducto;
    private int inventario;
    private String descripcionProducto;
    private int cantidadProducto;
    private double subTotal;
    
    /*Constructores*/
    public DetalleVenta() {
        //Constructor por defecto
    }

    public DetalleVenta(int idVenta, String codigoProducto, int inventario, String descripcionProducto, int cantidadProducto, double subTotal) {
        //Constructor con parametros
        this.idVenta = idVenta;
        this.codigoProducto = codigoProducto;
        this.inventario = inventario;
        this.descripcionProducto = descripcionProducto;
        this.cantidadProducto = cantidadProducto;
        this.subTotal = subTotal;
    }
    
    /*Metodos para las Query necesarias*/
    
    //Metodo que ingresa un nuevoDetalleVenta
    public boolean agregarDtlVenta() {
        boolean detalleAgregado = false; //Bandera que indica si un detalle de vetna fue agregado correctamente
        //Se formula la Query para que inserte datos en la tabla DetalleVenta
        String consulta = "INSERT INTO ControlTienda.DetalleVenta (idVenta, codigoPdt, inventario, descripcion, cantidad, subTotal) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preSt = Conexion.getConexionDB().prepareCall(consulta)) {
            preSt.setInt(1, this.idVenta);
            preSt.setString(2, this.codigoProducto);
            preSt.setInt(3, this.inventario);
            preSt.setString(4, this.descripcionProducto);
            preSt.setInt(5, this.cantidadProducto);
            preSt.setDouble(6, this.subTotal);
            if (preSt.executeUpdate() > 0) {
                detalleAgregado = true;
            }  
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return detalleAgregado;
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

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }
       
    
}
