/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.entidades;

import com.nrodas.archivosp1.conexion.Conexion;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lroda
 */
public class Empleado {
    
    /*Atributos*/
    private int idUsuario;
    private String contrasenia;
    private String nombreEmpleado;
    private int sucursal;
    private int rol;
    private BigDecimal salario;
    /*Constructores*/
    public Empleado() {
        //Constructor por defecto
    }

    public Empleado(int idUsuario, String contrasenia, String nombreEmpleado, int sucursal, int rol, BigDecimal salario) {
        this.idUsuario = idUsuario;
        this.contrasenia = contrasenia;
        this.nombreEmpleado = nombreEmpleado;
        this.sucursal = sucursal;
        this.rol = rol;
        this.salario = salario;
    }
    
    //Metodos de Query
    public boolean comprobarInformacion(int idUsuario, String contraseniap) { //Comprueba si los datos ingresador por el usuario son correctos
        boolean banderaCorrecta = false; //Bandera que marca si el usuario existe
        String consulta = "SELECT * FROM ControlPersonal.Empleado WHERE idUsuario = ? AND contrasenia = encode(digest(?, 'sha256'), 'hex')"; //Query
        try (PreparedStatement preSt = Conexion.getConexionDB().prepareCall(consulta)) { //SE utiliza un try-whith-resources por cualquier error
            preSt.setInt(1, idUsuario); //Se sustituye el primer ?
            preSt.setString(2, contraseniap); //Se sustituye el segundo ?
            ResultSet resultado = preSt.executeQuery(); //Se crea un conjunto de resultados
            if (resultado.next()) { //Valida si esta vacio es decir si se encontro el usuario correspondiente
                banderaCorrecta = true; //Se marca la bandero como verdader
                this.idUsuario = idUsuario; //Se llenan los datos del empleado
                this.contrasenia = contraseniap;
                this.sucursal = resultado.getInt("sucursal");
                this.nombreEmpleado = resultado.getString("nombreEmpleado");
                this.rol = resultado.getInt("rol");
                this.salario = resultado.getBigDecimal("salario");
            }
            resultado.close(); //Se cierra el result-set para proteger la memoria
        } catch (SQLException e) {
            System.out.println("Ocurrio un Problema: " + e.getMessage()); //Muestra el error que ocurre del porque no se pudo ejecutar la instrccuion
        }
        return banderaCorrecta; //Se retorna el valor de la bandera
    }
    
    public boolean agregarEmpleado() { //Metodo que se encarga de insertar un empleado
        boolean banderaAniadido = false; //Bandera que indica que fue aniadido
        String consulta = "INSERT INTO ControlPersonal.Empleado VALUES (?, encode(digest(?, 'sha256'), 'hex'), ?, ?, ?, ?)"; //Orden de consulta
         try (PreparedStatement preSt = Conexion.getConexionDB().prepareCall(consulta)) { //Se prepara la consulta
             preSt.setInt(1, this.idUsuario); //Se sustituyen valores
             preSt.setString(2, this.contrasenia);
             preSt.setString(3, this.nombreEmpleado);
             preSt.setInt(4, this.sucursal);
             preSt.setInt(5, this.rol);
             preSt.setBigDecimal(6, this.salario);
             preSt.executeUpdate(); //Se ejecuta la consulta
             banderaAniadido = true; //Tira afirmativo si fue aniadido
         } catch (SQLException e) {
             System.out.println("Ocurrio un Problema: " + e.getMessage()); //Muestra el error en pantalla 
         }
         return banderaAniadido; //Retorna el valor booleano
    }
    
    
    /*Getters y Setters*/
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    
    
}
