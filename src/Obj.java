import java.awt.*;
import java.awt.print.*;
import java.io.File;


public class Obj implements Printable {
     Font fuente = new Font("Code 128", Font.PLAIN,100);
    public static String llegaron = ConfirmacionDisp.getSerial();
    //public static Image receptor = CodeBar.picture;   
    
    
    public int print(Graphics g, PageFormat f, int pageIndex){
        if(pageIndex==0){
            g.setFont(fuente);
            g.drawString(llegaron, 100, 200);
            return PAGE_EXISTS;
        }else{
         return NO_SUCH_PAGE;   
        }
    }   
}
