
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class Confirmacionexispsal extends javax.swing.JFrame {


    Conexion ctm = new Conexion();
    Connection con = ctm.conexion();
    
    static String  greencard;
    public Confirmacionexispsal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese la cedula de la persona");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jTextField1.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 190, 30));

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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra naranjado.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra Verde35% Azul 65%.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 210, 500, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 30, 510, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
verificaCedula();
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
            verificaCedula();
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
    
    private void verificaCedula(){
        String cedula; 
        String recoger0 ="";
        String recoger1;
        String recoger2;
        String recoger3;
        String recoger4;
        String namba;
        String abe;
        
         
        cedula = jTextField1.getText();
        try{
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select * from persona where Id_persona_reg = "+cedula );
            //ResultSet resultado = estado.executeQuery("select distinct persona.*, dispositivo.Serial_dispositivo, dispositivo.Marca_dispositivo from persona,dispositivo where persona.Nombre_persona ='"+name+"'");
                           while(resultado.next()){
                 recoger0=resultado.getString("Id_persona_reg");
                 recoger1 = resultado.getString("Nombre_persona");
                 recoger2 = resultado.getString("Apellido_persona");
                 recoger3 = resultado.getString("Ficha_Persona");
                 recoger4 = resultado.getString("Id_tipo_persona");
                 
                 RegistroSalida Confirmacionexispsal  =new RegistroSalida();
                    this.setVisible(false);
                    Confirmacionexispsal.setVisible(true);
               
                             try{
            java.sql.Statement estados = con.createStatement();
            ResultSet resultados = estados.executeQuery("select Nombre_vigilante, Apellido_vigilante from vigilante where Id_vigilante ="+RegistroSalida.idout24.getText()+"");
             while(resultados.next()){
                 namba = resultados.getString("Nombre_vigilante");
                 abe = resultados.getString("Apellido_vigilante");
               RegistroSalida.jLabel22.setText(namba);
               RegistroSalida.jLabel23.setText(abe);
            }
            
        }catch(Exception e){
            System.out.println(e.toString()); //desde aqui empieza la consulta en caso de que no se digite nada en el campo
        }
                 
                if(cedula.equals(recoger0)){
                    greencard=recoger0;
                RegistroSalida.jLabel13.setText("Identificacion: "+greencard);
                RegistroSalida.jLabel16.setText("Nombre: "+recoger1);
                RegistroSalida.jLabel17.setText("Apellido: "+recoger2);
                RegistroSalida.jLabel18.setText("Ficha: "+recoger3);
                RegistroSalida.jLabel19.setText("Tipo persona: "+recoger4);
                
                
               // JOptionPane.showMessageDialog(null,"La cedula que busca es:"+greencard,"Info" ,JOptionPane.OK_OPTION);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
