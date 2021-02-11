

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;




public class ModificarTurnos extends javax.swing.JFrame {

   
    public ModificarTurnos() {
        initComponents();
      
         this.setLocationRelativeTo(null);
         this.getContentPane().setBackground(Color.white);
         this.setResizable(false);
    
    //Configuracion inicial para la ventana
    //La razon por la cual los textfields no son editables es porque en esta ventana solo se permite
    //la modificacion del turno del vigilante que se eliga.
    jTextField15.setEnabled(false);
    jTextField16.setEnabled(false);
    jTextField18.setEnabled(false);
    jTextField17.setEnabled(false);
    jButton7.setEnabled(false);
    jButton12.setEnabled(false);
    jButton13.setEnabled(false);
    jTextField15.setEditable(false);
    jTextField16.setEditable(false);
    jTextField17.setEditable(false);
    jTextField18.setEditable(false);

        
    
    }
    
    //Zona de variables y conexion
      Conexion cc = new Conexion();
    Connection cn = cc.conexion();
    
    String jornada;
     InputStream lol;
        ImageIcon foto;
        File ruta;
          File fichero;
          
        int longitudBytes;
        int i;
        FileInputStream fis;
        String conv;
        Date fechafin = new Date();
        
        //variables para administracion de vigilantes
        String numid;
        String nomvig;
        String apevig;
        String idvigi;
        String vigiusu;
        String vigipass;
        String vigitur;
        int combo;
        String temp;
        Statement sent;
        File ficherofix;
        ImageIcon fotofix;
        File rutafix;
        String jorcand;
        


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jTextField18 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(127, 70));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1370, 430));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel33.setText("Datos del vigilante");

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel36.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel36.setText("Nombre del Vigilante");

        jTextField15.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(89, 181, 72)));

        jTextField16.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(89, 181, 72)));

        jTextField17.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(89, 181, 72)));

        jLabel37.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel37.setText("Usuario del Vigilante");

        jLabel38.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel38.setText("Apellido del Vigilante");

        jLabel39.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel39.setText("Turno del vigilante");

        jComboBox7.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana-Tarde", "Tarde-Mañana" }));
        jComboBox7.setEnabled(false);
        jComboBox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox7ItemStateChanged(evt);
            }
        });

        jTextField18.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(89, 181, 72)));

        jLabel41.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel41.setText("Identificacion del Vigilante");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(0, 107, Short.MAX_VALUE))
                            .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(78, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox7)))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jButton7.setText("<html>Expandir Datos del vigilante <br> seleccionado</html>");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton7KeyPressed(evt);
            }
        });

        jButton12.setText("<html>Actualizar datos <br> del Vigilante</html>");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jButton12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton12KeyPressed(evt);
            }
        });

        jButton13.setText("<html>Limpiar <br> Campos</html>");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jButton13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton13KeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("<html>Haga clic en \"Actualizar Lista Vigilantes\" y posteriomente seleccione <br>\nel vigilante al cual desea modificar el turno</html>");

        jLabel5.setText("Consultar");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Turnos", "Vigilante" }));

        jLabel6.setText("Ingrese la cedula del vigilante:");

        jButton2.setText("Consultar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                        .addComponent(jLabel33)
                        .addGap(493, 493, 493))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jButton2))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(13, 13, 13)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Administrar Turnos", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1370, 560));

        jButton1.setText("VOLVER ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADMINISTRADOR");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra Verde35% Azul 65% 1400P157.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 1370, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra naranjado 1400P132.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
InicioAdmin administrador = new InicioAdmin();
administrador.setVisible(true);
dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        this.jTextField15.setText("");
        this.jComboBox7.setSelectedIndex(0);
        this.jTextField16.setText("");
        this.jTextField17.setText("");
        this.jTextField18.setText("");
      

        this.jTextField15.setEnabled(false);
        this.jComboBox7.setEnabled(false);
        this.jTextField16.setEnabled(false);
        this.jTextField17.setEnabled(false);
        this.jTextField18.setEnabled(false);
        
        
        this.jButton13.setEnabled(false);
        this.jButton12.setEnabled(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
String seleccion = (String) jComboBox7.getSelectedItem();
String id = jTextField17.getText();
String turno;

        try
        {

            java.sql.Statement estad = cn.createStatement();
            ResultSet resultado = estad.executeQuery("select turno.Turno from vigilante inner join turno on vigilante.Id_turno = turno.Id_turno where Id_vigilante = "+id+";");
            while(resultado.next())
            {
                turno = resultado.getString("Turno");

                    if(turno.equals(seleccion))
                        {
                            JOptionPane.showMessageDialog(null,"No se modifico el turno del vigilante \n por tanto no se realiza actualización");
                        }  
                    
                    if(!turno.equals(seleccion))
                        {
                            actualizar();
                        }     
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
expandir();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox7ItemStateChanged
        String turnocombo;

        turnocombo = this.jComboBox7.getSelectedItem().toString();

        switch(turnocombo){

            case "Mañana-Tarde":
            jornada = "1";
            break;

            case "Tarde-Mañana":
            jornada = "2";
            break;

          
        }
    }//GEN-LAST:event_jComboBox7ItemStateChanged

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked
        i = this.jTable5.getSelectedRow();
        idvigi = (String)jTable5.getValueAt(i,0);
        jButton7.setEnabled(true);
    }//GEN-LAST:event_jTable5MouseClicked

    private void jButton12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton12KeyPressed
int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
            String seleccion = (String) jComboBox7.getSelectedItem();
            String id = jTextField17.getText();
            String turno;

            try
            {

                java.sql.Statement estad = cn.createStatement();
                ResultSet resultado = estad.executeQuery("select turno.Turno from vigilante inner join turno on vigilante.Id_turno = turno.Id_turno where Id_vigilante = "+id+";");
                while(resultado.next())
                {
                    turno = resultado.getString("Turno");

                        if(turno.equals(seleccion))
                            {
                                JOptionPane.showMessageDialog(null,"No se modifico el turno del vigilante \n por tanto no se realiza actualización");
                            }  
                    
                        if(!turno.equals(seleccion))
                            {
                                actualizar();
                            }     
                }
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
    }//GEN-LAST:event_jButton12KeyPressed

    private void jButton13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton13KeyPressed
int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
            this.jTextField15.setText("");
            this.jComboBox7.setSelectedIndex(0);
            this.jTextField16.setText("");
            this.jTextField17.setText("");
            this.jTextField18.setText("");


            this.jTextField15.setEnabled(false);
            this.jComboBox7.setEnabled(false);
            this.jTextField16.setEnabled(false);
            this.jTextField17.setEnabled(false);
            this.jTextField18.setEnabled(false);


            this.jButton13.setEnabled(false);
            this.jButton12.setEnabled(false);
        }
    }//GEN-LAST:event_jButton13KeyPressed

    private void jButton7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton7KeyPressed
int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
         expandir();
        }
    }//GEN-LAST:event_jButton7KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
            InicioAdmin administrador = new InicioAdmin();
            administrador.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
consultasTurnos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c=evt.getKeyChar();          
          if(Character.isLetter(c))
          { 
              getToolkit().beep(); //supuestamente con esta linea de codigo, cuando ud escribe algo diferente a una letra, el hardware pita...     
              evt.consume(); 
              JOptionPane.showMessageDialog(null,"Ingresa solo numeros"); 
          }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
   int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
            consultasTurnos();
        }
    }//GEN-LAST:event_jButton2KeyPressed

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
            java.util.logging.Logger.getLogger(ModificarTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarTurnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarTurnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    public javax.swing.JTextField jTextField17;
    public javax.swing.JTextField jTextField18;
    // End of variables declaration//GEN-END:variables
private void limpiar(){
            this.jTextField15.setText("");
            this.jTextField16.setText("");
            this.jTextField18.setText("");
            this.jComboBox7.setName("");
            this.jComboBox7.setSelectedIndex(Integer.parseInt("0"));
            this.jTextField17.setText("");
          
   
}

private void consultaVigilante(){
  String nombread[]= new String[7];
        DefaultTableModel modelad = new DefaultTableModel();

        modelad.addColumn("Id vigilante");
        modelad.addColumn("Nombre Vigilante");
        modelad.addColumn("Apellido Vigilante");
        modelad.addColumn("Turno");

        ModificarTurnos.jTable5.setModel(modelad);
       
        try{

            java.sql.Statement estad = cn.createStatement();
            ResultSet resultado = estad.executeQuery("select vigilante.Id_vigilante, vigilante.Nombre_vigilante, vigilante.Apellido_vigilante, turno.Turno from vigilante \n" +
                "inner join turno on vigilante.Id_turno = turno.Id_turno where Vigilante.Tipo_usuario != 'Administrador';");
            while(resultado.next()){
                nombread[0] = resultado.getString("Id_vigilante");
                nombread[1] = resultado.getString("Nombre_vigilante");
                nombread[2] = resultado.getString("Apellido_vigilante");
                nombread[3] = resultado.getString("Turno");

                modelad.addRow(nombread);
            }
            ModificarTurnos.jTable5.setModel(modelad);
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
}

private void actualizar(){
            String idreal = jTextField17.getText();
            String fecfin;
            
            DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            fecfin = hourdateFormat.format(fechafin);
            System.out.println("fecha"+fecfin);

        try{

            PreparedStatement ps=cn.prepareCall("update vigilante set Id_turno = "+jornada+" where Id_vigilante = "+idreal+";");
            PreparedStatement otros = cn.prepareCall("update registro_turnos set fecha_fin = '"+fecfin+"';");
            
            //en este insert lo que hago es generar el nuevo turno, desde que este ultimo que se cambio 
            PreparedStatement agre2 =cn.prepareStatement("INSERT INTO registro_turnos VALUES (?,?,?,?,?)");
               agre2.setString(1,null);
                agre2.setString(2,jTextField17.getText());
                agre2.setString(3,jornada);
                agre2.setString(4, fecfin);
                agre2.setString(5, null);
            
            int uajaca = otros.executeUpdate();
            int uajaca2 = agre2.executeUpdate();
            int n=ps.executeUpdate();
            if(n>0){
                
                jTextField15.setText("");
                jComboBox7.setSelectedIndex(0);
                jTextField16.setText("");
                jTextField17.setText("");
                jTextField18.setText("");
                
                JOptionPane.showMessageDialog(null, "TURNO del vigilante modificado");
                consultaVigilante();

                jTextField15.setEnabled(false);
                jComboBox7.setEnabled(false);
                jTextField16.setEnabled(false);
                jTextField17.setEnabled(false);
                jTextField18.setEnabled(false);
                
                
                jButton13.setEnabled(false);
                jButton12.setEnabled(false);
                jButton7.setEnabled(false);

            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error"+e);
        }
}

private void expandir()
{
        jTextField15.setEnabled(true);
        jTextField16.setEnabled(true);
        jTextField18.setEnabled(true);
        jTextField17.setEnabled(true);
        jComboBox7.setEnabled(true);
        jButton12.setEnabled(true);
        jButton13.setEnabled(true);

        
        try{

                java.sql.Statement estad = cn.createStatement();
                ResultSet resultado = estad.executeQuery("select vigilante.Id_vigilante, vigilante.Nombre_vigilante, vigilante.Apellido_vigilante, turno.Turno, vigilante.Usuario \n" +
                "from vigilante\n" +
                "inner join turno\n" +
                "on vigilante.Id_turno = turno.Id_turno\n" +
                "where id_vigilante = "+idvigi+";");
                
                while(resultado.next())
                {
                    numid = resultado.getString("Id_vigilante");
                    nomvig = resultado.getString("Nombre_vigilante");
                    apevig = resultado.getString("Apellido_vigilante");
                    vigitur = resultado.getString("Turno");
                    vigiusu = resultado.getString("Usuario"); 
                }
           
                if(vigitur.equals("Mañana-Tarde"))
                {
                    combo = 0;
                }
                
                if(vigitur.equals("Tarde-Mañana"))
                {
                    combo = 1;
                }

                //Seteo de los demas resultados en sus respectivos campos dentro de la forma
                jTextField15.setText(nomvig);
                jTextField16.setText(apevig);
                jTextField17.setText(numid);
                jComboBox7.setSelectedIndex(combo);
                jTextField18.setText(vigiusu);
                

            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
}

private void consultasTurnos()
{
    String seleccion;

seleccion = jComboBox1.getSelectedItem().toString();

switch(seleccion)
{   
    //Caso para consulta del vigilante
    case "Turnos":
        
        String greencard = jTextField1.getText();
        String turnogen[]= new String[7];
        DefaultTableModel modela = new DefaultTableModel();

        modela.addColumn("Id vigilante");
        modela.addColumn("Nombre Vigilante");
        modela.addColumn("Apellido Vigilante");
        modela.addColumn("Turno");

        ModificarTurnos.jTable5.setModel(modela);
       
        try{

                java.sql.Statement estad = cn.createStatement();
                ResultSet resultado = estad.executeQuery("select vigilante.Id_vigilante, vigilante.Nombre_vigilante, vigilante.Apellido_vigilante, turno.Turno from vigilante inner join turno on vigilante.Id_turno = turno.Id_turno where Vigilante.ID_vigilante ="+greencard+";");
                while(resultado.next())
                    {
                        turnogen[0] = resultado.getString("Id_vigilante");
                        turnogen[1] = resultado.getString("Nombre_vigilante");
                        turnogen[2] = resultado.getString("Apellido_vigilante");
                        turnogen[3] = resultado.getString("Turno");

                        modela.addRow(turnogen);
                    }
                ModificarTurnos.jTable5.setModel(modela);
            }catch(Exception e)
            {
            System.out.println(e.toString());
            //JOptionPane.showMessageDialog(null, "Ocurrio un error realizando la consulta del turno actual del vigilante \n"+e);
            }
        
        //consulta en caso de que no se digite nada en el campo de texto
        if(jTextField1.getText().equals("")){
            
        try{
            String datoadmin ="Administrador";

            java.sql.Statement estad = cn.createStatement();
            ResultSet resultado = estad.executeQuery("select vigilante.Id_vigilante, vigilante.Nombre_vigilante, vigilante.Apellido_vigilante, turno.Turno from vigilante inner join turno on vigilante.Id_turno = turno.Id_turno where Vigilante.Tipo_usuario != '"+datoadmin+"'");
            while(resultado.next()){
                turnogen[0] = resultado.getString("Id_vigilante");
                turnogen[1] = resultado.getString("Nombre_vigilante");
                turnogen[2] = resultado.getString("Apellido_vigilante");
                turnogen[3] = resultado.getString("Turno");

                modela.addRow(turnogen);
            }
            ModificarTurnos.jTable5.setModel(modela);
        }catch(Exception e){
            System.out.println(e.toString());
        }
        }

             
        
        break;
        
        
    //Caso para consulta del vigilante    
    case "Vigilante":
        String cd = jTextField1.getText();
        String nombread[]= new String[7];
        DefaultTableModel modelad = new DefaultTableModel();

        modelad.addColumn("Id vigilante");
        modelad.addColumn("Nombre Vigilante");
        modelad.addColumn("Apellido Vigilante");
        modelad.addColumn("Fecha inicio");
        modelad.addColumn("Fecha fin");

        ModificarTurnos.jTable5.setModel(modelad);
       
        try{

                java.sql.Statement estad = cn.createStatement();
                ResultSet resultado = estad.executeQuery("select distinct vigilante.Id_vigilante, vigilante.Nombre_vigilante, vigilante.Apellido_vigilante, registro_turnos.fecha_inicio, registro_turnos.fecha_fin \n" +
                "from vigilante\n" +
                "inner join registro_turnos\n" +
                "on vigilante.Id_vigilante = registro_turnos.Id_vigilante\n" +
                "where vigilante.Id_vigilante = "+cd+" and Tipo_usuario != 'Administrador';");
                while(resultado.next())
                    {
                        nombread[0] = resultado.getString("Id_vigilante");
                        nombread[1] = resultado.getString("Nombre_vigilante");
                        nombread[2] = resultado.getString("Apellido_vigilante");
                        nombread[3] = resultado.getString("fecha_inicio");
                        nombread[4] = resultado.getString("fecha_fin");

                        modelad.addRow(nombread);
                    }
                ModificarTurnos.jTable5.setModel(modelad);
            }catch(Exception e)
            {
            //System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero de identificacion para realizar la consulta");
            }
        
        //consulta en caso de que no se digite una cedula en el campo de texto
//        if(jTextField1.getText().equals("")){
//                 JOptionPane.showMessageDialog(null, "Por favor ingrese un numero de identificacion para realizar la consulta");
//        }
        
        break;
}
}

}




