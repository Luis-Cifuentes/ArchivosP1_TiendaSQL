/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nrodas.archivosp1.interfazgrafica;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author lroda
 */
public class Administracion extends javax.swing.JFrame {

    int moveX;
    int moveY;
    
    
    public Administracion() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Icono-App.png")).getImage());
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jPanelBarraLateral = new javax.swing.JPanel();
        jLabelT1 = new javax.swing.JLabel();
        jLabelT2 = new javax.swing.JLabel();
        jPanelCerrarSecion = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanelInicio = new javax.swing.JPanel();
        jLabelHome = new javax.swing.JLabel();
        jLabelBtnHome = new javax.swing.JLabel();
        jPanelReportes = new javax.swing.JPanel();
        jLabelReportes = new javax.swing.JLabel();
        jLabelBtnReportes = new javax.swing.JLabel();
        jPanelIngresarUsuarios = new javax.swing.JPanel();
        jLabelEmpleado = new javax.swing.JLabel();
        jLabelBtnEmpleado = new javax.swing.JLabel();
        jPanelBarraSup = new javax.swing.JPanel();
        jPanelBtnCerrar = new javax.swing.JPanel();
        jLabelBtnCerrar = new javax.swing.JLabel();
        jPanelBtnMin = new javax.swing.JPanel();
        jLabelBtnMin = new javax.swing.JLabel();
        jPanelCambiante = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBarraLateral.setBackground(new java.awt.Color(115, 43, 245));
        jPanelBarraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelT1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelT1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelT1.setText("ELECTRONIC");
        jPanelBarraLateral.add(jLabelT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 280, -1));

        jLabelT2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabelT2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelT2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelT2.setText("HOMES");
        jPanelBarraLateral.add(jLabelT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 280, -1));

        jPanelCerrarSecion.setBackground(new java.awt.Color(115, 43, 245));
        jPanelCerrarSecion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close-Icon.png"))); // NOI18N
        jPanelCerrarSecion.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 60));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("     Cerrar Secion");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanelCerrarSecion.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        jPanelBarraLateral.add(jPanelCerrarSecion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 300, 60));

        jPanelInicio.setBackground(new java.awt.Color(115, 43, 245));
        jPanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home-Icon.png"))); // NOI18N
        jPanelInicio.add(jLabelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 60));

        jLabelBtnHome.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        jLabelBtnHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBtnHome.setText("     Inicio");
        jLabelBtnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBtnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBtnHomeMouseExited(evt);
            }
        });
        jPanelInicio.add(jLabelBtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        jPanelBarraLateral.add(jPanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 300, 60));

        jPanelReportes.setBackground(new java.awt.Color(115, 43, 245));
        jPanelReportes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelReportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reportes.png"))); // NOI18N
        jPanelReportes.add(jLabelReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 60));

        jLabelBtnReportes.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        jLabelBtnReportes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBtnReportes.setText("     Reportes");
        jLabelBtnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBtnReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBtnReportesMouseExited(evt);
            }
        });
        jPanelReportes.add(jLabelBtnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        jPanelBarraLateral.add(jPanelReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 300, 60));

        jPanelIngresarUsuarios.setBackground(new java.awt.Color(115, 43, 245));
        jPanelIngresarUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Empleado.png"))); // NOI18N
        jPanelIngresarUsuarios.add(jLabelEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 60));

        jLabelBtnEmpleado.setFont(new java.awt.Font("SansSerif", 1, 28)); // NOI18N
        jLabelBtnEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBtnEmpleado.setText("     Aggr. Empleado");
        jLabelBtnEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnEmpleadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBtnEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBtnEmpleadoMouseExited(evt);
            }
        });
        jPanelIngresarUsuarios.add(jLabelBtnEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 60));

        jPanelBarraLateral.add(jPanelIngresarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 300, 60));

        jPanelFondo.add(jPanelBarraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 700));

        jPanelBarraSup.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarraSup.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelBarraSupMouseDragged(evt);
            }
        });
        jPanelBarraSup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarraSupMousePressed(evt);
            }
        });
        jPanelBarraSup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBtnCerrar.setBackground(new java.awt.Color(255, 255, 255));

        jLabelBtnCerrar.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabelBtnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBtnCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBtnCerrar.setText("x");
        jLabelBtnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBtnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBtnCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnCerrarLayout = new javax.swing.GroupLayout(jPanelBtnCerrar);
        jPanelBtnCerrar.setLayout(jPanelBtnCerrarLayout);
        jPanelBtnCerrarLayout.setHorizontalGroup(
            jPanelBtnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBtnCerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelBtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBtnCerrarLayout.setVerticalGroup(
            jPanelBtnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBtnCerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelBtnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelBarraSup.add(jPanelBtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, -1, -1));

        jPanelBtnMin.setBackground(new java.awt.Color(255, 255, 255));

        jLabelBtnMin.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabelBtnMin.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBtnMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBtnMin.setText("_");
        jLabelBtnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBtnMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBtnMinMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnMinLayout = new javax.swing.GroupLayout(jPanelBtnMin);
        jPanelBtnMin.setLayout(jPanelBtnMinLayout);
        jPanelBtnMinLayout.setHorizontalGroup(
            jPanelBtnMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBtnMinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelBtnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBtnMinLayout.setVerticalGroup(
            jPanelBtnMinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBtnMinLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelBtnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelBarraSup.add(jPanelBtnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, -1, -1));

        jPanelFondo.add(jPanelBarraSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 30));

        jPanelCambiante.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCambiante.setLayout(new java.awt.CardLayout());
        jPanelFondo.add(jPanelCambiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 980, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
        Metodos relacionados con la barra superior
    */
    
    private void jPanelBarraSupMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarraSupMousePressed
        this.moveX = evt.getX();
        this.moveY = evt.getY();
    }//GEN-LAST:event_jPanelBarraSupMousePressed

    private void jPanelBarraSupMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarraSupMouseDragged
        int pFx = evt.getXOnScreen();
        int pFy = evt.getYOnScreen();
        this.setLocation(pFx - this.moveX, pFy - this.moveY);
    }//GEN-LAST:event_jPanelBarraSupMouseDragged

    /*
        Metodos con los desvanecimientos de los botones
    */
    
    private void jLabelBtnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnMinMouseEntered
        this.jPanelBtnMin.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_jLabelBtnMinMouseEntered

    private void jLabelBtnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnMinMouseExited
        this.jPanelBtnMin.setBackground(Color.white);
    }//GEN-LAST:event_jLabelBtnMinMouseExited

    private void jLabelBtnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnCerrarMouseEntered
        this.jPanelBtnCerrar.setBackground(Color.red);
        this.jLabelBtnCerrar.setForeground(Color.white);
    }//GEN-LAST:event_jLabelBtnCerrarMouseEntered

    private void jLabelBtnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnCerrarMouseExited
        this.jPanelBtnCerrar.setBackground(Color.white);
        this.jLabelBtnCerrar.setForeground(Color.black);
    }//GEN-LAST:event_jLabelBtnCerrarMouseExited

    /*
        Metodos relacionados con los botones de la barra lateral
    */
    
    private void jLabelBtnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnHomeMouseEntered
        this.jPanelInicio.setBackground(new Color(129, 98, 255));
    }//GEN-LAST:event_jLabelBtnHomeMouseEntered

    private void jLabelBtnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnHomeMouseExited
        if (this.jLabelBtnHome.isEnabled()) {
            this.jPanelInicio.setBackground(new Color(115, 43, 255));
        }
    }//GEN-LAST:event_jLabelBtnHomeMouseExited

    private void jLabelBtnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnReportesMouseEntered
        this.jPanelReportes.setBackground(new Color(129, 98, 255));
    }//GEN-LAST:event_jLabelBtnReportesMouseEntered

    private void jLabelBtnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnReportesMouseExited
        if (this.jLabelBtnReportes.isEnabled()) {
            this.jPanelReportes.setBackground(new Color(115, 43, 255));
        }
    }//GEN-LAST:event_jLabelBtnReportesMouseExited

    private void jLabelBtnEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnEmpleadoMouseEntered
        this.jPanelIngresarUsuarios.setBackground(new Color(129, 98, 225));
    }//GEN-LAST:event_jLabelBtnEmpleadoMouseEntered

    private void jLabelBtnEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnEmpleadoMouseExited
        if (this.jLabelBtnEmpleado.isEnabled()) {
            this.jPanelIngresarUsuarios.setBackground(new Color(115, 43, 255));
        }
    }//GEN-LAST:event_jLabelBtnEmpleadoMouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        this.jPanelCerrarSecion.setBackground(new Color(129, 98, 255));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        this.jPanelCerrarSecion.setBackground(new Color(115, 43, 255));
    }//GEN-LAST:event_jLabel3MouseExited

    /*
     * Eventos click con los botnes de Minimizar y Cerrar
    */
    
    private void jLabelBtnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnMinMouseClicked
        this.setExtendedState(Administracion.ICONIFIED);
    }//GEN-LAST:event_jLabelBtnMinMouseClicked

    private void jLabelBtnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelBtnCerrarMouseClicked

    /*
    * Metodos Relacionados con los click de la barra lateral
    */
    
    private void jLabelBtnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnHomeMouseClicked
        if (!this.jLabelBtnReportes.isEnabled()) {
            this.jPanelReportes.setBackground(new Color(115, 43, 255));
            this.jLabelBtnReportes.setEnabled(true);
            this.jLabelReportes.setEnabled(true);
        } else if (!this.jLabelBtnEmpleado.isEnabled()) {
            this.jPanelIngresarUsuarios.setBackground(new Color(115, 43, 255));
            this.jLabelBtnEmpleado.setEnabled(true);
            this.jLabelEmpleado.setEnabled(true);
        }
        this.jLabelBtnHome.setEnabled(false);
        this.jLabelHome.setEnabled(false);
        Inicio_Pnl pnl = new Inicio_Pnl();
        this.jPanelCambiante.removeAll();
        this.jPanelCambiante.add(pnl);
        this.jPanelCambiante.repaint();
        this.jPanelCambiante.revalidate();
    }//GEN-LAST:event_jLabelBtnHomeMouseClicked

    private void jLabelBtnReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnReportesMouseClicked
        if (!this.jLabelBtnHome.isEnabled()) {
            this.jPanelInicio.setBackground(new Color(115, 43, 255));
            this.jLabelBtnHome.setEnabled(true);
            this.jLabelHome.setEnabled(true);
        } else if (!this.jLabelBtnEmpleado.isEnabled()) {
            this.jPanelIngresarUsuarios.setBackground(new Color(115, 43, 255));
            this.jLabelBtnEmpleado.setEnabled(true);
            this.jLabelEmpleado.setEnabled(true);
        }
        this.jLabelBtnReportes.setEnabled(false);
        this.jLabelReportes.setEnabled(false);
        Admin_Pnl1 pnl = new Admin_Pnl1();
        this.jPanelCambiante.removeAll();
        this.jPanelCambiante.add(pnl);
        this.jPanelCambiante.repaint();
        this.jPanelCambiante.revalidate();
    }//GEN-LAST:event_jLabelBtnReportesMouseClicked

    private void jLabelBtnEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnEmpleadoMouseClicked
        if (!this.jLabelBtnHome.isEnabled()) {
            this.jPanelInicio.setBackground(new Color(115, 43, 255));
            this.jLabelBtnHome.setEnabled(true);
            this.jLabelHome.setEnabled(true);
        } else if (!this.jLabelBtnReportes.isEnabled()) {
            this.jPanelReportes.setBackground(new Color(115, 43, 255));
            this.jLabelBtnReportes.setEnabled(true);
            this.jLabelReportes.setEnabled(true);
        }
        this.jLabelBtnEmpleado.setEnabled(false);
        this.jLabelEmpleado.setEnabled(false);
        Admin_Pnl2 pnl = new Admin_Pnl2();
        this.jPanelCambiante.removeAll();
        this.jPanelCambiante.add(pnl);
        this.jPanelCambiante.repaint();
        this.jPanelCambiante.revalidate();
    }//GEN-LAST:event_jLabelBtnEmpleadoMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Login login = new Login();
        EmpLogueado.reiniciarValores();
        this.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseClicked

    public void repintarEmpleado() {
        Admin_Pnl2 pnl = new Admin_Pnl2();
        this.jPanelCambiante.removeAll();
        this.jPanelCambiante.add(pnl);
        this.jPanelCambiante.repaint();
        this.jPanelCambiante.revalidate();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBtnCerrar;
    private javax.swing.JLabel jLabelBtnEmpleado;
    private javax.swing.JLabel jLabelBtnHome;
    private javax.swing.JLabel jLabelBtnMin;
    private javax.swing.JLabel jLabelBtnReportes;
    private javax.swing.JLabel jLabelEmpleado;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelReportes;
    private javax.swing.JLabel jLabelT1;
    private javax.swing.JLabel jLabelT2;
    private javax.swing.JPanel jPanelBarraLateral;
    private javax.swing.JPanel jPanelBarraSup;
    private javax.swing.JPanel jPanelBtnCerrar;
    private javax.swing.JPanel jPanelBtnMin;
    private javax.swing.JPanel jPanelCambiante;
    private javax.swing.JPanel jPanelCerrarSecion;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPanel jPanelIngresarUsuarios;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPanel jPanelReportes;
    // End of variables declaration//GEN-END:variables
}