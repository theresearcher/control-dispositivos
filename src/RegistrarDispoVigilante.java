
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ANDRES
 */
public class RegistrarDispoVigilante extends javax.swing.JFrame {
    static Object combo;
     Conexion ctm = new Conexion();
    Connection registro = ctm.conexion();
    String marca1;
       String ced ="";
   static String send;
    
    
    
    public RegistrarDispoVigilante() {
        initComponents();
        this.setLocationRelativeTo(null);
       this.jLabel9.setVisible(false);
      this.jLabel9.setEnabled(false);
    this.jTextField2.setVisible(false);
       this.jTextField2.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("SoftIng");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        jLabel11.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel11.setText("Marca:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 90, 30));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 190, 30));

        jLabel13.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jLabel13.setText("Datos del dispositivo");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 220, 30));

        jLabel14.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel14.setText("Serial:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 90, 30));

        jLabel15.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel15.setText("Modelo:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 90, 30));

        jLabel16.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("Registrar dispositivos");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 260, 30));

        jTextField6.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 190, 30));

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 190, 30));

        jButton3.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("CANCELAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 580, 130, 30));

        jButton4.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setText("ACEPTAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, 130, 30));

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("VIGILANTE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 30, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra Verde35% Azul 65%.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 630, 1390, 80));

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/-Icono sena v3.png"))); // NOI18N
        getContentPane().add(jcMousePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra naranjado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 90));

        jLabel7.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel7.setText("Tipo de dispositivo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/PORTATIL.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 110, 130, 110));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 250, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Portatil", "Tableta" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 190, 30));

        jComboBox2.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Asus", "Lenovo", "HP", "Dell", "Toshiba", "Samsung", "Apple", "Huawei", "LG", "Nokia", "HTC", "ZTE", "Microsoft", "Acer", "Sony", "OTRO" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 190, 30));

        jLabel6.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel6.setText("Cedula de la persona que registra el equipo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, -1, -1));

        jTextField1.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 190, 30));

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel8.setText("identificacion vigilante");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 500, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 350, 160, 30));

        jLabel9.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel9.setText("Ingrese la marca:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 360, -1, -1));

        jLabel3.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1380, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
InicioVigilante RegistrarDispoVigilante = new InicioVigilante();
this.setVisible(false);
RegistrarDispoVigilante.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

   String dato = this.jTextField1.getText();
        try{
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = registro.createStatement();
            ResultSet resultado = estado.executeQuery("select * from persona where Id_persona_reg = "+dato+"" );
            
                while(resultado.next()){
                    //JOptionPane.showMessageDialog(null,"El serial recogido es:"+serial+"\n y el primer resultado seria:"+recoger+"","Info", JOptionPane.OK_OPTION);
                     ced = resultado.getString("Id_persona_reg");
                
                
                    if(dato.contentEquals(ced)){
                    
                        if(combo.equals("OTRO")){            
                            send = jTextField2.getText();
                            //JOptionPane.showMessageDialog(null, "La marca seleccionada es:"+send, "Upa", HEIGHT);
                            //marca = this.jTextField2.getText();
                        }
        
                        ConfirmacionDisp RegistrarDispoVigilante = new ConfirmacionDisp();
                        this.setVisible(false);
                        RegistrarDispoVigilante.setVisible(true);
                        ConfirmacionDisp.marca=send;
                    }
                
                }
                
                
                        if(!dato.contentEquals(ced)){
                            JOptionPane.showMessageDialog(null,"La cedula ingresada no ha sido registrada \n Debe hacer el proceso de registro de Persona","Informacion" ,JOptionPane.OK_OPTION);
                    
                            RegistrarDispoVigilante RegistrarPersonaVigilante = new RegistrarDispoVigilante();
                            this.setVisible(false);
                            RegistrarPersonaVigilante.setVisible(true);
                        }
                
        }           
        catch(Exception e){
            System.out.println(e.toString()); //desde aqui empieza la consulta en caso de que no se digite nada en el campo
            JOptionPane.showMessageDialog(null,"Ingrese solo numeros en este campo","Informacion " ,JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
         combo = jComboBox2.getSelectedItem().toString();

 if(combo.equals("OTRO")){            
            jLabel9.setVisible(true);
            jLabel9.setEnabled(true);
            jTextField2.setVisible(true);
            jTextField2.setEnabled(true);
            
           //marca = this.jTextField2.getText();
          
        }
//               else{
//             jLabel9.setVisible(false);
//             jTextField2.setVisible(false);
//             jTextField2.setEnabled(false);
//             marca =  (String) RegistrarDispoVigilante.jComboBox2.getSelectedItem();
//        }

            if(!combo.equals("OTRO")){            
            jLabel9.setVisible(false);
            jLabel9.setEnabled(false);
            jTextField2.setVisible(false);
            jTextField2.setEnabled(false);
            send = combo.toString();
            //JOptionPane.showMessageDialog(null, "La marca seleccionada es:"+send, "Upa", HEIGHT); monitor que si sirve
            //marca =  (String) RegistrarDispoVigilante.jComboBox2.getSelectedItem().toString();
            }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

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
            java.util.logging.Logger.getLogger(RegistrarDispoVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarDispoVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarDispoVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarDispoVigilante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarDispoVigilante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JLabel id = new javax.swing.JLabel();
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public static javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField9;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables
}
