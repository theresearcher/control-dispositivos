
import java.awt.event.KeyEvent;
import java.sql.Connection;


public class InicioAdmin extends javax.swing.JFrame {
 Conexion ctm = new Conexion();
    Connection registro = ctm.conexion();
    
    
    public InicioAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/door exit 30.png"))); // NOI18N
        jButton6.setText("<html>CERRAR <br> SESION <html>");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton6KeyPressed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 630, 170, 50));

        jLabel6.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Seleccione una opcion");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jLabel9.setText("Agregar vigilante");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 30));

        jButton5.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 153, 153));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/addmale 40.png"))); // NOI18N
        jButton5.setText("AGREGAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton5KeyPressed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 180, 40));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, 640, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jLabel8.setText("Consultar en la base de datos");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        jButton7.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 153, 153));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/looking blue 40.png"))); // NOI18N
        jButton7.setText("CONSULTAR");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton7KeyPressed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 220, 45));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 640, 100));

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADMINISTRADOR");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, -1, 40));

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("SoftIng");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jcMousePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/-Icono sena v3.3.png"))); // NOI18N
        getContentPane().add(jcMousePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra naranjado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 81));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra Verde35% Azul 65%.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 600, 1450, 120));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jLabel10.setText("Administrar Turnos");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, 30));

        jButton9.setFont(new java.awt.Font("Myriad Pro", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 153, 153));
        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Porteria mod\\src\\Iconos\\turno 50.png")); // NOI18N
        jButton9.setText("ADMINISTRAR");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton9KeyPressed(evt);
            }
        });
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 240, 70));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 640, 100));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/maxresdefault.jpg"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(1200, 600));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 40, 1550, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
AgregarVigilanteAdmin InicioAdmin = new AgregarVigilanteAdmin();
InicioAdmin.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
ConsultasAdmin InicioAdmin = new ConsultasAdmin();
InicioAdmin.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
new Inicio().setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
ModificarTurnos InicioAdmin = new ModificarTurnos();
InicioAdmin.setVisible(true);
this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton7KeyPressed
int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
            ConsultasAdmin InicioAdmin = new ConsultasAdmin();
            InicioAdmin.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton7KeyPressed

    private void jButton5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton5KeyPressed
int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
            AgregarVigilanteAdmin InicioAdmin = new AgregarVigilanteAdmin();
            InicioAdmin.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton5KeyPressed

    private void jButton9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton9KeyPressed
int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
            ModificarTurnos InicioAdmin = new ModificarTurnos();
            InicioAdmin.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton9KeyPressed

    private void jButton6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton6KeyPressed
int key = evt.getKeyCode(); 
        if (key == KeyEvent.VK_ENTER)
        {
            new Inicio().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton6KeyPressed

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
            java.util.logging.Logger.getLogger(InicioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    // End of variables declaration//GEN-END:variables
}
