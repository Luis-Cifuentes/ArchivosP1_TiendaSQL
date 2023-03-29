package com.nrodas.archivosp1;


import com.nrodas.archivosp1.conexion.Conexion;
import com.nrodas.archivosp1.interfazgrafica.Login;
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
            Login login = new Login();
        }
    }
}
