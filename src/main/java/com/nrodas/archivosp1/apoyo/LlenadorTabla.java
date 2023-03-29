/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nrodas.archivosp1.apoyo;

import com.nrodas.archivosp1.listas.Lista;
import com.nrodas.archivosp1.listas.Matriz;
import com.nrodas.archivosp1.listas.Nodo;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author lroda
 */
public class LlenadorTabla {
    
    public static void cambiarEncabezado(JTable tabla, String[] titulos) {
        JTableHeader header = tabla.getTableHeader();
        header.setBackground(new Color(94, 96, 98));
        header.setForeground(Color.white);
        header.setFont(new Font("SansSerif", Font.PLAIN, 18));
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);
        DefaultTableModel modelo = new DefaultTableModel();
        for (int i = 0; i < titulos.length; i++) {
            modelo.addColumn(titulos[i]);
        }
        tabla.setRowHeight(30);
        tabla.setBackground(new Color(238, 238, 238));
        tabla.setGridColor(Color.white);
        tabla.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        tabla.setFont(new Font("SansSerif", Font.PLAIN, 16));
        tabla.setEnabled(false);
        tabla.setCellSelectionEnabled(false); 
        tabla.setModel(modelo);
    }
    
    public static void llenarTabla(JTable tabla, Lista lista){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        Object[] objeto = new Object[lista.hallarTamanio()];
        Nodo temp = lista.getPrimero();
        int indice = 0;
        while (temp != null) {            
            objeto[indice] = " " + temp.getContenido();
            indice++;
            temp = temp.getSiguiente();
        }
        modelo.addRow(objeto);
    }
    
    public static void llenarTabla(JTable tabla, Matriz matriz) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int tamanio = matriz.getPrimera().hallarTamanio();
        Lista temp = matriz.getPrimera();
        int orden = 1;
        while (temp != null) {
            Object[] objeto = new Object[tamanio + 1];
            Nodo tempo = temp.getPrimero();
            int indice = 1;
            objeto[0] = "  " + orden; 
            while (tempo != null) {                
                objeto[indice] = "  " + tempo.getContenido();
                indice++;
                tempo = tempo.getSiguiente();
            }
            orden++;
            modelo.addRow(objeto);
            temp = temp.getSiguiente();
        }
    }
    
    public static void llenarTablaInventario(JTable tabla, Matriz matriz) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        int tamanio = matriz.getPrimera().hallarTamanio();
        Lista temp = matriz.getPrimera();
        while (temp != null) {
            Object[] objeto = new Object[tamanio];
            Nodo tempo = temp.getPrimero();
            int indice = 0;
            while (tempo != null) {                
                objeto[indice] = "  " + tempo.getContenido();
                indice++;
                tempo = tempo.getSiguiente();
            }
            modelo.addRow(objeto);
            temp = temp.getSiguiente();
        }
    }
}
