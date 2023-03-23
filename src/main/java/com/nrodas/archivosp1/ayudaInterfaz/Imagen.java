/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.ayudaInterfaz;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author lroda
 */
public class Imagen {
    
    //Creamos Metodos publicos
    public Icon setearIconoImagen(JLabel label, String ruta) {
        ImageIcon imgFondo = new ImageIcon(getClass().getResource(ruta));
        Icon icono = new ImageIcon(imgFondo.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        return icono;
    }
    
    
}
