package TwoDimensionalAnimation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;

public class myPanel extends JPanel implements ActionListener {
    public ImageIcon icon= new ImageIcon("DVD_logo.png");
    Image image;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 0;
    int y = 0;
    Timer timer = new Timer((int)0.1,this);
    int panel_width =1920;
    int panel_height = 1080;
    myPanel(){
        this.setPreferredSize(new Dimension(panel_width,panel_height));
        image = icon.getImage();
        timer.start();


    }
    public void paint(Graphics g){
        super.paint(g);
        Graphics g2d = (Graphics) g;
        g2d.drawImage(image,x,y,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x>=(panel_width-image.getWidth(null))){
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;
        repaint();
    }
}
