
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;




public class reportes {

private final String logotipo = "codebar.png"; 
//private final String logotipo = "c:/4ov6zw.png"; 
    
    
    
public void Imp_reporte(){    
JasperReport repor;
JasperPrint re;
      Map parametros = new HashMap();
        try{
            
//        JasperReport repor = (JasperReport) JRLoader.loadObject(this.class.getResource("seriales.jasper"));
        URL in = this.getClass().getResource("seriales.jasper");
        repor = (JasperReport)JRLoader.loadObject(in);
  
        //parametros.clear();
        parametros.put("logo",this.getClass().getResourceAsStream(logotipo));
        
        re = JasperFillManager.fillReport(repor, parametros, new JREmptyDataSource());
        JasperViewer.viewReport(re,false);
        }
        catch(JRException e)
        {
          System.out.println("error"+e);
        }   
        }



}
