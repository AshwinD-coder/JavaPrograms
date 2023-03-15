package TwoDimensionalGraphics;

import javax.swing.*;
import java.awt.*;

public class myPanel extends JPanel {
    Image image;

    myPanel(){
        image = new ImageIcon("dota.jpg").getImage();
        this.setPreferredSize(new Dimension(500,500));
    }
    public void paint(Graphics g){
        Graphics g2d = (Graphics2D) g;
//        g2d.setColor(Color.RED);
//        g2d.drawLine(0,0,500,500);
//        g2d.setColor(Color.MAGENTA);
//        g2d.fillOval(100,100,100,100);

//        g2d.fill3DRect(200,200,200,200,true);
//        g2d.fillRoundRect(100,200,150,150,15,15);
        g2d.drawImage(image,0,0,null);
    }

}
