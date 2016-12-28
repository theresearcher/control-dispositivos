
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
public class RegistrarPersonaVigilante extends javax.swing.JFrame {
   String inf;
    /**
     * Creates new form RegistrarPersonaVigilante
     */
    public RegistrarPersonaVigilante() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jTextField4.setEnabled(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("SoftIng");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel16.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("Registrar persona");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 260, 30));

        jLabel9.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel9.setText("Identificacion:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 150, 30));

        jLabel6.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel6.setText("Nombre:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 100, 30));

        jTextField3.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 190, 30));

        jTextField1.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 190, 30));

        jTextField7.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 190, 30));

        jTextField4.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 190, 30));

        jComboBox3.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Aprendiz", "Instructor", "Visitante", "Funcionario" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 190, 30));

        jButton4.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setText("ACEPTAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 510, 130, 30));

        jButton3.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("CANCELAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 130, 30));

        jLabel10.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel10.setText("Apellido:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 100, 30));

        jLabel11.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel11.setText("Ficha:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 100, 30));

        jLabel12.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel12.setText("Cargo:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 100, 30));

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("VIGILANTE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 40, 120, 40));

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/-Icono sena v3.png"))); // NOI18N
        getContentPane().add(jcMousePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 100, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra naranjado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 880, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra Verde35% Azul 65%.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 580, 910, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 90, 900, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    String id = this.jTextField3.getText();
    Object select = this.jComboBox3.getSelectedItem();
 
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select Id_persona_reg from persona where Id_persona_reg = "+id+"");
                while(resultado.next()){
                
                inf = resultado.getString("Id_persona_reg");
                
          if(id.equals(inf)){
                    JOptionPane.showMessageDialog(null,"La cedula a registrar ya esta ingresada en el sistema","ALERTA", JOptionPane.INFORMATION_MESSAGE);
                }
          if(select.equals("Seleccione")){
              JOptionPane.showMessageDialog(null,"Seleccione un cargo de la lista antes de continuar","ALERTA", JOptionPane.INFORMATION_MESSAGE);
          }
            }
                
                if(!id.equals(inf) && !select.equals("Seleccione") ){      
        
            ConfirmacionPersona RegistrarPersonaVigilante = new ConfirmacionPersona();
            this.setVisible(false);
            RegistrarPersonaVigilante.setVisible(true);
          }
            
        }catch(Exception e){
            System.out.println(e.toString()); //desde aqui empieza la consulta en caso de que no se digite nada en el campo
        };
          
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        InicioVigilante RegistrarDispoVigilante = new InicioVigilante();
        this.setVisible(false);
        RegistrarDispoVigilante.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
String box;

box = this.jComboBox3.getSelectedItem().toString();
        switch(box){
        
        case "Seleccione":
        this.jTextField4.setEnabled(false);
        break;    
            
        case "Aprendiz":
        this.jTextField4.setEnabled(true);
        break;
        
        case "Instructor":
        this.jTextField4.setEnabled(false);
       
        break;
        
        case "Visitante":
        this.jTextField4.setEnabled(false);
        break;
       
        
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged

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
            java.util.logging.Logger.getLogger(RegistrarPersonaVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPersonaVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPersonaVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPersonaVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPersonaVigilante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField7;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables
}
