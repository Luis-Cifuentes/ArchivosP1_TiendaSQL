package com.nrodas.archivosp1;


import com.nrodas.archivosp1.conexion.Conexion;
import com.nrodas.archivosp1.interfazgrafica.Login;

/**
 * Hello world!
 *
 */
public class App 
{

    /**
     *
     * @param args
     */
    public static void main( String[] args ) {
        Conexion conexion = new Conexion(); //Se instancia una nueva conexion
        if (conexion.iniciarConexionDB()) { //Si la conexion se realiza con exito
            Login login = new Login(); //Se muestra el jframe para loguearse
        }
    }
}
