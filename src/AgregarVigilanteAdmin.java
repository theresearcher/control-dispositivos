
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Arrays;


public class AgregarVigilanteAdmin extends javax.swing.JFrame {
   Conexion ctm = new Conexion();
    Connection registro = ctm.conexion();
   
    
    public AgregarVigilanteAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
         //clave1.setText("");
         clave1.setEditable(false);
          jTextField1.setEnabled(false);
          jComboBox1.setEnabled(false);
          jTextField7.setEnabled(false);
          clave1.setText("");
          clave1.setEnabled(false);
      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jcMousePanel3 = new jcMousePanel.jcMousePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        clave1 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel4.setText("Turno ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, 30));

        jLabel7.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel7.setText("Identificacion");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, 30));

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel8.setText("Nombre ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, 30));

        jLabel9.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel9.setText("Apellido");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, 30));

        jLabel10.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Administrador");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, -1, 30));

        jTextField1.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 240, 30));

        jTextField2.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 240, 30));

        jTextField3.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 240, 30));

        jButton3.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("ACEPTAR");
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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 140, 30));

        jButton4.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setText("CANCELAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton4KeyPressed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 140, 30));

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("SoftIng");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jcMousePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/-Icono sena v3.3.png"))); // NOI18N
        jcMousePanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jcMousePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra naranjado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1060, 81));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra Verde35% Azul 65%.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 640, 1060, 70));

        jLabel12.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel12.setText("Contraseña");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, -1, -1));

        jLabel13.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel13.setText("Usuario");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, -1, -1));

        jTextField7.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 240, 30));

        clave1.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        getContentPane().add(clave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 240, 30));

        jComboBox1.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "1. Mañana - Tarde", "2. Tarde - Mañana" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 80, 1070, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    

String id = jTextField2.getText();
String nombre = jTextField3.getText();
String apellido = jTextField1.getText();
String usuario = jTextField7.getText();

        //El siguiente grupo de IF'S verifican que todos los campos dentro de esta forma
        //se hallan diligenciado
        
        
        if(id.isEmpty()) //Este if verifica que el jTextField3 no este vacio
        {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un NUMERO DE IDENTIFICACION");
        }
        else
        {
                   if(nombre.isEmpty()) 
                   {
                       JOptionPane.showMessageDialog(null, "Por favor ingrese un NOMBRE");
                   }
                   
                    if(apellido.isEmpty()) 
                    {
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un APELLIDO");
                    }

                    if(jComboBox1.getSelectedIndex()== 0)
                    {
                        JOptionPane.showMessageDialog(null, "Por favor seleccione un TURNO");
                    }
                    
                    if(usuario.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un NOMBRE DE USUARIO");
                    }
        
        }
       
     
        if(!id.isEmpty() && !nombre.isEmpty() && !apellido.isEmpty() && !usuario.isEmpty() && jComboBox1.getSelectedIndex()!=0)
        {
            botonAceptar();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
new InicioAdmin().setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
char c=evt.getKeyChar();          
          if(Character.isLetter(c))
          { 
              getToolkit().beep(); //supuestamente con esta linea de codigo, cuando ud escribe algo diferente a una letra, el hardware pita...     
              evt.consume(); 
              JOptionPane.showMessageDialog(null,"Ingresa solo numeros"); 
          } 
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
validarExistencia();
    }//GEN-LAST:event_jTextField2FocusLost

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
        int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
          String id = jTextField2.getText();
String nombre = jTextField3.getText();
String apellido = jTextField1.getText();
String usuario = jTextField7.getText();

        //El siguiente grupo de IF'S verifican que todos los campos dentro de esta forma
        //se hallan diligenciado
        
        
        if(id.isEmpty()) //Este if verifica que el jTextField3 no este vacio
        {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un NUMERO DE IDENTIFICACION");
        }
        else
        {
                   if(nombre.isEmpty()) 
                   {
                       JOptionPane.showMessageDialog(null, "Por favor ingrese un NOMBRE");
                   }
                   
                    if(apellido.isEmpty()) 
                    {
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un APELLIDO");
                    }

                    if(jComboBox1.getSelectedIndex()== 0)
                    {
                        JOptionPane.showMessageDialog(null, "Por favor seleccione un TURNO");
                    }
                    
                    if(usuario.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null, "Por favor ingrese un NOMBRE DE USUARIO");
                    }
        
        }
       
     
        if(!id.isEmpty() && !nombre.isEmpty() && !apellido.isEmpty() && !usuario.isEmpty() && jComboBox1.getSelectedIndex()!=0)
        {
            botonAceptar();
        }
        }

    }//GEN-LAST:event_jButton3KeyPressed

    private void jButton4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton4KeyPressed
        int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
            new InicioAdmin().setVisible(true);
            this.setVisible(false);
        }

    }//GEN-LAST:event_jButton4KeyPressed

  
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
            java.util.logging.Logger.getLogger(AgregarVigilanteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarVigilanteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarVigilanteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarVigilanteAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarVigilanteAdmin().setVisible(true);
            }
        });
    }
    
      private void validarExistencia()
    {
         String existe;
        
        try{
                java.sql.Statement estado = registro.createStatement();
                ResultSet resultado = estado.executeQuery("select count(id_vigilante) from vigilante where Id_vigilante="+jTextField2.getText()+";");
                    while(resultado.next())
                    {
                    existe = resultado.getString("count(id_vigilante)");
                    
                    if(existe.equals("1"))
                    {
                        JOptionPane.showMessageDialog(null, "La cedula que ha escrito ya se ha registrado anteriormente \n por favor ingrese otra cedula");
                        jTextField2.setText("");
                        jTextField2.requestFocus();
                        //jTextField3.setEnabled(false);
                        jTextField1.setEnabled(false);
                        jComboBox1.setEnabled(false);
                        jTextField7.setEnabled(false);
                        clave1.setText("");
                        clave1.setEnabled(false);
                    }
                    
                    if(existe.equals("0"))
                    {
                        String cedula = jTextField2.getText();
                        clave1.setText(cedula);
                        jTextField3.requestFocus();
                        jTextField3.setEnabled(true);
                        jTextField1.setEnabled(true);
                        jComboBox1.setEnabled(true);
                        jTextField7.setEnabled(true);
                        clave1.setEnabled(true);
                    }
                    
                    }
            }catch(Exception e){
            System.out.println(e.toString());
        };
    }
      
      private void botonAceptar()
      {
        ConfirmacionIngVigi AgregarVigilanteAdmin = new ConfirmacionIngVigi();  
        this.setVisible(false);
        AgregarVigilanteAdmin.setVisible(true);  
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPasswordField clave1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField7;
    private jcMousePanel.jcMousePanel jcMousePanel3;
    // End of variables declaration//GEN-END:variables
}
