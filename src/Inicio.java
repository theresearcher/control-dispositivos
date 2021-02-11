
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Inicio extends javax.swing.JFrame {

String  dato;
String tur;
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
       
    }
public void acceder(String usuario, String pass)
    {
        
        //Es para que busque el usuario y contraseña que se creo que mysql
        String cap="";
       String sql="SELECT * FROM vigilante WHERE Usuario='"+usuario+"' && contraseña='"+pass+"'";
       
        try {
            
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                cap=rs.getString("Tipo_Usuario");
            }
            //Yo lo puse asi ya creyendo que se abrira dos ventanas que sera uno para admin 
            //y otro para solo vigilante segun el ususario y contraseña que se le va a poner 
            if(cap.equals("Administrador"))
            {
                    this.setVisible(false);
                    InicioAdmin Inicio = new InicioAdmin();
                    Inicio.setVisible(true);
                    Inicio.pack();
                     
        
                
            }
            if(cap.equals("Vigilante"))
            {
                String  sql1="select id_vigilante from vigilante where Usuario='"+usuario+"' && contraseña='"+pass+"' "; 
                try {
                     st = cn.createStatement();
                     rs = st.executeQuery(sql1);
                     while(rs.next()){
                         RegistrarDispoVigilante.id.setText(rs.getString(1));
                         RegistroEntrada.jLabel25.setText(rs.getString(1));
                         RegistroSalida.idout24.setText(rs.getString(1));
                         dato = rs.getString("id_vigilante");
                         
                         CambioContraseña.jLabel7.setText(dato);
                         verificarDatos();
                     }
                }catch(Exception e)
                {
                  System.out.println("Error "+e);  
                }
//                    this.setVisible(false);
//                    InicioVigilante Inicio = new InicioVigilante();
//                    Inicio.setVisible(true);
//                    Inicio.pack();
                    
            }
            if((!cap.equals("Administrador"))&& (!cap.equals("Vigilante")))
            {
                JOptionPane.showMessageDialog(this, "Usuario o Contraseña Incorrecta");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel5 = new jcMousePanel.jcMousePanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        jcMousePanel3 = new jcMousePanel.jcMousePanel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
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

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("SoftIng");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 1, 11)); // NOI18N
        jLabel8.setText("Version 1.00");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 630, -1, -1));

        jLabel7.setFont(new java.awt.Font("Myriad Pro", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("USUARIO:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 100, 20));

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/-Icono sena v3.png"))); // NOI18N

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jcMousePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 230, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra naranjado.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 140));

        jLabel6.setFont(new java.awt.Font("Myriad Pro", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("CONTRASEÑA:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 130, 20));

        jLabel9.setFont(new java.awt.Font("Myriad Pro", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Acerca de...");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra Verde35% Azul 65%.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 600, 550, 80));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jButton3.setText("Iniciar Sesion ");
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
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 150, 40));

        jcMousePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/luiz.png"))); // NOI18N

        javax.swing.GroupLayout jcMousePanel2Layout = new javax.swing.GroupLayout(jcMousePanel2);
        jcMousePanel2.setLayout(jcMousePanel2Layout);
        jcMousePanel2Layout.setHorizontalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jcMousePanel2Layout.setVerticalGroup(
            jcMousePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jcMousePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 70, 60));

        jcMousePanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/coredump-keepass-dock-icono-de-clip-art_422339.jpg"))); // NOI18N

        javax.swing.GroupLayout jcMousePanel3Layout = new javax.swing.GroupLayout(jcMousePanel3);
        jcMousePanel3.setLayout(jcMousePanel3Layout);
        jcMousePanel3Layout.setHorizontalGroup(
            jcMousePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        jcMousePanel3Layout.setVerticalGroup(
            jcMousePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jcMousePanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 50, 50));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 110, -1));
        getContentPane().add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 110, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 540, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String usu=jTextField1.getText();
    String pas=new String(jPasswordField2.getPassword());
    acceder(usu, pas);
    //ventanaContra();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
AcercaDe Inicio = new AcercaDe();
this.setVisible(false);
Inicio.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton3KeyPressed
    int key = evt.getKeyCode(); //esto va a funcionar cuando ud le de enter PERO al BOTOOOOOOOOOOOOOOON
         if (key == KeyEvent.VK_ENTER) {
              String usu=jTextField1.getText();
     String pas=new String(jPasswordField2.getPassword());
     acceder(usu, pas);  
     //ventanaContra();
         }
    }//GEN-LAST:event_jButton3KeyPressed

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
    
    private void ventanaContra()
    {       
       //new CambioContraseña().setVisible(true);
       //this.setVisible(false);
        String data;
     try {
            
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select PrimerCambio from vigilante where id_vigilante = "+dato+"; ");
                while(rs.next())
                {
                    JOptionPane.showMessageDialog(this, "aqui voy");
                    data=rs.getString("PrimerCambio");
                  
                    if(data.equals(0))
                    {
                        JOptionPane.showMessageDialog(this, "no ha cambiado");
                        new CambioContraseña().setVisible(true);
                        this.setVisible(false);
                        
                        
                         CambioContraseña cr = new CambioContraseña();
                        cr.setVisible(true);
                        dispose();
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Algo pasó");
            }

    
    }
    
    public void verificarDatos()
    {
        String id;
        String user;
        String pasok;
        user = jTextField1.getText();
        pasok = jPasswordField2.getText();
        Long idres;
        int contrares;
        int prime;
        
      try{
          Statement st = cn.createStatement();
                ResultSet rst1 = st.executeQuery("select id_vigilante,count(Contraseña),PrimerCambio from vigilante where Usuario='"+user+"' && contraseña='"+pasok+"'");
                while(rst1.next())
                {
                    //idres=rst1.getInt("id_vigilante");
                    idres=rst1.getLong("id_vigilante");
                    contrares = rst1.getInt("count(Contraseña)");
                    prime = rst1.getInt("PrimerCambio");
                            
                      if(idres == 0)
                        {
                            JOptionPane.showMessageDialog(null, "La contraseña esta mal");
                        }
                      
                      if(idres != 0){
                          if(prime == 0)
                          {    
                              JOptionPane.showMessageDialog(null,"Debe realizar el primer cambio de contraseña");
                              CambioContraseña cr = new CambioContraseña();
                              cr.setVisible(true);
                              dispose();   
                          }
                          
                          if(prime == 1)
                          {
                                this.setVisible(false);
                                InicioVigilante Inicio = new InicioVigilante();
                                Inicio.setVisible(true);
                                Inicio.pack();
                    
                          }
                      }
                      
                }
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Algo pasó abajo"+e);
            }
    }
      
      //segunda consulta
//          try {
//            int resultado;
//          
//          String contra1;
//            
//            contra1 = jTextField1.getText();
//            
//            JOptionPane.showMessageDialog(null, "voy verificando ");
//                Statement st = cn.createStatement();
//                ResultSet rst1 = st.executeQuery("select count(Contraseña) from vigilante where Usuario = '"+contra1+"' and Id_vigilante ='"+id+"';");
//                while(rst1.next())
//                {
//                    resultado=rst1.getInt("count(Contraseña)");
//                            
//                      if(resultado == 0)
//                        {
//                            JOptionPane.showMessageDialog(null, "La contraseña esta mal");
//                        }
//                }
//            }
//            catch(Exception e)
//            {
//                JOptionPane.showMessageDialog(null, "Algo pasó abajo");
//            }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    private jcMousePanel.jcMousePanel jcMousePanel3;
    private jcMousePanel.jcMousePanel jcMousePanel5;
    // End of variables declaration//GEN-END:variables

     Conexion cc = new Conexion();
    Connection cn = cc.conexion();
    }

