/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.nrodas.archivosp1.interfazgrafica;

import com.nrodas.archivosp1.apoyo.Contrasenia;
import com.nrodas.archivosp1.conexion.Conexion;
import com.nrodas.archivosp1.entidades.Empleado;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.ImageIcon;

/**
 *
 * @author lroda
 */
public class Login extends javax.swing.JFrame {

    private final Empleado emp;
    private int moveX;
    private int moveY;

    public Login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Icono-App.png")).getImage());
        emp = new Empleado();
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
        jPanelBarraSuperior = new javax.swing.JPanel();
        jPanelBtnCerrar = new javax.swing.JPanel();
        jLabelBtnCerrar = new javax.swing.JLabel();
        jPanelBtnMinimizar = new javax.swing.JPanel();
        jLabelBtnMinimizar = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jSeparatorUsuario = new javax.swing.JSeparator();
        jLabelPassword = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanelBtnIngresar = new javax.swing.JPanel();
        jLabelBtnIngresar = new javax.swing.JLabel();
        jLabelMsgError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelFondo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBarraSuperior.setBackground(new java.awt.Color(255, 255, 255));
        jPanelBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelBarraSuperiorMouseDragged(evt);
            }
        });
        jPanelBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarraSuperiorMousePressed(evt);
            }
        });
        jPanelBarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanelBarraSuperior.add(jPanelBtnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, -1, -1));

        jPanelBtnMinimizar.setBackground(new java.awt.Color(255, 255, 255));

        jLabelBtnMinimizar.setFont(new java.awt.Font("Lucida Console", 0, 18)); // NOI18N
        jLabelBtnMinimizar.setForeground(new java.awt.Color(0, 0, 0));
        jLabelBtnMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBtnMinimizar.setText("_");
        jLabelBtnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBtnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBtnMinimizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnMinimizarLayout = new javax.swing.GroupLayout(jPanelBtnMinimizar);
        jPanelBtnMinimizar.setLayout(jPanelBtnMinimizarLayout);
        jPanelBtnMinimizarLayout.setHorizontalGroup(
            jPanelBtnMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBtnMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelBtnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBtnMinimizarLayout.setVerticalGroup(
            jPanelBtnMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBtnMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelBtnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelBarraSuperior.add(jPanelBtnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, -1, -1));

        jPanelFondo.add(jPanelBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 30));

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitulo.setText("ELECTRONIC-HOMES");
        jPanelFondo.add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 370, -1));

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUsuario.setText("Usuario");
        jPanelFondo.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 100, -1));

        jTextFieldUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldUsuario.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jTextFieldUsuario.setText("Ingresa tu ID");
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.setFocusable(false);
        jTextFieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldUsuarioMousePressed(evt);
            }
        });
        jTextFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyTyped(evt);
            }
        });
        jPanelFondo.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 350, 30));
        jPanelFondo.add(jSeparatorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 350, 20));

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPassword.setText("Contraseña");
        jPanelFondo.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 140, -1));

        jPasswordFieldPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordFieldPassword.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jPasswordFieldPassword.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordFieldPassword.setText("Ejemplo");
        jPasswordFieldPassword.setBorder(null);
        jPasswordFieldPassword.setFocusable(false);
        jPasswordFieldPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPasswordFieldPasswordMousePressed(evt);
            }
        });
        jPanelFondo.add(jPasswordFieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 350, 30));
        jPanelFondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 350, 10));

        jPanelBtnIngresar.setBackground(new java.awt.Color(94, 96, 98));

        jLabelBtnIngresar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelBtnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBtnIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBtnIngresar.setText("INGRESAR");
        jLabelBtnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelBtnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelBtnIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBtnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBtnIngresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelBtnIngresarLayout = new javax.swing.GroupLayout(jPanelBtnIngresar);
        jPanelBtnIngresar.setLayout(jPanelBtnIngresarLayout);
        jPanelBtnIngresarLayout.setHorizontalGroup(
            jPanelBtnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBtnIngresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelBtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelBtnIngresarLayout.setVerticalGroup(
            jPanelBtnIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBtnIngresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelBtnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanelFondo.add(jPanelBtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 150, 50));

        jLabelMsgError.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabelMsgError.setForeground(java.awt.Color.red);
        jPanelFondo.add(jLabelMsgError, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 350, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*Metodos que le dan el estilo de cambio de color a los botones cuando el maouse entra y sale de ellos*/

    private void jLabelBtnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnMinimizarMouseEntered
        this.jPanelBtnMinimizar.setBackground(new Color(240, 240, 240));
    }//GEN-LAST:event_jLabelBtnMinimizarMouseEntered

    private void jLabelBtnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnMinimizarMouseExited
        this.jPanelBtnMinimizar.setBackground(Color.white);
    }//GEN-LAST:event_jLabelBtnMinimizarMouseExited

    private void jLabelBtnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnCerrarMouseEntered
        this.jPanelBtnCerrar.setBackground(Color.red);
        this.jLabelBtnCerrar.setForeground(Color.white);
    }//GEN-LAST:event_jLabelBtnCerrarMouseEntered

    private void jLabelBtnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnCerrarMouseExited
        this.jPanelBtnCerrar.setBackground(Color.white);
        this.jLabelBtnCerrar.setForeground(Color.black);
    }//GEN-LAST:event_jLabelBtnCerrarMouseExited

    private void jLabelBtnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnIngresarMouseEntered
        this.jPanelBtnIngresar.setBackground(new Color(152, 155, 158));
    }//GEN-LAST:event_jLabelBtnIngresarMouseEntered

    private void jLabelBtnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnIngresarMouseExited
        this.jPanelBtnIngresar.setBackground(new Color(94, 96, 98));
    }//GEN-LAST:event_jLabelBtnIngresarMouseExited

    /*Metodos relacionados con los jTextFields*/

    private void jTextFieldUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioMousePressed
        // TODO add your handling code here:
        if (this.jTextFieldUsuario.getText().equals("Ingresa tu ID")) {
            this.jTextFieldUsuario.setText("");
            this.jTextFieldUsuario.setForeground(Color.black);
            this.jTextFieldUsuario.setFocusable(true);
            this.jTextFieldUsuario.requestFocus();
        }
        if (String.valueOf(this.jPasswordFieldPassword.getPassword()).isEmpty()) {
            this.jPasswordFieldPassword.setText("Ejemplo");
            this.jPasswordFieldPassword.setForeground(new Color(204, 204, 204));
            this.jPasswordFieldPassword.setFocusable(false);
            this.jPasswordFieldPassword.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldUsuarioMousePressed

    private void jPasswordFieldPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldPasswordMousePressed
        if (String.valueOf(this.jPasswordFieldPassword.getPassword()).equals("Ejemplo")) {
            this.jPasswordFieldPassword.setText("");
            this.jPasswordFieldPassword.setForeground(Color.black);
            this.jPasswordFieldPassword.setFocusable(true);
            this.jPasswordFieldPassword.requestFocus();
        }
        if (this.jTextFieldUsuario.getText().isEmpty()) {
            this.jTextFieldUsuario.setText("Ingresa tu ID");
            this.jTextFieldUsuario.setForeground(new Color(204, 204, 204));
            this.jTextFieldUsuario.setFocusable(false);
            this.jTextFieldUsuario.requestFocus();
        }
    }//GEN-LAST:event_jPasswordFieldPasswordMousePressed

    /*Metodos referentes a los llenados de los JTextFields*/

    private void jTextFieldUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyTyped
        if (this.jTextFieldUsuario.getText().length() > 9) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        if (!(evt.getKeyChar() >= 48 && evt.getKeyChar() <= 57)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldUsuarioKeyTyped

    /*Metodos relacionado con los clicks de los botones*/

    private void jLabelBtnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnMinimizarMouseClicked
        this.setExtendedState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabelBtnMinimizarMouseClicked

    private void jLabelBtnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnCerrarMouseClicked
        Conexion.cerrarConexionDB();
        System.exit(0);
    }//GEN-LAST:event_jLabelBtnCerrarMouseClicked

    private void jLabelBtnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBtnIngresarMouseClicked
        if (!this.jTextFieldUsuario.getText().equals("Ingresa tu ID")) {
            String passwrd = Contrasenia.hashearContrasenia(String.valueOf(this.jPasswordFieldPassword.getPassword()));
            boolean correcta = this.emp.comprobarInformacion(Long.valueOf(this.jTextFieldUsuario.getText()), passwrd);
            if (correcta) {
                EmpLogueado.empleadoLogueado = this.emp;
                switch (this.emp.getRol()) {
                    case 1:
                        VentaR vnd = new VentaR();
                        this.setVisible(false);
                        break;
                    case 2:
                        Inventario inv = new Inventario();
                        this.setVisible(false);
                        break;
                    case 3:
                        Bodega bodega = new Bodega();
                        this.setVisible(false);
                        break;
                    case 4:
                        Administracion admin = new Administracion();
                        this.setVisible(false);
                        break;
                }
            } else {
                this.jLabelMsgError.setText("ID o contraseña invalidos");
            }
        }
    }//GEN-LAST:event_jLabelBtnIngresarMouseClicked

    /*Metodos relacionados con el posicion final de la ventana al arrastrar el frame*/

    private void jPanelBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarraSuperiorMousePressed
        this.moveX = evt.getX();
        this.moveY = evt.getY();
    }//GEN-LAST:event_jPanelBarraSuperiorMousePressed

    private void jPanelBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarraSuperiorMouseDragged
        int posicionFinalX = evt.getXOnScreen();
        int posicionFinalY = evt.getYOnScreen();
        this.setLocation(posicionFinalX - this.moveX, posicionFinalY - this.moveY);
    }//GEN-LAST:event_jPanelBarraSuperiorMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBtnCerrar;
    private javax.swing.JLabel jLabelBtnIngresar;
    private javax.swing.JLabel jLabelBtnMinimizar;
    private javax.swing.JLabel jLabelMsgError;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelBarraSuperior;
    private javax.swing.JPanel jPanelBtnCerrar;
    private javax.swing.JPanel jPanelBtnIngresar;
    private javax.swing.JPanel jPanelBtnMinimizar;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparatorUsuario;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
