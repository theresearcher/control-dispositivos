
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConfirmacionPersona extends javax.swing.JFrame {
    
    Conexion ctm = new Conexion();
    Connection registro = ctm.conexion();
    //RegistrarPersonaVigilante regis = new RegistrarPersonaVigilante();

    public ConfirmacionPersona() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra naranjado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra Verde35% Azul 65%.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 150, 390, 40));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("<html>¿Desea guardar <br> los datos de la persona?</html>");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/triangle-atention-26990.jpg"))); // NOI18N

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jcMousePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 50, 50));

        jButton1.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("Guardar");
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jButton2.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Cancelar");
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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 390, 190));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
guardarPersona();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
RegistrarPersonaVigilante ConfirmacionPersona = new RegistrarPersonaVigilante();
this.setVisible(false);
ConfirmacionPersona.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
            RegistrarPersonaVigilante ConfirmacionPersona = new RegistrarPersonaVigilante();
            this.setVisible(false);
            ConfirmacionPersona.setVisible(true);
            
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
     int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
         guardarPersona();
        }
    }//GEN-LAST:event_jButton1KeyPressed

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
            java.util.logging.Logger.getLogger(Confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirmacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirmacion().setVisible(true);
            }
        });
    }
    
    public void guardarPersona()
    {
         //esta primera parte son los datos de la persona
        String nombre;
        String apellido;
        String cedula;
        String ficha;
        int cargo;

        //String fentrada = "2016-03-29 12:52:00 ";
        //String fsalida = "2016-03-31 12:52:00 ";
        //por revisar solo inicializados por prueba nah mas
        
        cedula = RegistrarPersonaVigilante.jTextField3.getText();        
        nombre = RegistrarPersonaVigilante.jTextField1.getText();
        apellido = RegistrarPersonaVigilante.jTextField7.getText();
        ficha = RegistrarPersonaVigilante.jTextField4.getText();
        cargo =  RegistrarPersonaVigilante.jComboBox3.getSelectedIndex();

        //JOptionPane.showMessageDialog(null, "El item seleccionado del combo box es: "+ctm.cargo);
        //JOptionPane.showMessageDialog(null, "la cedula recogida es: "+cedula);
        try 
        {
            PreparedStatement pst = registro.prepareStatement ("INSERT INTO persona VALUES (?,?,?,?,?);");
            pst.setString(1, cedula);
            pst.setString(2, nombre);
            pst.setString(3, apellido);
            pst.setString(4, ficha);
            pst.setInt(5, cargo);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"La persona ha sido registrada con EXITO","ALERTA", JOptionPane.INFORMATION_MESSAGE);
        }

        catch(SQLException ex)
        {
            Logger.getLogger(AgregarVigilanteAdmin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Verifique que todos los campos del formulario esten llenos\n No se ingreso el dato de la persona\n","Atencion",JOptionPane.OK_OPTION);
        }

        new InicioVigilante().setVisible(true);
        //this.setVisible(false);
        dispose();
        
        //regis.setVisible(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables
}
