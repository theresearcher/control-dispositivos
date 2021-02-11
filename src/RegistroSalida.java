import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RegistroSalida extends javax.swing.JFrame {
    
Date date = new Date();
Conexion ctm = new Conexion();
Connection reg = ctm.conexion();
String recoger ="";
String fsalida;
int stat;
String ced;
String ser;
String varn = null;
String varn1;  
private  static String cadena = "0123456789abcdefghijklmnopqrstuvwxyz";
    
public RegistroSalida() {
        initComponents();
        this.jTextField1.requestFocus();
        this.setLocationRelativeTo(null);
        jButton3.setEnabled(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/-Icono sena v3.png"))); // NOI18N

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jcMousePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 90));

        jButton2.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/back 60.png"))); // NOI18N
        jButton2.setText("VOLVER");
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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 679, 200, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra Verde35% Azul 65%.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 660, 980, 90));

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("SoftIng");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Vigilante");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Miriam", 0, 11)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra naranjado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 90));

        jLabel6.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Registro de salida");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel13.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel13.setText("Identificacion:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        jLabel14.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel14.setText("Serial dispositivo:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 180, 40));

        jLabel7.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel7.setText("Serial");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 400, -1));

        jLabel9.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel9.setText("Marca:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 380, -1));

        jLabel10.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel10.setText("Modelo:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 430, -1));

        jLabel11.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel11.setText("Fecha de registro:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 340, -1));

        jLabel12.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel12.setText("Tipo dispositivo:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 400, -1));

        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magnifier 50.png"))); // NOI18N
        jButton1.setText("Buscar");
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 150, 50));

        jLabel16.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel16.setText("Nombre:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));

        jLabel17.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel17.setText("Apellido:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        jLabel18.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel18.setText("Ficha:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 380, -1, -1));

        jLabel19.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel19.setText("Tipo persona:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, -1, -1));

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel8.setText("Identificacion Vigilante:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, -1, -1));

        jButton3.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jButton3.setText("SALIDA DE DISPOSITIVO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton3KeyPressed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        jLabel15.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel15.setText("Ingrese el serial del dispositivo");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel20.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel20.setText("Apellido Vigilante:");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, -1, -1));

        jLabel21.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel21.setText("Nombre Vigilante:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 530, -1, -1));

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 530, 150, 30));

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 150, 30));

        idout24.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        getContentPane().add(idout24, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 610, 140, 20));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 160, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 70, 960, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
buscaSerial();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new InicioVigilante().setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
salidaDispo();  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
           buscaSerial();     
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
           salidaDispo();
        }
    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
            new InicioVigilante().setVisible(true);
            this.setVisible(false);
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
            java.util.logging.Logger.getLogger(RegistroSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroSalida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroSalida().setVisible(true);
            }
        });
    }
    
    private void buscaSerial(){
                if(this.jTextField1.getText().length()== 0)
                {
                    JOptionPane.showMessageDialog(null, "Ingrese un dato en el campo de texto para poder \n consultar su dispositivo", "Informacion", JOptionPane.OK_OPTION);
                }
        String serial; 
  
 
        String reco1;
        String reco2;
        String reco3;
        String reco4;
        String reco5;
        String reco6;

        DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        fsalida = hourdateFormat.format(date);
        serial = jTextField1.getText();
        
        try{
                java.sql.Statement estado = reg.createStatement();
                ResultSet resultado = estado.executeQuery("select * from dispositivo where Serial_dispositivo = '"+serial+"'" );
            
                while(resultado.next())
                {
                    recoger = resultado.getString("Serial_dispositivo");
                    reco1 = resultado.getString("Marca_dispositivo");
                    reco2 = resultado.getString("Modelo_dispositivo");
                    reco3 = resultado.getString("Id_tipo_dispositivo");
                    reco4 = resultado.getString("Fecha_registro");
                    reco5 = resultado.getString("Id_vigilante");
                
                        if(serial.equals(recoger))
                        {
                            jLabel7.setText("Serial: "+recoger);
                            jLabel9.setText("Marca: "+reco1);
                            jLabel10.setText("Modelo: "+reco2);
                            jLabel12.setText("Tipo dispositivo: "+reco3);
                            jLabel11.setText("Fecha registro: "+reco4);
                            jButton3.setEnabled(true);
                        }
                }
                
                if(!serial.contentEquals(recoger))
                {
                    JOptionPane.showMessageDialog(null,"El serial que busca no se ha encontrado \n Debe hacer el proceso de registro de nuevo dispositivo","Informacion" ,JOptionPane.OK_OPTION);
                    RegistrarDispoVigilante RegistroEntrada = new RegistrarDispoVigilante();
                    this.setVisible(false);
                    RegistroEntrada.setVisible(true);
                    int longitudCad = cadena.length();

                    String clave = "";
                    String caracter = "";
                
                    for (int i = 0; i < 6; i++)
                    {
                        int numero = (int) (Math.random() * (longitudCad));
                        caracter = cadena.substring(numero, numero + 1);
                        clave = clave + caracter;
                    }
                    RegistrarDispoVigilante.jTextField9.setText(clave);
                    
                }                         
            }
            catch(Exception e)
            {
                System.out.println(e.toString()); //desde aqui empieza la consulta en caso de que no se digite nada en el campo
                JOptionPane.showMessageDialog(null,"Ingrese solo numeros en este campo","Informacion " ,JOptionPane.OK_OPTION);
            }
    }
    
    private void salidaDispo(){
        try{
                if(this.jTextField1.getText().equals(""))
                {
                    JOptionPane.showMessageDialog(null,"Ingrese el serial del dispositivo a sacar","Alerta", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    java.sql.Statement estado = reg.createStatement();
                    ResultSet resultado = estado.executeQuery("select est_band from bandera where Serial_dispositivo = '"+recoger+"'" );
            
                        while(resultado.next())
                        {
                            stat = resultado.getByte("est_band");
                            //JOptionPane.showMessageDialog(null,"El estado de la bandera es: "+stat,"INfo", JOptionPane.OK_OPTION);    
                        }
                        
                            if(stat == 0)
                            {
                                JOptionPane.showMessageDialog(null,"El dispositivo ya ha salido","Informacion", JOptionPane.OK_OPTION);
                            }
                }
            }catch(Exception e)
            {
            }
        
            if(stat == 1)
            {
                try {
                       byte bandera = 0; 
            
                        //Revision de seguridad presalida       
    

                        java.sql.Statement estado00 = reg.createStatement();
                        ResultSet resultado00 = estado00.executeQuery("select Id_persona_ing, serial_dispositivo, Fecha_salida from ingreso_dispositivo where Id_persona_ing = '"+Confirmacionexispsal.greencard+"' and serial_dispositivo = '"+this.jTextField1.getText()+"' and Fecha_salida is "+varn+"");            
    
                        while(resultado00.next())
                        {
                            ced = resultado00.getString("Id_persona_ing");
                            ser = resultado00.getString("serial_dispositivo");
                            varn1= resultado00.getString("Fecha_salida");
                      
                        }                
                      
                            if(ced == null && ser == null)
                            {
                                JOptionPane.showMessageDialog(null, "La cedula no concuerda", "Info",JOptionPane.ERROR_MESSAGE);
                            }        
                            else
                            {
                                PreparedStatement pst = reg.prepareStatement ("INSERT INTO bandera VALUES (?,?);");
                                PreparedStatement pst1 = reg.prepareStatement ("update ingreso_dispositivo set Fecha_salida ='"+fsalida+"' where Id_persona_ing = '"+Confirmacionexispsal.greencard+"' and serial_dispositivo = '"+recoger+"' and Fecha_salida is "+varn+"");
                                pst.setString(1, recoger);
                                pst.setByte(2, bandera);
                                pst.executeUpdate();
                                pst1.executeUpdate();
                                JOptionPane.showMessageDialog(null,"El dispositivo ha salido correctamente","Informacion",JOptionPane.INFORMATION_MESSAGE);
    
                                new InicioVigilante().setVisible(true);
                                this.setVisible(false);
                            }
                 
                 
                    }
                    catch(Exception e)
                        {
                            Logger.getLogger(AgregarVigilanteAdmin.class.getName()).log(Level.SEVERE, null, e);
                            JOptionPane.showMessageDialog(null, "Verifique que todos los campos del formulario esten llenos\n No se ingreso el dato de la persona\n" ,"Atencion",JOptionPane.OK_OPTION);
                        }      

            }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JLabel idout24 = new javax.swing.JLabel();
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public static final javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    public static final javax.swing.JLabel jLabel22 = new javax.swing.JLabel();
    public static final javax.swing.JLabel jLabel23 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables
}

