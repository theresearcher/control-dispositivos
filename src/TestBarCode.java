
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import net.sourceforge.jbarcodebean.BarcodeException;
import net.sourceforge.jbarcodebean.JBarcodeBean;
import net.sourceforge.jbarcodebean.model.Code128;

public class TestBarCode {
    
   public static Image picbarra;
   public static BufferedImage bufferedImage;

    public static void main(String[] args) throws IOException, BarcodeException {
//
//        JBarcodeBean barcode = new JBarcodeBean();
//
//        // nuestro tipo de codigo de barra
//        barcode.setCodeType(new Code128());
//        //barcode.setCodeType(new Code39());
//
//        // nuestro valor a codificar y algunas configuraciones mas
//        barcode.setCode(RegistrarDispoVigilante.jTextField9.getText());
//        barcode.setCheckDigit(true);
//
//        bufferedImage = barcode.draw(new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB));
//        picbarra = bufferedImage;
//        Imprimir.go();
//        
//        // guardar en disco como png
//        File file = new File("codebar.png");
//        ImageIO.write(bufferedImage, "png", file);

    }
    
    public static void barras() throws IOException{
        JBarcodeBean barcode = new JBarcodeBean();

        // nuestro tipo de codigo de barra
        barcode.setCodeType(new Code128());
        //barcode.setCodeType(new Code39());

        // nuestro valor a codificar y algunas configuraciones mas
        barcode.setCode(RegistrarDispoVigilante.jTextField9.getText());
        barcode.setCheckDigit(true);

        bufferedImage = barcode.draw(new BufferedImage(200, 150, BufferedImage.TYPE_INT_RGB));
        picbarra = bufferedImage;
        Imprimir.go();
        
        // guardar en disco como png
        File file = new File("C:\\Users\\Axess\\Desktop\\Nuevo\\"+Impresion.jLabel101.getText()+".png");
        ImageIO.write(bufferedImage, "png", file);

    }
    
     public static void creaCarpeta(){
        File directorio = new File("C:\\Users\\Axess\\Desktop\\Nuevo\\");
        directorio.mkdirs();
    }

}