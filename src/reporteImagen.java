
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

/**
 *
 * @author Axess
 */
public class reporteImagen {
    
    private final String logotipo ="C:\\4ov6zw";

public void ver_Reporte()
{
    JasperReport repor;
    JasperPrint re;
    
    try
    {   //JasperReport jp = (JasperReport) JRLoader.loadObject(GenerarReporte.class.getResource("UsuarioReporteEdit.jasper"));
        URL in = this.getClass().getResource("C:\\Users\\Axess\\Google Drive\\Porteria mod\\src\\seriales.jasper");
        repor = (JasperReport)JRLoader.loadObject(in);
        
        Map parametros = new HashMap();
        parametros.clear();
        parametros.put("logo", this.getClass().getResourceAsStream(logotipo));
        
        re = JasperFillManager.fillReport(repor, parametros, new JREmptyDataSource());
        
        JasperViewer.viewReport(re, false);
        
    }catch(JRException e)
    {
      System.out.println(e);  
    }
    
    
    
    
    
}

    
}
