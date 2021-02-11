
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConfirmacionIngVigi extends javax.swing.JFrame {

    
    public ConfirmacionIngVigi() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
Conexion ctm = new Conexion();
    Connection registro = ctm.conexion();
    //Date fechainicio = new Date();
    Date fechainicio = new Date();
    
    
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
        jLabel4.setText("¿ Desea guardar cambios. ?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, -1));

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

        getContentPane().add(jcMousePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 50, 50));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 390, 190));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
guardarVigilante();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new AgregarVigilanteAdmin().setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
guardarVigilante();
    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
new AgregarVigilanteAdmin().setVisible(true);
this.setVisible(false);
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

    private void guardarVigilante()
    {
        String nombre;
        String apellido;
        String cedula;
        String usuario;
        String tipouser;
        String fechabeg;
        byte banderapass = 0;
        
        DateFormat hourdateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        fechabeg = hourdateFormat.format(fechainicio);
        System.out.println("fecha"+fechabeg);

        String turno = (String) AgregarVigilanteAdmin.jComboBox1.getSelectedItem();

        switch (turno){

            case "1. Mañana - Tarde":
        cedula = AgregarVigilanteAdmin.jTextField2.getText();        
        nombre = AgregarVigilanteAdmin.jTextField3.getText();
        apellido = AgregarVigilanteAdmin.jTextField1.getText();
        

        String contraseña = AgregarVigilanteAdmin.clave1.getText();
        usuario = AgregarVigilanteAdmin.jTextField7.getText();

        try {
                PreparedStatement pst =registro.prepareStatement("INSERT INTO vigilante VALUES (?,?,?,?,?,?,?,?,?)");
                PreparedStatement agre2 =registro.prepareStatement("INSERT INTO registro_turnos VALUES (?,?,?,?,?)");
                pst.setString(1, cedula );
                pst.setString(2, nombre);
                pst.setString(3, apellido);
                pst.setString(4, "1");
                pst.setString(5, contraseña);
                pst.setString(6, usuario);
                pst.setString(7, "Vigilante");
                pst.setByte(8, banderapass);
                pst.setDate(9, null);
                
                //datos ha agregar a la segunda tabla
                agre2.setString(1,null);
                agre2.setString(2,cedula);
                agre2.setString(3,"1");
                agre2.setString(4, fechabeg);
                agre2.setString(5, null);

                pst.executeUpdate();
                agre2.executeUpdate();
                validarExistencia();
                 } catch (SQLException ex) {
                Logger.getLogger(AgregarVigilanteAdmin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Verifique que todos los campos del formulario esten llenos\n No se ingreso el dato del vigilante\n Error literal :"+ex,"Atencion",JOptionPane.OK_OPTION);
            }
                break;


            case "2. Tarde - Mañana":     

        cedula = AgregarVigilanteAdmin.jTextField2.getText();        
        nombre = AgregarVigilanteAdmin.jTextField3.getText();
        apellido = AgregarVigilanteAdmin.jTextField1.getText();
        contraseña = AgregarVigilanteAdmin.clave1.getText();
        usuario = AgregarVigilanteAdmin.jTextField7.getText();


        try {
                PreparedStatement pst =registro.prepareStatement("INSERT INTO vigilante VALUES (?,?,?,?,?,?,?,?,?)");
                PreparedStatement agre2 =registro.prepareStatement("INSERT INTO registro_turnos VALUES (?,?,?,?,?)");
                pst.setString(1, cedula );
                pst.setString(2, nombre);
                pst.setString(3, apellido);
                pst.setString(4, "2");
                pst.setString(5, contraseña);
                pst.setString(6, usuario);
                pst.setString(7, "Vigilante");
                pst.setByte(8, banderapass);
                pst.setDate(9, null);
                
                 //datos ha agregar a la segunda tabla
                agre2.setString(1,null);
                agre2.setString(2,cedula);
                agre2.setString(3,"2");
                agre2.setString(4, fechabeg);
                agre2.setString(5, null);
                
                pst.executeUpdate();
                agre2.executeUpdate();
                validarExistencia();
                 } catch (SQLException ex) {
                Logger.getLogger(AgregarVigilanteAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
                    break;
        }



        new InicioAdmin().setVisible(true);
        this.setVisible(false);
    }
    
    
    
     private void validarExistencia()
    {
         String existe;
        
        try{
                java.sql.Statement estado = registro.createStatement();
                ResultSet resultado = estado.executeQuery("select count(id_vigilante) from vigilante where Id_vigilante="+AgregarVigilanteAdmin.jTextField2.getText()+";");
                    while(resultado.next())
                    {
                    existe = resultado.getString("count(id_vigilante)");
                    
                    if(existe.equals("1"))
                    {
                        JOptionPane.showMessageDialog(null, "Se ha registrado correctamente al nuevo vigilante");
                        
                    }
                    
                    if(existe.equals("0"))
                    {
                        JOptionPane.showMessageDialog(null, "No se ha registrado al nuevo vigilante \n realice de nuevo el ingreso del vigilante \n verificando los datos ingresados");
                    }
                    
                    }
            }catch(Exception e){
            System.out.println(e.toString());
        };
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
