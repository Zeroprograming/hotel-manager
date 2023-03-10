package com.mycompany.views;

import com.login.DAOUsersIMPL;
import com.mycompany.interfaces.DAOUsers;
import java.awt.Color;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UpUsers extends javax.swing.JPanel {

    boolean isEdition = false;
    com.mycompany.models.Users userEdition;

    public UpUsers() {
        initComponents();
        
    }

    public UpUsers(com.mycompany.models.Users user) {
        initComponents();
        isEdition = true;
        userEdition = user;
        InitStyles();
       
    }
    
    private void InitStyles() {
        if (isEdition) {
            title.setText("Editar Usuario");
            button.setText("Guardar");
            cedulaTxt.setForeground(Color.black);
            daysTxt.setForeground(Color.black);
            domTxt.setForeground(Color.black);

            if (userEdition != null) {
                cedulaTxt.setText(Integer.toString(userEdition.getCedula()));
                daysTxt.setText(Integer.toString(userEdition.getDays()));
                options.setSelectedItem(userEdition.getType());
                Timestamp timestamp = userEdition.getDay_of_arrival();
                String text = timestamp.toString();
                text = text.replaceAll(" 00:00:00.0", "");
                domTxt.setText(text);
            }
        }
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
        title = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        cedulaTxt = new javax.swing.JTextField();
        days = new javax.swing.JLabel();
        daysTxt = new javax.swing.JTextField();
        type = new javax.swing.JLabel();
        options = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        arrival = new javax.swing.JLabel();
        domTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(750, 460));

        title.setText("Registrar nuevo Usuario");

        nameLbl.setText("Cedula");

        cedulaTxt.setForeground(new java.awt.Color(153, 153, 153));
        cedulaTxt.setText("Ingrese su numero de cedula");
        cedulaTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cedulaTxtMousePressed(evt);
            }
        });
        cedulaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaTxtKeyTyped(evt);
            }
        });

        days.setText("Dias de hospedaje");

        daysTxt.setForeground(new java.awt.Color(153, 153, 153));
        daysTxt.setText("Ingrese los dias a hospedarse");
        daysTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                daysTxtMousePressed(evt);
            }
        });
        daysTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                daysTxtKeyTyped(evt);
            }
        });

        type.setText("Tipo de habitacion");

        options.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opcion", "Platinum", "Gold", "Ruby", "Diamond" }));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        arrival.setText("Fecha de llegada (a??o-mes-dia)");

        domTxt.setForeground(new java.awt.Color(153, 153, 153));
        domTxt.setText("Ingrese la fecha de llegada(****/**/**)");
        domTxt.setToolTipText("");
        domTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                domTxtMousePressed(evt);
            }
        });

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Registrar");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(223, 223, 223))
                                    .addComponent(cedulaTxt)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(days, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(182, 182, 182))
                                    .addComponent(daysTxt)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(180, 180, 180)))
                                .addGap(68, 68, 68))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(arrival, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(356, 356, 356))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(domTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(381, 381, 381))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(nameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cedulaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(days, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(daysTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(type, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(options, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(arrival, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(domTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String cedula = cedulaTxt.getText();
        String days = daysTxt.getText();
        String type = options.getSelectedItem().toString();
        String text = domTxt.getText();
        

        // Validaciones para los campos
        if (cedula.isEmpty() || days.isEmpty() || type == "Seleccione una opcion" || text.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            cedulaTxt.requestFocus();
            return;
        }
         
        final String textt = text +  " 00:00:00";         
        final Timestamp ts = Timestamp.valueOf(textt);
        
        
        int cedulaa = Integer.parseInt(cedulaTxt.getText());
        int dayss = Integer.parseInt(daysTxt.getText());
        
        
        System.out.println("llegue");

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
                cedulaTxt.setText("");
                daysTxt.setText("");
                options.setSelectedIndex(0);
                
            }
        } catch (Exception e) {
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurri?? un error al " + errorMsg + " el usuario. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buttonActionPerformed

    private void cedulaTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cedulaTxtMousePressed
         if(cedulaTxt.getText().equals("Ingrese su numero de cedula")){
           cedulaTxt.setText("");
           cedulaTxt.setForeground(Color.black);
       }
       if(daysTxt.getText().isEmpty()){
           daysTxt.setText("Ingrese los dias a hospedarse");
           daysTxt.setForeground(Color.gray);
       }
        if(domTxt.getText().isEmpty()){
           domTxt.setText("Ingrese la fecha de llegada(****/**/**)");
           domTxt.setForeground(Color.gray);
       }
    }//GEN-LAST:event_cedulaTxtMousePressed

    private void daysTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daysTxtMousePressed
         if(daysTxt.getText().equals("Ingrese los dias a hospedarse")){
          daysTxt.setText("");
          daysTxt.setForeground(Color.black); 
       }
       if(cedulaTxt.getText().isEmpty()){
          cedulaTxt.setText("Ingrese su numero de cedula");
          cedulaTxt.setForeground(Color.gray);
       }
       if(domTxt.getText().isEmpty()){
           domTxt.setText("Ingrese la fecha de llegada(****/**/**)");
           domTxt.setForeground(Color.gray);
       }
    }//GEN-LAST:event_daysTxtMousePressed

    private void domTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_domTxtMousePressed
       if(domTxt.getText().equals("Ingrese la fecha de llegada(****/**/**)")){
            domTxt.setText("");
            domTxt.setForeground(Color.black);
        }
        if(cedulaTxt.getText().isEmpty()){
          cedulaTxt.setText("Ingrese su numero de cedula");
          cedulaTxt.setForeground(Color.gray);
       }
        if(daysTxt.getText().isEmpty()){
           daysTxt.setText("Ingrese los dias a hospedarse");
           daysTxt.setForeground(Color.gray);
       }
    }//GEN-LAST:event_domTxtMousePressed

    private void cedulaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaTxtKeyTyped
        if(cedulaTxt.getText().length() >= 10)
        {
        evt.consume();
        }
        
         int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros)
        {
        evt.consume();
        }

        if (cedulaTxt.getText().trim().length() == 10) {
        evt.consume();
        }
    }//GEN-LAST:event_cedulaTxtKeyTyped

    private void daysTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_daysTxtKeyTyped
       if(daysTxt.getText().length() >= 10)
        {
        evt.consume();
        }
        
         int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros)
        {
        evt.consume();
        }

        if (daysTxt.getText().trim().length() == 10) {
        evt.consume();
        }
    }//GEN-LAST:event_daysTxtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrival;
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JTextField cedulaTxt;
    private javax.swing.JLabel days;
    private javax.swing.JTextField daysTxt;
    private javax.swing.JTextField domTxt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JComboBox<String> options;
    private javax.swing.JLabel title;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}