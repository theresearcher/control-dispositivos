
import java.io.*;
import java.awt.print.*;
import java.awt.print.PageFormat.*;
import javax.swing.JOptionPane;

public class Imprimir{

    
    public static void main(String[] args) {
//        PrinterJob trabajo = PrinterJob.getPrinterJob();
//        trabajo.setPrintable(new Obj());
//        
//    if(trabajo.printDialog()){
//        try{
//            trabajo.print();
//        }
//        catch(PrinterException e){
//            JOptionPane.showMessageDialog(null,"el error es el siguiente"+e,"Informacion", JOptionPane.OK_OPTION);
//        }
//    }
    
    }
    
    
      public static void go(){
         PrinterJob trabajo = PrinterJob.getPrinterJob();
        trabajo.setPrintable(new ImagePrintable(trabajo, TestBarCode.bufferedImage));
    if(trabajo.printDialog()){
        try{
            trabajo.print();
            
        }
        catch(PrinterException e){
            JOptionPane.showMessageDialog(null,"el error es el siguiente"+e,"Informacion", JOptionPane.OK_OPTION);
        }
    }
    }
   
           public static void went(){
         PrinterJob trabajo = PrinterJob.getPrinterJob();
        
    if(trabajo.printDialog()){
        try{
            trabajo.print();
            
        }
        catch(PrinterException e){
            JOptionPane.showMessageDialog(null,"el error es el siguiente"+e,"Informacion", JOptionPane.OK_OPTION);
        }
    }
    }
}
