/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaControlador;

import javax.swing.JOptionPane;
import Modelo.BBDD;
import Modelo.Metodos;
import java.awt.Color;

/**
 *
 * @author USER
 */
public class Login extends javax.swing.JFrame {

    private String username;
    Principal segundoFrame;
    UsuarioNuevo tercerFrame;

    public Login() {
        initComponents();
        BarraSupLabel.setText(this.getClass().getSimpleName()); 
        Metodos.habilitarArrastre(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLateralLogin = new javax.swing.JPanel();
        BarraSupLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        checkMostrarPasswd = new javax.swing.JCheckBox();
        entradaUsuario = new javax.swing.JTextField();
        botonLOGIN = new javax.swing.JButton();
        entradaPasswd = new javax.swing.JPasswordField();
        labelNuevoUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        setForeground(java.awt.Color.black);
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        panelLateralLogin.setBackground(new java.awt.Color(7, 87, 91));
        panelLateralLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 59, 70), 2));
        panelLateralLogin.setForeground(new java.awt.Color(196, 223, 230));
        panelLateralLogin.setLayout(null);

        BarraSupLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BarraSupLabel.setForeground(new java.awt.Color(255, 255, 255));
        BarraSupLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BarraSupLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelLateralLogin.add(BarraSupLabel);
        BarraSupLabel.setBounds(140, 10, 131, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\GitHub\\pr-ctica-3-1-usabilidad-b-sica-gu-a-estilo-e-instalaci-n-IRamirezSanchez\\Practica 3.1\\media\\icons8-cerrar-ventana-52.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        panelLateralLogin.add(jLabel4);
        jLabel4.setBounds(370, 20, 25, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Documents\\GitHub\\pr-ctica-3-1-usabilidad-b-sica-gu-a-estilo-e-instalaci-n-IRamirezSanchez\\Practica 3.1\\media\\icons8-minimizar-50-removebg-preview.png")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        panelLateralLogin.add(jLabel5);
        jLabel5.setBounds(340, 20, 30, 30);

        panelLogin.setBackground(new java.awt.Color(102, 165, 173));
        panelLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 59, 70), 2));
        panelLogin.setToolTipText("");
        panelLogin.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Por favor, introduzca sus credenciales para acceder");
        panelLogin.add(jLabel1);
        jLabel1.setBounds(30, 20, 360, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Usuario");
        panelLogin.add(jLabel2);
        jLabel2.setBounds(50, 70, 48, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Password");
        panelLogin.add(jLabel3);
        jLabel3.setBounds(40, 100, 58, 30);

        checkMostrarPasswd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkMostrarPasswd.setText("Mostrar");
        checkMostrarPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMostrarPasswdActionPerformed(evt);
            }
        });
        panelLogin.add(checkMostrarPasswd);
        checkMostrarPasswd.setBounds(300, 110, 80, 20);

        entradaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaUsuarioActionPerformed(evt);
            }
        });
        panelLogin.add(entradaUsuario);
        entradaUsuario.setBounds(110, 70, 172, 22);

        botonLOGIN.setBackground(new java.awt.Color(7, 87, 91));
        botonLOGIN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botonLOGIN.setForeground(new java.awt.Color(255, 255, 255));
        botonLOGIN.setText("LOGUEAR");
        botonLOGIN.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonLOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLOGINActionPerformed(evt);
            }
        });
        panelLogin.add(botonLOGIN);
        botonLOGIN.setBounds(110, 170, 172, 30);

        entradaPasswd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaPasswdActionPerformed(evt);
            }
        });
        panelLogin.add(entradaPasswd);
        entradaPasswd.setBounds(110, 110, 172, 22);

        labelNuevoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelNuevoUsuario.setText("Haz click aqui para crear una cuenta nueva");
        labelNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelNuevoUsuarioMouseClicked(evt);
            }
        });
        panelLogin.add(labelNuevoUsuario);
        labelNuevoUsuario.setBounds(80, 220, 240, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelLateralLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelLateralLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonLOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLOGINActionPerformed
//        Gestor_Usuarios Gestor = new Gestor_Usuarios();
//        if (Gestor_Usuarios.comprobarUsuarioContrasenia(entradaUsuario.getText(), new String(entradaPasswd.getPassword()))) {
//            abrirSegundoFrame();
//
//        } else {
//            Metodos.vibrar(this);
//            JOptionPane.showMessageDialog(this, "Logueo Incorrecto, vuelve a introducir");
//
//        }
        if (BBDD.consultarUsuario(entradaUsuario.getText(), new String(entradaPasswd.getPassword()))) {
            abrirSegundoFrame();
        } else {
            Metodos.vibrar(this);
            JOptionPane.showMessageDialog(this, "Logueo Incorrecto, vuelve a introducir");
        }
        actualizar();
    }//GEN-LAST:event_botonLOGINActionPerformed

    private void entradaPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaPasswdActionPerformed
        botonLOGINActionPerformed(evt);//action coge todo lo que hagas dentro de ese icono
    }//GEN-LAST:event_entradaPasswdActionPerformed

    private void entradaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaUsuarioActionPerformed
        botonLOGINActionPerformed(evt);
    }//GEN-LAST:event_entradaUsuarioActionPerformed

    private void checkMostrarPasswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMostrarPasswdActionPerformed
        if (checkMostrarPasswd.isSelected()) {
            entradaPasswd.setEchoChar((char) 0); // Mostrar la contraseña
        } else {
            entradaPasswd.setEchoChar('*'); // Ocultar la contraseña
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_checkMostrarPasswdActionPerformed

    private void labelNuevoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelNuevoUsuarioMouseClicked
       tercerFrame = new UsuarioNuevo();
       tercerFrame.setVisible(true);
       tercerFrame.pack();
       tercerFrame.setLocationRelativeTo(this);
    }//GEN-LAST:event_labelNuevoUsuarioMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
      this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel5MouseClicked

    public void actualizar() {
        entradaPasswd.setText("");
        entradaUsuario.setText("");
        checkMostrarPasswd.setSelected(false);
    }

    private void abrirSegundoFrame() {
        segundoFrame = new Principal(entradaUsuario.getText());
        segundoFrame.setVisible(true);
        segundoFrame.pack();
        segundoFrame.setLocationRelativeTo(this);
        segundoFrame.cambiarColorPrincipal( panelLateralLogin.getBackground(),panelLogin.getBackground());
        this.dispose();
    }
    
    public void cambiarColorLogin(Color oscuro, Color claro){
        panelLateralLogin.setBackground(claro);
        panelLogin.setBackground(oscuro);
        botonLOGIN.setBackground(oscuro);      
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BarraSupLabel;
    private javax.swing.JButton botonLOGIN;
    private javax.swing.JCheckBox checkMostrarPasswd;
    private javax.swing.JPasswordField entradaPasswd;
    private javax.swing.JTextField entradaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelNuevoUsuario;
    private javax.swing.JPanel panelLateralLogin;
    private javax.swing.JPanel panelLogin;
    // End of variables declaration//GEN-END:variables

}
