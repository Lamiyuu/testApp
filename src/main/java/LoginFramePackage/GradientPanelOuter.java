package LoginFramePackage;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class GradientPanelOuter extends javax.swing.JPanel {

    private BufferedImage image;

    public GradientPanelOuter() {
        initComponents();
        setOpaque(false);
    }
    @Override
    public void paintComponent(Graphics grphcs){
        //Set ảnh nền 
        try {
            image = ImageIO.read(getClass().getResourceAsStream("ke_toan.jpg"));
        } catch (IOException ex) {
            Logger.getLogger(GradientPanelOuter.class.getName()).log(Level.SEVERE, null, ex);
        }
        super.paintComponent(grphcs);
        grphcs.drawImage(image, 0, 0, getWidth(), getHeight(), this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
