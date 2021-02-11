
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CambioContraseña extends javax.swing.JFrame {

String  dato;
    public CambioContraseña() {
        initComponents();
        this.setLocationRelativeTo(null);
//         jPasswordField3.setEnabled(false);
           jPasswordField4.setEnabled(false);
    }
    
    
     Conexion cc = new Conexion();
    Connection cn = cc.conexion();
    Date date = new Date();
    String contra1;
    String contra3;
    String contra4;
    String res1;
    String id;
    String regi;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel5 = new jcMousePanel.jcMousePanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jcMousePanel5Layout = new javax.swing.GroupLayout(jcMousePanel5);
        jcMousePanel5.setLayout(jcMousePanel5Layout);
        jcMousePanel5Layout.setHorizontalGroup(
            jcMousePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jcMousePanel5Layout.setVerticalGroup(
            jcMousePanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 150, 20));

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cambio de contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/-Icono sena v3.png"))); // NOI18N

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jcMousePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra naranjado.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra Verde35% Azul 65%.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 460, 550, 80));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jButton3.setText("Cambiar Contraseña");
        jButton3.setAlignmentX(0.5F);
        jButton3.setAutoscrolls(true);
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(2);
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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 220, 40));

        jLabel4.setText("Ingrese su contraseña actual, y luego, ingrese la nueva contraseña.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel10.setText("Contraseña actual:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel12.setText("Confirme la nueva contraseña:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel11.setText("Contraseña nueva:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 110, -1));
        getContentPane().add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 110, -1));
        getContentPane().add(jPasswordField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 110, -1));

        jLabel6.setText("Cedula vigilante:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 140, 30));

        jButton2.setText("Cerrar Sesión");
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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 540, 370));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        
        String pass1 = jPasswordField1.getText();
        String pass3 = jPasswordField3.getText();
        String pass4 = jPasswordField4.getText();

if(!pass1.isEmpty())
{
    validar();
}        
        

if(!pass1.isEmpty() && !pass3.isEmpty() && !pass4.isEmpty() ){        
    
    validar();
        if(!pass3.equals(pass4))
        {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
        }

        if(pass3.equals(pass4))
        {
            if(pass3.length() < 8)
            {
               JOptionPane.showMessageDialog(null, "La contraseña nueva debe tener 8 o mas caracteres");
            }
            
            if(pass3.length() >= 8)
            {
                if(tieneNumeros(pass4).equals(true))
                {   
                    if(tieneMayusculas(pass4).equals(true))
                    {
                      //JOptionPane.showMessageDialog(null, "final correcto");
                      actualizar();
                    }
                    else
                    {
                      JOptionPane.showMessageDialog(null, "La contraseña debe tener una mayuscula");
                    }
                }
                else
                {
                  JOptionPane.showMessageDialog(null, "La contraseña debe tener un numero");
                }
            }
      }
}
else
{
    JOptionPane.showMessageDialog(null, "Por favor llene todos los campos");
}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new Inicio().setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
validar();
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
          int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER) 
        {
           actualizar();
        }
    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
          int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER) 
        {
         new Inicio().setVisible(true);
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }
    
    private void verificar(){
          try {
            int resultado;
            contra1= jPasswordField1.getText();
            contra3= jPasswordField3.getText();
            contra4= jPasswordField4.getText();
            id = jLabel7.getText();
            
            
                Statement st = cn.createStatement();
                ResultSet rst1 = st.executeQuery("select count(Contraseña) from vigilante where Contraseña = '"+contra1+"' and Id_vigilante ='"+id+"';");
                while(rst1.next())
                {
                    resultado=rst1.getInt("count(Contraseña)");
                            
                      if(resultado == 0)
                        {
                            
                            jLabel8.setText("Contraseña Incorrecta");
                            jLabel8.setForeground(Color.red);
                            jPasswordField4.setEnabled(false);
                        }
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Algo pasó abajo");
            }
    }
    
    
    //parte que valida si la contraseña tiene numeros
      public static Boolean tieneNumeros(String pass) {
        Boolean num = false;
        for (int i = 0; i <= 9; i++) {
            if (pass.contains("" + i)) {
                num = true;
                //JOptionPane.showMessageDialog(null, "hay "+i+" numeros");
            }
        }
       return num;
    }
   
      
    //parte que valida si la contraseña tiene letras mayusculas
          public static Boolean tieneMayusculas(String pass) {
        Boolean let = false;
        for (char i = 'A'; i <= 'Z'; i++) {
            if (pass.contains("" + i)) {
                let = true;
            }
        }
        return let;
    }
          
      
      
      private void validar()
      {
               
        contra1= jPasswordField1.getText();
        contra3= jPasswordField3.getText();
        contra4= jPasswordField4.getText();
        id = jLabel7.getText();
      
       verificar();
        try {
            
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select Contraseña from vigilante where Contraseña = '"+contra1+"' and Id_vigilante ='"+id+"'; ");
                while(rs.next())
                {
                    res1=rs.getString("Contraseña");
                            
                      if(contra1.equals(res1))
                        {
                            jLabel8.setText("Contraseña correcta");
                            jLabel8.setForeground(new Color(89,181,72));
                            jPasswordField3.setEnabled(true);
                            jPasswordField4.setEnabled(true);
                        }

                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Algo pasó arriba ");
            }
  
      }
      
      private void actualizar(){
            String idvigi = jLabel7.getText();
            String pass = jPasswordField4.getText();
            //String reg;

        try{
             DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
             regi = hourdateFormat.format(date);

            PreparedStatement dos =cn.prepareStatement("UPDATE vigilante set Fecha_cambio='"+regi+"' where Id_vigilante ="+idvigi+"");
            PreparedStatement tres =cn.prepareStatement("UPDATE vigilante set Contraseña ='"+pass+"' where Id_vigilante ="+idvigi+"");
            PreparedStatement cuatro =cn.prepareStatement("UPDATE vigilante set PrimerCambio = 1 where Id_vigilante ="+idvigi+"");

            dos.executeUpdate();
            tres.executeUpdate();
            cuatro.executeUpdate();

            JOptionPane.showMessageDialog(null, "Se realizo correctamente la actualización de la contraseña");

            Inicio CambioContraseña = new Inicio();
            CambioContraseña.setVisible(true);
            dispose();

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error"+e);
            System.out.println(e);
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static final javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JPasswordField jPasswordField4;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel5;
    // End of variables declaration//GEN-END:variables

    }

