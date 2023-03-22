/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.entidades;

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
    private double salario;
    
    /*Constructores*/
    public Empleado() {
        //Constructor por defecto
    }

    public Empleado(int idUsuario, String contrasenia, String nombreEmpleado, int sucursal, int rol, double salario) {
        this.idUsuario = idUsuario;
        this.contrasenia = contrasenia;
        this.nombreEmpleado = nombreEmpleado;
        this.sucursal = sucursal;
        this.rol = rol;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
