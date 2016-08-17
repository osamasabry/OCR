/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessFile;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import javax.imageio.ImageIO;
import com.itextpdf.text.pdf.PRStream;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfObject;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfImageObject;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
//import com.aspose.pdf.*;

/**
 *
 * @author osama
 */
public class PDFManager {
    
   
   private PDFParser parser;
   private PDFTextStripper pdfStripper;
   private PDDocument pdDoc ;
   private COSDocument cosDoc ;
   private String Text ;
   private String filePath;
   private File file;

    public PDFManager() {
        
    }
   public  Map<String, String> ToText() throws IOException
   {
       this.pdfStripper = null;
       this.pdDoc = null;
       this.cosDoc = null;
       
       file = new File(filePath);
       parser = new PDFParser(new RandomAccessFile(file,"r")); // update for PDFBox V 2.0
       
       parser.parse();
       cosDoc = parser.getDocument();
       pdfStripper = new PDFTextStripper();
       pdDoc = new PDDocument(cosDoc);
       pdDoc.getNumberOfPages();             
       // if you want to get text from full pdf file use this code
//       pdfStripper.setEndPage(pdDoc.getNumberOfPages());
       
// if you want specific number of pages
       pdfStripper.setStartPage(1);
       pdfStripper.setEndPage(1);     
       Text = pdfStripper.getText(pdDoc);
       System.out.println(Text);
       // spilt 
       
       String[] result = Text.split("\n");
                       
                        Map<String, String> map = new HashMap<String, String>();          
                        for (int j = 0; j < result.length; j++)
                        {
                            
                             if (result[j].contains("Type"))
                            {
                                
                                String x = result[j].substring(5);
                                map.put("Type", x);
                            }
                            else if (result[j].contains("Document Number"))
                            {

                                String x = result[j].substring(16);
                                 map.put("Document Number", x);
                            }
                            else if (result[j].contains("Date of Birth"))
                            {
                               
                                String x = result[j].substring(14);
                                 map.put("Date of Birth",x);
                            }
                            else if (result[j].contains("Date of Expiry"))
                            {
                             
                                String x = result[j].substring(15);
                                 map.put("Date of Expiry", x);
                            }
                            else if (result[j].contains("Issuer"))
                            {
                            
                                String x = result[j].substring(7);
                                 map.put("Issuer", x);
                            }
                            else if (result[j].contains("Nationality"))
                            {
                                
                                String x = result[j].substring(12);
                                 map.put("Nationality" , x);
                            }
                            else if (result[j].contains("First Names"))
                            {
                             
                                String x = result[j].substring(12);
                                 map.put("First Names",x);
                            }
                            else if (result[j].contains("Last Names"))
                            {
                            
                                String x = result[j].substring(11);
                                 map.put("Last Names", x);
                            }
                            else if (result[j].contains("Discretionary 1"))
                            {
                               
                                String x = result[j].substring(16);
                                 map.put("Discretionary 1", x);
                            }
//                            else if (result[j].contains("Discretionary 2"))
//                            {
//                               
//                                String x = result[j].substring(16);
//                                map.put("Discretionary 2", x);
//                                
//                            }
                            else if (result[j].contains("Gender"))
                            {
                                
                                String x = result[j].substring(7);
                                map.put("Gender",x);
                            }
                        }
        
       return map;
   }
   
   

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
    
   
   
    
}
