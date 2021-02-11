
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Axess
 */
public class Conexion {
    String rol = "";   
Connection con = null;
String cargo = "";
String contraseña = "Porteria_S3N4"; //ESTO ES LO UNICO QUE TIENEN QUE CAMBIAR
String user = "root";
        


public Connection conexion(){
      try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/soft",user,contraseña);
       //JOptionPane.showMessageDialog(null,"se ha conectado");
      }catch (ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,"A OCURRIDO UN INCONVENIENTE CON LA CONEXION"+e);
      }
       return con;
  }
    
  
    public void getCargo(String boxCargo){
        cargo = boxCargo;
    }
    
    
    
    
    
    
}
