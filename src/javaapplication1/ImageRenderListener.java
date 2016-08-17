/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.pdf.parser.ImageRenderInfo;
import com.itextpdf.text.pdf.parser.PdfImageObject;
import com.itextpdf.text.pdf.parser.RenderListener;
import com.itextpdf.text.pdf.parser.TextRenderInfo;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
//import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author osama
 */

/**
 * Saves images to a directory.
 *
 * @author mnguyen
 */
public class ImageRenderListener implements RenderListener {
    
    protected byte[] img ; // Added this

    /**
     * The directory path to store images.
     */
    protected String path;

    /**
     * Creates a RenderListener that will look for images.
     */
    public ImageRenderListener() {
//        this.path = path;
    }

    /**
     * @see com.itextpdf.text.pdf.parser.RenderListener#beginTextBlock()
     */
    @Override
    public void beginTextBlock() {
    }

    /**
     * @see com.itextpdf.text.pdf.parser.RenderListener#endTextBlock()
     */
    @Override
    public void endTextBlock() {
    }
    
     public byte[] getBimgArray() { //
        return img;                                 // Added this
    } 

    /**
     * @see com.itextpdf.text.pdf.parser.RenderListener#renderImage(
     * com.itextpdf.text.pdf.parser.ImageRenderInfo)
     */
    @Override
    public void renderImage(ImageRenderInfo renderInfo) {
        try {
                PdfImageObject image = renderInfo.getImage();
                if (image == null) {
                    return;
                }
                   if (renderInfo.getRef().getNumber()==16){              
                    img = image.getImageAsBytes();

                 }       
            } 
        
        catch (IOException e) {
            Logger.getLogger(ImageRenderListener.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     * @see com.itextpdf.text.pdf.parser.RenderListener#renderText(
     * com.itextpdf.text.pdf.parser.TextRenderInfo)
     */
    @Override
    public void renderText(TextRenderInfo renderInfo) {
    }
    
}
