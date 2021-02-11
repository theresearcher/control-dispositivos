

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Axess
 */
public class Confirmacionexisp extends javax.swing.JFrame {

    
    public Confirmacionexisp() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

     Conexion cc = new Conexion();
    Connection con = cc.conexion();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jLabel1.setText("Ingrese la cedula de la persona");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 190, 30));

        jButton1.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jButton1.setText("Ingresar");
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jButton2.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jButton2.setText("Volver");
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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel2.setText("entrando");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra naranjado.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 520, 190));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra Verde35% Azul 65%.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 200, 550, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String cedula = jTextField1.getText();
        if(cedula.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor ingrese un numero de identificacion");
        }
        else{
            verificar();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new InicioVigilante().setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
            new InicioVigilante().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
            String cedula = jTextField1.getText();
                if(cedula.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un numero de identificacion");
                }
                else
                    {
                     verificar();
                    }   
        }
    }//GEN-LAST:event_jButton1KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
char c=evt.getKeyChar();       
          if(Character.isLetter(c)) 
          { 
              getToolkit().beep(); //supuestamente con esta linea de codigo, cuando ud escribe algo diferente a una letra, el hardware pita...      
              evt.consume();                
              JOptionPane.showMessageDialog(null,"Ingresa solo numeros"); 
          }
    }//GEN-LAST:event_jTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(Confirmacionexisp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirmacionexisp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirmacionexisp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirmacionexisp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirmacionexisp().setVisible(true);
            }
        });
    }
    
    private void verificar(){
        String cedula; 
        String recoger0 ="";
        String recoger1;
        String recoger2;
        String recoger3;
        String recoger4;
         String name;
        String ape;
        
         
        cedula = jTextField1.getText();
        try{
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","root");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select * from persona where Id_persona_reg = "+cedula );
            //ResultSet resultado = estado.executeQuery("select * from ingreso_dispositivo where Id_persona_reg = "+cedula );
                           while(resultado.next()){
                 recoger0=resultado.getString("Id_persona_reg");
                 recoger1 = resultado.getString("Nombre_persona");
                 recoger2 = resultado.getString("Apellido_persona");
                 recoger3 = resultado.getString("Ficha_Persona");
                 recoger4 = resultado.getString("Id_tipo_persona");
                 
                 RegistroEntrada Confirmacionexisp  =new RegistroEntrada();
                    this.setVisible(false);
                    Confirmacionexisp.setVisible(true);
                    
                         try{
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","root");
            java.sql.Statement estados = con.createStatement();
            ResultSet resultados = estados.executeQuery("select Nombre_vigilante, Apellido_vigilante from vigilante where Id_vigilante ="+RegistroEntrada.jLabel25.getText()+"");
             while(resultados.next()){
                 name = resultados.getString("Nombre_vigilante");
                 ape = resultados.getString("Apellido_vigilante");
               RegistroEntrada.jLabel21.setText(name);
               RegistroEntrada.jLabel22.setText(ape);
            }
            
        }catch(Exception e){
            System.out.println(e.toString()); //desde aqui empieza la consulta en caso de que no se digite nada en el campo
        }
               
                 
                if(cedula.equals(recoger0)){
                    
                RegistroEntrada.jLabel17.setText(recoger0);
                RegistroEntrada.jLabel11.setText("Nombre: "+recoger1);
                RegistroEntrada.jLabel8.setText("Apellido: "+recoger2);
                RegistroEntrada.jLabel12.setText("Ficha: "+recoger3);
                RegistroEntrada.jLabel10.setText("Tipo persona: "+recoger4);
                
                
                //JOptionPane.showMessageDialog(null,"La cedula que busca es:"+recoger,"Info" ,JOptionPane.OK_OPTION);
                }
                
                
            }
           if(!cedula.contentEquals(recoger0)){
                    JOptionPane.showMessageDialog(null,"La cedula que busca no ha sido ingresada","Info" ,JOptionPane.OK_OPTION);
                }
                
        }catch(Exception e){
            System.out.println(e.toString()); //desde aqui empieza la consulta en caso de que no se digite nada en el campo
            JOptionPane.showMessageDialog(null,"Ingrese solo numeros en este campo","Informacion " ,JOptionPane.OK_OPTION);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
