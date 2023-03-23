package com.nrodas.archivosp1;

import com.nrodas.archivosp1.conexion.Conexion;
import com.nrodas.archivosp1.entidades.Cliente;
import com.nrodas.archivosp1.entidades.Empleado;
import com.nrodas.archivosp1.entidades.Producto;
import java.math.BigDecimal;
//import com.nrodas.archivosp1.interfazgrafica.Login;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Conexion conexion = new Conexion();

        if (conexion.iniciarConexionDB()) {
            System.out.println("Conexion Exitosa");
            Producto producto = new Producto("000A11122345", 4, "Lampara de noche Oster", 15, 105.56);
            if (producto.insertarProducto()) {
                System.out.println("Producto Agregado");
            } else {
                System.out.println("No se puedo agregar el producto");
            }
        }
    }
}
