/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.nrodas.archivosp1.interfazgrafica;

/**
 * Clase encargada de presentar el panel de home
 * @author lroda
 */
public class Inicio_Pnl extends javax.swing.JPanel {

    /**
     * Creates new form Inicio_Pnl
     */
    public Inicio_Pnl() {
        initComponents();
        this.setSize(980, 650);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelT1 = new javax.swing.JLabel();
        jLabelText1 = new javax.swing.JLabel();
        jLabelText2 = new javax.swing.JLabel();
        jLabelTextRecordatorio = new javax.swing.JLabel();
        jLabelInfo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelT1.setFont(new java.awt.Font("SansSerif", 1, 42)); // NOI18N
        jLabelT1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelT1.setText("Electronic-Homes");
        add(jLabelT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabelText1.setFont(new java.awt.Font("SansSerif", 0, 28)); // NOI18N
        jLabelText1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelText1.setText("Contamos con los mejores electrodomesticos en la ciudad a los ");
        add(jLabelText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabelText2.setFont(new java.awt.Font("SansSerif", 0, 28)); // NOI18N
        jLabelText2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelText2.setText("mejores precios.");
        add(jLabelText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabelTextRecordatorio.setFont(new java.awt.Font("SansSerif", 0, 28)); // NOI18N
        jLabelTextRecordatorio.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTextRecordatorio.setText("Recordatorio:");
        add(jLabelTextRecordatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabelInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Promocion.png"))); // NOI18N
        add(jLabelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 820, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelT1;
    private javax.swing.JLabel jLabelText1;
    private javax.swing.JLabel jLabelText2;
    private javax.swing.JLabel jLabelTextRecordatorio;
    // End of variables declaration//GEN-END:variables
}
