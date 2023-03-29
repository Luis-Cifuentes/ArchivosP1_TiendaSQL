/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.nrodas.archivosp1.interfazgrafica;

import com.nrodas.archivosp1.apoyo.Conversor;

/**
 *
 * @author lroda
 */
public class Inv_Pnl1 extends javax.swing.JPanel {

    /**
     * Creates new form Inv_Pnl1
     */
    public Inv_Pnl1() {
        initComponents();
        String suc = Conversor.determinarNombreSucursal(EmpLogueado.empleadoLogueado.getSucursal());
        this.jLabelSucursal.setText(suc);
        this.jComboBoxInstalacion.removeItem(suc);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSucursal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxInstalacion = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSucursal.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelSucursal.setForeground(new java.awt.Color(0, 0, 0));
        jLabelSucursal.setText("jLabel1");
        add(jLabelSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 260, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Instalacion Proveedora: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 260, -1));

        jComboBoxInstalacion.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxInstalacion.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jComboBoxInstalacion.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxInstalacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bodega", "Sucursal Central", "Sucursal Norte", "Sucursal Sur" }));
        add(jComboBoxInstalacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, 170, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxInstalacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelSucursal;
    // End of variables declaration//GEN-END:variables
}