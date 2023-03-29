/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.entidades;

import com.nrodas.archivosp1.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lroda
 */
public class Venta {
    
    /*Atributos*/
    private int sucursal;
    private Date fechaVenta;
    private long codigoEmpleado;
    private String nitCliente;
    private boolean cFinal;
    private double total;
    
    /*Constructor*/
    public Venta() {
        //Constructor por defecto
    }

    public Venta(int sucursal, Date fechaVenta, long codigoEmpleado, String nitCliente, boolean cFinal, double total) {
        this.sucursal = sucursal;
        this.fechaVenta = fechaVenta;
        this.codigoEmpleado = codigoEmpleado;
        this.nitCliente = nitCliente;
        this.cFinal = cFinal;
        this.total = total;
    }
    
    //Metodos para realizar las Query
    public boolean insertarCompra() { //Metodo que registra las ventas
        boolean insercionCorrecta = false; //Bandera que Indica que la vetna fue realizada
        //Se formula la Query
        String consulta = "INSERT INTO ControlTienda.Venta (sucursal, fechaVenta, codigoEmpleado, nitcli, cf, total) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preSt = Conexion.getConexionDB().prepareCall(consulta)) { //Se prepara la call
            preSt.setInt(1, this.sucursal); //Se sutituyen datos
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd"); //Se da formato a la fecha
            preSt.setDate(2, java.sql.Date.valueOf(formato.format(this.fechaVenta)));
            preSt.setLong(3, this.codigoEmpleado);
            if (this.nitCliente == null) { //Comprueba si se ingreso un nit
                preSt.setNull(4, Types.BIGINT); //Setea como null
            } else {
                preSt.setInt(4, Integer.parseInt(this.nitCliente)); //Sustituye por el nit
            }
            preSt.setBoolean(5,this.cFinal);
            preSt.setDouble(6, this.total);
            if (preSt.executeUpdate() > 0) { //Se comprueba que la insercion hubiera sido exitosa
                insercionCorrecta = true; //La operacion es exitosa
            }
        } catch (SQLException e) {
            
            System.err.println(e.getMessage()); //Muestra un error
        }
        return insercionCorrecta; //Retorna el resultado de la expresion
    }
    
    //Metodo que busca la ultima compra y retorna el descuento
    public double buscarUltimaCompra(int nitCliente) { //Busca la ultima compra con el nit del cliente
        double totalAnterior = 0; //Retorne el total gastado de esa compra
        //Se formula la Query
        String consulta = "SELECT total FROM ControlTienda.Venta WHERE nitcli=? ORDER BY fechaVenta DESC LIMIT 1";
        try (PreparedStatement preSt = Conexion.getConexionDB().prepareCall(consulta)) { //Se prepara la call
            preSt.setInt(1, nitCliente); //Se sustituyen los valores
            ResultSet resultado = preSt.executeQuery(); //Se instancia un cuerpo de resultados
            if (resultado.next()) { //Verifica si retorno un resultado
                totalAnterior = resultado.getDouble(1); //Se le asigna el valor 
            }
            resultado.close(); //Se cierra para evitar problemas de optimizacion
        } catch (SQLException e) {
            System.err.println(e.getMessage()); //Muestra un error por si lo hay
        }
        return totalAnterior; //Retorna el valor
    }
    
    //Metodo que obtiene el id de factura mas alto
    public int buscarUltimaInsercion() {
        int idMax = 0;
        String consulta = "SELECT MAX(idVenta) FROM ControlTienda.Venta";
        try (PreparedStatement preSt = Conexion.getConexionDB().prepareCall(consulta)) {
            ResultSet resultado = preSt.executeQuery();
            if (resultado.next()) {
                idMax = resultado.getInt(1);
            }
            resultado.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return idMax;
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

    public Long getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(Long codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNitCliente() {
        return nitCliente;
    }

    public void setNitCliente(String nitCliente) {
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
