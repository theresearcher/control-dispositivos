
import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.Barcode;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.io.FileNotFoundException;
/**
 * @author usuario
 */
public class CodeBar {


 public static Image picture;   
 public static void main(String[] args) throws FileNotFoundException  {

  // Por defecto es A4
  Document documento = new Document();

  try {                                 
   // Obtenemos una instancia de un objeto PDFWriter
   PdfWriter pdfw1 = PdfWriter.getInstance(documento, new FileOutputStream("Example.pdf"));
   //Abro el documento
   documento.open();
   //Preparo las variables para utilizar la imagen
   Image img; 
   //Es el tipo de clase 
   Barcode128 code128 = new Barcode128();
   //Seteo el tipo de codigo
   code128.setCodeType(Barcode.CODE128);
   //Setep el codigo
   code128.setCode(ConfirmacionDisp.getSerial());
   //Paso el codigo a imagen
   img = code128.createImageWithBarcode( pdfw1.getDirectContent(), BaseColor.BLACK, BaseColor.RED);
   picture = img;
   //Agrego la imagen al documento
   documento.add(img); 
   documento.close();
  }catch (DocumentException ex) {
   // Atrapamos excepciones concernientes al documentoo.
  }
  
 }
 
 public static void barras() throws FileNotFoundException{
  Document documento = new Document();

  try {                                 
   // Obtenemos una instancia de un objeto PDFWriter
   PdfWriter pdfw = PdfWriter.getInstance(documento, new FileOutputStream("Example.pdf"));
   //Abro el documento
   documento.open();
   //Preparo las variables para utilizar la imagen
   Image img; 
   //Es el tipo de clase 
   Barcode128 code128 = new Barcode128();
   //Seteo el tipo de codigo
   code128.setCodeType(Barcode.CODE128);
   //Setep el codigo
   code128.setCode(ConfirmacionDisp.getSerial());
   //Paso el codigo a imagen
   img = code128.createImageWithBarcode( pdfw.getDirectContent(), BaseColor.BLACK, BaseColor.RED);
   //Agrego la imagen al documento
   documento.add(img); 
   documento.close();
  }catch (DocumentException ex) {
   // Atrapamos excepciones concernientes al documentoo.
  }   
 }
 

}