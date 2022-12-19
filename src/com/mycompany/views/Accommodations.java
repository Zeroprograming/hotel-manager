/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.views;

import com.login.DAOUsersIMPL;
import com.mycompany.interfaces.DAOUsers;
import java.awt.Color;
import java.sql.Timestamp;
import java.time.LocalDate;

/**
 *
 * @author zerot
 */
public class Accommodations extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    
    boolean isEdition = false;
    com.mycompany.models.Users userEdition;
    public Accommodations() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        user = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();
        hostel = new javax.swing.JLabel();
        hosteltxt = new javax.swing.JTextField();
        selection = new javax.swing.JLabel();
        options = new javax.swing.JComboBox<>();
        send = new javax.swing.JPanel();
        sendbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(750, 460));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setBackground(new java.awt.Color(255, 255, 255));
        image.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/abcdd.png"))); // NOI18N
        bg.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 450, 460));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 10, 400));

        user.setText("Numero de cedula");
        bg.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, -1, -1));

        usertxt.setForeground(new java.awt.Color(153, 153, 153));
        usertxt.setText("Ingrese su numero de cedula");
        usertxt.setToolTipText("");
        usertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usertxtMousePressed(evt);
            }
        });
        usertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usertxtKeyTyped(evt);
            }
        });
        bg.add(usertxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 280, 40));

        hostel.setText("Dias de hospedaje");
        bg.add(hostel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, 20));

        hosteltxt.setForeground(new java.awt.Color(153, 153, 153));
        hosteltxt.setText("Ingrese los dias a hospedarse");
        hosteltxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hosteltxtMousePressed(evt);
            }
        });
        hosteltxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hosteltxtKeyTyped(evt);
            }
        });
        bg.add(hosteltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 280, 40));

        selection.setText("Tipo de habitacion");
        bg.add(selection, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, 20));

        options.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Platinum", "Gold", "Ruby", "Diamond" }));
        bg.add(options, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 280, -1));

        send.setBackground(new java.awt.Color(21, 101, 192));
        send.setLayout(new java.awt.BorderLayout());

        sendbtn.setBackground(new java.awt.Color(21, 101, 192));
        sendbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sendbtn.setForeground(new java.awt.Color(255, 255, 255));
        sendbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/account-multiple.png"))); // NOI18N
        sendbtn.setText("Enviar");
        sendbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        sendbtn.setBorderPainted(false);
        sendbtn.setContentAreaFilled(false);
        sendbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sendbtn.setFocusPainted(false);
        sendbtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        sendbtn.setIconTextGap(10);
        sendbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sendbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sendbtnMouseExited(evt);
            }
        });
        sendbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendbtnActionPerformed(evt);
            }
        });
        send.add(sendbtn, java.awt.BorderLayout.CENTER);

        bg.add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, 140, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Nuevo usuario");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendbtnMouseEntered
        sendbtn.setBackground(new Color(0,102 ,255 ));
        send.setBackground(new Color(0,102 ,255 )); 
    }//GEN-LAST:event_sendbtnMouseEntered

    private void sendbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendbtnMouseExited
        sendbtn.setBackground(new Color(21,101 ,192 ));
        send.setBackground(new Color(21,101 ,192 ));
    }//GEN-LAST:event_sendbtnMouseExited

    private void usertxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertxtMousePressed
        if(usertxt.getText().equals("Ingrese su numero de cedula")){
           usertxt.setText("");
           usertxt.setForeground(Color.black);
       }
       if(hosteltxt.getText().isEmpty()){
           hosteltxt.setText("Ingrese los dias a hospedarse");
           hosteltxt.setForeground(Color.gray);
       }
    }//GEN-LAST:event_usertxtMousePressed

    private void hosteltxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hosteltxtMousePressed
        if(hosteltxt.getText().equals("Ingrese los dias a hospedarse")){
          hosteltxt.setText("");
          hosteltxt.setForeground(Color.black); 
       }
       if(usertxt.getText().isEmpty()){
          usertxt.setText("Ingrese su numero de cedula");
          usertxt.setForeground(Color.gray);
       }
    }//GEN-LAST:event_hosteltxtMousePressed

    private void sendbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendbtnActionPerformed
         String cedula = usertxt.getText();
        String days = hosteltxt.getText();
        String type = options.getSelectedItem().toString();
        
        

        // Validaciones para los campos
        if (cedula.isEmpty() || days.isEmpty() || "Seleccione una opcion".equals(type) || "Ingrese su numero de cedula".equals(cedula) || "Ingrese los dias a hospedarse".equals(days)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            usertxt.requestFocus();
            return;
        }
         
        LocalDate ahora = LocalDate.now();
        String text = ahora.toString();
        final String textt = text +  " 00:00:00";         
        final Timestamp ts = Timestamp.valueOf(textt);
               
        
        
        int cedulaa = Integer.parseInt(usertxt.getText());
        int dayss = Integer.parseInt(hosteltxt.getText());
        
        

        com.mycompany.models.Users user = isEdition ? userEdition : new com.mycompany.models.Users();
        user.setCedula(cedulaa);
        user.setDays(dayss);
        user.setType(type);
        user.setDay_of_arrival(ts);
        
        

        try {
            DAOUsers dao = new DAOUsersIMPL();

            if (!isEdition) {
                dao.registrar(user);
            } else {
                dao.modificar(user);
            }

            String successMsg = isEdition ? "modificado" : "registrado";

            javax.swing.JOptionPane.showMessageDialog(this, "Usuario " + successMsg + " exitosamente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            if (!isEdition) {
                usertxt.setText("");
                hosteltxt.setText("");
                options.setSelectedIndex(0);
                
            }
        } catch (Exception e) {
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el usuario. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_sendbtnActionPerformed

    private void usertxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertxtKeyTyped
        if(usertxt.getText().length() >= 10)
        {
        evt.consume();
        }
        
         int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros)
        {
        evt.consume();
        }

        if (usertxt.getText().trim().length() == 10) {
        evt.consume();
        }
    }//GEN-LAST:event_usertxtKeyTyped

    private void hosteltxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hosteltxtKeyTyped
        if(hosteltxt.getText().length() >= 10)
        {
        evt.consume();
        }
        
         int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros)
        {
        evt.consume();
        }

        if (hosteltxt.getText().trim().length() == 10) {
        evt.consume();
        }
    }//GEN-LAST:event_hosteltxtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel hostel;
    private javax.swing.JTextField hosteltxt;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> options;
    private javax.swing.JLabel selection;
    private javax.swing.JPanel send;
    private javax.swing.JButton sendbtn;
    private javax.swing.JLabel user;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}