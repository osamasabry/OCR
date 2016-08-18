/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.RenderListener;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.snowtide.pdf.Page;
//import com.snowtide.pdf.layout.Image;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javafx.stage.WindowEvent;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import sun.misc.BASE64Encoder;


public class PDF extends javax.swing.JFrame  {
        JFileChooser fileChooser = new JFileChooser();
        JFileChooser imgChooser = new JFileChooser();
        

        PDFManager pdfManager = new PDFManager();
        Map<String, String> data = null;

        ImageRenderListener listener;
        
        // extractImages
        public void extractImages(String filename)
        throws IOException, DocumentException {
//        System.out.println("Processing PDF at " + filename);
        PdfReader reader = new PdfReader(filename);
        PdfReaderContentParser parser = new PdfReaderContentParser(reader);
        listener = new ImageRenderListener();           
        RenderListener print = parser.processContent(3, listener);
        reader.close();       
    }
        
        
    /**
     * Creates new form PDF
     */
    public PDF() {
        initComponents();
        getContentPane().setBackground(Color.decode("#AEC0A2"));
        

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        uploadpic = new javax.swing.JRadioButton();
        fileLabel = new javax.swing.JLabel();
        picLabel = new javax.swing.JLabel();
        btn_Finash = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        btn_Send = new javax.swing.JButton();
        displayimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Upload PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        uploadpic.setText("Upload Image");
        uploadpic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadpicActionPerformed(evt);
            }
        });

        fileLabel.setBackground(new java.awt.Color(155, 218, 137));
        fileLabel.setForeground(new java.awt.Color(41, 70, 96));

        picLabel.setBackground(new java.awt.Color(245, 232, 60));
        picLabel.setForeground(new java.awt.Color(79, 89, 102));

        btn_Finash.setText("Finish");
        btn_Finash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FinashActionPerformed(evt);
            }
        });

        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        btn_Send.setText("Send data");
        btn_Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadpic)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(btn_Send, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(displayimage, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btn_Finash, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(fileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uploadpic)
                    .addComponent(picLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(displayimage, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Finash)
                    .addComponent(btn_Send)
                    .addComponent(btn_Reset))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        // TODO add your handling code here:
        uploadpic.setSelected(false);
        fileLabel.setText(null);
        picLabel.setText(null);
        displayimage.setIcon(null);
        data=null;
        pdfManager.setFilePath(null);
//        System.out.println(data);

    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SendActionPerformed
        // TODO add your handling code here
        
        try { 
            // TODO add your handling code here:
            String s = null;
            data = pdfManager.ToText();
            URL url = new URL("http://localhost/pdf.php");
            URLConnection con = url.openConnection();
            // activate the output
            con.setDoOutput(true);
            PrintStream ps = new PrintStream(con.getOutputStream());
            // send your parameters to your site
            if (uploadpic.isSelected()) {

                try {
                    byte[] im= extractBytes(imgChooser.getSelectedFile());
                    BASE64Encoder encoder = new BASE64Encoder();
                    s = encoder.encode(im);
                }catch (IOException ex) {
                    Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{

                byte[] pic = listener.getBimgArray();
                s = new sun.misc.BASE64Encoder().encode(pic);
            }
            
            System.out.println(data);
            if(s.isEmpty()|| data.isEmpty()){
               JOptionPane.showMessageDialog(null, "data not found . please select OCR PDF Only ","",JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                
                ps.print("data:\n"+data+"img:\n"+s);
                con.getInputStream();
                DataInputStream inStream = new DataInputStream(con.getInputStream());
                String buffer;
                while((buffer = inStream.readLine()) != null) {
//                    System.out.println(buffer);
                }
                ps.close();
                JOptionPane.showMessageDialog(null, "Data Sent","",JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "please selecet OCR PDF","worng pass",JOptionPane.ERROR_MESSAGE);
            fileLabel.setText(null);

        }

    }//GEN-LAST:event_btn_SendActionPerformed

    private void btn_FinashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FinashActionPerformed
        // TODO add your handling code here:
//        System.out.println("osama");
        System.exit(1);
    }//GEN-LAST:event_btn_FinashActionPerformed

    private void uploadpicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadpicActionPerformed
        // TODO add your handling code here:

        imgChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        imgChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        imgChooser.addChoosableFileFilter(new FileNameExtensionFilter("JPG & GIF & JPEG & PNG Images", "jpg","png"));

        imgChooser.setAcceptAllFileFilterUsed(false);
        int result = imgChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = imgChooser.getSelectedFile();
            picLabel.setText(selectedFile.getName());
            
            ImageIcon icon = new ImageIcon(selectedFile.getAbsolutePath());
            displayimage.setBounds(100, 100, 200, 200);
            Image im = (Image)icon.getImage(); //convert icon image to image
            Image newimg = im.getScaledInstance(displayimage.getWidth(), displayimage.getHeight(), Image.SCALE_SMOOTH);
            displayimage.setIcon(new ImageIcon(newimg));
//            System.out.println(s);

        }  else{

            uploadpic.setSelected(false);

        }
    }//GEN-LAST:event_uploadpicActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            ReadFile();
        } catch (IOException ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public byte[] extractBytes (File ImageName) throws IOException {
 // open image
//    File imgPath = new File(ImageName);
    BufferedImage bufferedImage = ImageIO.read(ImageName);
    // get DataBufferBytes from Raster
    WritableRaster raster = bufferedImage .getRaster();
    DataBufferByte data   = (DataBufferByte) raster.getDataBuffer();

    return (data.getData() );
   }
    
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
            java.util.logging.Logger.getLogger(PDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           
           
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDF().setVisible(true);
            }
        });
    }

    private void ReadFile() throws IOException, DocumentException {
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("PDF Documents", "pdf"));
       
        fileChooser.setAcceptAllFileFilterUsed(true);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            fileLabel.setText(selectedFile.getName());
            pdfManager.setFilePath(selectedFile.getAbsolutePath());
            String sourcePDF = selectedFile.getAbsolutePath();
            extractImages(sourcePDF);
            BufferedImage img = ImageIO.read(new ByteArrayInputStream(listener.getBimgArray()));
            displayimage.setBounds(100, 100, 200, 200);
            try{
                    data = pdfManager.ToText();

            }catch(Exception e){
                
                JOptionPane.showMessageDialog(null, "please selecet OCR PDF","worng pass",JOptionPane.ERROR_MESSAGE);

            }
            ImageIcon icon = new ImageIcon(img); //image icon 
            Image im = (Image)icon.getImage(); //convert icon image to image
            Image newimg = im.getScaledInstance(displayimage.getWidth(), displayimage.getHeight(), Image.SCALE_SMOOTH);
            displayimage.setIcon(new ImageIcon(newimg));
            
            }               
        
    }
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Finash;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Send;
    private javax.swing.JLabel displayimage;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel picLabel;
    private javax.swing.JRadioButton uploadpic;
    // End of variables declaration//GEN-END:variables
}
