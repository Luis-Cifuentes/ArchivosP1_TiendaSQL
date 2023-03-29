/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.nrodas.archivosp1.interfazgrafica;

import com.nrodas.archivosp1.entidades.Cliente;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author lroda
 */
public class Venta_Pnl2 extends javax.swing.JPanel {

    private Cliente cliente;
    
    public Venta_Pnl2() {
        initComponents();
        this.cliente = null;
        this.jPanelUpdate.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelT = new javax.swing.JLabel();
        jLabelNitCli = new javax.swing.JLabel();
        jTextFieldNitCli = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelBtnBuscar = new javax.swing.JPanel();
        jLabelBtnBuscar = new javax.swing.JLabel();
        jPanelUpdate = new javax.swing.JPanel();
        jLabelNombreCli = new javax.swing.JLabel();
        jTextFieldNombreCli = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabelApCli = new javax.swing.JLabel();
        jTextFieldApCli = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanelUpdateCli = new javax.swing.JPanel();
        jLabelUpdateCli = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelT.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelT.setForeground(new java.awt.Color(0, 0, 0));
        jLabelT.setText("Modifica con cuidado a nuestro clientes :)");
        add(jLabelT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jLabelNitCli.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelNitCli.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNitCli.setText("NIT del Cliente: ");
        add(jLabelNitCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 180, -1));

        jTextFieldNitCli.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNitCli.setFont(new java.awt.Font("SansSerif", 0, 21)); // NOI18N
        jTextFieldNitCli.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNitCli.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNitCli.setBorder(null);
        jTextFieldNitCli.setFocusable(false);
        jTextFieldNitCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldNitCliMousePressed(evt);
            }
        });
        jTextFieldNitCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNitCliKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNitCliKeyTyped(evt);
            }
        });
        add(jTextFieldNitCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 140, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 140, 10));

        jPanelBtnBuscar.setBackground(new java.awt.Color(94, 96, 98));

        jLabelBtnBuscar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabelBtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBtnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BuscarCliente.png"))); // NOI18N
        jLabelBtnBuscar.setText("Buscar");
        jLabelBtnBuscar.setEnabled(false);
        jLabelBtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBtnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBtnBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnBuscarLayout = new javax.swing.GroupLayout(jPanelBtnBuscar);
        jPanelBtnBuscar.setLayout(jPanelBtnBuscarLayout);
        jPanelBtnBuscarLayout.setHorizontalGroup(
            jPanelBtnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        jPanelBtnBuscarLayout.setVerticalGroup(
            jPanelBtnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelBtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        add(jPanelBtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 140, 30));

        jPanelUpdate.setBackground(new java.awt.Color(255, 255, 255));
        jPanelUpdate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombreCli.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelNombreCli.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombreCli.setText("Nombres: ");
        jPanelUpdate.add(jLabelNombreCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 120, -1));

        jTextFieldNombreCli.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldNombreCli.setFont(new java.awt.Font("SansSerif", 0, 21)); // NOI18N
        jTextFieldNombreCli.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldNombreCli.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldNombreCli.setBorder(null);
        jTextFieldNombreCli.setFocusable(false);
        jTextFieldNombreCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldNombreCliMousePressed(evt);
            }
        });
        jTextFieldNombreCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreCliKeyReleased(evt);
            }
        });
        jPanelUpdate.add(jTextFieldNombreCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 280, 30));
        jPanelUpdate.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 280, 10));

        jLabelApCli.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabelApCli.setForeground(new java.awt.Color(0, 0, 0));
        jLabelApCli.setText("Apellidos:");
        jPanelUpdate.add(jLabelApCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, -1));

        jTextFieldApCli.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldApCli.setFont(new java.awt.Font("SansSerif", 0, 21)); // NOI18N
        jTextFieldApCli.setForeground(new java.awt.Color(0, 0, 0));
        jTextFieldApCli.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldApCli.setBorder(null);
        jTextFieldApCli.setFocusable(false);
        jTextFieldApCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldApCliMousePressed(evt);
            }
        });
        jTextFieldApCli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldApCliKeyReleased(evt);
            }
        });
        jPanelUpdate.add(jTextFieldApCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 280, -1));
        jPanelUpdate.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 280, 10));

        jPanelUpdateCli.setBackground(new java.awt.Color(94, 96, 98));

        jLabelUpdateCli.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelUpdateCli.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUpdateCli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUpdateCli.setText("Actualizar");
        jLabelUpdateCli.setEnabled(false);
        jLabelUpdateCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelUpdateCliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelUpdateCliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelUpdateCliMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelUpdateCliLayout = new javax.swing.GroupLayout(jPanelUpdateCli);
        jPanelUpdateCli.setLayout(jPanelUpdateCliLayout);
        jPanelUpdateCliLayout.setHorizontalGroup(
            jPanelUpdateCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpdateCliLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelUpdateCli, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelUpdateCliLayout.setVerticalGroup(
            jPanelUpdateCliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelUpdateCliLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelUpdateCli, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelUpdate.add(jPanelUpdateCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 150, 40));

        add(jPanelUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 490, 290));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelBtnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnBuscarMouseEntered
        if (this.jLabelBtnBuscar.isEnabled()) {
            this.jLabelBtnBuscar.setBackground(new Color(152, 155, 158));
        }
    }//GEN-LAST:event_jLabelBtnBuscarMouseEntered

    private void jLabelBtnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnBuscarMouseExited
        this.jLabelBtnBuscar.setBackground(new Color(94, 96, 98));
    }//GEN-LAST:event_jLabelBtnBuscarMouseExited

    private void jLabelUpdateCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUpdateCliMouseEntered
        if (this.jLabelUpdateCli.isEnabled()) {
            this.jPanelUpdateCli.setBackground(new Color(152, 155, 158));
        }
    }//GEN-LAST:event_jLabelUpdateCliMouseEntered

    private void jLabelUpdateCliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUpdateCliMouseExited
        this.jPanelUpdateCli.setBackground(new Color(94, 96, 98));
    }//GEN-LAST:event_jLabelUpdateCliMouseExited

    /*Metodos Relacionados con los JTextFields*/
    
    private void jTextFieldNitCliKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNitCliKeyTyped
        if (this.jTextFieldNitCli.getText().length() > 7) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if (evt.getKeyChar() <= 48 && evt.getKeyChar() >= 57) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNitCliKeyTyped

    private void jTextFieldNitCliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNitCliKeyReleased
        if (!this.jTextFieldNitCli.getText().isBlank()) {
            this.jLabelBtnBuscar.setEnabled(true);
        } else {
            this.jLabelBtnBuscar.setEnabled(false);
        }
    }//GEN-LAST:event_jTextFieldNitCliKeyReleased

    private void jTextFieldNitCliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNitCliMousePressed
        this.jTextFieldNitCli.setFocusable(true);
        this.jTextFieldNitCli.requestFocus();
    }//GEN-LAST:event_jTextFieldNitCliMousePressed

    /*Metodo relacionado con el boton de buscar*/
    
    private void jLabelBtnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnBuscarMouseClicked
        if (this.jLabelBtnBuscar.isEnabled()) {
            this.cliente = new Cliente();
            String nit = this.jTextFieldNitCli.getText();
            if (this.cliente.buscarCliente(Integer.valueOf(nit))) {
                this.jTextFieldNombreCli.setText(this.cliente.getNombreCliente());
                this.jTextFieldApCli.setText(this.cliente.getApellidoCliente());
                this.jTextFieldNitCli.setEditable(false);
                this.jPanelUpdate.setVisible(true);             
            } else {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                ShowMsg msg = new ShowMsg(frame, true, "El cliente que ingresaste no existe");
            }
        }
    }//GEN-LAST:event_jLabelBtnBuscarMouseClicked

    /*Eventos con los otros dos jTextFields*/
    private void jTextFieldNombreCliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNombreCliMousePressed
        this.jTextFieldNombreCli.setFocusable(true);
        this.jTextFieldNombreCli.requestFocus();
    }//GEN-LAST:event_jTextFieldNombreCliMousePressed

    private void jTextFieldApCliMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldApCliMousePressed
        this.jTextFieldApCli.setFocusable(true);
        this.jTextFieldApCli.requestFocus();
    }//GEN-LAST:event_jTextFieldApCliMousePressed

    private void jTextFieldNombreCliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreCliKeyReleased
        int codigo = evt.getKeyCode();
        if (codigo == KeyEvent.VK_BACK_SPACE || codigo == KeyEvent.VK_DELETE) {
            this.jLabelUpdateCli.setEnabled(true);
        }
    }//GEN-LAST:event_jTextFieldNombreCliKeyReleased

    private void jTextFieldApCliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApCliKeyReleased
        int codigo = evt.getKeyCode();
        if (codigo == KeyEvent.VK_BACK_SPACE || codigo == KeyEvent.VK_DELETE) {
            this.jLabelUpdateCli.setEnabled(true);
        }
    }//GEN-LAST:event_jTextFieldApCliKeyReleased

    private void jLabelUpdateCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUpdateCliMouseClicked
        if (this.jLabelUpdateCli.isEnabled()) {
            String nombres = this.jTextFieldNombreCli.getText();
            String apellidos = this.jTextFieldApCli.getText();
            boolean correcto = this.cliente.actualizarCliente(nombres, apellidos, this.cliente.getNitCliente());
            if (correcto) {
                VentaR pnl = (VentaR) SwingUtilities.getWindowAncestor(this); //Se vuelve a actualizar el panel
                pnl.repintarPanelUpdate();
            } else {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                ShowMsg msg = new ShowMsg(frame, true, "Hubo un error al tratar de modificar al cliente");
            }
        }
    }//GEN-LAST:event_jLabelUpdateCliMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelApCli;
    private javax.swing.JLabel jLabelBtnBuscar;
    private javax.swing.JLabel jLabelNitCli;
    private javax.swing.JLabel jLabelNombreCli;
    private javax.swing.JLabel jLabelT;
    private javax.swing.JLabel jLabelUpdateCli;
    private javax.swing.JPanel jPanelBtnBuscar;
    private javax.swing.JPanel jPanelUpdate;
    private javax.swing.JPanel jPanelUpdateCli;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldApCli;
    private javax.swing.JTextField jTextFieldNitCli;
    private javax.swing.JTextField jTextFieldNombreCli;
    // End of variables declaration//GEN-END:variables
}