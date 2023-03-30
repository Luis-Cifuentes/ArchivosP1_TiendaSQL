/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.entidades;

import com.nrodas.archivosp1.conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
    
    //Metodos Para las Query con Clientes
    public boolean actualizarCliente(String nombre, String apellido, int nit) { //Metodo que recibe los datos a actualizar del Cliente
        boolean correctUpdate = false; //Bandera que marca si se realizo con exito
        String consulta = "UPDATE ControlTienda.Cliente SET nombreCliente = ?, apellidoCliente = ? WHERE nit = ?"; //Se prepara la Query
        try(PreparedStatement preSt = Conexion.getConexionDB().prepareCall(consulta)){ //Se hace la llamada
            //Se sustituyen los valores
            preSt.setString(1, nombre);
            preSt.setString(2, apellido);
            preSt.setInt(3, nit);
            if (preSt.executeUpdate() > 0) { //Vaida que haya sido exitosa
                correctUpdate = true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            //Imprime un mensaje en caso de que no sea asi
        }
        return correctUpdate; //Retorna el valor
    }
    
    //Metodo para Insertar un cliente
    public boolean insertarCliente() {
        boolean correctInsert = false; //Bandera que indica que fue agregado
        String consulta = "INSERT INTO ControlTienda.Cliente(nit, apellidoCliente, nombreCliente) VALUES (?, ?, ?)"; //Se prepara la consulta
        try (PreparedStatement preSt = Conexion.getConexionDB().prepareCall(consulta)) { //Se prepara la llamada
            //Se sustituyen los datos
            preSt.setInt(1, this.nitCliente);
            preSt.setString(2, this.apellidoCliente);
            preSt.setString(3, this.nombreCliente);
            if (preSt.executeUpdate() > 0) {
                correctInsert = true; //Si se inserto correctamente se setea a true
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            //Muestra si hay un error
        }
        return correctInsert; //Devuelve si la insercion fue correcta
    }
    
    //Metodo para buscarUnCliente
    public boolean buscarCliente(int nit) {
        boolean clienteEncontrado = false; //Bandera que indica si el cliente fue encontrado
        String consulta = "SELECT apellidoCliente, nombreCliente FROM ControlTienda.Cliente WHERE nit = ?"; //Se prepara la Query
        try(PreparedStatement preSt = Conexion.getConexionDB().prepareCall(consulta)) { //Se prepara la llamada
            //Se setean los datos
            preSt.setInt(1, nit);
            ResultSet resultado = preSt.executeQuery(); //Se ejecuta la Query
            if (resultado.next()) { //Valida que se haya encontrado el cliente
                //Se asignan los datos
                this.nitCliente = nit;
                this.apellidoCliente = resultado.getString(1);
                this.nombreCliente = resultado.getString(2);
                clienteEncontrado = true; //Se devulve verdadero
            }
            resultado.close(); //Se cierra para mejor optimizacion 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            //Muestra si es que hay un error
        }
        return clienteEncontrado; //Devuelve si la operacion fue exitosa
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
