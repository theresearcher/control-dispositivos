

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultasAdmin extends javax.swing.JFrame {
    
//constructor y variables publicas importantes para esta ventana    
 Conexion ctm = new Conexion();
    Connection con = ctm.conexion();
    
    public ConsultasAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logos/-Icono sena v3.png"))); // NOI18N

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        getContentPane().add(jcMousePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 90, 70));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, 450, 20));

        jLabel4.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADMINISTRADOR ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 170, 40));

        jLabel5.setFont(new java.awt.Font("Myriad Pro", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Softing");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra naranjado.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 90));

        jLabel7.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jLabel7.setText("Consultar por:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 130, 50));

        jComboBox1.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione...", "Nombre", "Ficha", "Serial", "Identificacion", "Nombre Vigilante", "Id Vigilantes", "Fecha Ingreso", "Fecha Salida" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 140, 40));

        jTextField1.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 160, 40));

        jButton2.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jButton2.setText("ATRAS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 660, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/-Barra Verde35% Azul 65%.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 650, 1400, 80));

        jButton1.setFont(new java.awt.Font("Myriad Pro", 0, 18)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 130, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.getTableHeader().setResizingAllowed(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 1240, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 130, 260, 20));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Temas/maxresdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 80, 1440, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
InicioAdmin ConsultasAdmin = new InicioAdmin();
this.setVisible(false);
ConsultasAdmin.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String combo2;

combo2 = this.jComboBox1.getSelectedItem().toString();

switch (combo2){
    //Este primer case es para consulta el nombre de un usuario del sistema
    case "Nombre":
       
String namead;
        String nombread[]= new String[11];
        DefaultTableModel modelad = new DefaultTableModel();
        modelad.addColumn("Nombre");
        modelad.addColumn("Apellido");
        modelad.addColumn("Identificacion");
        modelad.addColumn("Serial Dispositivo");
        modelad.addColumn("Tipo dispositivo");
        modelad.addColumn("Fecha Ingreso");
        modelad.addColumn("Fecha Salida");
        
        
        
        

        ConsultasAdmin.jTable2.setModel(modelad);
        namead = jTextField1.getText();
        try{
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select persona.nombre_persona,persona.apellido_persona,ingreso_dispositivo.id_persona_ing,dispositivo.serial_dispositivo,\n" +
"\n" +
"tipo_dispositivo.tipo_dispositivo,ingreso_dispositivo.Fecha_ingreso,ingreso_dispositivo.Fecha_salida \n" +
"from dispositivo inner join tipo_dispositivo \n" +
"on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo \n" +
"\n" +
"left join ingreso_dispositivo on dispositivo.Serial_dispositivo = ingreso_dispositivo.Serial_dispositivo \n" +
"\n" +
"inner join persona on persona.Id_persona_reg = ingreso_dispositivo.Id_persona_ing\n" +
" \n" +
"where persona.Nombre_persona = '"+namead+"' order by persona.nombre_persona;");
                while(resultado.next()){
                nombread[0] = resultado.getString("nombre_persona");
                nombread[1] = resultado.getString("apellido_persona");
                nombread[2] = resultado.getString("id_persona_ing");
                nombread[3] = resultado.getString("serial_dispositivo");
                nombread[4] = resultado.getString("tipo_dispositivo");
                nombread[5] = resultado.getString("fecha_ingreso");
                nombread[6] = resultado.getString("fecha_salida");
                modelad.addRow(nombread);
            }
            ConsultasAdmin.jTable2.setModel(modelad);
        }catch(Exception e){
            System.out.println(e.toString());
        };       
        
        if(jTextField1.getText().equals(""))
        {
            try{
//             Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select persona.nombre_persona,persona.apellido_persona,ingreso_dispositivo.id_persona_ing,dispositivo.serial_dispositivo,\n" +
"\n" +
"tipo_dispositivo.tipo_dispositivo,ingreso_dispositivo.Fecha_ingreso,ingreso_dispositivo.Fecha_salida \n" +
"from dispositivo inner join tipo_dispositivo \n" +
"on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo \n" +
"\n" +
"left join ingreso_dispositivo on dispositivo.Serial_dispositivo = ingreso_dispositivo.Serial_dispositivo \n" +
"\n" +
"inner join persona on persona.Id_persona_reg = ingreso_dispositivo.Id_persona_ing\n" +
" \n" +
"where persona.Nombre_persona = persona.Nombre_persona order by persona.nombre_persona;");
            
                while(resultado.next()){
                
                nombread[0] = resultado.getString("nombre_persona");
                nombread[1] = resultado.getString("apellido_persona");
                nombread[2] = resultado.getString("id_persona_ing");
                nombread[3] = resultado.getString("serial_dispositivo");
                nombread[4] = resultado.getString("tipo_dispositivo");
                nombread[5] = resultado.getString("fecha_ingreso");
                nombread[6] = resultado.getString("fecha_salida");
                
                modelad.addRow(nombread);
                
            }
            ConsultasVigilante.modificar.setModel(modelad);
        }catch(Exception e){
            System.out.println(e.toString());
        };
        }        
        break;

        
    //Aqui empieza el tercer case, este es para el numero telefonico de la persona    
    case "Ficha":
        String fich;
        String phone[]= new String[11];
        DefaultTableModel phonet = new DefaultTableModel();
        
        //phonet.addColumn("Apellido");
        phonet.addColumn("Ficha");
        phonet.addColumn("Nombre");
        phonet.addColumn("Apellido");
        phonet.addColumn("Serial dispositivo");
        phonet.addColumn("Marca dispositivo");
        phonet.addColumn("Tipo dispositivo");
        //phonet.addColumn("Id vigilante");
        phonet.addColumn("Fecha Ingreso");
        phonet.addColumn("Fecha salida");
        //phonet.addColumn("Fecha registro");

        

        ConsultasAdmin.jTable2.setModel(phonet);
         fich = jTextField1.getText();
        try{

//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select persona.ficha_persona,persona.nombre_persona,persona.apellido_persona,dispositivo.serial_dispositivo,\n" +
"\n" +
"dispositivo.marca_dispositivo,tipo_dispositivo.tipo_dispositivo,ingreso_dispositivo.Fecha_ingreso,ingreso_dispositivo.Fecha_salida \n" +
"from dispositivo \n" +
"inner join tipo_dispositivo \n" +
"on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo \n" +
"\n" +
"left join ingreso_dispositivo on dispositivo.Serial_dispositivo = ingreso_dispositivo.Serial_dispositivo\n" +
" \n" +
"inner join persona on persona.Id_persona_reg = ingreso_dispositivo.Id_persona_ing\n" +
" \n" +
"where persona.ficha_persona = "+fich+" order by persona.Ficha_persona;");
            while(resultado.next()){
            
                phone[0] = resultado.getString("ficha_persona");
                phone[1] = resultado.getString("nombre_persona");
                phone[2] = resultado.getString("apellido_persona");
                phone[3] = resultado.getString("serial_dispositivo");
                phone[4] = resultado.getString("marca_dispositivo");
                phone[5] = resultado.getString("tipo_dispositivo");
                phone[6] = resultado.getString("fecha_ingreso");
                phone[7] = resultado.getString("fecha_salida");
            
                phonet.addRow(phone);
            }
            ConsultasAdmin.jTable2.setModel(phonet);
        }catch(Exception e){
            System.out.println(e.toString());
        };
        if(jTextField1.getText().equals("")){
            try{

//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select persona.ficha_persona,persona.nombre_persona,persona.apellido_persona,dispositivo.serial_dispositivo,\n" +
"\n" +
"dispositivo.marca_dispositivo,tipo_dispositivo.tipo_dispositivo,ingreso_dispositivo.Fecha_ingreso,ingreso_dispositivo.Fecha_salida \n" +
"from dispositivo \n" +
"inner join tipo_dispositivo \n" +
"on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo \n" +
"\n" +
"left join ingreso_dispositivo on dispositivo.Serial_dispositivo = ingreso_dispositivo.Serial_dispositivo\n" +
" \n" +
"inner join persona on persona.Id_persona_reg = ingreso_dispositivo.Id_persona_ing\n" +
" \n" +
"where persona.ficha_persona = persona.Ficha_persona order by persona.Ficha_persona;");            
            while(resultado.next()){
                
                phone[0] = resultado.getString("ficha_persona");
                phone[1] = resultado.getString("nombre_persona");
                phone[2] = resultado.getString("apellido_persona");
                phone[3] = resultado.getString("serial_dispositivo");
                phone[4] = resultado.getString("marca_dispositivo");
                phone[5] = resultado.getString("tipo_dispositivo");
                phone[6] = resultado.getString("fecha_ingreso");
                phone[7] = resultado.getString("fecha_salida");    
                phonet.addRow(phone);
            }
            ConsultasAdmin.jTable2.setModel(phonet);
        }catch(Exception e){
            System.out.println(e.toString());
        };
        }
        break;
        
        
        
        
    //Aqui arranca el cuarto case, este es para la identificacion    
    case "Identificacion":
          String datoid;
        String identi[]= new String[11];
        DefaultTableModel idtable = new DefaultTableModel();
                
        idtable.addColumn("Identificacion");
        idtable.addColumn("Nombre");
        idtable.addColumn("Apellido");
        idtable.addColumn("Serial dispositivo");
        idtable.addColumn("Tipo dispositivo");
        idtable.addColumn("Fecha Ingreso");
        idtable.addColumn("Fecha salida");
       

        ConsultasAdmin.jTable2.setModel(idtable);
         datoid = jTextField1.getText();
        try{

//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select ingreso_dispositivo.id_persona_ing,persona.nombre_persona,persona.apellido_persona,dispositivo.serial_dispositivo,\n" +
"\n" +
"tipo_dispositivo.tipo_dispositivo,ingreso_dispositivo.Fecha_ingreso,ingreso_dispositivo.Fecha_salida \n" +
"\n" +
"from dispositivo inner join tipo_dispositivo \n" +
"on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo \n" +
"\n" +
"left join ingreso_dispositivo on dispositivo.Serial_dispositivo = ingreso_dispositivo.Serial_dispositivo\n" +
" \n" +
"inner join persona on persona.Id_persona_reg = ingreso_dispositivo.Id_persona_ing\n" +
" \n" +
"where ingreso_dispositivo.id_persona_ing = "+datoid+" order by ingreso_dispositivo.Id_persona_ing;");
            while(resultado.next()){
                identi[0] = resultado.getString("id_persona_ing");
                identi[1] = resultado.getString("nombre_persona");
                identi[2] = resultado.getString("apellido_persona");
                identi[3] = resultado.getString("serial_dispositivo");
                identi[4] = resultado.getString("tipo_dispositivo");
                identi[5] = resultado.getString("Fecha_ingreso");
                identi[6] = resultado.getString("Fecha_salida");

                idtable.addRow(identi);
            }
            ConsultasAdmin.jTable2.setModel(idtable);
        }catch(Exception e){
            System.out.println(e.toString());
        };
        if(jTextField1.getText().equals("")){
             try{

//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select ingreso_dispositivo.id_persona_ing,persona.nombre_persona,persona.apellido_persona,dispositivo.serial_dispositivo,\n" +
"\n" +
"tipo_dispositivo.tipo_dispositivo,ingreso_dispositivo.Fecha_ingreso,ingreso_dispositivo.Fecha_salida \n" +
"\n" +
"from dispositivo inner join tipo_dispositivo \n" +
"on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo \n" +
"\n" +
"left join ingreso_dispositivo on dispositivo.Serial_dispositivo = ingreso_dispositivo.Serial_dispositivo\n" +
" \n" +
"inner join persona on persona.Id_persona_reg = ingreso_dispositivo.Id_persona_ing\n" +
" \n" +
"where ingreso_dispositivo.id_persona_ing = ingreso_dispositivo.Id_persona_ing order by ingreso_dispositivo.Id_persona_ing;");
            while(resultado.next()){
                identi[0] = resultado.getString("id_persona_ing");
                identi[1] = resultado.getString("nombre_persona");
                identi[2] = resultado.getString("apellido_persona");
                identi[3] = resultado.getString("serial_dispositivo");
                identi[4] = resultado.getString("tipo_dispositivo");
                identi[5] = resultado.getString("fecha_ingreso");
                identi[6] = resultado.getString("fecha_salida");
                
                idtable.addRow(identi);
            }
            ConsultasAdmin.jTable2.setModel(idtable);
        }catch(Exception e){
            System.out.println(e.toString());
        };
        }
        break;
    
        
     
       
    case "Serial":  
       
        String ser;
        String coder[]= new String[11];
        DefaultTableModel modser = new DefaultTableModel();
              
        modser.addColumn("Serial dispositivo");
        modser.addColumn("Marca dispositivo");
        modser.addColumn("Id persona registro");
        modser.addColumn("Nombre persona");
        modser.addColumn("Apellido persona");
        modser.addColumn("Tipo dispositivo");
        modser.addColumn("Fecha Ingreso");
        modser.addColumn("Fecha salida");

        ConsultasAdmin.jTable2.setModel(modser);
        ser = jTextField1.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select dispositivo.serial_dispositivo,dispositivo.Marca_dispositivo,ingreso_dispositivo.id_persona_ing,\n" +
"persona.nombre_persona,\n" +
"persona.apellido_persona,\n" +
"tipo_dispositivo.tipo_dispositivo,ingreso_dispositivo.Fecha_ingreso,ingreso_dispositivo.Fecha_salida\n" +
"\n" +
"from dispositivo \n" +
"inner join tipo_dispositivo \n" +
"on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo \n" +
"\n" +
"left join ingreso_dispositivo on dispositivo.Serial_dispositivo = ingreso_dispositivo.Serial_dispositivo\n" +
" \n" +
"inner join persona on persona.Id_persona_reg = ingreso_dispositivo.Id_persona_ing\n" +
"\n" +
"where dispositivo.serial_dispositivo = '"+ser+"' order by dispositivo.serial_dispositivo");
            while(resultado.next()){

                coder[0] = resultado.getString("Serial_dispositivo");
                coder[1] = resultado.getString("marca_dispositivo");
                coder[2] = resultado.getString("id_persona_ing");
                coder[3] = resultado.getString("nombre_persona");
                coder[4] = resultado.getString("apellido_persona");
                coder[5] = resultado.getString("tipo_dispositivo");        
                coder[6] = resultado.getString("fecha_ingreso");        
                coder[7] = resultado.getString("fecha_salida");        
                modser.addRow(coder);
            }
            ConsultasAdmin.jTable2.setModel(modser);
        }catch(Exception e){
            System.out.println(e.toString());
        };
        if(jTextField1.getText().equals("")){
          try{

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select dispositivo.serial_dispositivo,dispositivo.Marca_dispositivo,ingreso_dispositivo.id_persona_ing,\n" +
"persona.nombre_persona,\n" +
"persona.apellido_persona,\n" +
"tipo_dispositivo.tipo_dispositivo,ingreso_dispositivo.Fecha_ingreso,ingreso_dispositivo.Fecha_salida\n" +
"\n" +
"from dispositivo \n" +
"inner join tipo_dispositivo \n" +
"on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo \n" +
"\n" +
"left join ingreso_dispositivo on dispositivo.Serial_dispositivo = ingreso_dispositivo.Serial_dispositivo\n" +
" \n" +
"inner join persona on persona.Id_persona_reg = ingreso_dispositivo.Id_persona_ing\n" +
"\n" +
"where dispositivo.serial_dispositivo = dispositivo.Serial_dispositivo order by dispositivo.serial_dispositivo");
            while(resultado.next()){
                coder[0] = resultado.getString("serial_dispositivo");
                coder[1] = resultado.getString("Marca_dispositivo");
                coder[2] = resultado.getString("id_persona_ing");        
                coder[3] = resultado.getString("nombre_persona");
                coder[4] = resultado.getString("apellido_persona");        
                coder[5] = resultado.getString("tipo_dispositivo");        
                coder[6] = resultado.getString("fecha_ingreso");        
                coder[7] = resultado.getString("fecha_salida");
                modser.addRow(coder);
            }
            ConsultasAdmin.jTable2.setModel(modser);
        }catch(Exception e){
            System.out.println(e.toString());
        };  
        }
        break;
        
//        
//        
//        Aqui arranca el sexto case
//    case "Serial Dispositivo":
//        String serialdisp;
//        String sdisp[]= new String[11];
//        DefaultTableModel serial = new DefaultTableModel();
//                
//        serial.addColumn("Serial dispositivo");
//        serial.addColumn("Modelo dispositivo");
//        serial.addColumn("Fecha Ingreso");
//        serial.addColumn("Fecha salida");
//
//        ConsultasAdmin.jTable2.setModel(serial);
//         serialdisp = jTextField1.getText();
//        try{
//
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
//            java.sql.Statement estado = con.createStatement();
//            ResultSet resultado = estado.executeQuery("select dispositivo.Serial_dispositivo,Modelo_dispositivo,ingreso_dispositivo.fecha_ingreso,ingreso_dispositivo.fecha_salida from dispositivo inner join persona on persona.Id_persona_reg = dispositivo.Id_persona_reg left join ingreso_dispositivo on ingreso_dispositivo.Serial_dispositivo = dispositivo.Serial_dispositivo where dispositivo.Serial_dispositivo = '"+serialdisp+"'order by dispositivo.Serial_dispositivo asc");
//            while(resultado.next()){
//                sdisp[0] = resultado.getString("Serial_dispositivo");
//                sdisp[1] = resultado.getString("Modelo_dispositivo");
//                sdisp[2] = resultado.getString("fecha_ingreso");
//                sdisp[3] = resultado.getString("fecha_salida");
//                serial.addRow(sdisp);
//            }
//            ConsultasAdmin.jTable2.setModel(serial);
//        }catch(Exception e){
//            System.out.println(e.toString());
//        };
//        if(jTextField1.getText().equals("")){
//         try{
//
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
//            java.sql.Statement estado = con.createStatement();
//            ResultSet resultado = estado.executeQuery("select dispositivo.Serial_dispositivo,Modelo_dispositivo,ingreso_dispositivo.fecha_ingreso,ingreso_dispositivo.fecha_salida from dispositivo inner join persona on persona.Id_persona_reg = dispositivo.Id_persona_reg left join ingreso_dispositivo on ingreso_dispositivo.Serial_dispositivo = dispositivo.Serial_dispositivo order by dispositivo.Serial_dispositivo asc");
//            while(resultado.next()){
//                sdisp[0] = resultado.getString("Serial_dispositivo");
//                sdisp[1] = resultado.getString("Modelo_dispositivo");
//                sdisp[2] = resultado.getString("fecha_ingreso");
//                sdisp[3] = resultado.getString("fecha_salida");
//                serial.addRow(sdisp);
//            }
//            ConsultasAdmin.jTable2.setModel(serial);
//        }catch(Exception e){
//            System.out.println(e.toString());
//        };   
//        }
//        
//        break;
//        
//    Aqui arranca el septimo case    
//    case "Modelo Dispositivo":
//     
//      String modeldisp;
//        String modisp[]= new String[11];
//        DefaultTableModel mode = new DefaultTableModel();
//        mode.addColumn("Modelo dispositivo");
//        mode.addColumn("Serial dispositivo");
//        mode.addColumn("Fecha Ingreso");
//        mode.addColumn("Fecha salida");
//
//        ConsultasAdmin.jTable2.setModel(mode);
//         modeldisp = jTextField1.getText();
//        try{
//
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
//            java.sql.Statement estado = con.createStatement();
//            ResultSet resultado = estado.executeQuery("select Modelo_dispositivo,dispositivo.Serial_dispositivo,ingreso_dispositivo.fecha_ingreso,ingreso_dispositivo.fecha_salida from dispositivo inner join persona on persona.Id_persona_reg = dispositivo.Id_persona_reg left join ingreso_dispositivo on ingreso_dispositivo.Serial_dispositivo = dispositivo.Serial_dispositivo where Modelo_dispositivo = '"+modeldisp+"' order by Modelo_dispositivo asc");
//            while(resultado.next()){
//                 modisp[0] = resultado.getString("Modelo_dispositivo");
//                 modisp[1] = resultado.getString("Serial_dispositivo");
//                 modisp[2] = resultado.getString("fecha_ingreso");
//                 modisp[3] = resultado.getString("fecha_salida");
//
//                mode.addRow(modisp);
//            }
//            ConsultasAdmin.jTable2.setModel(mode);
//        }catch(Exception e){
//            System.out.println(e.toString());
//        };
//        if(jTextField1.getText().equals("")){
//          try{
//
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
//            java.sql.Statement estado = con.createStatement();
//            ResultSet resultado = estado.executeQuery("select Modelo_dispositivo,dispositivo.Serial_dispositivo,ingreso_dispositivo.fecha_ingreso,ingreso_dispositivo.fecha_salida from dispositivo inner join persona on persona.Id_persona_reg = dispositivo.Id_persona_reg left join ingreso_dispositivo on ingreso_dispositivo.Serial_dispositivo = dispositivo.Serial_dispositivo order by Modelo_dispositivo asc");
//            while(resultado.next()){
//                modisp[0] = resultado.getString("Modelo_dispositivo");
//                modisp[1] = resultado.getString("Serial_dispositivo");
//                modisp[2] = resultado.getString("fecha_ingreso");
//                modisp[3] = resultado.getString("fecha_salida");
//                mode.addRow(modisp);
//            }
//            ConsultasAdmin.jTable2.setModel(mode);
//        }catch(Exception e){
//            System.out.println(e.toString());
//        };   
//        }
//      break;
//        
//FIN ZONA FUERA DE USO      
    case "Nombre Vigilante":
        String namev;
        String nombrevi[]= new String[7];
        // clave=new Blob();
        DefaultTableModel vigin = new DefaultTableModel();
        vigin.addColumn("Id Vigilante");
        vigin.addColumn("Nombre Vigilante");
        vigin.addColumn("Apellido Vigilante");
        //vigin.addColumn("Id turno");
        //vigin.addColumn("Contraseña");
        vigin.addColumn("Usuario");
        vigin.addColumn("Tipo usuario");
        

        ConsultasAdmin.jTable2.setModel(vigin);
        namev = jTextField1.getText();
        try{
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select * from vigilante where Nombre_vigilante like  '"+namev+"'");
                while(resultado.next()){
                nombrevi[0] = resultado.getString("Id_vigilante");
                nombrevi[1] = resultado.getString("Nombre_vigilante");
                nombrevi[2] = resultado.getString("Apellido_vigilante");
                //nombrevi[3] = resultado.getString("Id_turno");
                //nombrevi[4] = resultado.getString("Contraseña");
                //nombrevi[4] = resultado.getNString("Contraseña");
//esta guama no funciona porque el tipo de dato BLOB no puede ser convertido a string
                nombrevi[3] = resultado.getString("Usuario");
                nombrevi[4] = resultado.getString("Tipo_usuario");
                vigin.addRow(nombrevi);
            }
            ConsultasAdmin.jTable2.setModel(vigin);
        }catch(Exception e){
            System.out.println(e.toString());
        };
         if(jTextField1.getText().equals("")){
          try{

//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select * from vigilante");
            while(resultado.next()){
                nombrevi[0] = resultado.getString("Id_vigilante");
                nombrevi[1] = resultado.getString("Nombre_vigilante");
                nombrevi[2] = resultado.getString("Apellido_vigilante");
                nombrevi[3] = resultado.getString("Usuario");
                nombrevi[4] = resultado.getString("Tipo_usuario");
                vigin.addRow(nombrevi);
            }
            ConsultasAdmin.jTable2.setModel(vigin);
        }catch(Exception e){
            System.out.println(e.toString());
        };   
        }
        break;
       
    //inicio caso vigilante    
    case "Id Vigilantes":
        String idvigi;
        String idv[]= new String[7];
        DefaultTableModel id = new DefaultTableModel();
        
        id.addColumn("Id Vigilante");
        id.addColumn("Nombre Vigilante");
        id.addColumn("Apellido Vigilante");
        //id.addColumn("Id turno");
        //id.addColumn("Contraseña");
        id.addColumn("Usuario");
        id.addColumn("Tipo usuario");
        

        ConsultasAdmin.jTable2.setModel(id);
        idvigi = jTextField1.getText();
        try{
//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select * from vigilante where Id_vigilante like  '"+idvigi+"'");
                while(resultado.next()){
                idv[0] = resultado.getString("Id_vigilante");
                idv[1] = resultado.getString("Nombre_vigilante");
                idv[2] = resultado.getString("Apellido_vigilante");
                //idv[3] = resultado.getString("Id_turno");
                //idv[4] = resultado.getString("Contraseña");
                idv[3] = resultado.getString("Usuario");
                idv[4] = resultado.getString("Tipo_usuario");
                id.addRow(idv);
            }
            ConsultasAdmin.jTable2.setModel(id);
        }catch(Exception e){
            System.out.println(e.toString());
        };    
         if(jTextField1.getText().equals("")){
          try{

//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select * from vigilante");
            while(resultado.next()){
                idv[0] = resultado.getString("Id_vigilante");
                idv[1] = resultado.getString("Nombre_vigilante");
                idv[2] = resultado.getString("Apellido_vigilante");
                idv[3] = resultado.getString("Usuario");
                idv[4] = resultado.getString("Tipo_usuario");
            }
            ConsultasAdmin.jTable2.setModel(id);
        }catch(Exception e){
            System.out.println(e.toString());
        };   
        }
        break;
        
        //IMPORTANTE
        //MUY IMPORTANTE
        //aqui empiezan los casos de las fechas tanto de entrada como de salida.
         case "Fecha Ingreso":
        String fec;
        String fe[]= new String[11];
        DefaultTableModel fecha = new DefaultTableModel();
                
        fecha.addColumn("Identificacion");
        fecha.addColumn("Nombre");
        fecha.addColumn("Apellido");
        fecha.addColumn("Serial dispositivo");
        fecha.addColumn("Tipo dispositivo");
        fecha.addColumn("Fecha Ingreso");
        fecha.addColumn("Fecha salida");
        

        ConsultasAdmin.jTable2.setModel(fecha);
         fec = jTextField1.getText();
        try{

//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select ingreso_dispositivo.id_persona_ing,persona.nombre_persona,persona.apellido_persona,\n" +
"dispositivo.serial_dispositivo,\n" +
"tipo_dispositivo.tipo_dispositivo,ingreso_dispositivo.Fecha_ingreso,\n" +
"ingreso_dispositivo.Fecha_salida \n" +
"from dispositivo \n" +
"inner join tipo_dispositivo \n" +
"on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo \n" +
"\n" +
"left join ingreso_dispositivo on dispositivo.Serial_dispositivo = ingreso_dispositivo.Serial_dispositivo \n" +
"\n" +
"inner join persona on persona.Id_persona_reg = ingreso_dispositivo.Id_persona_ing \n" +
"where\n" +
" ingreso_dispositivo.Fecha_ingreso like '%"+fec+"%'\n" +
"order by ingreso_dispositivo.Fecha_ingreso asc");
            while(resultado.next()){
                fe[0] = resultado.getString("id_persona_ing");
                fe[1] = resultado.getString("nombre_persona");
                fe[2] = resultado.getString("apellido_persona");
                fe[3] = resultado.getString("serial_dispositivo");
                fe[4] = resultado.getString("tipo_dispositivo");
                fe[5] = resultado.getString("fecha_ingreso");
                fe[6] = resultado.getString("fecha_salida");
                fecha.addRow(fe);
            }
            ConsultasAdmin.jTable2.setModel(fecha);
        }catch(Exception e){
            System.out.println(e.toString());
        };
        if(jTextField1.getText().equals("")){
             try{

//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select ingreso_dispositivo.id_persona_ing,persona.nombre_persona,persona.apellido_persona,\n" +
"dispositivo.serial_dispositivo,\n" +
"tipo_dispositivo.tipo_dispositivo,ingreso_dispositivo.Fecha_ingreso,\n" +
"ingreso_dispositivo.Fecha_salida \n" +
"from dispositivo \n" +
"inner join tipo_dispositivo \n" +
"on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo \n" +
"\n" +
"left join ingreso_dispositivo on dispositivo.Serial_dispositivo = ingreso_dispositivo.Serial_dispositivo \n" +
"\n" +
"inner join persona on persona.Id_persona_reg = ingreso_dispositivo.Id_persona_ing \n" +
"where\n" +
" ingreso_dispositivo.Fecha_ingreso like ingreso_dispositivo.Fecha_ingreso\n" +
"order by ingreso_dispositivo.Fecha_ingreso asc");
            while(resultado.next()){
                fe[0] = resultado.getString("id_persona_ing");
                fe[1] = resultado.getString("nombre_persona");
                fe[2] = resultado.getString("apellido_persona");
                fe[3] = resultado.getString("serial_dispositivo");
                fe[4] = resultado.getString("tipo_dispositivo");
                fe[5] = resultado.getString("fecha_ingreso");
                fe[6] = resultado.getString("fecha_salida");
                
                fecha.addRow(fe);
            }
            ConsultasAdmin.jTable2.setModel(fecha);
        }catch(Exception e){
            System.out.println(e.toString());
        };
        }
        break;
        
        
        //CASO DE FECHA DE SALIDA
          case "Fecha Salida":
        String fecs;
        String fes[]= new String[11];
        DefaultTableModel fechas = new DefaultTableModel();
        
                
        fechas.addColumn("Identificacion");
        fechas.addColumn("Nombre");
        fechas.addColumn("Apellido");
        fechas.addColumn("Serial dispositivo");
        fechas.addColumn("Marca dispositivo");
        fechas.addColumn("Tipo dispositivo");
        fechas.addColumn("Fecha Ingreso");
        fechas.addColumn("Fecha salida");
        
        

        ConsultasAdmin.jTable2.setModel(fechas);
         fecs = jTextField1.getText();
        try{

//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select ingreso_dispositivo.id_persona_ing,persona.nombre_persona,persona.apellido_persona,\n" +
"\n" +
"dispositivo.serial_dispositivo,dispositivo.marca_dispositivo,tipo_dispositivo.tipo_dispositivo,ingreso_dispositivo.Fecha_ingreso,\n" +
"\n" +
"ingreso_dispositivo.Fecha_salida \n" +
"from dispositivo inner join tipo_dispositivo \n" +
"\n" +
"on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo \n" +
"\n" +
"left join ingreso_dispositivo on dispositivo.Serial_dispositivo = ingreso_dispositivo.Serial_dispositivo \n" +
"\n" +
"inner join persona on persona.Id_persona_reg = ingreso_dispositivo.Id_persona_ing \n" +
"where\n" +
" ingreso_dispositivo.Fecha_salida like '%"+fecs+"%'\n" +
"order by ingreso_dispositivo.Fecha_salida asc");
            while(resultado.next()){
                fes[0] = resultado.getString("id_persona_ing");
                fes[1] = resultado.getString("nombre_persona");
                fes[2] = resultado.getString("apellido_persona");
                fes[3] = resultado.getString("Serial_dispositivo");
                fes[4] = resultado.getString("Marca_dispositivo");
                fes[5] = resultado.getString("tipo_dispositivo");
                fes[6] = resultado.getString("fecha_ingreso");
                fes[7] = resultado.getString("fecha_salida");
                fechas.addRow(fes);
            }
            ConsultasAdmin.jTable2.setModel(fechas);
        }catch(Exception e){
            System.out.println(e.toString());
        };
        if(jTextField1.getText().equals("")){
             try{

//            Class.forName("com.mysql.jdbc.Driver").newInstance();
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/soft","root","");
            java.sql.Statement estado = con.createStatement();
            ResultSet resultado = estado.executeQuery("select ingreso_dispositivo.id_persona_ing,persona.nombre_persona,persona.apellido_persona,\n" +
"\n" +
"dispositivo.serial_dispositivo,dispositivo.marca_dispositivo,tipo_dispositivo.tipo_dispositivo,ingreso_dispositivo.Fecha_ingreso,\n" +
"\n" +
"ingreso_dispositivo.Fecha_salida \n" +
"from dispositivo inner join tipo_dispositivo \n" +
"\n" +
"on dispositivo.Id_tipo_dispositivo = tipo_dispositivo.Id_tipo_dispositivo \n" +
"\n" +
"left join ingreso_dispositivo on dispositivo.Serial_dispositivo = ingreso_dispositivo.Serial_dispositivo \n" +
"\n" +
"inner join persona on persona.Id_persona_reg = ingreso_dispositivo.Id_persona_ing \n" +
"where\n" +
" ingreso_dispositivo.Fecha_salida like ingreso_dispositivo.Fecha_salida\n" +
"order by ingreso_dispositivo.Fecha_salida asc");
            while(resultado.next()){
                fes[0] = resultado.getString("id_persona_ing");
                fes[1] = resultado.getString("nombre_persona");
                fes[2] = resultado.getString("apellido_persona");
                fes[3] = resultado.getString("serial_dispositivo");
                fes[4] = resultado.getString("marca_dispositivo");
                fes[5] = resultado.getString("tipo_dispositivo");
                fes[6] = resultado.getString("fecha_ingreso");
                fes[7] = resultado.getString("fecha_salida");
                
                fechas.addRow(fes);
            }
            ConsultasAdmin.jTable2.setModel(fechas);
        }catch(Exception e){
            System.out.println(e.toString());
        };
        }
        break;
        
        
}
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
String combo2;

combo2 = this.jComboBox1.getSelectedItem().toString();

        switch(combo2){
        
            case "Seleccione...":
        this.jLabel6.setText("");
        this.jLabel8.setText("");
        this.jTextField1.setText("");
        jTable2.setModel(new DefaultTableModel());
        break;     
            
        case "Nombre":
        this.jLabel6.setText("");
        this.jLabel8.setText("");
        this.jTextField1.setText("");
        jTable2.setModel(new DefaultTableModel());
        break;    
        
        case "Ficha":
        this.jLabel6.setText("");
        this.jLabel8.setText("");
        this.jTextField1.setText("");
        jTable2.setModel(new DefaultTableModel());
        break;
        
        case "Identificacion":
        this.jLabel6.setText("");
        this.jLabel8.setText("");
        this.jTextField1.setText("");
        jTable2.setModel(new DefaultTableModel());
        break;
        
        case "Serial Dispositivo":
        this.jLabel6.setText("");
        this.jLabel8.setText("");
        this.jTextField1.setText("");
        jTable2.setModel(new DefaultTableModel());
        break;
        
        case "Nombre Vigilantes":
        this.jLabel6.setText("");
        this.jLabel8.setText("");
        this.jTextField1.setText("");
        jTable2.setModel(new DefaultTableModel());
        break;
        
        case "Id Vigilantes":
        this.jLabel6.setText("");
        this.jLabel8.setText("");
        this.jTextField1.setText("");
        jTable2.setModel(new DefaultTableModel());
        break;
            
        case "Fecha Ingreso":
        this.jLabel6.setText("Para este tipo de consulta, se debe utilizar \n el formato Año-Mes-Dia");
        this.jLabel8.setText("Un ejemplo seria:2010-12-24");
        this.jTextField1.setText("");
        jTable2.setModel(new DefaultTableModel());
        break;
    
        case "Fecha Salida":
        this.jLabel6.setText("Para este tipo de consulta, se debe utilizar \n el formato Año-Mes-Dia");
        this.jLabel8.setText("Un ejemplo seria:2010-12-24");
        this.jTextField1.setText("");
        jTable2.setModel(new DefaultTableModel());
        break;
}
    }//GEN-LAST:event_jComboBox1ItemStateChanged

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
            java.util.logging.Logger.getLogger(ConsultasAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultasAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultasAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultasAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultasAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    // End of variables declaration//GEN-END:variables
}



