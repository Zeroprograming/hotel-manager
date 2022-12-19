/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import com.mycompany.db.Conexionlogin;
import com.mycompany.db.Database;
import com.mycompany.models.Loginget;
import com.sun.jndi.ldap.Connection;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Login extends javax.swing.JFrame {

   int xMouse,yMouse;
    public Login() {
        initComponents();
    }
    
    public void ingresar(){
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Nametext = new javax.swing.JLabel();
        Citypng = new javax.swing.JLabel();
        Logomin = new javax.swing.JLabel();
        Logintext = new javax.swing.JLabel();
        UserText = new javax.swing.JLabel();
        TextFieldUser = new javax.swing.JTextField();
        UserSeparator = new javax.swing.JSeparator();
        PassText1 = new javax.swing.JLabel();
        PassSeparator1 = new javax.swing.JSeparator();
        Passfield = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        sendbtn = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        Exitpanel = new javax.swing.JPanel();
        Exit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo.png"))); // NOI18N
        Background.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 300, 160));

        Nametext.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        Nametext.setForeground(new java.awt.Color(255, 255, 255));
        Nametext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nametext.setText("Nombre Empresa");
        Background.add(Nametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 300, 40));

        Citypng.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/city.png"))); // NOI18N
        Citypng.setMaximumSize(new java.awt.Dimension(300, 500));
        Citypng.setMinimumSize(new java.awt.Dimension(300, 500));
        Background.add(Citypng, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, 510));

        Logomin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Logomin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/favicon.png"))); // NOI18N
        Logomin.setText("Logo");
        Background.add(Logomin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 40));

        Logintext.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Logintext.setText("INICIAR SESIÓN");
        Background.add(Logintext, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        UserText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserText.setText("Usuario");
        UserText.setToolTipText("");
        Background.add(UserText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        TextFieldUser.setForeground(new java.awt.Color(153, 153, 153));
        TextFieldUser.setText("Ingrese su nombre de usuario");
        TextFieldUser.setBorder(null);
        TextFieldUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TextFieldUserMousePressed(evt);
            }
        });
        Background.add(TextFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 410, 30));

        UserSeparator.setBackground(new java.awt.Color(0, 0, 0));
        UserSeparator.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(UserSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 263, 480, 10));

        PassText1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PassText1.setText("Contraseña");
        PassText1.setToolTipText("");
        Background.add(PassText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        PassSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        PassSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(PassSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 480, 10));

        Passfield.setForeground(new java.awt.Color(153, 153, 153));
        Passfield.setText("*******");
        Passfield.setBorder(null);
        Passfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PassfieldMousePressed(evt);
            }
        });
        Background.add(Passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 410, 30));

        jPanel1.setBackground(new java.awt.Color(96, 175, 255));
        jPanel1.setLayout(new java.awt.GridLayout());

        sendbtn.setBackground(new java.awt.Color(18, 90, 173));
        sendbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sendbtn.setForeground(new java.awt.Color(255, 255, 255));
        sendbtn.setText("Entrar");
        sendbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtnActionPerformed(evt);
            }
        });
        jPanel1.add(sendbtn);

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 130, 30));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        Exitpanel.setBackground(new java.awt.Color(255, 255, 255));

        Exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X");
        Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ExitpanelLayout = new javax.swing.GroupLayout(Exitpanel);
        Exitpanel.setLayout(ExitpanelLayout);
        ExitpanelLayout.setHorizontalGroup(
            ExitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
            .addGroup(ExitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        );
        ExitpanelLayout.setVerticalGroup(
            ExitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
            .addGroup(ExitpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(Exitpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 854, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addComponent(Exitpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
       xMouse = evt.getX();
       yMouse = evt.getY();
        
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseEntered
        Exitpanel.setBackground(Color.red);
        Exit.setForeground(Color.white);
    }//GEN-LAST:event_ExitMouseEntered

    private void ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseExited
        Exitpanel.setBackground(Color.white);
        Exit.setForeground(Color.black);
    }//GEN-LAST:event_ExitMouseExited

    private void TextFieldUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldUserMousePressed
       if(TextFieldUser.getText().equals("Ingrese su nombre de usuario")){
           TextFieldUser.setText("");
           TextFieldUser.setForeground(Color.black);
       }
       if(String.valueOf(Passfield.getPassword()).isEmpty()){
           Passfield.setText("*******");
           Passfield.setForeground(Color.gray);
       }
       
    }//GEN-LAST:event_TextFieldUserMousePressed

    private void PassfieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassfieldMousePressed
       if(String.valueOf(Passfield.getPassword()).equals("*******")){
          Passfield.setText("");
          Passfield.setForeground(Color.black); 
       }
       if(TextFieldUser.getText().isEmpty()){
          TextFieldUser.setText("Ingrese su nombre de usuario");
          TextFieldUser.setForeground(Color.gray);
       }
    }//GEN-LAST:event_PassfieldMousePressed

    private void sendbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbtnActionPerformed
        // TODO add your handling code here:
        String usuario = TextFieldUser.getText();
        String password = String.valueOf(Passfield.getPassword());
        Conexionlogin co = new Conexionlogin();
        ArrayList<Loginget> re = co.login(usuario, password);
        
        String datos[] = new String[2];
        
        for(Loginget lo:re){
            datos[0] = lo.getUser();
            datos[1] = lo.getPassword();
        } 
        if (re.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Usuario inexistente o mal escrito. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }else{
            Dashboard dash = new Dashboard();
            this.dispose();
            dash.setVisible(true);
        }
    }//GEN-LAST:event_sendbtnActionPerformed

   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Citypng;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Exitpanel;
    private javax.swing.JPanel Header;
    private javax.swing.JLabel Logintext;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logomin;
    private javax.swing.JLabel Nametext;
    private javax.swing.JSeparator PassSeparator1;
    private javax.swing.JLabel PassText1;
    private javax.swing.JPasswordField Passfield;
    private javax.swing.JTextField TextFieldUser;
    private javax.swing.JSeparator UserSeparator;
    private javax.swing.JLabel UserText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton sendbtn;
    // End of variables declaration//GEN-END:variables
}
