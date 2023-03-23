/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.entidades;

import com.nrodas.archivosp1.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
    
    //Metodos para las Query de Productos
    public boolean buscarProducto(String codigoProducto, int inventario) { //Metodo que busca el producto
        boolean productoEncontrado = false; //Bandera que indica si fue encontrado
        //Se prepara la consulta
        String consulta = "SELECT descripcion, cantidad, precioUnitario FROM ControlTienda.Producto WHERE codigoPdt = ? AND inventario = ?";
        try (PreparedStatement preSt = Conexion.getConexionDB().prepareCall(consulta)) { //Se prepara la llamada
            //Se sustituyen los datos
            preSt.setString(1, codigoProducto);
            preSt.setInt(2, inventario);
            ResultSet resultado = preSt.executeQuery(); //Se hace la consulta
            if (resultado.next()) { //Si existe sustituye los datos y afirma la operacion con exito
                this.codigoProducto = codigoProducto;
                this.inventario = inventario;
                this.descripcionProducto = resultado.getString(1);
                this.cantidad = resultado.getInt(2);
                this.precioUnitario = resultado.getDouble(3);
                productoEncontrado = true;
            }
            resultado.close(); //se cierra el resultado
        } catch (SQLException e) {
            System.err.println(e.getMessage()); //Se imprime el error
        }
        return productoEncontrado; //Se retorna el valor
    }
    
    //Metodo para agregar un producto
    public boolean insertarProducto () {
        boolean correctInsert = false; //Bandera que indica que el producto fue agregado
        String consulta = "INSERT INTO ControlTienda.Producto VALUES (?, ?, ?, ?, ?)"; //Se formula el Query
        try (PreparedStatement preSt = Conexion.getConexionDB().prepareCall(consulta)) { //Se prepara la llamada
            //Se sustituyen los datos
            preSt.setString(1, this.codigoProducto);
            preSt.setInt(2, this.inventario);
            preSt.setString(3, this.descripcionProducto);
            preSt.setInt(4, this.cantidad);
            preSt.setDouble(5, this.precioUnitario);
            if (preSt.executeUpdate() > 0) { //Se ejecuta el Query
                correctInsert = true; //Si setea a true si fue realizada con exito
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage()); //Muestra un error por si lo hubiera
        }
        return correctInsert; //Devuelve si la operacion se realizo con exito
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
