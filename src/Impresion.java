



import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;




public class Impresion extends javax.swing.JFrame {

   
    public Impresion() {
        initComponents();
      
         this.setLocationRelativeTo(null);
         this.getContentPane().setBackground(Color.white);
         this.setResizable(false);
         ocultar();
         
//         this.jButton8.setEnabled(false);
//         this.jButton12.setEnabled(false);
           this.jButton3.setEnabled(false);
    }
    
    String coud[]= new String[11];
    int w;
    int contador = 0;
    String serono;
    String sero;
    String marcapos;
    String idpersona;
    String nomper;
    String apeper;
    String tipodi;
    String fecing;
    String fecsal;
    
 Conexion cc = new Conexion();
    Connection con = cc.conexion();   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1370, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("VIGILANTE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 30, -1, -1));

        jButton1.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/door exit 30.png"))); // NOI18N
        jButton1.setText("<HTML>VOLVER</HTML>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 150, -1));

        jcMousePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/-Icono sena v3.3.png"))); // NOI18N
        getContentPane().add(jcMousePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 120, 60));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 582, 200));

        jButton8.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jButton8.setText("Reiniciar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 120, 40));

        jButton13.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jButton13.setText("<html>Limpiar <br> Campos</html>");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 120, -1));

        jButton12.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jButton12.setText("<html>Expandir datos <br> seleccionados</html>");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, -1, -1));

        jButton2.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magnifier 50.png"))); // NOI18N
        jButton2.setText("<html>Consultar<br>seriales<html>");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 160, 50));

        jLabel14.setFont(new java.awt.Font("Myriad Pro", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setText("Softing");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 130, 50));

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel4.setText("Seleccione de la lista los seriales que desea imprimir");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel7.setText("Serial:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel8.setText("Marca:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel10.setText("Identificacion Persona que registra:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, -1, -1));

        jLabel15.setFont(new java.awt.Font("Myriad Pro", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("Seleccione para imprimir");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 300, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra naranjado.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 100));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 180, 20));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 180, 180, 20));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 180, 20));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 200, 30));

        jLabel21.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel21.setText("Nombre Persona:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 170, 20));

        jLabel23.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel23.setText("Apellido Persona:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 150, 150, -1));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 150, 190, 20));

        jLabel25.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel25.setText("Tipo Dispositivo:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, -1, -1));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 200, 130, 20));

        jLabel27.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel27.setText("Fecha registro:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 210, -1, -1));
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 210, 180, 20));

        jButton3.setText("Agregar a lista de impresion");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        jButton4.setText("<html>Imprimir seriales <br> \nSeleccionados</html>");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 640, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra Verde35% Azul 65%.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 610, 1410, 120));

        jLabel2.setText("Serial 1:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, -1, -1));

        jLabel101.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, 160, 20));

        jLabel6.setText("Serial 2:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, -1, -1));

        jLabel102.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, 160, 20));

        jLabel5.setText("Serial 3:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, -1, -1));

        jLabel103.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 444, 160, 20));

        jLabel18.setText("Serial 4:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, -1, -1));

        jLabel104.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 340, 160, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 90, 1430, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
        String sera;
        String code[]= new String[11];
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Serial dispositivo");
        modelo.addColumn("Marca dispositivo");
        modelo.addColumn("Id persona registro");
        modelo.addColumn("Nombre persona");
        modelo.addColumn("Apellido persona");
        modelo.addColumn("Tipo dispositivo");
        
        this.jTextField1.requestFocus();
        this.jTable1.setModel(modelo);
         sera = jTextField1.getText();
        try{

            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select dispositivo.serial_dispositivo,dispositivo.Marca_dispositivo,dispositivo.id_persona_reg,\n" +
"persona.nombre_persona,\n" +
"persona.apellido_persona,\n" +
"tipo_dispositivo.tipo_dispositivo\n" +
"from dispositivo inner join tipo_dispositivo\n" +
"on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo\n" +
"inner join persona on persona.Id_persona_reg = dispositivo.Id_persona_reg \n" +
"where dispositivo.serial_dispositivo = 'fv68xx' order by dispositivo.serial_dispositivo");
            
            while(resultado.next()){
                code[0] = resultado.getString("serial_dispositivo");
                code[1] = resultado.getString("marca_dispositivo");
                code[2] = resultado.getString("id_persona_reg");
                code[3] = resultado.getString("nombre_persona");
                code[4] = resultado.getString("apellido_persona");
                code[5] = resultado.getString("tipo_dispositivo"); 

                modelo.addRow(code);
            }
            this.jTable1.setModel(modelo);
        }catch(Exception e){
            System.out.println(e.toString());
        };
        //desde aqui empieza la consulta en caso de que no se digite nada en el campo
        if(jTextField1.getText().equals("")){
            
            try{
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select dispositivo.serial_dispositivo,dispositivo.Marca_dispositivo,dispositivo.id_persona_reg,\n" +
"persona.nombre_persona,\n" +
"persona.apellido_persona,\n" +
"tipo_dispositivo.tipo_dispositivo\n" +
"from dispositivo inner join tipo_dispositivo\n" +
"on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo\n" +
"inner join persona on persona.Id_persona_reg = dispositivo.Id_persona_reg \n" +
"where dispositivo.serial_dispositivo = dispositivo.serial_dispositivo order by dispositivo.serial_dispositivo");
            while(resultado.next()){
                code[0] = resultado.getString("serial_dispositivo");
                code[1] = resultado.getString("Marca_dispositivo");
                code[2] = resultado.getString("id_persona_reg");   
                code[3] = resultado.getString("nombre_persona");
                code[4] = resultado.getString("apellido_persona");
                code[5] = resultado.getString("tipo_dispositivo");
                modelo.addRow(code);
            }
            this.jTable1.setModel(modelo);
        }catch(Exception e){
            System.out.println(e.toString());
        };
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
            this.jLabel17.setText("");
            this.jLabel16.setText("");
            this.jLabel1.setText("");
            this.jLabel22.setText("");
            this.jLabel24.setText("");
            this.jLabel26.setText("");
            this.jLabel29.setText("");
            
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        try{

            java.sql.Statement estad = con.createStatement();
            ResultSet resultado = estad.executeQuery("select dispositivo.serial_dispositivo,dispositivo.Marca_dispositivo,dispositivo.id_persona_reg,\n" +
"persona.nombre_persona, persona.apellido_persona, tipo_dispositivo.tipo_dispositivo, dispositivo.Fecha_registro\n" +
"from dispositivo inner join tipo_dispositivo on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo\n" +
"inner join persona on persona.Id_persona_reg = dispositivo.Id_persona_reg \n" +
"where dispositivo.serial_dispositivo = '"+sero+"' order by dispositivo.serial_dispositivo;");
            
            while(resultado.next()){
                 serono = resultado.getString("serial_dispositivo");
                marcapos = resultado.getString("Marca_dispositivo");
                idpersona = resultado.getString("id_persona_reg");
                nomper = resultado.getString("nombre_persona");
               apeper  = resultado.getString("apellido_persona");
               tipodi  = resultado.getString("tipo_dispositivo");
                fecing = resultado.getString("Fecha_registro");
                
            }

            this.jLabel17.setText(serono);
            this.jLabel16.setText(marcapos);
            this.jLabel1.setText(idpersona);
            this.jLabel22.setText(nomper);
            this.jLabel24.setText(apeper);
            this.jLabel26.setText(tipodi);
            this.jLabel29.setText(fecing);
            
            this.jButton3.setEnabled(true);
            
            

        }catch(Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
w = this.jTable1.getSelectedRow();
        sero = (String)this.jTable1.getValueAt(w,0);
        //JOptionPane.showMessageDialog(null, "serial:"+sero);
        jButton12.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
for(int l=0;l<11;l++){
coud[l]=null;
}        
ocultar();
this.jLabel17.setText("");
this.jLabel16.setText("");
this.jLabel1.setText("");
this.jLabel22.setText("");
this.jLabel24.setText("");
this.jLabel26.setText("");
this.jLabel29.setText("");
this.jLabel101.setText("");
this.jLabel102.setText("");
this.jLabel103.setText("");
this.jLabel104.setText("");
contador = 0;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       //contador = contador + 1;
       
        adicionSerial Impresion = new adicionSerial(); //aqui no se ve util, pero la variable impresion va dentro de cada caso escrito abajo.
        
       switch(contador){
            
           case 0:
                  jLabel2.setEnabled(true);
                  jLabel101.setEnabled(true);
                  String paki = this.jLabel17.getText();
                  //JOptionPane.showMessageDialog(null, paki);
                  coud[1]=paki;
                  jLabel101.setText(coud[1]);
                  //JOptionPane.showMessageDialog(null, coud[1]);
                  Impresion = new adicionSerial();
                  this.setVisible(true);
                  Impresion.setVisible(true);         
                  contador = contador + 1;
                  //JOptionPane.showMessageDialog(null, "en el primer caso: "+contador);
               break;
               
           case 1:
             
               if(this.jLabel17.getText().equals(coud[contador]))
               {
                    //JOptionPane.showMessageDialog(null, "El numero que hay en coud es:"+coud[contador]+"y el numero recogido es"+this.jLabel17.getText());
                    JOptionPane.showMessageDialog(null, "El serial ya ha sido seleccionado");
                }
                    else{
                        //JOptionPane.showMessageDialog(null, "El numero no se ha ingresado aun");
                        jLabel6.setEnabled(true);
                        jLabel102.setEnabled(true);
                        String pako = this.jLabel17.getText();
                        //JOptionPane.showMessageDialog(null, pako);
                        coud[2]=pako;
                        jLabel102.setText(coud[2]);
                        //JOptionPane.showMessageDialog(null, coud[2]);
                        Impresion = new adicionSerial();
                        this.setVisible(true);
                        Impresion.setVisible(true);         
                        contador = contador + 1;
                        //JOptionPane.showMessageDialog(null, "en el segundo caso: "+contador);
                        }
             break;
               
               
               
           case 2:
               if(this.jLabel17.getText().equals(coud[contador])){
                //JOptionPane.showMessageDialog(null, "El numero que hay en coud es:"+coud[contador]+"y el numero recogido es"+this.jLabel17.getText());
                JOptionPane.showMessageDialog(null, "El serial ya ha sido seleccionado");
            }else{
                //JOptionPane.showMessageDialog(null, "El numero no se ha ingresado aun");
                jLabel5.setEnabled(true);
                  jLabel103.setEnabled(true);
                  String pake = this.jLabel17.getText();
                  //JOptionPane.showMessageDialog(null, pake);
                  coud[3]=pake;
                  jLabel103.setText(coud[3]);
                  //JOptionPane.showMessageDialog(null, coud[3]);
                  Impresion = new adicionSerial();
                  this.setVisible(true);
                  Impresion.setVisible(true);         
                  contador = contador + 1;
                  //JOptionPane.showMessageDialog(null, "en el tercer caso: "+contador);
            }
                  
               break;
               
           case 3:
                if(this.jLabel17.getText().equals(coud[contador])){
                //JOptionPane.showMessageDialog(null, "El numero que hay en coud es:"+coud[contador]+"y el numero recogido es:"+this.jLabel17.getText());
                JOptionPane.showMessageDialog(null, "El serial ya ha sido seleccionado");
            }else{
                //JOptionPane.showMessageDialog(null, "El numero no se ha ingresado aun");
                jLabel18.setEnabled(true);
                  jLabel104.setEnabled(true);
                  String paka = this.jLabel17.getText();
                  //JOptionPane.showMessageDialog(null, paka);
                  coud[4]=paka;
                  jLabel104.setText(coud[4]);
                  //JOptionPane.showMessageDialog(null, coud[4]);
                  Impresion = new adicionSerial();
                  this.setVisible(true);
                  Impresion.setVisible(true);         
                  contador = contador + 1;
                 // JOptionPane.showMessageDialog(null, "en el cuarto caso: "+contador);
            }
                  
               break;
               
               
           default:
               JOptionPane.showMessageDialog(null, "Ha llegado al limite de ingresos de seriales por hoja \n por favor imprima estos seriales");
               break;
       }        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//try {         
//        JasperReport jp = (JasperReport) JRLoader.loadObject(GenerarReporte.class.getResource("UsuarioReporteEdit.jasper"));
//        Map parametro = new HashMap();
//            
//        parametro.put("idusuariot", idusuario);
//            
//        JasperPrint j= JasperFillManager.fillReport(jp, parametro,Ven1Inicio1.hc.con);
//        JasperViewer jv = new JasperViewer(j,false);
//        jv.setTitle("Imprimir Certificación ");
//        jv.setVisible(true);
//        } catch (JRException e) {
//        JOptionPane.showMessageDialog(null, "Error al mostrar (GenerarReporte) :  " +e);
//        }
//    }

    
    try {   
        JOptionPane.showMessageDialog(null, "estoy antes de la carga del objeto");
        JasperReport jp = (JasperReport) JRLoader.loadObject(Impresion.class.getResource("seriales.jasper"));//27-12-2016 Faltaba colocarlo en el Src
        Map parametro = new HashMap();
            
        parametro.put("parameter1", this.jLabel101.getText());
        
        JOptionPane.showMessageDialog(null, "el parametro capturado es:"+parametro);
        JasperPrint j= JasperFillManager.fillReport(jp, parametro, con);
        JasperViewer jv = new JasperViewer(j,false);
        JOptionPane.showMessageDialog(null, "voy antes de multiples seriales");
        jv.setTitle("Multiples Seriales");
        jv.setVisible(true);
        } catch (JRException e) {
        JOptionPane.showMessageDialog(null, "Error al mostrar (GenerarReporte) :  " +e);
        }
    
    }//GEN-LAST:event_jButton4ActionPerformed
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
            java.util.logging.Logger.getLogger(Impresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Impresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Impresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Impresion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Impresion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    private javax.swing.JButton jButton8;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel101;
    public static javax.swing.JLabel jLabel102;
    public static javax.swing.JLabel jLabel103;
    public static javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public static javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    public static javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    public static javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    public static javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    // End of variables declaration//GEN-END:variables

    
    private void ocultar(){
        jLabel2.setEnabled(false);
        jLabel101.setEnabled(false);
        jLabel6.setEnabled(false);
        jLabel102.setEnabled(false);
        jLabel5.setEnabled(false);
        jLabel103.setEnabled(false);
        jLabel18.setEnabled(false);
        jLabel104.setEnabled(false);
    }
    
    private void verificacion(){
        
            if(this.jLabel17.getText().equals(coud[contador])){
                JOptionPane.showMessageDialog(null, "El numero que hay en coud es:"+coud[contador]+"y el numero recogido es"+this.jLabel17.getText());
                JOptionPane.showMessageDialog(null, "El serial ya ha sido seleccionado");
            }else{
                JOptionPane.showMessageDialog(null, "El numero no se ha ingresado aun");
            }
    }
}




